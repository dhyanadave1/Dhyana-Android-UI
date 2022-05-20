package com.example.dhyana_android_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_authentication_navigation.btnSignUp
import kotlinx.android.synthetic.main.activity_authentication_navigation.btnLogin

class AuthenticationNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authentication_navigation)

        btnLogin.setOnClickListener {
            val intent = Intent(this@AuthenticationNavigationActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        btnSignUp.setOnClickListener {
            val intent = Intent(this@AuthenticationNavigationActivity, SignUpActivity::class.java)
            startActivity(intent)
        }
    }
}