package com.example.dhyana_android_ui

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.SyncStateContract
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.btnFinalLogin
import kotlinx.android.synthetic.main.activity_login.etUserName
import kotlinx.android.synthetic.main.activity_login.etPhone
import kotlinx.android.synthetic.main.activity_login.login_base_screen
import kotlinx.android.synthetic.main.activity_login.tvCreateNewAccount
import kotlinx.android.synthetic.main.activity_login.tvForgotPwd

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)



        fun Activity.hideKeyboard() {
            currentFocus?.let {
                val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0.toInt())
            }
        }

        login_base_screen.setOnClickListener {
            hideKeyboard()
        }

        tvForgotPwd.setOnClickListener {
            val intent = Intent(this@LoginActivity, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        tvCreateNewAccount.setOnClickListener {
            val intent = Intent(this@LoginActivity, SignUpActivity::class.java)
            startActivity(intent)
        }

        btnFinalLogin.setOnClickListener {

            val email = etUserName.text.toString().trim()
            val password = etPhone.text.toString().trim()

            if (email.isEmpty()) {
                etUserName.error = getString(R.string.email_required)
                return@setOnClickListener
            }

            if (email.matches(Constant.EMAILPATTERN.toRegex())) {
                Toast.makeText(this@LoginActivity,getString(R.string.valid_email_address), Toast.LENGTH_SHORT).show()
            } else {
                etUserName.error = getString(R.string.email_not_valid)
                return@setOnClickListener
            }

            if (password.isEmpty()) {
                    etPhone.error = getString(R.string.password_required)
                    return@setOnClickListener
                }

            val intent = Intent(this@LoginActivity, HomeScreenActivity::class.java)
            startActivity(intent)
            }
        }
    }



