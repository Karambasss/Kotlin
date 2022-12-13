package com.mywebsite.karambasss.view
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.mywebsite.karambasss.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val intent = Intent(this@MainActivity, MoviesActivity::class.java)
//        startActivity(intent)

        main_activity_register_button.setOnClickListener{

            Toast.makeText(this, "You clicked me.", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, RegistrationActivity::class.java)
            startActivity(intent)
        }

        main_activity_textView_loginTip.setOnClickListener{
            Toast.makeText(this, "You are at the login page", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@MainActivity, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}