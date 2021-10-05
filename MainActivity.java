package com.example.newsreaderapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    PagerAdapter pagerAdapter;
    Toolbar toolbar;
    TabLayout tablayout;
    TabItem mentertainment,mscience,mhealth, mhome ,mtechnology,msports;
    String api="aa6ab835c72943a78631ea71df862d94";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     toolbar=findViewById(R.id.androidtoolbar);
     tablayout=findViewById(R.id.newscategory);
     mentertainment=findViewById(R.id.entertainment);
     mscience=findViewById(R.id.science);
     mhealth=findViewById(R.id.health);
     mhome=findViewById(R.id.home);
     mtechnology=findViewById(R.id.technology);
     msports=findViewById(R.id.sport);
        ViewPager viewPager =findViewById(R.id.fragmentcontainer);
        pagerAdapter= new PagerAdapter(getSupportFragmentManager(),6);
        viewPager.setAdapter(pagerAdapter);
        tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if (tab.getPosition()==0||tab.getPosition()==1||tab.getPosition()==2||tab.getPosition()==3||tab.getPosition()==4||tab.getPosition()==5){
                    pagerAdapter.notifyDataSetChanged();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));

    }
}