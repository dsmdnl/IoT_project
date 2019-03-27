package com.example.tutorial;

import android.content.Intent;
import android.graphics.drawable.LayerDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

    private DrawerLayout myDrawer;
    private ActionBarDrawerToggle myToogle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myDrawer = (DrawerLayout) findViewById(R.id.myDrawer);
        myToogle = new ActionBarDrawerToggle(this, myDrawer, R.string.open_menu, R.string.close_menu);
        myDrawer.addDrawerListener(myToogle);
        myToogle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView navigationView=(NavigationView)findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (myToogle.onOptionsItemSelected(item)) {
                return true;
            }
            return super.onOptionsItemSelected(item);
    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.drawSpeed:
                Intent intent1 = new Intent(this, SpeedActivity.class);
                this.startActivity(intent1);
                return true;
            case R.id.drawAnt:
                Intent intent2 = new Intent(this, AntennaActivity.class);
                this.startActivity(intent2);
                return true;
            case R.id.drawCode:
                Intent intent3 = new Intent(this, ScanActivity.class);
                this.startActivity(intent3);
                return true;
            default:
                return false;
        }

    }
}
