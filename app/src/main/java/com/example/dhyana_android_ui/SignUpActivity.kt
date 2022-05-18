package com.example.dhyana_android_ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_authentication_navigation.login
import kotlinx.android.synthetic.main.activity_login.etPhone
import kotlinx.android.synthetic.main.activity_login.etUserName
import kotlinx.android.synthetic.main.activity_login.forgotpwd
import kotlinx.android.synthetic.main.activity_sign_up.btnSubmit
import kotlinx.android.synthetic.main.activity_sign_up.spDay
import kotlinx.android.synthetic.main.activity_sign_up.spMonth
import kotlinx.android.synthetic.main.activity_sign_up.spYear
import kotlinx.android.synthetic.main.activity_sign_up.etPhone as etPhone1

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val option: Spinner = spMonth as Spinner
//        spMonth.prompt = "Month"

        // val options = arrayOf("Jan", "Feb", "March", "Apr", "May", "June", "July", "Aug", "Sept", "Oct", "Nov", "Dec" )
        //val dayOptions = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31)
        //val yearOptions = arrayOf(2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019,2020,2021,2022)

       // spMonth.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)
        //spDay.adapter = ArrayAdapter<Int>(this, android.R.layout.simple_list_item_1, dayOptions)
        //spYear.adapter = ArrayAdapter<Int>(this, android.R.layout.simple_list_item_1, yearOptions)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
            }

        }
       val noWhiteSpace = "\\A\\w{4,20}\\z"

        btnSubmit.setOnClickListener {
            val userName = etUserName.text.toString().trim()
            val phone = etPhone.text.toString().trim()

            if (userName.isEmpty()) {
                etUserName.error = "Username required"
                return@setOnClickListener
            }

            if (userName.length >= 15) {
                etUserName.error = "Username too long"
                return@setOnClickListener
            }

            if (!userName.matches(noWhiteSpace.toRegex())) {
                etUserName.error = "Space is not valid"
                return@setOnClickListener
            }

            if (phone.isEmpty()) {
                etPhone.error = "Phone number required"
                return@setOnClickListener
            }

            if (phone.length < 10) {
                etPhone.error = "Mobile number is not valid, 10 digits required"
                return@setOnClickListener
            }
        }

        }
    }
