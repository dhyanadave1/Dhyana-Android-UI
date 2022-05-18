package com.example.dhyana_android_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.btnFinalLogin
import kotlinx.android.synthetic.main.activity_login.etUserName
import kotlinx.android.synthetic.main.activity_login.etPhone
import kotlinx.android.synthetic.main.activity_login.forgotpwd

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        forgotpwd.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        btnFinalLogin.setOnClickListener {
            val email = etUserName.text.toString().trim()
            val password = etPhone.text.toString().trim()
            val emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+"

            if (email.isEmpty()) {
                etUserName.error = "Email Required"
                return@setOnClickListener
            }

            if (email.matches(emailPattern.toRegex())) {
                Toast.makeText(this@LoginActivity,"Valid email address", Toast.LENGTH_SHORT).show()
            } else {
                etUserName.error = "Email is not valid"
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                    etPhone.error = "Password Required"
                    return@setOnClickListener
                }
            }
        }
    }


