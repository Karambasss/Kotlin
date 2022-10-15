package com.example.applicationwithprogressbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.time.Duration
import java.util.*

class MainActivity : AppCompatActivity() {
    private var lastClickTime : Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener(this::updateProgressBtnListener)
    }

    private fun updateProgressBtnListener(v: View) {
        //убираем повторное нажатие на кнопку
        Log.d("test1","$lastClickTime")
        Log.d("test2", "${SystemClock.elapsedRealtime()}")
        Log.d("test", "${SystemClock.elapsedRealtime() - lastClickTime}")
        if ((SystemClock.elapsedRealtime() - lastClickTime  ) < 1000*100){
            return
        }
        var myProgress = 0
        progressBar.progress = myProgress
        progressBar.visibility = View.VISIBLE
        var timer = Timer()
        //запуск таймера каждую секунду заново заходит в эту функцию
        timer.scheduleAtFixedRate(object : TimerTask() {
            override fun run() {
                //проверка на завершение загрузки
                if (progressBar.progress >= 100){
                    timer.cancel() //остановка новых таймеров
                    runOnUiThread {
                        Toast.makeText(this@MainActivity,"Your downloading is completed",Toast.LENGTH_LONG).show()
                    }
                    Log.d("TAG", "${progressBar.progress}")
                }
                else {
                    myProgress++
                    // для обновления UI используется свой поток
                    runOnUiThread {
                        progressBar.progress = myProgress
                        textView.text = getString(R.string.txt_name) + " " + progressBar.progress + "%"
                    }
                }
            }
        }, 250, 1000)
        lastClickTime = SystemClock.elapsedRealtime()
        Log.d("test", "$lastClickTime, ${SystemClock.elapsedRealtime() - lastClickTime}")
        Log.d("TAG", "After all the downloading is over and timer is closed ")

    } //через 250 мс начнется загрузка, каждые 1 сек будет обновление
}