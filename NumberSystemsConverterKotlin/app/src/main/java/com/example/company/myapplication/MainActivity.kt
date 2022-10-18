package com.example.company.myapplication

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        convertButton.setOnClickListener(this::convertListener)
        Log.d("TAG", "${(2).toString(radix = 3)}")
    }

    private fun convertListener(v : View){
        var my_number = 0
        var to_number_system = 0
        try {
            my_number = number.text.toString().toInt()
            to_number_system = systemOfCalculus.text.toString().toInt()
        }
        catch (exception : NumberFormatException){
            convertResult.text = "Error"
            return
        }
        if (my_number != 0 && to_number_system != 0){
            val result = numberSystemsConverter(my_number, to_number_system)
            convertResult.text = result
        }
        else{
            convertResult.text = "Error"
        }
    }

    private fun numberSystemsConverter(number: Int, number_system : Int) : String{
        if (number_system > 36){
            return "Error"
        }
        return number.toString(radix = number_system)
    }
}
