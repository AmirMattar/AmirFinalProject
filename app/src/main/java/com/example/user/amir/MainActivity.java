package com.example.user.amir;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();


    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        Intent GoToAlert = new Intent(getApplicationContext(), AlertDialogActivity.class);
        Intent GoToAbout = new Intent(getApplicationContext(), AboutProject.class);

        switch (item.getItemId()) {
            case R.id.action_settings:
                GoToAlert = new Intent(getApplicationContext(), AlertDialogActivity.class);
                startActivity(GoToAlert);
                break;
            case R.id.about:
                GoToAlert = new Intent(getApplicationContext(), AboutProject.class);
                startActivity(GoToAbout);
                break;
            case R.id.sign_out:
                GoToAlert = new Intent(getApplicationContext(), AlertDialogActivity.class);
                startActivity(GoToAlert);
                break;
        }
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        switch (item.getItemId()) {

            case R.id.NewBooks:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new BooksFragment()).commit();
                break;
            case R.id.Books:
                Toast.makeText(this, "hi", Toast.LENGTH_SHORT).show();
                break;
            case R.id.BestSellers:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new BestSellerFragment()).commit();
                break;

        }


        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
