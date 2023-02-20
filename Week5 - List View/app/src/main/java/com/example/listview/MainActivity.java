package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Comparator;

public class MainActivity extends AppCompatActivity {
    final String TAG ="DEMO";
    ListView listView;
    String [] colors = {"Red","Green","Blue"};
    ArrayList<User> users = new ArrayList<>();
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        users.add(new User("Zebra", 23));
        users.add(new User("Jonny Burrito", 28));
        users.add(new User("Dello darkness", 28));
        users.add(new User("Alex old friend", 47));
        users.add(new User("Mom ", 28));
        listView = findViewById(R.id.listView);
        adapter = new UserAdapter(this, R.layout.user_row_layout, users);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });


    }
}


















