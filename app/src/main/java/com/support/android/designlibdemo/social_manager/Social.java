package com.support.android.designlibdemo.social_manager;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;

/**
 * Created by fabio on 15/03/16.
 * responsible for social-actions
 */
public class Social {

    final String facebook_id = "100000854413331";
    final String facebook_url = "https://www.facebook.com/fabio.soave.7";

    final String fb_group_id ="685204534959411";
    final String fb_group_url ="https://www.facebook.com/groups/685204534959411";

    final String twitter_id = "935528545";
    final String twitter_url = "https://twitter.com/mrcelsius1";

    /* Facebook reference
    * http://stackoverflow.com/questions/4810803/open-facebook-page-from-android-app
    * http://findmyfbid.com/
    */
    /* user_profile */

    public Intent newFacebookIntent(PackageManager pm) {
        Uri uri;
        try {
            pm.getPackageInfo("com.facebook.katana", 0);
            // http://stackoverflow.com/a/24547437/1048340
            uri = Uri.parse("fb://profile/" + facebook_id);
        } catch (PackageManager.NameNotFoundException e) {
            uri = Uri.parse(facebook_url);
        }
        return new Intent(Intent.ACTION_VIEW, uri);
    }
    /* groups */
    public Intent newFacebookGroupsIntent(PackageManager pm) {
        Uri uri;
        try {
            pm.getPackageInfo("com.facebook.groups", 0);
            uri = Uri.parse("fb://group/" + fb_group_id);
        } catch (PackageManager.NameNotFoundException e) {
            uri = Uri.parse(fb_group_url);
        }
        return new Intent(Intent.ACTION_VIEW, uri);
    }

    /* Twitter reference
    * http://mytwitterid.com/
    * http://stackoverflow.com/questions/11105103/open-page-in-twitter-app-from-other-app-android
    * */
    public Intent newTwitterIntent(PackageManager pm) {
        Intent intent = null;
        try {
            // get the Twitter app if possible
            pm.getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id="+ twitter_id));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse(twitter_url));
        }
        return intent;
    }
}
