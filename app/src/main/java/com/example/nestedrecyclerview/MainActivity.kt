package com.example.nestedrecyclerview

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedrecyclerview.adapters.MainAdapter
import com.example.nestedrecyclerview.model.Categories
import com.example.nestedrecyclerview.model.CategoryItems

class MainActivity : AppCompatActivity() {


    private var categoryData = ArrayList<Categories>()
    private var categoryItem = ArrayList<CategoryItems>()
   



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        createDummyData()
        val mainrecyclerview = findViewById<RecyclerView>(R.id.mainRecyclerView)
        mainrecyclerview.layoutManager = LinearLayoutManager(this,RecyclerView.VERTICAL,false)
        mainrecyclerview.adapter = MainAdapter(this,categoryData)




    }


    fun createDummyData(){
        val bmap = BitmapFactory.decodeResource(resources,R.drawable.sciencefiction1)
        val resized = Bitmap.createScaledBitmap(bmap,350,420,true)
        val bmap2 = BitmapFactory.decodeResource(resources,R.drawable.sciencefiction2)
        val resized2 = Bitmap.createScaledBitmap(bmap2,350,420,true)
        val bmap3 = BitmapFactory.decodeResource(resources,R.drawable.sciencefiction3)
        val resized3 = Bitmap.createScaledBitmap(bmap3,350,420,true)

        categoryItem.add(CategoryItems(resized))
        categoryItem.add(CategoryItems(resized2))
        categoryItem.add(CategoryItems(resized3))
        categoryItem.add(CategoryItems(resized))
        categoryItem.add(CategoryItems(resized2))
        categoryItem.add(CategoryItems(resized3))
        categoryItem.add(CategoryItems(resized))
        categoryItem.add(CategoryItems(resized2))
        categoryItem.add(CategoryItems(resized3))
        categoryItem.add(CategoryItems(resized))
        categoryItem.add(CategoryItems(resized2))
        categoryItem.add(CategoryItems(resized3))


        categoryData.add(Categories("Science Fiction",categoryItem))
        categoryData.add(Categories("Comedy",categoryItem))
        categoryData.add(Categories("Horror",categoryItem))
        categoryData.add(Categories("Documentary",categoryItem))
        categoryData.add(Categories("History",categoryItem))
    }







}