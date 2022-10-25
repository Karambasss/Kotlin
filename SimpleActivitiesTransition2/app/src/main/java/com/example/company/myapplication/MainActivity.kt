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
        button_prev1.setOnClickListener(this::onClickListener)
        button_next1.setOnClickListener(this::onClickListener)
    }
    private fun onClickListener(view : View){
        var intent: Intent
        when(view.id){
            R.id.button_prev1 -> {
                intent = Intent(this@MainActivity, ThirdActivity::class.java)
                startActivity(intent)
            }
            R.id.button_next1 -> {
                intent = Intent(this@MainActivity, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
