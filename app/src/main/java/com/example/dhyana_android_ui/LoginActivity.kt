package com.example.dhyana_android_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.btnFinalLogin
import kotlinx.android.synthetic.main.activity_login.etEmail
import kotlinx.android.synthetic.main.activity_login.etPassword

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btnFinalLogin.setOnClickListener {

            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

            if (email.isEmpty()) {
                etEmail.error = "Email Required"
                return@setOnClickListener
            }

            if (email.matches(emailPattern.toRegex())) {
                Toast.makeText(applicationContext, "Valid email address",
                    Toast.LENGTH_SHORT).show()
            } else {
                etEmail.error = "Email is not valid"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                    etPassword.error = "Password Required"
                    return@setOnClickListener
                }
            if (password.length < 8) {
                etPassword.error = "Minimum Password length should be 8"
                return@setOnClickListener
            }
            }
        }
    }


