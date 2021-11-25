package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var recyclerView=findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.adapter=RecyclerAdapter()

        var layout= LinearLayoutManager(this)
        recyclerView.layoutManager=layout
    }
}