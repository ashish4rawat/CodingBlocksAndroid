package com.technicalrj.cb9_network

import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import java.io.InputStream
import java.net.URL
import java.net.URLConnection

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun getData(view: View){



    }


    class MyAsyncTask() : AsyncTask<String,Void,String>(){
        override fun doInBackground(vararg p0: String?): String {

            var url = URL(p0[0])
            var urlConn : URLConnection?= url.openConnection()
            var inputStream = urlConn?.getInputStream()


return ""
        }


    }




}
