package com.example.test

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val songs:List<song>): Adapter<MyAdapter.MyViewHolder>(){


    class MyViewHolder(itemView: View): ViewHolder(itemView) {
        val txttitle=itemView.findViewById<TextView>(R.id.txttitle)
        val txtdesp=itemView.findViewById<TextView>(R.id.txtdesp)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater=LayoutInflater.from(parent.context)
        val view= inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.txttitle.text=songs[position].title
        holder.txtdesp.text=songs[position].desp
        val color="#cccc"



    }

    override fun getItemCount(): Int {
            return songs.size
    }

}



