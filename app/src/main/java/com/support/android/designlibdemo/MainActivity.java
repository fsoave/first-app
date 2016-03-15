package com.support.android.designlibdemo;


import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.support.android.designlibdemo.character.character_activity.CharacterActivity;
import com.support.android.designlibdemo.optionmenu.menumain.OptionMenuMainActivity;

import static com.support.android.designlibdemo.R.drawable;
import static com.support.android.designlibdemo.R.id;
import static com.support.android.designlibdemo.R.layout;

public class MainActivity extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private View content;
    private String type;
    private String option_type;

    private String facebook_id = "100000854413331";
    private String facebook_url = "https://www.facebook.com/fabio.soave.7";

    private String fb_group_id ="685204534959411";
    private String fb_group_url ="https://www.facebook.com/groups/685204534959411";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(id.toolbar);
        setSupportActionBar(toolbar);

        final ActionBar ab = getSupportActionBar();
        ab.setHomeAsUpIndicator(drawable.ic_menu);
        ab.setDisplayHomeAsUpEnabled(true);

        mDrawerLayout = (DrawerLayout) findViewById(id.drawer_layout);

        content = findViewById(id.main_content);

        NavigationView navigationView = (NavigationView) findViewById(id.nav_view_main);
        if (navigationView != null) {
            setupDrawerContent(navigationView);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option_menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:                             //apre il navigation drawer
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;

            case id.main_contact:
                option_type = "contact";
                optionMenuHelper(item, option_type);
                return true;

            case id.main_info:
                option_type = "info";
                optionMenuHelper(item, option_type);
                return true;

            case id.main_author:
                option_type = "about";
                optionMenuHelper(item, option_type);
                return true;

            case id.main_rateapp:
                openRateBox();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void optionMenuHelper(MenuItem item, String type){
        item.setChecked(true);
        Intent intent = new Intent(content.getContext(), OptionMenuMainActivity.class);
        intent.putExtra("option", type);
        startActivity(intent);
    }

    private void openRateBox(){                                      // TODO: 02/11/15
        Snackbar.make(content, "Open the box", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {

                        //qui metto i link alle altre --> Activity <--
                        switch (menuItem.getItemId()) {
                            case id.nav_heroes:
                                type = "hero";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_enemies:
                                type = "enemy";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_lockbox:
                                type = "lockbox";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_pvp_hero:
                                type = "pvp";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_specop_hero:
                                type = "specop";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_coverthero:
                                type = "covert";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.nav_group_boss:
                                type = "groupboss";
                                drawerMenuHelper(menuItem, type);
                                return true;

                            case id.facebook:
                                PackageManager pm = getPackageManager();
                                Intent intent_fb = newFacebookIntent(pm, facebook_id, facebook_url);
                                startActivity(intent_fb);
                                return true;

                            case id.fb_groups:
                                PackageManager pm1 = getPackageManager();
                                Intent intent_gr = newFacebookGroupsIntent(pm1, fb_group_id, fb_group_url);
                                startActivity(intent_gr);
                                return true;

                            case id.twitter:
                                PackageManager pm2 = getPackageManager();
                                Intent intent_twitter = newTwitterIntent(pm2);
                                startActivity(intent_twitter);
                                return true;

                            default:
                                return true;
                        }
                    }
                });

    }

    private void drawerMenuHelper(MenuItem menuItem, String type){
        menuItem.setChecked(true);
        mDrawerLayout.closeDrawers();
        Intent intent = new Intent(content.getContext(), CharacterActivity.class);
        intent.putExtra("character_type", type);
        startActivity(intent);
    }

    /* Facebook reference
    * http://stackoverflow.com/questions/4810803/open-facebook-page-from-android-app
    * http://findmyfbid.com/
    */
    /* user_profile */
    public static Intent newFacebookIntent(PackageManager pm, String facebook_id, String facebook_url) {
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
    public static Intent newFacebookGroupsIntent(PackageManager pm, String fb_group_id, String fb_group_url) {
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
    public static Intent newTwitterIntent(PackageManager pm) {
        Intent intent = null;
        try {
            // get the Twitter app if possible
            pm.getPackageInfo("com.twitter.android", 0);
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("twitter://user?user_id="+ "935528545"));
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        } catch (Exception e) {
            // no Twitter app, revert to browser
            intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/mrcelsius1"));
        }
        return intent;
    }
}
