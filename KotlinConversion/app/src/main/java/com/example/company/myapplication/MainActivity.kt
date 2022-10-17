package com.example.company.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.NumberFormatException

class MainActivity : AppCompatActivity() {
    val constant_ = 39370f

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editText.addTextChangedListener(object : TextWatcher {

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                Log.d("TAG", "${p0.toString()}: before text changed")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                if (p0.toString() == ""){
                    status.text = "error"
                    return
                }
                var my_num = 0f
                try {
                    my_num = p0.toString().toFloat()
                }
                catch (exception : NumberFormatException){
                    status.text = "error"
                    return
                }
                if (editText.hasFocus()){ //если есть фокус у edittext, тогда надо вызывать setText и менять содержимое edittext2
                    editText2.setText((my_num/constant_).toString())
                }
                Log.d("TAG", "${p0.toString()}: onTextChanged, $p3")
                status.text = ""
            }

            override fun afterTextChanged(p0: Editable?) {
                Log.d("TAG", "${p0.toString()}: afterTextChanged")
            }
        })
        editText2.addTextChangedListener(object : TextWatcher{
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

                Log.d("TAG2", "${p0.toString()}: before text changed2")
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (p0.toString() == ""){
                    status.text = "error"
                    return
                }
                var my_num = 0f
                try {
                    my_num = p0.toString().toFloat()
                }
                catch (exception : NumberFormatException){
                    status.text = "error"
                    return
                }
                if (editText2.hasFocus()){ //если есть фокус у edittext2, тогда надо вызывать setText и менять содержимое edittext
                    editText.setText((my_num*constant_).toString())
                }
                Log.d("TAG2", "${p0.toString()}: on text changed2, start = $p1, before = $p2, count = $p3")
                status.text = ""
            }

            override fun afterTextChanged(p0: Editable?) {
                Log.d("TAG2", "${p0.toString()}: after text changed2")
            }
        })
    }
}
