package com.example.navigation.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Menu;

import com.example.navigation.Location.LocationActivity;
import com.example.navigation.R;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.navigation.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;
//    private ActivityMainBinding binding;
    private  ActivityMainBinding binding;
  //  private AppBarMainBinding appBarMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
        binding=ActivityMainBinding.inflate(getLayoutInflater());
      //  appBarMainBinding=AppBarMainBinding.bind(binding.getRoot().);
        setContentView(binding.getRoot());


        setSupportActionBar(binding.appBarMain.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(R.id.nav_profile,
                R.id.nav_myattendancecalender,
                R.id.nav_punchinout,
                R.id.nav_markattendance,
                R.id.nav_myholiday,
                R.id.nav_leaverequest,
                R.id.nav_odrequest,
                R.id.nav_leaveencashmentrequest,
                R.id.nav_dashboard,
                R.id.nav_shortleaverequest,
                R.id.nav_map)
                .setOpenableLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();



    }

    public void getLocation(MenuItem item) {
        startActivity(new Intent(MainActivity.this, LocationActivity.class));
    }
}