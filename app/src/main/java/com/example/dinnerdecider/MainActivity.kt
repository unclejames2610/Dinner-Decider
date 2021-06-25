package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

//import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val foodList = arrayListOf("Jollof Rice", "Chicken Republic", "Dominos", "Fried Beans", "Indomie", "Swallow", "Spaghetti", "Fried Yam")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val decideBtn = findViewById<Button>(R.id.decidebtn)
        decideBtn.setOnClickListener{
            val random = Random()
            val randomFood = random.nextInt(foodList.count())
            val selectedFoodTxt = findViewById<TextView>(R.id.selectedFoodTxt)
                    selectedFoodTxt.text = foodList[randomFood]
        }

        val addFoodBtn = findViewById<Button>(R.id.addFoodBtn)
        addFoodBtn.setOnClickListener{
            val addFoodTxt = findViewById<TextView>(R.id.addFoodTxt)
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood)
            addFoodTxt.text = " "
        }



    }
}