package com.example.navigation.ui.PunchInOut.PunchAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.navigation.ui.PunchInOut.MarkReportPunch.MarkPunchFragment;
import com.example.navigation.ui.PunchInOut.MarkReportPunch.ReportPunchFragment;

public class PageAdapter extends FragmentPagerAdapter {

    int tabcount;
    public PageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;

    }
    void addOnPageChangeListener (ViewPager.OnPageChangeListener listener){

    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return new MarkPunchFragment();
            case 1: return new ReportPunchFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
