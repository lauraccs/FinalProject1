package com.example.laura.finalproject1;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.laura.finalproject1.adapter.ViewPagerAdapter;
import com.example.laura.finalproject1.fragment.FragmentTop1;
import com.example.laura.finalproject1.fragment.FragmentTop2;

import java.util.ArrayList;

public class ClosetActivity extends AppCompatActivity {
    private ViewPager topsViewPager;
    private ViewPager headWearViewPager;
    private ViewPager bottomsViewPager;
    private ViewPager footWearViewPager;

    private ArrayList<Fragment> fragmentList = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_closet);
        topsView();
        bottomsView();
        headwearView();
        footWearView();
    }

    public void topsView(){
        topsViewPager = (ViewPager) findViewById(R.id.closet_viewpager_tops);
        fragmentList.add(new FragmentTop1());
        fragmentList.add(new FragmentTop2());

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        topsViewPager.setAdapter(viewPagerAdapter);

    }

    public void headwearView(){
        headWearViewPager = (ViewPager) findViewById(R.id.closet_viewpager_hats);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        headWearViewPager.setAdapter(viewPagerAdapter);

    }

    public void bottomsView(){
        bottomsViewPager = (ViewPager) findViewById(R.id.closet_viewpager_bottoms);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        bottomsViewPager.setAdapter(viewPagerAdapter);

    }

    public void footWearView(){
        footWearViewPager = (ViewPager) findViewById(R.id.closet_viewpager_shoes);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this.getSupportFragmentManager());
        viewPagerAdapter.setContent(fragmentList);
        footWearViewPager.setAdapter(viewPagerAdapter);

    }
}
