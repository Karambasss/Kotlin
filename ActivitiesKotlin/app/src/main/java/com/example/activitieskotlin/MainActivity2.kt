package com.example.activitieskotlin

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        button2.setOnClickListener(this::clickAndProceedToMain)
    }
    private fun clickAndProceedToMain(v : View){
        setResult(Activity.RESULT_OK, intent.putExtra("name", editTextText.text.toString()))
        finish()
    }
}