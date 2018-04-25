package com.example.ajite.camera;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class LinksDisplay extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_links_display);
        ((WebView) findViewById(R.id.webView)).loadUrl(getIntent().getExtras().getString("link"));
    }
}
