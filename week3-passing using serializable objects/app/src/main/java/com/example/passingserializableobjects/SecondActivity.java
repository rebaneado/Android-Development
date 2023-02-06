package com.example.passingserializableobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView textViewGreeting;
    TextView textViewAge;
    Button buttonFinish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewAge = findViewById(R.id.textViewAge);
        textViewGreeting = findViewById(R.id.textViewGreeting);
        buttonFinish = findViewById(R.id.buttonFinish);

        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(MainActivity.USER_KEY)){
            User user = (User) getIntent().getSerializableExtra(MainActivity.USER_KEY);
            textViewGreeting.setText("Hello "+user.name);
            textViewAge.setText("AGE: "+ user.age);



            String name = getIntent().getStringExtra(MainActivity.NAME_KEY);



        }




    }
}