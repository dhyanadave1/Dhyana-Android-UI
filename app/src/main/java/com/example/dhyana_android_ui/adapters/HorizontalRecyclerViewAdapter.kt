package com.example.dhyana_android_ui.adapters

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.dhyana_android_ui.CategoryDataClass
import com.example.dhyana_android_ui.R
import kotlinx.android.synthetic.main.categories.view.cardView
import kotlinx.android.synthetic.main.categories.view.imChair
import kotlinx.android.synthetic.main.categories.view.tvChair

class HorizontalRecyclerViewAdapter(private val dataList: List<CategoryDataClass>) : RecyclerView.Adapter<HorizontalRecyclerViewAdapter.MyViewHolder>() {
    private var selectedItemPosition: Int = 0
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.categories, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, @SuppressLint("RecyclerView") position: Int) {
        val currentItem = dataList[position]
        holder.titleImage.setImageResource(currentItem.titleImage)
        holder.tvHeading.text = currentItem.heading

        holder.itemView.setOnClickListener {
            selectedItemPosition = position
            notifyDataSetChanged()
        }

        if(selectedItemPosition == position)
            holder.cardView.setBackgroundColor(Color.parseColor("#F1F1F1"))

        else
            holder.cardView.setBackgroundColor(Color.parseColor("#FFFFFF"))

    }

    override fun getItemCount(): Int {
        return  dataList.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val cardView: CardView = itemView.cardView
        val titleImage: ImageView = itemView.imChair
        val tvHeading: TextView = itemView.tvChair
    }
}

