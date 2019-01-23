package com.technicalrj.cb9_network;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class SampleData extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_data);



    }

    public void getData(View view) {


        MyTask myTask = new MyTask();
        myTask.execute("https://www.google.com");

    }


    class MyTask extends AsyncTask<String,Void,String>{

        @Override
        protected String doInBackground(String... strings) {

            String s=null;
            try {
                URL url =  new URL(strings[0]);
                InputStream is  = url.openConnection().getInputStream();
                Scanner scanner = new Scanner(is);
                scanner.useDelimiter("\\A");

                if(scanner.hasNext()){
                    s = scanner.next();
                }


                Log.d("InfoText", "doInBackground: "+s.substring(0,10));


            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return s;
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);

            TextView textView = findViewById(R.id.txt);
            textView.setText(s);
        }
    }

}
