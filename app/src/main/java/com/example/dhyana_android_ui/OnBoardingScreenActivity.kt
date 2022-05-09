package com.example.dhyana_android_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.dhyana_android_ui.adapters.FragmentAdapter
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnFirst
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnSecond
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnThird
import kotlinx.android.synthetic.main.activity_on_boarding_screen.view_pager

class OnBoardingScreenActivity : AppCompatActivity() {

    lateinit var viewPager : ViewPager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_screen)
        setViewPager()
    }

    private fun setViewPager() {
        val oneFragmentFirst = FirstFragment()
        val oneFragmentSecond = FirstFragment()
        val fragmentList = arrayListOf(oneFragmentFirst, oneFragmentSecond, SecondFragment())
        val adapter = FragmentAdapter(fragmentList, supportFragmentManager)
        view_pager.adapter = adapter

        view_pager.addOnPageChangeListener(object :
            ViewPager.OnPageChangeListener {

            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int,
            ) {
            }

            override fun onPageSelected(position: Int) {
                when (position) {
                    0 -> {
                        oneFragmentFirst.setTitle("Discover", "Quality products from household are guaranteed.", R.drawable.first_onboarding_screen, "Get Ready", R.drawable.shape_for_first_screen_btn, R.color.black)
                        btnFirst.setImageResource(R.drawable.selected_dot)
                        btnSecond.setImageResource(R.drawable.default_dot)
                        btnThird.setImageResource(R.drawable.default_dot)
                    } 1 -> {
                        oneFragmentSecond.setTitle("Coming Soon", "Some products that will be present in the household will provide comfort for you.", R.drawable.second_onboarding_screen, "Started Now", R.drawable.shape, R.color.white)
                        btnFirst.setImageResource(R.drawable.default_dot)
                        btnSecond.setImageResource(R.drawable.selected_dot)
                        btnThird.setImageResource(R.drawable.default_dot)
                    } 2 -> {
                        btnFirst.setImageResource(R.drawable.default_dot)
                        btnSecond.setImageResource(R.drawable.default_dot)
                        btnThird.setImageResource(R.drawable.selected_dot)
                    }
                }
            }

            override fun onPageScrollStateChanged(state: Int) {

            }
            })
    }
}


