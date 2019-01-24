package com.technicalrj.cb10_file_sql;

import android.content.SharedPreferences;
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class SharedText extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shared_text);


        SharedPreferences sharedPreferences = getSharedPreferences("setting",MODE_PRIVATE);
        Log.d("InfoText", "onCreate: "+sharedPreferences.getInt("color", Color.WHITE));


        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putInt("color",Color.RED);
        editor.apply();

    }
}
