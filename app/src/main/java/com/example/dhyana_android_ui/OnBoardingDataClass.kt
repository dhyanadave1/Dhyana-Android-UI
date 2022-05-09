package com.example.dhyana_android_ui

data class OnBoardingDataClass(var mainImage: Int, var subImage: Int, var heading: String, var subHeading: String)
var details = mutableListOf(
    OnBoardingDataClass(R.drawable.first_onboarding_screen, R.drawable.rectangle, "Discover", "Quality products"),
    OnBoardingDataClass(R.drawable.second_onboarding_screen, R.drawable.rectangle, "Discover", "Quality products"),
)