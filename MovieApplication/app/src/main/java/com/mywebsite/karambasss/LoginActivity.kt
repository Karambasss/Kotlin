package com.mywebsite.karambasss

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mywebsite.karambasss.view.MoviesActivity
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        login_activity_login_button.setOnClickListener {
            val intent = Intent(this@LoginActivity, MoviesActivity::class.java)
            startActivity(intent)
            this.finish()
        }
    }
}