package com.example.navigation.ui.MyAttendanceCalendar;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.navigation.R;

public class MyAttendanceCalendarFragment extends Fragment {

    private MyAttendanceCalendarViewModel mViewModel;

    public static MyAttendanceCalendarFragment newInstance() {
        return new MyAttendanceCalendarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_attendance_calendar_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MyAttendanceCalendarViewModel.class);
        // TODO: Use the ViewModel
    }

}