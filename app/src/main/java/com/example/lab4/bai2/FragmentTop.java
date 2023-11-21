package com.example.lab4.bai2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lab4.R;

public class FragmentTop extends Fragment {
 TextView textView;
    public FragmentTop() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_top, container, false);
       textView = v.findViewById(R.id.textReceivedData);
        return v;
    }
    public void displayReceivedData(String data){
        textView.setText(data);
    }
}