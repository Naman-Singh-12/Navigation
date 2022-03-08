package com.example.navigation.ui.PunchInOut;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
//
//import android.support.design.widget.TabLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.example.navigation.R;
import com.example.navigation.databinding.PunchInOutFragmentBinding;
import com.example.navigation.ui.PunchInOut.MarkReportPunch.MarkPunchFragment;
import com.example.navigation.ui.PunchInOut.MarkReportPunch.ReportPunchFragment;
import com.example.navigation.ui.PunchInOut.PunchAdapter.PageAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class PunchInOutFragment extends Fragment {

    private PunchInOutViewModel mViewModel;
    private PunchInOutFragmentBinding punchInOutFragmentBinding;
    TabLayout tabLayout;
    ViewPager viewPager;
    TabItem tabItem1,tabItem2;
    FrameLayout frameLayout;
    Fragment fragment = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    PageAdapter pageAdapter;

    public static PunchInOutFragment newInstance() {
        return new PunchInOutFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.punch_in_out_fragment, container, false);

       // pageAdapter=new PageAdapter(getActivity().getSupportFragmentManager(), tabLayout.getTabCount());
       // viewPager.setAdapter(pageAdapter);

//        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                viewPager.setCurrentItem(tab.getPosition());
//
//                if(tab.getPosition()==0 || tab.getPosition()==1)
//                    pageAdapter.notifyDataSetChanged();
//
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//        fragment = new MarkPunchFragment();
//        fragmentManager = getSupportFragmentManager();
//        fragmentTransaction = fragmentManager.beginTransaction();
//        fragmentTransaction.replace(R.id.punch_frameLayout, fragment);
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//        fragmentTransaction.commit();
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                // Fragment fragment = null;
//                switch (tab.getPosition()) {
//                    case 0:
//                        fragment = new MarkPunchFragment();
//                        break;
//                    case 1:
//                        fragment = new ReportPunchFragment();
//                        break;
//
//                }
//                FragmentManager fm = getSupportFragmentManager();
//                FragmentTransaction ft = fm.beginTransaction();
//                ft.replace(R.id.punch_frameLayout, fragment);
//                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
//                ft.commit();
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
       // new View.OnLayoutChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(PunchInOutViewModel.class);
        // TODO: Use the ViewModel

    }

}