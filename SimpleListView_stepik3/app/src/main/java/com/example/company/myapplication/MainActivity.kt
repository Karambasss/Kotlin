package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val my_list = MutableList(11) { it * it }
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, my_list)

        listView.adapter = arrayAdapter

        listView.setOnItemClickListener { parent, view, position, id ->
            //var element_of_the_listView = my_list[position]
            //Log.d("TAG", "$element_of_the_listView")

            my_list.removeAt(position)
            arrayAdapter.notifyDataSetChanged()
        }
    }
}
