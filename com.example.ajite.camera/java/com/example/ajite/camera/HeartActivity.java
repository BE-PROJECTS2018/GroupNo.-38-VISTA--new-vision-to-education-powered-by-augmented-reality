package com.example.ajite.camera;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class HeartActivity extends AppCompatActivity {
    String[] links = new String[]{"https://en.wikipedia.org/wiki/Heart", "https://www.webmd.com/heart/picture-of-the-heart#1", "http://www.innerbody.com/image/card01.html", "https://www.khanacademy.org/science/health-and-medicine/circulatory-system/circulatory-system-introduction/v/meet-the-heart", "https://www.youtube.com/watch?v=H04d3rJCLCE", "https://www.youtube.com/watch?v=oHMmtqKgs50", "https://www.youtube.com/watch?v=Mv3dKgwbJ7U", "https://www.kenhub.com/en/start/c/heart", "https://www.merckmanuals.com/en-ca/home/heart-and-blood-vessel-disorders/biology-of-the-heart-and-blood-vessels/biology-of-the-heart", "https://www.youtube.com/watch?v=UEGQhC-yYCI"};
    Toolbar mActionBarToolbar;
    String[] mobileArray = new String[]{"Wikipedia", "WebMD", "InnerBody", "KHAN ACADEMY", "Michael Maxin", "mohaalimp", "New Anatomy and Physiology video", "Ken Hub", "Merck Manual", "Online Guruji"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);
        this.mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(this.mActionBarToolbar);
        getSupportActionBar().setTitle("Recommendation");
        this.mActionBarToolbar.setBackgroundColor(Color.parseColor("#303F9F"));
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter(this, R.layout.activity_listview, this.mobileArray));
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(HeartActivity.this, LinksDisplay.class);
                intent.putExtra("link", HeartActivity.this.links[i]);
                HeartActivity.this.startActivity(intent);
            }
        });
    }
}
