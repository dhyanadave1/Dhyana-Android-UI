package com.example.dhyana_android_ui

data class ItemDataClass(var itemImage : Int, var itemHeading : String, var itemPrice: String)

var itemDetails = mutableListOf(
    ItemDataClass(R.drawable.dining_chair, "Daytona dining chair", "\$45.00"),
    ItemDataClass(R.drawable.accent_chair, "Accent chair", "\$78.00"),
    ItemDataClass(R.drawable.nordic_dining_chair, "Nordic dining chair", "\$98.00")
)
