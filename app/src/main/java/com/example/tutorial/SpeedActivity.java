package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SpeedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.speedactivity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
