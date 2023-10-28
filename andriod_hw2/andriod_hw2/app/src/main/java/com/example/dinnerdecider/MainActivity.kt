package com.example.dinnerdecider

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var food = arrayListOf<String>("Hamburger", "Pizza","Mexican", "American", "Chinese")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn2.setOnClickListener {
            tview.text = food.random()
        }

        btn1.setOnClickListener {
           val newFood = addNewFood.text.toString()
            food.add(newFood)
        }
    }

}