package com.example.dhyana_android_ui

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.inputmethod.InputMethodManager
import kotlinx.android.synthetic.main.activity_forgot_password.btnSend
import kotlinx.android.synthetic.main.activity_forgot_password.forgot_pwd_base_screen
import kotlinx.android.synthetic.main.activity_login.login_base_screen

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        fun Activity.hideKeyboard() {
            currentFocus?.let {
                val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0.toInt())
            }
        }

        btnSend.setOnClickListener {

        }

        forgot_pwd_base_screen.setOnClickListener {
            hideKeyboard()
        }

    }
}