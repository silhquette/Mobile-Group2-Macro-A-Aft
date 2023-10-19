package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class CarousellAdapter (private val imageList: ArrayList<Carousell>) : RecyclerView.Adapter<CarousellAdapter.CarousellViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarousellAdapter.CarousellViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.food_carousell, parent, false)
        return CarousellAdapter.CarousellViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: CarousellAdapter.CarousellViewHolder, position: Int) {
        val currentItem = imageList[position]
        holder.districtImage.setImageResource(currentItem.foodImage)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }

    class CarousellViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val districtImage: ShapeableImageView = itemView.findViewById(R.id.carousell_image)
    }
}