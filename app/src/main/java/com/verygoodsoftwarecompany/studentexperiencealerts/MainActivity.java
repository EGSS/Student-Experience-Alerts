package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import static com.verygoodsoftwarecompany.studentexperiencealerts.R.id.recyclerView;

public class MainActivity extends AppCompatActivity {

    private Settings settings;
    private ArrayList<CardEntry> cardList;
    private RecyclerView residenceListView;
    private RecyclerView.LayoutManager layoutManager;

    private void initaliseState() {
        settings = new Settings(this);
        cardList = new ArrayList<>();
        cardList.add(new CardEntry(R.drawable.amstel, "Amstel Home", settings.isAmstelNotifications()));
        cardList.add(new CardEntry(R.drawable.ravel, "Ravel Residence", settings.isRavelNotifications()));
        cardList.add(new CardEntry(R.drawable.nautique, "Nautique Living", settings.isNautiqueNotifications()));
    }

    private void initaliseViews() {
        residenceListView = (RecyclerView) findViewById(recyclerView);
        CardAdapter adapter = new CardAdapter(MainActivity.this, cardList);
        residenceListView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        residenceListView.setLayoutManager(layoutManager);
        residenceListView.setAdapter(adapter);
    }

    public Settings getSettings() {
        return settings;
    }

    private CardView cardView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        cardView = (CardView) findViewById(R.);

        initaliseState();
        initaliseViews();
    }
}