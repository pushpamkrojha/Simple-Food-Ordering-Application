package com.example.simplefoodordering

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    // Creating Key
    companion object{
        const val KEY = "com.example.simplefoodordering.KEY"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val et1 = findViewById<EditText>(R.id.et1)
        val et2 = findViewById<EditText>(R.id.et2)
        val et3 = findViewById<EditText>(R.id.et3)
        val et4 = findViewById<EditText>(R.id.et4)

        btnOrder.setOnClickListener{
            val orderPlaced = "You have ordered \n"+ et1.text.toString() +"\n"+et2.text.toString()+"\n"+
                    et3.text.toString()+"\n"+et4.text.toString()
             intent = Intent(this,SecondActivity::class.java)
            intent.putExtra(KEY,orderPlaced)
            startActivity(intent)
        }

    }
}