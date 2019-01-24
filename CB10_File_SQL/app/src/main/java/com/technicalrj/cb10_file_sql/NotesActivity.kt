package com.technicalrj.cb10_file_sql

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_notes.*

class NotesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notes)

        val dbHelper = MyDbHelper(this).writableDatabase


        val todoList = columns.getAllTodo(dbHelper)
        val adapter = ArrayAdapter<Todo>(this,android.R.layout.simple_list_item_1,todoList)
        listView.adapter = adapter

        button.setOnClickListener {

            todoList.add(Todo(editText.text.toString(),false) )
            columns.insertTodo(dbHelper,Todo(editText.text.toString(),false))
            adapter.notifyDataSetChanged()

        }



    }
}
