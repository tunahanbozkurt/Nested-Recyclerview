package com.example.nestedrecyclerview.adapters

import android.content.Context
import android.content.res.Resources
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.CategoryItems

class HelperAdapter(val categoryItems:ArrayList<CategoryItems>):RecyclerView.Adapter<HelperAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {

        val helperImageView:ImageView = view.findViewById(R.id.imageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.helper_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       // holder.helperTextView.text = helperSet[position]
        holder.helperImageView.setImageBitmap(categoryItems[position].bitmap)

    }

    override fun getItemCount(): Int {
        return categoryItems.size
    }
}