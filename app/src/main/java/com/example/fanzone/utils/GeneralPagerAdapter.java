package com.example.fanzone.utils;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chikemgbemena on 19/02/2018.
 */
@Deprecated
public class GeneralPagerAdapter extends FragmentPagerAdapter {

    private final List<Fragment> tabsFragmentList = new ArrayList<>();
    private final List<String> tabsFragmentTitleList = new ArrayList<>();

    public GeneralPagerAdapter(FragmentManager fm) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return tabsFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return tabsFragmentList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabsFragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String title) {
        tabsFragmentList.add(fragment);
        tabsFragmentTitleList.add(title);
        notifyDataSetChanged();
    }

    public void addFragment(List<Fragment> fragment, List<String> title) {
        tabsFragmentList.addAll(fragment);
        tabsFragmentTitleList.addAll(title);
        notifyDataSetChanged();
    }

    public void removeFragment(int position) {
        tabsFragmentList.remove(position);
        notifyDataSetChanged();
    }

    public void replaceFragment(int position, Fragment fragment) {
        tabsFragmentList.remove(position);
        tabsFragmentList.add(position, fragment);
        notifyDataSetChanged();
    }

    public void clearAll(){
        tabsFragmentList.clear();
        tabsFragmentTitleList.clear();
    }
}
