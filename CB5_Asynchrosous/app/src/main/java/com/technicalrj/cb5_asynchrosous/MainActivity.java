package com.technicalrj.cb5_asynchrosous;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "InfoText";
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        String[] names = {"Ashish","Atul","Rawat","Ashish","Atul","Rawat","Ashish","Atul","Rawat"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);




    }



    public void makeAdelay(View view) {


        Handler handler = new Handler();
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                long start = System.currentTimeMillis();

                Log.d(TAG, "makeADelay: "+"delay done");
            }
        };


        handler.postDelayed(runnable,4000);

    }



}
