package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lab4.bai2.Bai2Activity;
import com.example.lab4.bai3.Bai3Activity;
import com.example.lab4.fragment.MainActivity;

public class QuanllyActivity extends AppCompatActivity {
      Button btn1,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanlly);
        btn1 = findViewById(R.id.bai1);
        btn2 = findViewById(R.id.bai2);
        btn3 = findViewById(R.id.bai3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuanllyActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuanllyActivity.this, Bai2Activity.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuanllyActivity.this, Bai3Activity.class);
                startActivity(intent);
            }
        });
    }
}