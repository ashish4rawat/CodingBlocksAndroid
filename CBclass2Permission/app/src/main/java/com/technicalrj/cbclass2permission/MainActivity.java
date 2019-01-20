package com.technicalrj.cbclass2permission;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.security.Permission;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        startActivity(new Intent(this,ListDemo.class));

    }






    public void checkNetwork(View view) {

        ConnectivityManager connectivityManager = (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo networkInfo = connectivityManager.getActiveNetworkInfo();

        boolean isConn = networkInfo!=null && networkInfo.isConnected();

        Toast.makeText(MainActivity.this,isConn+"",Toast.LENGTH_LONG).show();




    }

    public void openFolder(View view) {

        if(ContextCompat.checkSelfPermission(MainActivity.this,Manifest.permission.CALL_PHONE)==PackageManager.PERMISSION_GRANTED){
            call();
        }else {
            ActivityCompat.requestPermissions(MainActivity.this,new String[]{Manifest.permission.CALL_PHONE},324);
        }

    }

    public void call(){
        Uri uri = Uri.parse("tel:8687263");
        Intent intent = new Intent(Intent.ACTION_CALL,uri);
        startActivity(intent);
    }
}
