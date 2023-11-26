package com.example.consumoapisuperhero

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        object : CountDownTimer(1000,1){
            override fun onTick(p0: Long) {

            }

            override fun onFinish() {
              startActivity(Intent(this@MainActivity,Loguin::class.java))
            }
        }.start()
    }
}