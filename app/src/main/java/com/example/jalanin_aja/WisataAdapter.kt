package com.example.jalanin_aja

import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class WisataAdapter(private val wisataList:ArrayList<Wisata>)
    : RecyclerView.Adapter<WisataAdapter.WisataViewHolder>() {

    var onItemClick : ((Wisata) -> Unit)? = null
    class WisataViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val iv_acehdarussalam : ImageView = itemView.findViewById(R.id.iv_acehdarusallam)
        val tv_aceh : TextView = itemView.findViewById(R.id.tv_aceh)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WisataViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.imageitem, parent, false)
        return WisataViewHolder(view)
    }

    override fun onBindViewHolder(holder: WisataViewHolder, position: Int) {
        val wisata = wisataList[position]
        holder.iv_acehdarussalam.setImageResource(wisata.image)
        holder.tv_aceh.text = wisata.name

        holder.itemView.setOnClickListener {
            val OnItemClick = null
            OnItemClick?.invoke(wisata)
        }
    }
    override fun getItemCount(): Int {
        return wisataList.size
    }

}