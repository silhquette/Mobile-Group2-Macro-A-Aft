package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class NearbySpotAdapter(private val spotList: ArrayList<NearbySpots>) : RecyclerView.Adapter<NearbySpotAdapter.SpotViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SpotViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.nearby_card, parent, false)
        return SpotViewHolder(itemView)
    }


    override fun onBindViewHolder(holder: NearbySpotAdapter.SpotViewHolder, position: Int) {
        val currentItem = spotList[position]
        holder.cardImage.setImageResource(currentItem.cardImage)
        holder.cardTitle.text = currentItem.cardTitle
        holder.cardBody.text = currentItem.cardBody
        holder.cardDistance.text = currentItem.cardDistance
    }

    override fun getItemCount(): Int {
        return spotList.size
    }

    class SpotViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val cardImage: ShapeableImageView = itemView.findViewById(R.id.card_image)
        val cardTitle: TextView = itemView.findViewById(R.id.card_title)
        val cardBody: TextView = itemView.findViewById(R.id.card_body)
        val cardDistance: TextView = itemView.findViewById(R.id.card_distance)
    }

}