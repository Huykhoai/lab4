package com.example.lab4.bai2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

import com.example.lab4.R;

public class Bai2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai2);
        FragmentTop fragmentTop = new FragmentTop();
        FragmentBottom fragmentBottom = new FragmentBottom();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        fragmentTransaction.replace(R.id.fragmentContainerTop, fragmentTop);

        fragmentTransaction.replace(R.id.fragmentContainerBottom, fragmentBottom);

        fragmentTransaction.commit();
    }
}