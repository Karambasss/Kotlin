package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        button_prev3.setOnClickListener(this::onClickListener)
        button_next3.setOnClickListener(this::onClickListener)
    }
    private fun onClickListener(view : View){
        var intent: Intent
        when(view.id){
            R.id.button_prev3 -> {
                intent = Intent(this@ThirdActivity, SecondActivity::class.java)
                startActivity(intent)
            }
            R.id.button_next3 -> {
                intent = Intent(this@ThirdActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
