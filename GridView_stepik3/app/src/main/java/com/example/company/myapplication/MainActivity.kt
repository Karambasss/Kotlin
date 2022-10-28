package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val array = MutableList(31) { it }
        val arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1, array)
        gridView.adapter = arrayAdapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            array.removeAt(position)
            arrayAdapter.notifyDataSetChanged()
        }
    }
}
