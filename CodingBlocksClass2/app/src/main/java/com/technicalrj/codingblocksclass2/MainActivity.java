package com.technicalrj.codingblocksclass2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String TAG = "InfoText";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = findViewById(R.id.button);
        button.setOnClickListener(MainActivity.this);


    }

    @Override
    public void onClick(View view) {

        EditText editText = findViewById(R.id.editText);
        String txt = editText.getText().toString();

        Uri uri = Uri.parse(txt);
        Intent intent = new Intent(Intent.ACTION_VIEW);
        startActivity(intent);

    }
}
