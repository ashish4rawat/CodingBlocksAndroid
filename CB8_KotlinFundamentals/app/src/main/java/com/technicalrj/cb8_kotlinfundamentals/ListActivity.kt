package com.technicalrj.cb8_kotlinfundamentals

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.technicalrj.cb8_kotlinfundamentals.model.Todo
import kotlinx.android.synthetic.main.activity_list.*

class ListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        var d = Todo("",false)

        var list: ArrayList<Todo> = ArrayList()
        list.add(Todo("Ahsih",false))
        list.add(Todo("atul",false))
        list.add(Todo("fghfg",false))
        list.add(Todo("dfgdfg",false))
        list.add(Todo("dfgdr",false))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TodoAdaper(list)


        button.setOnClickListener {
            list.add(Todo(todoTask.text.toString(),false))
            recyclerView.adapter?.notifyDataSetChanged()
            todoTask.setText("")
        }


    }
}
