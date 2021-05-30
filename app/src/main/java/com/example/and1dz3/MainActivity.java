package com.example.and1dz3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.and1dz3.adapter.FragmentPagerAdapter;
import com.google.android.material.tabs.TabLayout;

import static androidx.fragment.app.FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;
    private FragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViewPager2();
    }

    private void initViewPager2() {
        tabLayout = findViewById(R.id.tab_layout);
        viewPager = findViewById(R.id.view_pager);
        tabLayout.setupWithViewPager(viewPager);
        fragmentPagerAdapter = new FragmentPagerAdapter(getSupportFragmentManager(), BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        fragmentPagerAdapter.addFragment(new TitleFragment(), "TITLES");
        fragmentPagerAdapter.addFragment(new NumbersFragment(), "NUMBERS");
        fragmentPagerAdapter.addFragment(new ImagesFragment(), "IMAGES");
        viewPager.setAdapter(fragmentPagerAdapter);
    }
}