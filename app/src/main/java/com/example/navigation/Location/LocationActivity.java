package com.example.navigation.Location;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.os.Bundle;

import com.example.navigation.R;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class LocationActivity extends AppCompatActivity {

    SupportMapFragment supportMapFragment;
    FusedLocationProviderClient client;
    public double latitude;
    public double longitude;
    GoogleMap mGoogleMap;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);

        supportMapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.location_map);
        client = LocationServices.getFusedLocationProviderClient(this);
        checkPermissionRequest();

    }
    private void checkPermissionRequest() {
        if (ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_FINE_LOCATION") == 0 || ContextCompat.checkSelfPermission(this, "android.permission.ACCESS_COARSE_LOCATION") == 0) {
         getMyLocation();
        } else {
            ActivityCompat.requestPermissions(this, new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"}, 1010);
        }
    }

    private void getMyLocation() {
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding

            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        Task<Location> locationTask = client.getLastLocation();
        locationTask.addOnSuccessListener(new OnSuccessListener<Location>()
        {
            @Override
            public void onSuccess(Location location) {
                supportMapFragment.getMapAsync(new OnMapReadyCallback()
                {
                    @Override
                    public void onMapReady(@NonNull GoogleMap googleMap)
                    {

                        mGoogleMap=googleMap;

                       // LatLng latLng=new LatLng(location.getLatitude(),location.getLongitude());
                       // latitude=location.getLatitude();
                       // longitude=location.getLongitude();
//                        mGoogleMap.isMyLocationEnabled();
//                        Location currentlocation=mGoogleMap.getMyLocation();
//                        Log.e("LocationActivity","Location "+currentlocation);
//                        LatLng latLng=new LatLng(location.getLatitude(),location.getLongitude());
//                        longitude = location.getLongitude();
//                        latitude = location.getLatitude();
//                        Toast.makeText(LocationActivity.this, "latitude:" + latitude + " longitude:" + longitude, Toast.LENGTH_SHORT).show();
                        //MarkerOptions markerOptions=new MarkerOptions().position(latLng).title("You are here....!!");
                        //googleMap.addMarker(markerOptions);
                        //Log.e("Location latitude", String.valueOf(latLng));
                        //googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,20));
                        // Turn on the My Location layer and the related control on the map.
                        //updateLocationUI();
                        // Get the current location of the device and set the position of the map.
                       // getDeviceLocation();

                    }
                });
            }
        });
    }
}