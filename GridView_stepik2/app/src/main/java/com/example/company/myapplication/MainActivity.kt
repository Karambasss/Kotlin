package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.GridView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.absoluteValue
import kotlin.math.round
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = Array(31) {"$it"}
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, data)
        gridView.adapter = arrayAdapter
        gridView.columnWidth = GridView.AUTO_FIT

        gridView.setOnItemClickListener { parent, view, position, id ->
            val columnsCnt = gridView.numColumns
            Log.d("TAG", "$columnsCnt")

            val indexRow = (position / columnsCnt) + 1
            Log.d("TAG", "IndexRow: $indexRow")
            val indexCol = (position % columnsCnt) + 1
            Log.d("TAG", "IndexCol: $indexCol")

            data[position] = "$indexRow,$indexCol"
            arrayAdapter.notifyDataSetChanged()
        }
    }
}
