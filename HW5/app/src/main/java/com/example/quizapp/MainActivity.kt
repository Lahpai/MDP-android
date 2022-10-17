package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_main)
   //     setContentView(R.layout.activity_quiz)


        btnQuiz.setOnClickListener {
            var intentQuiz = Intent(this, QuizActivity::class.java)
            startActivity(intentQuiz)
        }

        btnFoodApp.setOnClickListener {
            var intentFoodApp = Intent(this,FoodAppActivity::class.java)
            startActivity(intentFoodApp)
        }

    }
}