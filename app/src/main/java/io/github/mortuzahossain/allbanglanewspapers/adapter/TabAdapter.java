package io.github.mortuzahossain.allbanglanewspapers.adapter;
/*
 * Created by mortuza on 23/6/20 | 1:25 AM for All Bangla Newspapers
 * Junior Programmer
 * Flora Systems
 * Email : mortuzahossain1997@gmail.com
 * Phone : +8801719200957
 * */


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import io.github.mortuzahossain.allbanglanewspapers.fragments.NewsContainerFragment;
import io.github.mortuzahossain.allbanglanewspapers.utils.Constants;

public class TabAdapter extends FragmentPagerAdapter {

    public TabAdapter(@NonNull FragmentManager fm) {
        super(fm, FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new NewsContainerFragment(Constants.NewsCategory.BANGLA);
            case 1:
                return new NewsContainerFragment(Constants.NewsCategory.ENGLISH);
            case 2:
                return new NewsContainerFragment(Constants.NewsCategory.INTERNATIONAL);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return Constants.NewsCategoryTitle[position];
    }
}
