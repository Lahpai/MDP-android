package com.example.quizapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.itemview.view.*


class FoodAdapter(val foodItems: List<Food>, val onClickListener: OnFoodClickListener) : RecyclerView.Adapter<FoodAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodAdapter.MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemview,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: FoodAdapter.MyViewHolder, position: Int) {
        holder.itemView.imageView.setImageResource(foodItems[position].image)
        holder.itemView.name.text = foodItems[position].name

    }

   override fun getItemCount() = foodItems.count()

    /*   override fun getItemCount(): Int {
       return foodItems.count()
   } */


    inner class MyViewHolder : RecyclerView.ViewHolder, View.OnClickListener {
        constructor(itemView:View) :super(itemView) {
            itemView.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            onClickListener.onFoodClicked(foodItems[adapterPosition])
        }
    }

    interface OnFoodClickListener {
        fun onFoodClicked(food: Food)
    }
}