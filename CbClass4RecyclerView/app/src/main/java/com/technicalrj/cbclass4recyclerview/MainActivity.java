package com.technicalrj.cbclass4recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
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
        for (int i = 0; i < 20; i++) {
            list.add(new Student("Ashish","Programming"));
            list.add(new Student("Atul","Playing"));
        }


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
        public View getView(int i, View convertView, ViewGroup viewGroup) {

            Log.d("InfoText", "position: "+i+"   getView: "+convertView);

            LayoutInflater layoutInflater = getLayoutInflater();
            ViewHolder viewHolder;

            if(convertView==null){
                convertView = layoutInflater.inflate(R.layout.single_item,viewGroup,false);


                viewHolder = new ViewHolder(convertView);
                convertView.setTag(viewHolder);
            }else {
                viewHolder = (ViewHolder) convertView.getTag();
            }


            viewHolder.name.setText(list.get(i).name);
            viewHolder.hobby.setText(list.get(i).hobby);


            return convertView;
        }


        class ViewHolder{

            TextView name,hobby;

            public ViewHolder( View convertView) {
                name = convertView.findViewById(R.id.name);
                hobby = convertView.findViewById(R.id.hobby);
            }
        }
    }

}


