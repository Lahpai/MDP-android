package com.example.quizapp

import android.content.Intent
import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_food_app.*


class FoodAppActivity : AppCompatActivity(), FoodAdapter.OnFoodClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_app)

        val foodItems = generateFoodItems()

        recyclerView.layoutManager = GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false)
        val madapter = FoodAdapter(foodItems, this)
        recyclerView.adapter = madapter
    }
    private fun generateFoodItems(): List<Food> {
        val item1 = Food("Coffee",getString(R.string.coffee), R.drawable.coffee_pot)
        val item2 = Food("Espresso", getString(R.string.espresso), R.drawable.espresso)
        val item3 = Food("French Fires", getString(R.string.french_fries), R.drawable.french_fries)
        val item4 = Food("Honey", getString(R.string.honey), R.drawable.honey)
        val item5 = Food("Strawberry", getString(R.string.strawberry), R.drawable.strawberry_ice_cream)
        val item6 = Food("Sugar Cubes", getString(R.string.sugar),R.drawable.sugar_cubes)

        return listOf(item1,item2,item3,item4,item5,item6)
    }

    private fun showRecipe(food: Food) {
        val intent = Intent(this, FoodRecipe::class.java)

        intent.putExtra("food", food)

        startActivity(intent)
    }

    override fun onFoodClicked(food: Food) {
        val intent = Intent(this, FoodRecipe::class.java)

        intent.putExtra("food", food)

        startActivity(intent)
    }


}