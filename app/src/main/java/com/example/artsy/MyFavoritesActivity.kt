package com.example.artsy

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MyFavoritesActivity():AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        searchView.queryHint = "Tempbar"
        searchView.textAlignment = View.TEXT_ALIGNMENT_TEXT_START

        var recyclerview = findViewById<RecyclerView>(R.id.rv_fav_list)
        recyclerview.layoutManager = LinearLayoutManager(this)
        var data = ArrayList<String>()
        data.add("Hello madam")
        var adapter = MyFavAdapter(data)

        recyclerview.adapter= adapter

        var count = 1;


        var t1= findViewById<TextView>(R.id.bottom_text)
        t1.setOnClickListener {

            data.add("count "+count.toString())
            adapter.notifyDataSetChanged()
            count++

        }

    }

    fun setAdapter(){

    }
}