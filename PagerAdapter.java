package com.example.newsreaderapp;

import android.view.View;

import androidx.fragment.app.FragmentPagerAdapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

public class PagerAdapter extends FragmentPagerAdapter{
    int tabcount;



    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount=behavior;
    }

    @Override
    public Fragment getItem(int position) {
     switch (position){
         case 0:
             return new Homefragment();
         case 1:
             return new EntertainmentFragment();
         case 2:
             return new  Health();
         case 3:
             return new TechnologyFragment();
         case 4:
             return new sports();
         case 5:
             return new Health();
         default:
             return null;

     }
    }

    @Override
    public int getCount() {
       return tabcount;
    }
}



