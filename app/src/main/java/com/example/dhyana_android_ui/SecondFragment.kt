package com.example.dhyana_android_ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import kotlinx.android.synthetic.main.fragment_second.btnSubmitToAuthentication


class SecondFragment : Fragment(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val btn = view.findViewById<Button>(R.id.btnSubmitToAuthentication)
        btn?.setOnClickListener(this)
        // Inflate the layout for this fragment
        return view

    }

    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btnSubmitToAuthentication -> {
                val intent = Intent (context, AuthenticationNavigationActivity::class.java)
                startActivity(intent)
            }
        }
    }

}