package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val wardrobe: MutableList<Wardrobe>) :
    RecyclerView.Adapter<CustomAdapter.WardrobeViewHolder>(){


    class WardrobeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val nameTV: TextView = itemView.findViewById(R.id.nameTV)
        val descriptionTV: TextView = itemView.findViewById(R.id.descriptionTW)
        val imageView: ImageView = itemView.findViewById(R.id.imageViewIW)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WardrobeViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return WardrobeViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: WardrobeViewHolder, position: Int) {
        val wardrobe = wardrobe[position]
        holder.nameTV.text = wardrobe.name
        holder.descriptionTV.text = wardrobe.description
        holder.imageView.setImageResource(wardrobe.image)
    }

    override fun getItemCount() = wardrobe.size
}
