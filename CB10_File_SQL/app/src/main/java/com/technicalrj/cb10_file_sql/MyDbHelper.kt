package com.technicalrj.cb10_file_sql

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class MyDbHelper(ctx: Context) : SQLiteOpenHelper(ctx,"Todo.db",null,1){

    override fun onCreate(db: SQLiteDatabase?) {

        db?.execSQL(columns.db_query)


    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
