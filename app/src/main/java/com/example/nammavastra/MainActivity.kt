package com.example.nammavastra

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val galleryBtn = findViewById<Button>(R.id.galleryBtn)
        val trendBtn = findViewById<Button>(R.id.trendBtn)
        val priceBtn = findViewById<Button>(R.id.priceBtn)
        val storyBtn = findViewById<Button>(R.id.storyBtn)

        galleryBtn.setOnClickListener {
            startActivity(
                Intent(this, LoomGalleryActivity::class.java)
            )
        }

        trendBtn.setOnClickListener {
            startActivity(
                Intent(this, TrendBoardActivity::class.java)
            )
        }

        priceBtn.setOnClickListener {
            startActivity(
                Intent(this, PriceCalculatorActivity::class.java)
            )
        }

        storyBtn.setOnClickListener {
            startActivity(
                Intent(this, WeaverStoryActivity::class.java)
            )
        }
    }
}