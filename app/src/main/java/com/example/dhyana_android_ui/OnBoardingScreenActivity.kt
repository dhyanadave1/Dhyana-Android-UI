package com.example.dhyana_android_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.example.dhyana_android_ui.Fragments.FirstFragment
import com.example.dhyana_android_ui.Fragments.SecondFragment
import com.example.dhyana_android_ui.adapters.FragmentAdapter
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnFirst
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnSecond
import kotlinx.android.synthetic.main.activity_on_boarding_screen.btnThird
import kotlinx.android.synthetic.main.activity_on_boarding_screen.view_pager

class OnBoardingScreenActivity : AppCompatActivity() {

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
                    Constant.ZERO -> {
                        oneFragmentFirst.setTitle(getString(R.string.discover), getString(R.string.sub_heading), R.drawable.first_onboarding_screen,getString(R.string.get_ready) , R.drawable.shape_for_first_screen_btn, R.color.black)
                        btnFirst.setImageResource(R.drawable.selected_dot)
                        btnSecond.setImageResource(R.drawable.default_dot)
                        btnThird.setImageResource(R.drawable.default_dot)
                    } Constant.ONE -> {
                        oneFragmentSecond.setTitle(getString(R.string.coming_soon), getString(R.string.second_sub_heading), R.drawable.second_onboarding_screen,getString(R.string.started_now) , R.drawable.shape, R.color.white)
                        btnFirst.setImageResource(R.drawable.default_dot)
                        btnSecond.setImageResource(R.drawable.selected_dot)
                        btnThird.setImageResource(R.drawable.default_dot)
                    } Constant.TWO -> {
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


