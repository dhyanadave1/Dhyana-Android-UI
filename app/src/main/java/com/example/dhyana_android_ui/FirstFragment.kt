package com.example.dhyana_android_ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.custom_item_default.tvSubHeading
import kotlinx.android.synthetic.main.custom_item_default.tvHeading
import kotlinx.android.synthetic.main.fragment_first.btnSubmit
import kotlinx.android.synthetic.main.fragment_first.ivBackgroundImage

class FirstFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    fun setTitle(text: String, secondText: String, image: Int, thirdText: String, drawable: Int, color: Int) {
        tvHeading.text = text
        tvSubHeading.text = secondText
        ivBackgroundImage.setImageResource(image)
        btnSubmit.text = thirdText
        btnSubmit.setBackgroundResource(drawable)
        btnSubmit.setTextColor(ContextCompat.getColor(requireContext(),color))
    }
}