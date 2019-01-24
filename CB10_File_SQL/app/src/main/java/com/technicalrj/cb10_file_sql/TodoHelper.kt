package com.technicalrj.cb10_file_sql

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase

object columns {

    var table_name = "todoItem"

    object todo{
        var id = "id"
        var task = "task"
        var done = "done"

    }


    val db_query = """
        CREATE TABLE if not exists $table_name (
            ${todo.id} INTEGER PRIMARY KEY AUTOINCREMENT,
            ${todo.task} TEXT ,
            ${todo.done} BOOLEAN
        );

    """.trimIndent()


    fun insertTodo(db: SQLiteDatabase,todoObject : Todo){

        val cv = ContentValues()
        cv.put(todo.task,todoObject.task)
        cv.put(todo.done,todoObject.done)

        db.insert(table_name,null,cv)

    }

    fun getAllTodo(db: SQLiteDatabase) : ArrayList<Todo>{

        val cursor = db.query(table_name, arrayOf(todo.id,todo.task,todo.done) , null,null,null,null,null)

        val list = ArrayList<Todo>()
        while (cursor.moveToNext()){
            val task = cursor.getString(1)
            val done = cursor.getInt(2)
            list.add(Todo(task,done==1 ))
        }

        return list
    }


}