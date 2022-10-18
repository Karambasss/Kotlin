package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        butAnswer.setOnClickListener(this::answerListener)
    }
    private fun answerListener(view: View){
        tvAnswer.text = ""
        getAnswer()
    }

    private fun getAnswer(){
        // Если никакой radioButton не выбран, то результатом вызова checkedRadioButtonId будет -1
        Log.d("TAG", "${rgAnswers.checkedRadioButtonId}")

        tvAnswer.text = when(rgAnswers.checkedRadioButtonId){
            R.id.rbDisk -> "Неправильно!"
            R.id.rbSphere -> "Правильно!"
            R.id.rbEllipsoid -> "Неправильно!"
            R.id.rbCube -> "Неправильно!"
            -1 -> "Неправильно!"
            else -> ""
        }
    }
}
