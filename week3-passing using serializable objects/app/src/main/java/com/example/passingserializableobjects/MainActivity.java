package com.example.passingserializableobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    final String TAG = "demo";
    final static public String NAME_KEY = "NAME";
    final static public String USER_KEY = "USER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);

                intent.putExtra(USER_KEY, new User("Bobby Smurta",27));

                ArrayList<User> users = new ArrayList<>();
                startActivity(intent);
            }
        });
    }
}




//    findViewById(R.id.button) .setOnClickListener (new View. OnClickListener () {
//        31
//        32 af
//        33
//        34
//        35
//@Override
//public void onClick(View v) {
//        Intent intent = new Intent ( packageContext: MainActivity.this, SecondActivity.class);
//        intent. putExtra (NAME_KEY, value: "Bob Smith");
//        startActivity(intent);
//        }
//        });