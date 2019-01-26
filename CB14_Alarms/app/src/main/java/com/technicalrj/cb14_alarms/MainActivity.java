package com.technicalrj.cb14_alarms;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        AlarmManager alarmManager = (AlarmManager) getSystemService(ALARM_SERVICE);

        Intent i = new Intent(this,Main2Activity.class);
        PendingIntent pi = PendingIntent.getActivity(this,123,i,PendingIntent.FLAG_UPDATE_CURRENT);
        //alarmManager.set(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime() +10000,pi);

        alarmManager.setRepeating(AlarmManager.ELAPSED_REALTIME_WAKEUP,SystemClock.elapsedRealtime()+10000,60000,pi);




    }
}
