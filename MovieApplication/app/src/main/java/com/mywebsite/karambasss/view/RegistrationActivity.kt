package com.mywebsite.karambasss.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mywebsite.karambasss.R
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_registration.*

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        setImageView()
    }

    private fun setImageView() {
        Picasso.get().load("https://i.imgur.com/DvpvklR.png").into(activity_registration_imageView)
    }

}