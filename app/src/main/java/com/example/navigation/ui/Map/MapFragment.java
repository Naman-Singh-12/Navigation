package com.example.navigation.ui.Map;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigation.R;
import com.example.navigation.databinding.MapFragmentBinding;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.karumi.dexter.Dexter;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionDeniedResponse;
import com.karumi.dexter.listener.PermissionGrantedResponse;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.single.PermissionListener;

public class MapFragment extends Fragment {

    private MapViewModel mViewModel;
    MapFragmentBinding mapFragmentBindingbinding;
    // SupportMapFragment supportMapFragment;
    //FusedLocationProviderClinent client;
    GoogleMap mgoogleMap;


    public static MapFragment newInstance() {
        return new MapFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mapFragmentBindingbinding = MapFragmentBinding.inflate(inflater, container, false);
        View root = mapFragmentBindingbinding.getRoot();
        return root;
        //supportMapFragment=(SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.google_map);
        //supportMapFragment=(SupportMapFragment) v.findViewById(R.id.google_map);

    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.google_map);
        if (mapFragment != null) {
            mapFragment.getMapAsync(callback);
        }
    }

    private OnMapReadyCallback callback = new OnMapReadyCallback() {
        @Override
        public void onMapReady(@NonNull GoogleMap googleMap) {
            mgoogleMap = googleMap;
        }
    };


}