package com.example.dhyana_android_ui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val postDelayed = Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this@SplashScreenActivity, OnBoardingScreenActivity::class.java)
            startActivity(intent)
            finish()
        }, Constant.delayMillis)
    }
}