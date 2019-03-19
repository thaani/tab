package com.example.tab;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Home homeFragment = new Home();
                return homeFragment;
            case 1:
                Sport sportFragment = new Sport();
                return sportFragment;
            case 2:
                Moviee movieFragment = new Moviee();
                return movieFragment;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return totalTabs;
    }
}
