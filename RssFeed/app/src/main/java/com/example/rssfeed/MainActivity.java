package com.example.rssfeed;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import java. util.*;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ArrayList<String> list = new ArrayList<String>();
        list.add("Android");
        list.add("Python");
        list.add("Java");
        list.add("Asp.net");
        list.add("C++");
        list.add("WEB Development");

        ArrayAdapter arrayAdapter = new ArrayAdapter(getApplicationContext(), android.R.layout.simple_list_item_1,list);

        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?>parent, View view, int position, long id ){

                if (position ==0){
                    startActivity(new Intent(MainActivity.this,Android_courses.class));
                }else if(position == 1) {
                    startActivity(new Intent(MainActivity.this,Python_course.class));
                }else if(position == 2) {
                    startActivity(new Intent(MainActivity.this,Java_course.class));
                }else if(position == 3) {
                    startActivity(new Intent(MainActivity.this,ASP_course.class));
                }else if(position == 4) {
                    startActivity(new Intent(MainActivity.this,Cpp_course.class));
                }else if(position == 5) {
                    startActivity(new Intent(MainActivity.this,WebDevelopment_course.class));
                }
            }
        });
    }
}