package com.example.lab4.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab4.R;
import com.example.lab4.fragment.Fragment1;
import com.example.lab4.fragment.Fragment2;

public class MainActivity extends AppCompatActivity {
   Button btnFragment1,btnFragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       btnFragment1 = findViewById(R.id.btnFragment1);
       btnFragment2 = findViewById(R.id.btnFragment2);

       btnFragment1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Fragment1 fragment1 = new Fragment1();
               FragmentManager fragmentManager = getSupportFragmentManager();
               fragmentManager.beginTransaction()
                       .replace(R.id.frameLayout, fragment1)
                       .commit();
           }
       });
        btnFragment2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment2 fragment2 = new Fragment2();
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout, fragment2)
                        .commit();
            }
        });
    }
}