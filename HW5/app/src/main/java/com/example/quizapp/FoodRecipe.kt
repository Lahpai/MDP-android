package com.example.quizapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.food_recipe.*

class FoodRecipe : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.food_recipe)

        val food = intent.getSerializableExtra("food") as Food
        detailsImg.setImageResource(food.image)
        detailText1.text = food.name
        detailText2.text = food.item
    }
}