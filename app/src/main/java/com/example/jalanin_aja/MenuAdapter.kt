package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class MenuAdapter(private val foodList: ArrayList<Foods>) : RecyclerView.Adapter<MenuAdapter.MenuViewHolder>() {
    class MenuViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val foodImage: ShapeableImageView = itemView.findViewById(R.id.card_image)
        val foodName: TextView = itemView.findViewById(R.id.card_name)
        val foodPrice: TextView = itemView.findViewById(R.id.card_price)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuAdapter.MenuViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.food_menu, parent, false)
        return MenuAdapter.MenuViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MenuAdapter.MenuViewHolder, position: Int) {
        val currentItem = foodList[position]
        holder.foodImage.setImageResource(currentItem.foodImage)
        holder.foodName.text = currentItem.foodName
        holder.foodPrice.text = "Rp. " + currentItem.foodPrice.toString()
    }

    override fun getItemCount(): Int {
        return foodList.size
    }
}