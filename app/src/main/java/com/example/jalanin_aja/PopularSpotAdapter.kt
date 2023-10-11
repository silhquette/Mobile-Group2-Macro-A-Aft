package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class PopularSpotAdapter (private val spotList: ArrayList<PopularSpots>) : RecyclerView.Adapter<PopularSpotAdapter.SpotViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpotViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.popular_card, parent, false)
        return SpotViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: PopularSpotAdapter.SpotViewHolder, position: Int) {
        val currentItem = spotList[position]
        holder.cardImage.setImageResource(currentItem.cardImage)
        holder.cardTitle.text = currentItem.cardTitle
        holder.cardLocation.text = currentItem.cardLocation
    }

    override fun getItemCount(): Int {
        return spotList.size
    }

    class SpotViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val cardImage: ShapeableImageView = itemView.findViewById(R.id.pop_image)
        val cardTitle: TextView = itemView.findViewById(R.id.pop_title)
        val cardLocation: TextView = itemView.findViewById(R.id.pop_location)
    }

}