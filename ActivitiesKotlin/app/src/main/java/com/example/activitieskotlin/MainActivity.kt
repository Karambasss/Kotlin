package com.example.activitieskotlin

import android.app.Activity
import android.app.DatePickerDialog
import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.result.ActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    // Получаем result от MainActivity2
    private val getResult =
        registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()) {
            if (it.resultCode == Activity.RESULT_OK){
                val value = it.data?.getStringExtra("name")
                textView.text = value
            }
        }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this::onProceedListener)

    }

    private fun onProceedListener(view : View){
        val intent = Intent(this,MainActivity2::class.java)
        getResult.launch(intent)
    }
}