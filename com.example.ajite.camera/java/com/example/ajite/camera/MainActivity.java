package com.example.ajite.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void camera(View view) {
        startActivity(new Intent(this, CameraActivity.class));
    }

    public void collabration(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.teamviewer.teamviewer.market.mobile");
        if (launchIntent != null) {
            startActivity(launchIntent);
        } else {
            Toast.makeText(this, "Error", 1);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout btnCamera = (LinearLayout) findViewById(R.id.btnCamera);
        LinearLayout about_us = (LinearLayout) findViewById(R.id.about_us);
        ((LinearLayout) findViewById(R.id.recommendation)).setOnClickListener(new OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.startActivity(new Intent(MainActivity.this, Recommendation.class));
            }
        });
    }
}
