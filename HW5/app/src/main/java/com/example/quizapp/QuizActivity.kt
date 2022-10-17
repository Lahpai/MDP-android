package com.example.quizapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_quiz.*
import java.text.SimpleDateFormat
import java.util.Date


class QuizActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        btnSubmit.setOnClickListener {
            var sum = 0

            val currentTime = Date()
            val dateTimeFormat = SimpleDateFormat("dd/M/yyyy")
            val dateTime= dateTimeFormat.format(currentTime)

            val clicked = radioGroup.checkedRadioButtonId

            sum += when(clicked) {
                R.id.radioBtn1 -> 0
                R.id.radioBtn2 -> 50
                R.id.radioBtn3 -> 0
                R.id.radioBtn4 -> 0
                else -> {0}
            }

            if (checkBox1.isChecked) sum += 25
            if (checkBox4.isChecked) sum += 25
            else sum+=0


            btnReset.setOnClickListener {
                radioGroup.clearCheck()
                checkBox1.isChecked = false
                checkBox2.isChecked = false
                checkBox3.isChecked = false
                checkBox4.isChecked = false
            }

            val alertBuilder = AlertDialog.Builder(this)
            alertBuilder.setTitle("Result")
            alertBuilder.setMessage("Congratulations! You submitted on $dateTime Your achieved $sum")
            alertBuilder.setPositiveButton("OK") {
                dialogInterface,which -> dialogInterface.dismiss()
            }
            alertBuilder.setNegativeButton("Cancel") {
                dialogInterface, which ->dialogInterface.dismiss()
            }

            val dialog = alertBuilder.create()
            dialog.show()
        }

    }
}
