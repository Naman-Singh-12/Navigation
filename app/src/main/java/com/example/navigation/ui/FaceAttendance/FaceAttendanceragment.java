package com.example.navigation.ui.FaceAttendance;

import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.navigation.R;
import com.example.navigation.ui.FaceAttendance.Activity.FaceAttendanceActivity;

public class FaceAttendanceragment extends Fragment {

    Button camera;
    private FaceAttendanceragmentViewModel mViewModel;

    public static FaceAttendanceragment newInstance() {
        return new FaceAttendanceragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.face_attendanceragment_fragment, container, false);
        camera=(Button) root.findViewById(R.id.bt_faceattendance);
        camera.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getContext(), FaceAttendanceActivity.class));
            }
        });

        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(FaceAttendanceragmentViewModel.class);
        // TODO: Use the ViewModel
    }

}