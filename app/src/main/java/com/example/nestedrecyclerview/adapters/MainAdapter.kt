package com.example.nestedrecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.R
import com.example.nestedrecyclerview.model.Categories
import com.example.nestedrecyclerview.model.CategoryItems

class MainAdapter(val context: Context, val dataSet:ArrayList<Categories>):RecyclerView.Adapter<MainAdapter.ViewHolder>() {

    class ViewHolder(view: View):RecyclerView.ViewHolder(view) {
        val maintextView:TextView = view.findViewById(R.id.mainTextView)
        val helperRecyclerView:RecyclerView = view.findViewById(R.id.categoryItemRecycler)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.main_row,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.maintextView.text = dataSet[position].category
        initializeHelper(context,holder.helperRecyclerView,dataSet[position].items)
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }


    private fun initializeHelper(context: Context, recyclerview:RecyclerView, helperSet:ArrayList<CategoryItems>){

        recyclerview.layoutManager = LinearLayoutManager(context,RecyclerView.HORIZONTAL,false)
        recyclerview.adapter = HelperAdapter(helperSet)

    }
}