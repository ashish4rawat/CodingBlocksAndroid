package com.technicalrj.cb16_broadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class LocaleChanged : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {


        Toast.makeText(context,"headset chnaged hello",Toast.LENGTH_LONG).show()
        Log.i("InfoText","headset changed")

    }
}
