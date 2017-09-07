package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private Settings settings;
    private ArrayList<CardEntry> cardList;
    private ListView residenceListView;

    private void initaliseState() {
        settings = new Settings(this);
        cardList = new ArrayList<>();
        cardList.add(new CardEntry(R.drawable.amstel, "Amstel Home", settings.isAmstelNotifications()));
        cardList.add(new CardEntry(R.drawable.ravel, "Ravel Residence", settings.isRavelNotifications()));
        cardList.add(new CardEntry(R.drawable.nautique, "Nautique Living", settings.isNautiqueNotifications()));
    }

    private void initaliseViews() {
        Log.d(TAG, "initaliseViews: here");
        residenceListView = (ListView) findViewById(R.id.residenceList);
        CardAdapter adapter = new CardAdapter(MainActivity.this, R.layout.card_record, cardList);
        Log.d(TAG, "initaliseViews: before set adapter");
        residenceListView.setAdapter(adapter);
        Log.d(TAG, "initaliseViews: after set adapter");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initaliseState();
        initaliseViews();
    }
}