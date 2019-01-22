package com.technicalrj.cb8_kotlinfundamentals

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.technicalrj.cb8_kotlinfundamentals.model.Todo
import kotlinx.android.synthetic.main.single_item.*


class TodoAdaper(var list: ArrayList<Todo>): RecyclerView.Adapter<TodoAdaper.TodoViewHolder>() {

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): TodoViewHolder {

        val li  = p0.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = li.inflate(R.layout.single_item,p0,false)
        return TodoViewHolder(view)


    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: TodoViewHolder, pos: Int) {

        holder.todotask.text = list[pos].task

    }


    class TodoViewHolder(val view: View) : RecyclerView.ViewHolder(view)  {

        var todotask: TextView = view.findViewById(R.id.todotask)

    }


}

