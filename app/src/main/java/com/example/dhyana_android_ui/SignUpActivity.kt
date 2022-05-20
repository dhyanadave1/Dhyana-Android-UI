package com.example.dhyana_android_ui

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.AdapterView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_login.etPhone
import kotlinx.android.synthetic.main.activity_login.etUserName
import kotlinx.android.synthetic.main.activity_login.login_base_screen
import kotlinx.android.synthetic.main.activity_sign_up.btnSubmit
import kotlinx.android.synthetic.main.activity_sign_up.signup_base_screen
import kotlinx.android.synthetic.main.activity_sign_up.spMonth
import kotlinx.android.synthetic.main.activity_sign_up.tvHaveAccount

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        spMonth.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }
        }

        fun Activity.hideKeyboard() {
            currentFocus?.let {
                val inputMethodManager = getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
                inputMethodManager.hideSoftInputFromWindow(it.windowToken, 0.toInt())
            }
        }

        signup_base_screen.setOnClickListener {
            hideKeyboard()
        }

        tvHaveAccount.setOnClickListener {
            val intent = Intent(this@SignUpActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        btnSubmit.setOnClickListener {
            val userName = etUserName.text.toString().trim()
            val phone = etPhone.text.toString().trim()

            if (userName.isEmpty()) {
                etUserName.error = getString(R.string.username_required)
                return@setOnClickListener
            }

            if (userName.length >= 15) {
                etUserName.error = getString(R.string.username_too_long)
                return@setOnClickListener
            }

            if (!userName.matches(Constant.NOWHITESPACE.toRegex())) {
                etUserName.error = getString(R.string.space_not_valid)
                return@setOnClickListener
            }

            if (phone.isEmpty()) {
                etPhone.error = getString(R.string.phone_number_required)
                return@setOnClickListener
            }

            if (phone.length < 10) {
                etPhone.error = getString(R.string.mobile_number_not_valid)
                return@setOnClickListener
            }

            val intent = Intent(this@SignUpActivity, HomeScreenActivity::class.java)
            startActivity(intent)
        }
        }
    }

