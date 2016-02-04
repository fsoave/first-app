package com.support.android.designlibdemo.optionmenu.menumain;

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
import android.support.design.widget.FloatingActionButton;

import com.support.android.designlibdemo.R;
import com.support.android.designlibdemo.character.enemy.EnemiesListFragment;
import com.support.android.designlibdemo.character.hero.HeroesListFragment;
import com.support.android.designlibdemo.character.lockbox.LockboxesListFragment;
import com.support.android.designlibdemo.optionmenu.menumain.contactme.EmailMeFragment;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by fabio on 29/10/15.
 */
public class OptionMenuMainActivity extends AppCompatActivity{

    private DrawerLayout mDrawerLayout;
    private View content;

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
        setContentView(R.layout.activity_main_optionmenu);

        Intent myIntent = getIntent();                          // gets the previously created intent
        String option = myIntent.getStringExtra("option");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);

        content = findViewById(R.id.main_content);

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        if (viewPager != null) {
            setupViewPager(viewPager, option);
        }

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);


        //setupTabIcons(tabLayout);   //fixare questo
    }

    /* private void setupTabIcons(TabLayout tabLayout) {
        tabLayout.getTabAt(0).setIcon(tabIcons[0]);
        tabLayout.getTabAt(1).setIcon(tabIcons[1]);
        tabLayout.getTabAt(2).setIcon(tabIcons[2]);
        tabLayout.getTabAt(3).setIcon(tabIcons[3]);
        tabLayout.getTabAt(4).setIcon(tabIcons[4]);
        tabLayout.getTabAt(5).setIcon(tabIcons[5]);
    }*/

    private void setupViewPager(ViewPager viewPager, String type) {

        if (type.equals("contact")){
            this.setTitle("Contact me");
            //set tab icon to busta delle lettere

            //email-me, ask.me,twitter app official profile, facebook app official profile, give me a job

            Adapter adapter = new Adapter(getSupportFragmentManager());
            adapter.addFragment(new EmailMeFragment(), "Email Me");
            // add others
            viewPager.setAdapter(adapter);

        }

        if (type.equals("info")){
            this.setTitle("Infos");

            //tutto il materiale viene da: , versione e build, changelog versione, history dei changelog

            Adapter adapter = new Adapter(getSupportFragmentManager());
            adapter.addFragment(new EnemiesListFragment(), "Blaster");
            adapter.addFragment(new EnemiesListFragment(), "Bruiser");
            adapter.addFragment(new EnemiesListFragment(), "Tactical");
            adapter.addFragment(new EnemiesListFragment(), "Infiltrator");
            adapter.addFragment(new EnemiesListFragment(), "Scrapper");
            adapter.addFragment(new EnemiesListFragment(), "Generalist");
            viewPager.setAdapter(adapter);
        }

        if (type.equals("about")){
            this.setTitle("About me");

            //about.me, musica che ho ascoltato, thanks to:

            Adapter adapter = new Adapter(getSupportFragmentManager());
            adapter.addFragment(new LockboxesListFragment(), "Blaster");
            adapter.addFragment(new LockboxesListFragment(), "Bruiser");
            adapter.addFragment(new LockboxesListFragment(), "Tactical");
            adapter.addFragment(new LockboxesListFragment(), "Infiltrator");
            adapter.addFragment(new LockboxesListFragment(), "Scrapper");
            adapter.addFragment(new LockboxesListFragment(), "Generalist");
            viewPager.setAdapter(adapter);
        }
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
            return mFragmentTitles.get(position);
            //return null;
        }

    }

}
