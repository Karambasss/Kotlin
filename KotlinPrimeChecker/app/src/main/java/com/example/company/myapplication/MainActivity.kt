package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        checkBtn.setOnClickListener(this::checkResult)
    }

    private fun checkResult(view: View){
        var number = 0
        try {
            number = editText.text.toString().toInt()
        }
        catch (exception: NumberFormatException){
            Log.d("FatalExceptionTAG", "${editText.text.toString()} is not number")
            textView.text = "error"
            return
        }
        var checkPrimeNumber = 0

        if (number == 1 || number == 0 || number < 0){
            textView.text = "not prime"
            return
        }

        for (i in 1 until number+1){
            if ((number % i) == 0) checkPrimeNumber++
        }

        when{
            checkPrimeNumber == 2 -> textView.text = "prime"
            checkPrimeNumber > 2 -> textView.text = "not prime"
        }
    }
}
