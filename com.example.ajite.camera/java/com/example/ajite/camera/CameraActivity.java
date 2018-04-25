package com.example.ajite.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class CameraActivity extends AppCompatActivity {
    public void ethene(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gauatmc.ethene12");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
    }

    public void heart(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gautamchhabria.RotateMov");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
    }

    public void isometric1(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gautamc.isometric");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
    }

    public void video(View view) {
        Intent launchIntent = getPackageManager().getLaunchIntentForPackage("com.gautamchhbria.RotateMov");
        if (launchIntent != null) {
            startActivity(launchIntent);
        }
    }
}
