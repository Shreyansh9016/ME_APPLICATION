package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val btnintent =findViewById<TextView>(R.id.text1)

        btnintent.setOnClickListener{
            //open a  new activity
            intent= Intent(applicationContext, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}