package com.example.week4;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.week4.databinding.FragmentSecondBinding;


public class SecondFragment extends Fragment {
    final String TAG = "demo";
    public SecondFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "On Create second Fragment");
    }

    FragmentSecondBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentSecondBinding.inflate(inflater, container, false);

        //return inflater.inflate(R.layout.fragment_second, container, false);
        return binding.getRoot();

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String typed = binding.editTextTextPersonName.getText().toString();
                binding.buttonSubmit.setText(typed);
                sListener.sendUserName(typed);


            }
        });
    }

    SecondFragmentListener sListener;
    @Override
    public void onAttach(@NonNull Context context) {// the context is your activity
        super.onAttach(context);
        sListener = (SecondFragmentListener) context;
    }

    //implement interface fragment
    public  interface SecondFragmentListener{
        void sendUserName(String username);
    }
}