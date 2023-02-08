package com.example.passingserializableobjects;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SecondActivity extends AppCompatActivity {
    TextView textViewGreeting;
    TextView textViewAge;
    Button buttonFinish;
    Button buttonSendData;
    EditText editTextDataSentBack;
    public static final String BUBBLE = "NAME";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        textViewAge = findViewById(R.id.textViewAge);
        textViewGreeting = findViewById(R.id.textViewGreeting);
        buttonFinish = findViewById(R.id.buttonFinish);
        buttonSendData = findViewById(R.id.buttonSendData);
        editTextDataSentBack = findViewById(R.id.editTextDataSentBack);

        if (getIntent() != null && getIntent().getExtras() != null && getIntent().hasExtra(MainActivity.USER_KEY)){
            User user = getIntent().getParcelableExtra(MainActivity.USER_KEY);
            textViewGreeting.setText("Hello "+user.name);
            textViewAge.setText("AGE: "+ user.age);

            String name = getIntent().getStringExtra(MainActivity.NAME_KEY);
        }

        buttonSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String enteredText = editTextDataSentBack.getText().toString();
                Intent intent = new Intent();
                intent.putExtra(BUBBLE, enteredText);
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    buttonFinish.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            finish();
        }
    });

    }
}