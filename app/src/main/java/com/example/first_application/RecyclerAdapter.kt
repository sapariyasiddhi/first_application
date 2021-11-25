package com.example.first_application

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {

    var Seven_Wonders= arrayOf("chichenitza","christtheredeemer","colosseum","greatwallofchina","machupicchu","petra","tajmahal")
    
    //var state_data= arrayOf("Gujarat","Goa","Chhattisgarh","Bihar","Assam","Jharkhand","Odisha")
    var image1= intArrayOf(R.drawable.chichenitza,R.drawable.christtheredeemer,R.drawable.colosseum,R.drawable.greatwallofchina,R.drawable.machupicchu,R.drawable.petra,R.drawable.tajmahal)

    inner class MyHolder(view: View) : RecyclerView.ViewHolder(view){
        var Seven_Wonders: TextView
        //var state: TextView
        var image: ImageView

        init{
            image=view.findViewById(R.id.imageView)
            Seven_Wonders=view.findViewById(R.id.testview1)
            //state=view.findViewById(R.id.textview2)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        var v= LayoutInflater.from(parent.context).inflate(R.layout.mylayout,parent,false)


        return  MyHolder(v)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.Seven_Wonders.text=Seven_Wonders[position]
        //holder.state.text=state_data[position]
        holder.image.setImageResource(image1[position])
    }

    override fun getItemCount(): Int {
        return Seven_Wonders.size
    }
}