package com.technicalrj.cb9_network

import android.content.Context
import android.support.v4.content.ContextCompat
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.single_item.view.*

class GithubAdapter(val list: ArrayList<GithubUser>) : RecyclerView.Adapter<GithubAdapter.GithubViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): GithubViewHolder {

        val li = parent.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view = li.inflate(R.layout.single_item,parent,false)

        return GithubViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: GithubViewHolder, p1: Int) {

        holder.bind(list[p1])

    }


    class GithubViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(gihubUser: GithubUser){
            itemView.login.text = gihubUser.login
            itemView.html_url.text = gihubUser.html_url
            itemView.score.text = gihubUser.score.toString()
        }

    }
}