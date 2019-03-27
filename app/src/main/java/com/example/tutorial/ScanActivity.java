package com.example.tutorial;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ScanActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scanactivity);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }
}
