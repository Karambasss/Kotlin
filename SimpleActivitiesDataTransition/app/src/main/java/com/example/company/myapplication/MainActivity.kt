package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this::buttonClickListener)
    }

    private fun buttonClickListener(view : View){
        var intent = Intent(this@MainActivity, SecondActivity::class.java)

        val inputText = editText.text.toString()

//        if (inputText.isBlank()) return

        intent.putExtra("name_input", inputText)

        startActivity(intent)
    }
}
