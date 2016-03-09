package com.support.android.designlibdemo.character.character_activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.support.android.designlibdemo.R;


/**
 * Created by fabio on 22/10/15.
 *
 * quando funzionerà il db, spero di poter usare il pattern DAO per poter passare tutti i dati del personaggio
 * in un'unica detailview
 */
public class CharacterDetailActivity extends AppCompatActivity {

    public static final String EXTRA_NAME = "";
    private int class_type;
    private String bio;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        final String characterName = intent.getStringExtra(EXTRA_NAME);
        class_type = intent.getIntExtra("class_type", 000);

        bio = intent.getStringExtra("bio");
        loadBio();

        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbar =
                (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar);
        collapsingToolbar.setTitle(characterName);

        loadBackdrop();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void loadBackdrop() {
        final ImageView imageView = (ImageView) findViewById(R.id.backdrop);
        //use the dialog version of the hero image. when available
        imageView.setImageResource(class_type);
    }

    private void loadBio() {
        final TextView text = (TextView) findViewById(R.id.biopic);
        //use the dialog version of the hero image. when available
        text.setText(bio);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sample_actions, menu);
        return true;
    }
}
