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

public class IsometricActivity extends AppCompatActivity {
    String[] links = new String[]{"https://study.com/academy/lesson/what-is-an-isometric-drawing-definition-examples.html", "https://medium.com/gravitdesigner/designers-guide-to-isometric-projection-6bfd66934fc7", "https://www.britannica.com/topic/isometric-drawing", "http://oer.nios.ac.in/wiki/index.php/Steps_to_Draw_an_Isometric_View", "https://www.youtube.com/watch?v=NEKJ9S28Fh8", "https://www.youtube.com/watch?v=77ufJXvXUk4", "https://www.youtube.com/watch?v=KAx390oVKuo", "https://www.youtube.com/watch?v=cKX6khFd620", "https://www.youtube.com/watch?v=2bQzqdr5jYg", "https://www.youtube.com/watch?v=AA1Vxc5_nUI"};
    Toolbar mActionBarToolbar;
    String[] mobileArray = new String[]{"Study.com", "A Medium Corporation", " Britannica", "NIOS", "Prof Jeff", "Manas Patnaik", "Shaneinashirt", "Sachin Pandya", "Ganesh Shegar", "James Wilson"};

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
                Intent intent = new Intent(IsometricActivity.this, LinksDisplay.class);
                intent.putExtra("link", IsometricActivity.this.links[i]);
                IsometricActivity.this.startActivity(intent);
            }
        });
    }
}
