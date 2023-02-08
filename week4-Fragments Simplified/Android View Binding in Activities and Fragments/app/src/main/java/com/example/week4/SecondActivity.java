package com.example.week4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity implements SecondFragment.SecondFragmentListener {
    final String TAG = "demo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        getSupportFragmentManager().beginTransaction().add(R.id.constraintView, new SecondFragment()).commit();


    }

    @Override
    public void sendUserName(String username) {
        //i think this is wrong
        //Toast.makeText(SecondActivity.this, "this is toast", Toast.LENGTH_LONG);
        Log.d(TAG, "Send UserName" + username);

    }
}