package com.example.dhyana_android_ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dhyana_android_ui.CategoryDataClass
import com.example.dhyana_android_ui.ItemDataClass
import com.example.dhyana_android_ui.R
import kotlinx.android.synthetic.main.items.view.ivDiningChair
import kotlinx.android.synthetic.main.items.view.tvPrice
import kotlinx.android.synthetic.main.items.view.tvTitle

class VerticalRecyclerViewAdapter(private var itemList: MutableList<ItemDataClass>) : RecyclerView.Adapter<VerticalRecyclerViewAdapter.MyItemHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): VerticalRecyclerViewAdapter.MyItemHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.items, parent, false)
        return VerticalRecyclerViewAdapter.MyItemHolder(view)
    }

    override fun onBindViewHolder(holder: MyItemHolder, position: Int) {
        val recentItem = itemList[position]
        holder.image.setImageResource(recentItem.itemImage)
        holder.title.text = recentItem.itemHeading
        holder.price.text = recentItem.itemPrice
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyItemHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val image : ImageView = itemView.ivDiningChair
        val title: TextView = itemView.tvTitle
        val price : TextView = itemView.tvPrice
    }
}