package edu.temple.photoviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.GridLayout
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {
    lateinit var pizzaName: TextView
    lateinit var pizzaImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        pizzaName = findViewById(R.id.pizza_name)
        pizzaImage = findViewById(R.id.pizza_image)

        recyclerView.layoutManager = GridLayoutManager(this, 4)

        val imageList = listOf<Int>(
            R.drawable.pizza2,
            R.drawable.pizza3,
            R.drawable.pizza4,
            R.drawable.pizza5,
            R.drawable.pizza6,
            R.drawable.pizza7,
            R.drawable.pizza8,
            R.drawable.pizza9,
            R.drawable.pizza10
        )

        val pizzaNames = listOf<String>(
            "PEPERONI PIZZA",
            "PEPPER PIZZA",
            "PEPERONI BUT SMALLER",
            "PEPERONI AGAIN",
            "MORE PEPPERONI",
            "IM NOT SURE WHAT THIS IS",
            "CHICKEN?",
            "ITS A PIZZA",
            "PIZZA FROM AT AN ANGLE",
            "PIZZA AGAIN"
        )

        recyclerView.adapter = ImageAdapter(this, imageList, pizzaNames)

    }
}