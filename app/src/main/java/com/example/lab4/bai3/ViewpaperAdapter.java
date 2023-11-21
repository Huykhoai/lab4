package com.example.lab4.bai3;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.lab4.fragment.Fragment1;
import com.example.lab4.fragment.Fragment2;

public class ViewpaperAdapter extends FragmentStateAdapter {
    public ViewpaperAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        if(position==0){
            return  new Fragment1();
        }
        return new Fragment2();
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
