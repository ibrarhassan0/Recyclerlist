package com.example.test

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_second.*

class Second_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val name=intent.getStringExtra("tagname")
        val age=intent.getDoubleExtra("tagage",0.0)
        val country=intent.getStringExtra("tagcountry")
        val resString="$name age is $age and live in $country"
        result.text=resString
        btnback.setOnClickListener {
            finish()
        }

    }
}