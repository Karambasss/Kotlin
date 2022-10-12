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
        editText.addTextChangedListener(object : TextWatcher {
            // До изменения текста
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("TAG", "Before = $p0")
            }
            // Когда сам текст изменяем
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                Log.d("TAG", "On text changed = $p0")
                var myString : String = p0.toString()

                if (myString.contains("question")){
                    Log.d("TAG","BEFORE DELETE QUESTION = $myString")
                    myString = myString.replace("question", "answer", ignoreCase = true) // Нашли question - изменяем вручную само значение
                    Log.d("TAG","AFTER DELETE QUESTION = $myString")
                    editText.setText(myString) // Мы автозаменили question на answer -> после этого мы это вводим в setText(), опять вызывая изменение текста
                    numberOfChanges++ //счетчик изменений
                    Log.d("TAG", "$numberOfChanges")
                }
                else if (myString.contains("request")){
                    Log.d("TAG","BEFORE DELETE REQUEST = $myString")
                    myString = myString.replace("request", "response", ignoreCase = true)
                    Log.d("TAG","AFTER DELETE REQUEST = $myString")
                    editText.setText(myString)
                    numberOfChanges++
                    Log.d("TAG", "$numberOfChanges")

                }
                else if (myString.contains("problem")){
                    Log.d("TAG","BEFORE DELETE PROBLEM = $myString")
                    myString = myString.replace("problem", "task", ignoreCase = true)
                    Log.d("TAG","AFTER DELETE PROBLEM = $myString")
                    editText.setText(myString)
                    numberOfChanges++
                    Log.d("TAG", "$numberOfChanges")
                }
            }
            // После изменения текста
            override fun afterTextChanged(p0: Editable?) {
                Log.d("TAG", "After text changed = $p0")
                editText.setSelection(editText.length()) // каретка на конец строки всего editText после того, как текст изменяем
                textView.text = numberOfChanges.toString()
            }
        })
    }
}
