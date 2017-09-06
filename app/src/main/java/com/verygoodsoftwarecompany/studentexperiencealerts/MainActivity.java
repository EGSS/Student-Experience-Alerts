package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private Settings settings;
    private ListView residenceListView;

    private void initalise() {
        settings = new Settings(this);
        residenceListView = (ListView) findViewById(R.id.residenceList);
        residenceListView.setAdapter(new CardAdapter(MainActivity.this, R.layout.card_record, settings));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalise();
    }
}