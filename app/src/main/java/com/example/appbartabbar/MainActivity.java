package com.example.appbartabbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.Spinner;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private Spinner cmbToolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Code for Tabs
        ViewPager viewPager = findViewById(R.id.viewpager);
        viewPager.setAdapter(new CustomFragmentAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = findViewById(R.id.appbartabs);
        tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        tabLayout.setupWithViewPager(viewPager);
    }
}

