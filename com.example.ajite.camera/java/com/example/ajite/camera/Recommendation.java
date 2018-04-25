package com.example.ajite.camera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Recommendation extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recommendation);
    }

    public void recom_ethene(View view) {
        startActivity(new Intent(this, EtheneActivity.class));
    }

    public void recom_heart(View view) {
        startActivity(new Intent(this, HeartActivity.class));
    }

    public void recom_isometric(View view) {
        startActivity(new Intent(this, IsometricActivity.class));
    }
}
