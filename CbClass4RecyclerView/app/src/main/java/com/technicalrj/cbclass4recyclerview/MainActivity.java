package com.technicalrj.cbclass4recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayList<Student> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = findViewById(R.id.listview);

        list = new ArrayList<>();
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));
        list.add(new Student("Ashish","Programming"));
        list.add(new Student("Atul","Playing"));


        CustomAdaper customAdaper = new CustomAdaper();
        listView.setAdapter(customAdaper);


    }

    class CustomAdaper extends BaseAdapter {

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int i) {
            return list.get(i);
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {

            LayoutInflater layoutInflater = getLayoutInflater();
            view = layoutInflater.inflate(R.layout.single_item,viewGroup,false);

            TextView tv = view.findViewById(R.id.name);
            TextView tv_hobby = view.findViewById(R.id.hobby);

            tv.setText(list.get(i).name);
            tv_hobby.setText(list.get(i).hobby);


            return view;
        }
    }

}


