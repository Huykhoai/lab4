package com.example.lab4.bai2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lab4.R;


public class FragmentBottom extends Fragment {

    Button btn;
    EditText editText;
    public FragmentBottom() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_bottom, container, false);
        btn = v.findViewById(R.id.buttonSend);
        editText = v.findViewById(R.id.editTextData);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendDataToTopFragment(editText.getText().toString());
            }
        });

        return v;
    }
    private void sendDataToTopFragment(String data) {
        FragmentTop fragmentTop = (FragmentTop) getActivity()
                .getSupportFragmentManager()
                .findFragmentById(R.id.fragmentContainerTop);
        if (fragmentTop != null) {
            fragmentTop.displayReceivedData(data);
        }
    }
}