package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class DistrictAdapter (private val districtList: ArrayList<District>) : RecyclerView.Adapter<DistrictAdapter.DistrictViewHolder>() {
    var onItemClick : ((District) -> Unit)? = null

    class DistrictViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        val districtImage: ShapeableImageView = itemView.findViewById(R.id.card_image)
        val districtName: TextView = itemView.findViewById(R.id.card_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DistrictViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.district_card, parent, false)
        return DistrictViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return districtList.size
    }

    override fun onBindViewHolder(holder: DistrictViewHolder, position: Int) {
        val currentItem = districtList[position]
        holder.districtImage.setImageResource(currentItem.districtImage)
        holder.districtName.text = currentItem.districtName

        holder.itemView.setOnClickListener {
            onItemClick?.invoke(currentItem)
        }
    }
}