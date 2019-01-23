package com.technicalrj.cb10_file_sql

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import java.io.File
import java.io.FileOutputStream

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        button.setOnClickListener{

            var dataDir = ContextCompat.getDataDir(this@MainActivity)
            var file = File(dataDir,"sample.txt")
            file.appendText(editText.text.toString())
        }

        button2.setOnClickListener{

            var dataDir = ContextCompat.getDataDir(this@MainActivity)
            var file = File(dataDir,"sample.txt")
            textView.text = file.readText()
        }

    }
}
