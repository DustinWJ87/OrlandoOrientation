package com.example.android.orlandoorientation;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TourPagerAdapter extends FragmentPagerAdapter {
    private Context mContext;

    public TourPagerAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int pos) {
        if (pos == 0) {
            return new AttractionsFragment();
        } else if (pos == 1) {
            return new BeachesFragment();
        } else if (pos == 2) {
            return new RestaurantsFragment();
        } else {
            return new NightLifeFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int pos) {
        if (pos == 0) {
            return mContext.getString(R.string.category_attractions);
        } else if (pos == 1) {
            return mContext.getString(R.string.category_beaches);
        } else if (pos == 2) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_nightlife);
        }
    }
}