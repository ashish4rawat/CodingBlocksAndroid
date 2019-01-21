package com.technicalrj.cbclass4recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class DemoActivity extends AppCompatActivity {

    ArrayList<Student> list;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);


        Log.d("InfoText", "onCreate: demo");

        list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add(new Student("Ashish","Programming"));
            list.add(new Student("Atul","Playing"));
        }


        StudentAdapter studentAdapter = new StudentAdapter(list);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        recyclerView.setAdapter(studentAdapter);




    }
}
