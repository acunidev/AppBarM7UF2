package com.example.appbartabbar;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CustomFragmentAdapter extends FragmentPagerAdapter {

    public static final int PAGE_COUNT = 6;
    private final String[] tabTitles = {"Tab 1", "Tab 2", "Tab 3", "Tab 4", "Tab 5", "Tab 6"};

    public CustomFragmentAdapter(FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }

    @Override
    public Fragment getItem(int position) {
        if (position % 2 == 0) {
            return new Fragment1();
        } else {
            return new Fragment2();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
