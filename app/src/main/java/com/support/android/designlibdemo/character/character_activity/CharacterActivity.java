package com.support.android.designlibdemo.character.character_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.github.clans.fab.FloatingActionMenu;
import com.support.android.designlibdemo.R;

import java.util.ArrayList;
import java.util.List;



/**
 * Created by fabio on 22/10/15.
 *
 * Dispatch to correct kind of character
 */
public class CharacterActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private View content;

    private String class_type[] = {"Blaster","Bruiser","Tactical","Scrapper","Infiltrator","Generalist"};

    FloatingActionMenu materialDesignFAM;
    com.github.clans.fab.FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;


    private int[] tabIcons = {
            R.drawable.blastericon,
            R.drawable.bruisericon,
            R.drawable.tacticianicon,
            R.drawable.scrappericon,
            R.drawable.infiltratoricon,
            R.drawable.generalisticon
    };

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_characters);

        Intent myIntent = getIntent();                          // gets the previously created intent
        String character_type = myIntent.getStringExtra("character_type");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        //mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        content = findViewById(R.id.main_content);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager, character_type);
        }

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        FABInit();

        setupTabIcons(tabLayout);
    }

    public void FABInit(){
        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.char_material_design_android_floating_action_menu);
        floatingActionButton1 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.char_material_design_floating_action_menu_item1);
        floatingActionButton2 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.char_material_design_floating_action_menu_item2);
        floatingActionButton3 = (com.github.clans.fab.FloatingActionButton) findViewById(R.id.char_material_design_floating_action_menu_item3);

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

    private void setupTabIcons(TabLayout tabLayout) {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
    }

    private void setupViewPager(ViewPager viewPager, String type) {

        if (type.equals("hero")){
            this.setTitle("Heroes");
            prepareFragments(type, viewPager);
        }

        if (type.equals("enemy")){
            this.setTitle("Enemies");
            prepareFragments(type, viewPager);
        }

        if (type.equals("lockbox")){
            this.setTitle("Lockboxes Heroes");
            prepareFragments(type, viewPager);
        }

        if (type.equals("pvp")){
            this.setTitle("PVP Heroes");
            prepareFragments(type, viewPager);
        }

        if (type.equals("specop")){
            this.setTitle("SpecOp Heroes");
            prepareFragments(type, viewPager);
        }

        if (type.equals("covert")){
            this.setTitle("Covert Task Heroes");
            prepareFragments(type, viewPager);
        }

        if (type.equals("groupboss")){
            this.setTitle("Group Boss");
            prepareFragments(type, viewPager);
        }
    }

    private void prepareFragments(String type, ViewPager viewPager){
        Bundle args;
        Adapter adapter = new Adapter(getSupportFragmentManager());
        for (int i=0; i< class_type.length; i++) {
            args = new Bundle();
            args.putString("class", type);
            args.putString("type", class_type[i]);
            CharacterListFragment clf = new CharacterListFragment();
            clf.setArguments(args);
            adapter.addFragment(clf, class_type[i]);
        }
        viewPager.setAdapter(adapter);
    }

    static class Adapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragments = new ArrayList<>();
        private final List<String> mFragmentTitles = new ArrayList<>();

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        public void addFragment(Fragment fragment, String title) {
            mFragments.add(fragment);
            mFragmentTitles.add(title);
        }

        @Override
        public Fragment getItem(int position) {
            return mFragments.get(position);
        }

        @Override
        public int getCount() {
            return mFragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            //return mFragmentTitles.get(position);
            return null;
        }

    }

}
