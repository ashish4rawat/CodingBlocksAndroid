package com.technicalrj.cb9_network;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiDemo extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_api_demo);



        MyTask myTask = new MyTask();
        myTask.execute("https://api.github.com/search/users?q=ashish4ra");

    }

    class MyTask extends AsyncTask<String,Void,String> {

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

            showData(s);
        }
    }

    private void showData(String s) {


        ArrayList<GithubUser> users = parseJson(s);


        for (GithubUser githubUser:users) {
            Log.d("InfoText", "showData: "+githubUser);
        }


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        GithubAdapter adapter = new GithubAdapter(users);
        recyclerView.setAdapter(adapter);

    }

    private ArrayList<GithubUser> parseJson(String s) {

        ArrayList<GithubUser> list = new ArrayList<>();

        try {
            JSONObject jsonObject = new JSONObject(s);
            JSONArray jsonArray = jsonObject.getJSONArray("items");

            for (int i = 0; i <jsonArray.length() ; i++) {
                JSONObject object = (JSONObject) jsonArray.get(i);
                list.add(new GithubUser(
                        object.getString("login"),
                        object.getString("html_url"),
                        object.getDouble("score")
                ));
            }

        } catch (JSONException e) {
            e.printStackTrace();
        }


        return list;
    }
}