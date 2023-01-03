package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import kotlinx.android.synthetic.main.activity_recycler.*

class Recycler : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val list= mutableListOf<song>()
        list.add(song("hello","ok"))
        list.add(song("happy","ok"))
        list.add(song("baby","ok"))
        list.add(song("khan","ok"))
        list.add(song("Nidia","ok5"))
        list.add(song("lazy","ok"))
        list.add(song("lazy","ok3"))
        list.add(song("hajvery","ok"))
        list.add(song("punjab","faiz"))
     songslist.adapter=MyAdapter(list)
        songslist.layoutManager=LinearLayoutManager(this)

    }
}

