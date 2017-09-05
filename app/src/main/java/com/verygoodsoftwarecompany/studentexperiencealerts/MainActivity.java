package com.verygoodsoftwarecompany.studentexperiencealerts;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Settings settings;

    private synchronized void initalise() {
        settings = new Settings(this);
        /**
         *  method/thread (?) to populate:
         *      AppBar
         *      Widgets associated with variables.
         */
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initalise();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
