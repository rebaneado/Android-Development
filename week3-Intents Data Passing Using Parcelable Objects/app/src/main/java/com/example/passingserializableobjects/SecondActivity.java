package com.example.passingserializableobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

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

        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(MainActivity.USERS_KEY)){
            ArrayList<User> users = (ArrayList<User>)getIntent().getSerializableExtra(MainActivity.USERS_KEY);
            Collections.shuffle(users);
            User user =  users.get(0);
            //Below statement is for a single user to be passed.
            // User user = (User) getIntent().getSerializableExtra(MainActivity.USER_KEY);
            textViewGreeting.setText("Hello "+user.name);
            textViewAge.setText("AGE: "+ user.age);



            String name = getIntent().getStringExtra(MainActivity.NAME_KEY);



        }




    }
}