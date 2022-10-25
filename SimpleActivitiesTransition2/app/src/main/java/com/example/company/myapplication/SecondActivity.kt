package com.example.company.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        button_prev2.setOnClickListener(this::onClickListener)
        button_next2.setOnClickListener(this::onClickListener)
    }

    private fun onClickListener(view : View){
        var intent: Intent
        when(view.id){
            R.id.button_prev2 -> {
                intent = Intent(this@SecondActivity, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.button_next2 -> {
                intent = Intent(this@SecondActivity, ThirdActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
