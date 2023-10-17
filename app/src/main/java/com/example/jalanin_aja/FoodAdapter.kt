package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FoodAdapter (private val foodList: ArrayList<Foods>) : RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.food_card, parent, false)
        return FoodViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FoodAdapter.FoodViewHolder, position: Int) {
        val currentItem = foodList[position]
        holder.foodImage.setImageResource(currentItem.foodImage)
        holder.foodName.text = currentItem.foodName
        holder.foodAddress.text = currentItem.foodAddress
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

    class FoodViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val foodImage: ShapeableImageView = itemView.findViewById(R.id.card_image)
        val foodName: TextView = itemView.findViewById(R.id.card_name)
        val foodAddress: TextView = itemView.findViewById(R.id.card_address)
    }

}