package com.example.dhyana_android_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dhyana_android_ui.adapters.HorizontalRecyclerViewAdapter
import com.example.dhyana_android_ui.adapters.VerticalRecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_home_screen.recyclerView
import kotlinx.android.synthetic.main.activity_home_screen.verticalRecyclerView
import kotlinx.android.synthetic.main.categories.cardView

class HomeScreenActivity : AppCompatActivity() {

    private lateinit var adapter: HorizontalRecyclerViewAdapter
    private lateinit var imageArray :Array<Int>
    lateinit var headline: Array<String>
    private lateinit var itemImageArray: Array<Int>
    lateinit var myAdapter: VerticalRecyclerViewAdapter
    lateinit var titleArray: Array<String>
    lateinit var priceArray : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)
        imageArray = arrayOf(R.drawable.ic_chair, R.drawable.ic_lamp, R.drawable.ic_bathtub)
        headline = arrayOf("Chair", "Lamp", "Bathtub")
        adapter = HorizontalRecyclerViewAdapter(details)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL,false)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
        getUserdata()
        itemImageArray = arrayOf(R.drawable.dining_chair,R.drawable.dining_chair, R.drawable.accent_chair, R.drawable.nordic_dining_chair)
        titleArray = arrayOf("Daytona dining chair", "Daytona dining chair","Accent chair", "Nordic dining chair")
        priceArray = arrayOf("\$45.00","\$45.00", "\$78.00", "\$98.00")
        myAdapter = VerticalRecyclerViewAdapter(itemDetails)
        verticalRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        verticalRecyclerView.adapter = myAdapter
        getUserItem()

        val itemList = ArrayList<String>()
        for (i in 0..10){
            itemList.add("List Item $i")
        }

    }

    private fun getUserdata() {
        val newArrayList = arrayListOf<CategoryDataClass>()
        for (i in imageArray.indices) {
            val data = CategoryDataClass(imageArray[i], headline[i])
            newArrayList.add(data)
        }
        recyclerView.adapter = HorizontalRecyclerViewAdapter(newArrayList)
    }

    private  fun  getUserItem() {
        val arrayList = arrayListOf<ItemDataClass>()
        for (i in itemImageArray.indices) {
            val myData = ItemDataClass(itemImageArray[i], titleArray[i], priceArray[i])
            arrayList.add(myData)
        }
        verticalRecyclerView.adapter = VerticalRecyclerViewAdapter(arrayList)
    }
}

