package com.support.android.designlibdemo.webview;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.LinearLayout;

import com.support.android.designlibdemo.R;

/**
 * Created by fabio on 23/06/15.
 */
public class WebviewActivity extends AppCompatActivity {

    WebView wv;

    public static final String url = "http://google.it";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview); //change the layout
        initialise();
        wv = (WebView) findViewById(R.id.webView);
        wv.getSettings().setJavaScriptEnabled(true);
        if (savedInstanceState == null) {
            wv.loadUrl(url);
        }

        wv.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab2);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wv.loadUrl(url);
            }
        });

    }

    /**
     * Create, bind and set up the resources
     */
    private void initialise()
    {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (getSupportActionBar() != null)
        {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }

    }

    // Torna indietro nelle pagine
    // onBackPressed deve essere messo nell'activity in cui la webview risiede, ma
    //shouldOverrideUrlLoading() nel fragment che contiene la webview deve ritornare True.
    @Override
    public void onBackPressed() {
        WebView web = (WebView) findViewById(R.id.webView); //change R.id
        if (web.copyBackForwardList().getCurrentIndex() > 0) {
            web.goBack();
        }
        else {
            // Your exit alert code, or alternatively line below to finish
            super.onBackPressed(); // finishes activity
        }
    }
    //onSaveInstanceState(),onRestoreInstanceState() + controllo su savedInstanceState
    //necessari per non refreshare la pagina quando il device ruota
    @Override
    protected void onSaveInstanceState(Bundle outState )
    {
        super.onSaveInstanceState(outState);
        wv.saveState(outState);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState)
    {
        super.onRestoreInstanceState(savedInstanceState);
        wv.restoreState(savedInstanceState);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_webview, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //http://developer.android.com/reference/android/webkit/WebView.html

        //action_webview_chrome Apre il sito in un browser
        switch (item.getItemId()) {
            case R.id.action_webview_homepage: //return to homepage
                wv.loadUrl(url);
                return true;
            case R.id.action_webview_refresh: //refresh page
                wv.loadUrl(wv.getUrl());
                return true;
            case R.id.action_webview_chrome:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                Uri myUri = Uri.parse(url);
                intent.setData(myUri);
                startActivity(intent);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }

    }
}
