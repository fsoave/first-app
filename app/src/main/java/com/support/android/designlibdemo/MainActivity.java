package com.support.android.designlibdemo;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
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
import com.support.android.designlibdemo.social_manager.Social;

import static com.support.android.designlibdemo.R.drawable;
import static com.support.android.designlibdemo.R.id;
import static com.support.android.designlibdemo.R.layout;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

public class MainActivity extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private View content;
    private String type;
    private String option_type;

    Social socialManager = new Social();

    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;

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

        FABInit();

    }

    public void FABInit(){
        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        floatingActionButton1 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item1);
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);

        floatingActionButton1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu first item clicked
                Snackbar.make(v, "Hero added to roaster", Snackbar.LENGTH_LONG)
                        //.setAction(R.string.snackbar_action_undo, clickListener)
                        .setAction("Action", null).show();

            }
        });
        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked

            }
        });
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

                            /*  case id.nav_enemies:
                                type = "enemy";
                                drawerMenuHelper(menuItem, type);
                                return true; */

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

                            /*case id.nav_group_boss:
                                type = "groupboss";
                                drawerMenuHelper(menuItem, type);
                                return true;*/

                            case id.facebook:
                                //PackageManager pm = getPackageManager();
                                Intent intent_fb = socialManager.newFacebookIntent(getPackageManager());
                                startActivity(intent_fb);
                                return true;

                            case id.fb_groups:
                                //PackageManager pm1 = getPackageManager();
                                Intent intent_gr = socialManager.newFacebookGroupsIntent(getPackageManager());
                                startActivity(intent_gr);
                                return true;

                            case id.twitter:
                                //PackageManager pm2 = getPackageManager();
                                Intent intent_twitter = socialManager.newTwitterIntent(getPackageManager());
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

    boolean doubleBackToExitPressedOnce = false;

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Snackbar.make(content, "Please click BACK again to exit", Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
