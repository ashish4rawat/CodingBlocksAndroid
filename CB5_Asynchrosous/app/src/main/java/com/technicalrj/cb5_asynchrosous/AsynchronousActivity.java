package com.technicalrj.cb5_asynchrosous;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class AsynchronousActivity extends AppCompatActivity {

    private static final String TAG = "InfoText";
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asynchronous);

        textView = findViewById(R.id.textView);
    }

    public void start(View view) {

        MyTask myTask = new MyTask();
        myTask.execute(5);

    }

    class MyTask extends AsyncTask<Integer,Integer,Integer>{


        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected Integer doInBackground(Integer... integers) {



            int i;
            for (i = 0; i < integers[0]; i++) {
                long start = System.currentTimeMillis();
                while (System.currentTimeMillis()-start<1000);

                Log.d(TAG, "doInBackground: "+i);

                publishProgress(i);
            }


          return i;
        }


        @Override
        protected void onPostExecute(Integer integer) {
            super.onPostExecute(integer);
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            super.onProgressUpdate(values);

            textView.setText(values[0]+"");
        }
    }

}
