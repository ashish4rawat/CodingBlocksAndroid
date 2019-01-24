package com.technicalrj.cb10_file_sql

data class Todo (val task: String, val done: Boolean){
    override fun toString(): String {
        return task
    }
}