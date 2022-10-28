package com.example.company.myapplication

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    private val my_list = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, my_list)
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = arrayAdapter
        spinner.dropDownHorizontalOffset = 100
        spinner.dropDownVerticalOffset = 100

        editText.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("TAG", "beforeTextChanged: ${s.toString()}")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("TAG", "onTextChanged ${s.toString()}")
                my_list.clear()
                arrayAdapter.notifyDataSetChanged()
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("TAG", "afterTextChanged ${s.toString()}")
                if (s.toString().isBlank()){
                    return
                }
                val number : Int
                try {
                    number = s.toString().toInt()
                }
                catch (exception : NumberFormatException){
                    editText.setText("")
                    return
                }
                when{
                    number == 0 -> {
                        my_list.addAll(MutableList(1) { (it + 1).toString() })
                        arrayAdapter.notifyDataSetChanged()
                    }
                    number > 0 -> {
                        my_list.addAll(MutableList(number) { (it + 1).toString() })
                        arrayAdapter.notifyDataSetChanged()
                    }
                }
            }
        })

    }
}
