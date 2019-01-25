package com.technicalrj.cb12_fragments


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_add_down.view.*


/**
 * A simple [Fragment] subclass.
 *
 */
class AddDown : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        val view = inflater.inflate(R.layout.fragment_add_down, container, false)

        var count = 0
        view.button.setOnClickListener {
            --count
            view.textView.text = count.toString()
        }

        // Inflate the layout for this fragment
        return view
    }


}
