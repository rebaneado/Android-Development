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
    ArrayAdapter<User> adapter;
    int orderType = -1;

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
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, android.R.id.text1,users);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                User user = adapter.getItem(position);
                users.add(user);
                adapter.notifyDataSetChanged();


                //User user = users.get(position);
                //adapter.remove(user);//this annd below does the same thing
                //users.remove(user);
                //adapter.notifyDataSetChanged();
//
//
//                //code below is for sorting and modifying
//                orderType = orderType *-1;
//
//                Collections.sort(users, new Comparator<User>() {
//                    @Override
//                    public int compare(User o1, User o2) {
//
//                        return orderType * o1.name.compareTo(o2.name);
//
//                    }
//                });
//                // Log.d(TAG, "On click listener is: " + position + ", color is " +    colors[position]);
//                adapter.notifyDataSetChanged();
            }
        });


    }
}


















