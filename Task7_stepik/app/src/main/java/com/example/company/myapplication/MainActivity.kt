package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var numberOfChanges = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Добавляем обработчик изменения editText
        editText.addTextChangedListener(object : TextWatcher {
            // До изменения
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("TAG", "Before text changed = $p0")
            }
            // Само изменение
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("TAG", "On text changed = $p0")
                numberOfChanges++
            }
            // После измения
            override fun afterTextChanged(p0: Editable?) {
                Log.d("TAG", "After text changed= $p0")
                textView.text = numberOfChanges.toString()
            }
        })
    }
}
