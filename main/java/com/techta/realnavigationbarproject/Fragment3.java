package com.techta.realnavigationbarproject;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.Random;

public class Fragment3 extends Fragment implements View.OnClickListener {

    private Button gayButton;
    private String[] messages = {"you're so gay", "you're the gayest person I know", "SUPER DUPER GAY!"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment3, container, false);
        gayButton = view.findViewById(R.id.gayButton);
        gayButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.gayButton:
                int rnd = new Random().nextInt(messages.length);
                Toast.makeText(getActivity(), messages[rnd], Toast.LENGTH_SHORT).show();
        }
    }
}
