package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import java.lang.ArithmeticException
import java.lang.NumberFormatException
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        add.setOnClickListener(this::plusListener)
        subtr.setOnClickListener(this::minusListener)
        mul.setOnClickListener(this::multiplicationListener)
        divide.setOnClickListener(this::divideListener)
    }
    private fun plusListener(v : View){
        val x : Int
        val y : Int
        try {
            x = arg1.text.toString().toInt()
            y = arg2.text.toString().toInt()
        }
        catch (e : NumberFormatException){
            answer.text = "Input Error"
            return
        }
        answer.text = (x + y).toString()
    }
    private fun minusListener(v : View){
        val x : Int
        val y : Int
        try {
            x = arg1.text.toString().toInt()
            y = arg2.text.toString().toInt()
        }
        catch (e : NumberFormatException){
            answer.text = "Input Error"
            return
        }
        answer.text = (x - y).toString()
    }
    private fun multiplicationListener(v : View){
        val x : Int
        val y : Int
        try {
            x = arg1.text.toString().toInt()
            y = arg2.text.toString().toInt()
        }
        catch (e : NumberFormatException){
            answer.text = "Input Error"
            return
        }
        answer.text = (x * y).toString()
    }
    private fun divideListener(v : View){
        val x : Int
        val y : Int
        val result : Int
        try {
            x = arg1.text.toString().toInt()
            y = arg2.text.toString().toInt()
            result = x / y
        }
        catch (e : NumberFormatException){
            answer.text = "Input Error"
            return
        }
        catch (e : ArithmeticException){
            answer.text = "Div by zero"
            return
        }
        answer.text = result.toString()
    }
}
