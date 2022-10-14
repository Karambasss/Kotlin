package com.example.simpledatepickerkotlin

import android.app.DatePickerDialog
import android.app.TimePickerDialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import kotlinx.android.synthetic.main.activity_main.*
import java.text.SimpleDateFormat
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this::onClickBtn)
        button2.setOnClickListener(this::onClickBtn)
    }


    private fun onClickBtn(v: View) {
        val calendar = Calendar.getInstance()
        val activity = this@MainActivity
        when(v.id){
            R.id.button -> {
                val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)
                val month = calendar.get(Calendar.MONTH)
                val year = calendar.get(Calendar.YEAR)
                val datePickerDialog = DatePickerDialog(
                    activity,
                    { view, year_pd, monthOfYear, dayOfMonth_pd->
                        calendar.set(Calendar.YEAR, year_pd)
                        calendar.set(Calendar.MONTH, monthOfYear)
                        calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth_pd)
                        val myFormat = "dd.MM.yyyy"
                        val sdf = SimpleDateFormat(myFormat).format(calendar.time)
                        textView.visibility = View.VISIBLE
                        textView.text = resources.getText(R.string.txt_name).toString() + " " + sdf
                    },
                    year,
                    month,
                    dayOfMonth
                )
                datePickerDialog.show()
            }

            R.id.button2 -> {
                val minute = calendar.get(Calendar.MINUTE)
                val hour = calendar.get(Calendar.HOUR_OF_DAY)

                val timePickerDialog = TimePickerDialog(
                    activity,
                    { view, hourofday, minute1 ->
                        calendar.set(Calendar.HOUR_OF_DAY, hourofday)
                        calendar.set(Calendar.MINUTE, minute1)
                        val myFormat = "HH:mm"
                        val sdf = SimpleDateFormat(myFormat).format(calendar.time)
                        Log.d("TAG", "$sdf")
                        textView2.visibility = View.VISIBLE
                        textView2.text = resources.getText(R.string.txt2_name).toString() + " " + sdf
                    },
                    hour,
                    minute,
                    true
                )
                timePickerDialog.show()
            }
            else -> return
        }
    }
}