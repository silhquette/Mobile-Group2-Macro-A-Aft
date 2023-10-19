package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AmenityAdapter (private val amenityList: ArrayList<Amenities>) : RecyclerView.Adapter<AmenityAdapter.AmenityViewHolder>() {
    class AmenityViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        var amenity: TextView = itemView.findViewById(R.id.amenity)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): AmenityAdapter.AmenityViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.amenity_list, parent, false)
        return AmenityAdapter.AmenityViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: AmenityAdapter.AmenityViewHolder, position: Int) {
        val currentItem = amenityList[position]
        holder.amenity.text = currentItem.amenity
    }

    override fun getItemCount(): Int {
        return amenityList.size
    }
}