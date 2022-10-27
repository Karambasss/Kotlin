package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var startPoint = 0
    var endPoint = 0
    private var myList : MutableList<Int> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myList)
        listView.adapter = arrayAdapter
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{

            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                Log.d("TAG", "$progress")
            }

            override fun onStartTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null){
                    myList.clear()
                    arrayAdapter.notifyDataSetChanged()
                    startPoint = seekBar.progress
                }
            }

            override fun onStopTrackingTouch(seekBar: SeekBar?) {
                if (seekBar != null){
                    endPoint = seekBar.progress

                    if (endPoint != 0){
                        myList.addAll(MutableList(endPoint) { it * it })
                        arrayAdapter.notifyDataSetChanged()
                    }
                }
                Toast.makeText(this@MainActivity,"Changed seekbar value: ${(endPoint - startPoint) * 100 / 20}%",Toast.LENGTH_LONG).show()
            }
        })
    }
}
