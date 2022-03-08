package com.example.navigation.ui.MarkeAttendance;

import androidx.annotation.RequiresApi;
import androidx.lifecycle.ViewModelProvider;

import android.app.Activity;
import android.icu.text.SimpleDateFormat;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.navigation.R;
import com.example.navigation.databinding.MarkeAttendanceFragmentBinding;

import java.util.Date;
import java.util.Locale;

public class MarkeAttendanceFragment extends Fragment {

    private MarkeAttendanceViewModel mViewModel;
    private MarkeAttendanceFragmentBinding markeAttendanceFragmentBinding;
    TextView tv1;

    public static MarkeAttendanceFragment newInstance() {
        return new MarkeAttendanceFragment();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public View onCreateView( LayoutInflater inflater,  ViewGroup container,
                              Bundle savedInstanceState) {

        Log.e("Mark Attendance","onCreateView");

         View v= inflater.inflate(R.layout.marke_attendance_fragment, container, false);

         String currentDate = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault()).format(new Date());
         Log.e("Date",currentDate);
         TextView date=(TextView) v.findViewById(R.id.tv_date);
         date.setText(currentDate);

         String currentTime = new SimpleDateFormat("HH:mm:ss", Locale.getDefault()).format(new Date());
         Log.e("Time",currentTime);
         TextView time=(TextView) v.findViewById(R.id.tv_time);
         time.setText(currentTime);


         return v;

    }

    @Override
    public void onActivityCreated( Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MarkeAttendanceViewModel.class);
        // TODO: Use the ViewModel
        Log.e("Mark Attendance","onActivityCreated");

    }

}