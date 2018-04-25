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

public class EtheneActivity extends AppCompatActivity {
    String[] links = new String[]{"http://www.bbc.co.uk/schools/gcsebitesize/science/triple_edexcel/organic_chemistry/organic_chemistry/revision/4/", "http://www.essentialchemicalindustry.org/chemicals/ethene.html", "https://www.chemguide.co.uk/basicorg/bonding/ethene.html", "https://chem.libretexts.org/Core/Organic_Chemistry/Alkenes/Properties_of_Alkenes/Structure_and_Bonding_in_Ethene-The_Pi_Bond", "https://www.youtube.com/watch?v=ES5T12WdRpU", "https://www.youtube.com/watch?v=nn5o2chMOH4", "https://www.youtube.com/watch?v=ijzKPfjpTvc", "https://www.youtube.com/watch?v=l4qAKrdnBGw", "https://www.youtube.com/watch?v=-Tin46RxKGI", "https://www.youtube.com/watch?v=FjAJH4IGoLo"};
    Toolbar mActionBarToolbar;
    String[] mobileArray = new String[]{"BBC", "The Essential Chemical Industry", "Chemguide", "Chemistry LibreTexts", "7activestudio", "Wayne Breslyn", " Shawn Shields", "kentchemistry.com", "Learning Chemistry is fun", " Gordon Watson"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ethene);
        this.mActionBarToolbar = (Toolbar) findViewById(R.id.toolbar_actionbar);
        setSupportActionBar(this.mActionBarToolbar);
        getSupportActionBar().setTitle("Recommendation");
        this.mActionBarToolbar.setBackgroundColor(Color.parseColor("#303F9F"));
        ListView listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(new ArrayAdapter(this, R.layout.activity_listview, this.mobileArray));
        listView.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(EtheneActivity.this, LinksDisplay.class);
                intent.putExtra("link", EtheneActivity.this.links[i]);
                EtheneActivity.this.startActivity(intent);
            }
        });
    }
}
