package com.technicalrj.cb10_file_sql;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.*;

public class SampleActivity extends AppCompatActivity {

    EditText inputText;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        inputText = findViewById(R.id.editText);
        textView = findViewById(R.id.textView);

    }

    public void addText(View view) {

        File dataDir = ContextCompat.getDataDir(SampleActivity.this);
        File file = new File(dataDir,"sampa.txt");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file,true);
            String s = inputText.getText().toString();
            fileOutputStream.write(s.getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void getText(View view) {


        File dataDir = ContextCompat.getDataDir(SampleActivity.this);
        File file = new File(dataDir,"sampa.txt");

        try {
            FileInputStream fileInputStream = new FileInputStream(file);

            int ch;
            StringBuilder stringBuilder = new StringBuilder();
            while (  (ch = fileInputStream.read()) != -1  ){
                stringBuilder.append( (char)ch);
            }

            textView.setText(stringBuilder.toString());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
