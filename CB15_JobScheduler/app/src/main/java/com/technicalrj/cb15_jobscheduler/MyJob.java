package com.technicalrj.cb15_jobscheduler;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Log;
import android.widget.Toast;

public class MyJob extends JobService {
    @Override
    public boolean onStartJob(JobParameters params) {

        Toast.makeText(this, "Good", Toast.LENGTH_SHORT).show();

        Log.d("InfoText", "onStartJob: good");
        return false;
    }

    @Override
    public boolean onStopJob(JobParameters params) {
        return false;
    }

}
