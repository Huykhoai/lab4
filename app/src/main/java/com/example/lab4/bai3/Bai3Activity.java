package com.example.lab4.bai3;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import com.example.lab4.R;
import com.example.lab4.bai2.Bai2Activity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Bai3Activity extends AppCompatActivity {
    ViewpaperAdapter adapter;
    ViewPager2 viewPager2;
    TabLayout tabLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3);
        viewPager2 = findViewById(R.id.viewPaper);
        tabLayout = findViewById(R.id.tabLayout);
        adapter = new ViewpaperAdapter(Bai3Activity.this);
        viewPager2.setAdapter(adapter);
        TabLayoutMediator tab = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {
                switch (position){
                    case 0:
                        tab.setText("Tablayout 1");
                        break;
                    case 1:
                        tab.setText("Tablayout 2");
                        break;
                    default:
                        break;
                }

            }
        });
        tab.attach();
    }
}