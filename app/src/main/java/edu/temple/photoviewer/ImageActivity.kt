package edu.temple.photoviewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ImageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageData = createPizzaMenu()

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val imageView = findViewById<ImageView>(R.id.pizza_image)
        val textView = findViewById<TextView>(R.id.pizza_name)

        recyclerView.layoutManager = GridLayoutManager(this, 4)

        val handleClick = { item: ImageData ->
            imageView.setImageResource(item.resourceId)
            textView.text = item.description
        }

        recyclerView.adapter = ImageAdapter(imageData, handleClick)
    }

    private fun createPizzaMenu(): Array<ImageData> {
        return arrayOf(
            ImageData(R.drawable.pizza1, "Margarita"),
            ImageData(R.drawable.pizza2, "Tomato Chicken"),
            ImageData(R.drawable.pizza3, "Peppers, Olive, Mushroom"),
            ImageData(R.drawable.pizza4, "Peperoni"),
            ImageData(R.drawable.pizza5, "Pepper Peperoni Sausage"),
            ImageData(R.drawable.pizza6, "Peppers Onion Mushroom"),
            ImageData(R.drawable.pizza7, "Peperoni 'well done'"),
            ImageData(R.drawable.pizza8, "Hawaiian jalapeno"),
            ImageData(R.drawable.pizza9, "Chef Combination"),
            ImageData(R.drawable.pizza10, "Vegan Pizza")
        )
    }
}