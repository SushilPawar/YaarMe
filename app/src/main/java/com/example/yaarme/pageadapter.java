package com.example.yaarme;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class pageadapter extends FragmentPagerAdapter {
    int tabcount;
    public pageadapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        tabcount = behavior;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0 : return new Home();
            case 1 : return new About();
            case 2 : return new Jobs();
            case 3 : return new People();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabcount;
    }
}
