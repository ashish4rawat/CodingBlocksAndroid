package com.technicalrj.cb16_broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val br = AirplaceChecker2()

        val ifilter = IntentFilter().apply {
            addAction(Intent.ACTION_POWER_CONNECTED)
            addAction(Intent.ACTION_POWER_DISCONNECTED)
        }

        registerReceiver(br,ifilter)


    }

    inner class AirplaceChecker2 : BroadcastReceiver() {

        override fun onReceive(context: Context, intent: Intent) {

            Toast.makeText(context,"Airplace chnaged hello", Toast.LENGTH_LONG).show()
            Log.i("InfoText","Airplace changed")
        }
    }

}
