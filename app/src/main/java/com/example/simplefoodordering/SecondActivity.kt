package com.example.simplefoodordering

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val tvOrder = findViewById<TextView>(R.id.tvOrder)

        val orderOfCustomer = intent.getStringExtra(MainActivity.KEY)
        tvOrder.text = orderOfCustomer.toString()

    }
}