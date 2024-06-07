package com.example.vgt_personality

import CarouselAdapter
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.carousel.CarouselSnapHelper

class MainActivity : AppCompatActivity() {

    private lateinit var carouselRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCarouselRecyclerView()
    }

    private fun setupCarouselRecyclerView() {
        carouselRecyclerView = findViewById(R.id.carouselRecyclerView)
        CarouselSnapHelper().attachToRecyclerView(carouselRecyclerView)
        carouselRecyclerView.adapter = CarouselAdapter(images = getImages())
    }

    private fun getImages(): List<String> {
        return listOf(
            "https://vgt-developments.vercel.app/static/media/gbBarber.a5ed582921b36c6f4ee0.png",
            "https://vgt-developments.vercel.app/static/media/pizzarobot.903922d3c46382b999a2.png",
            "https://vgt-developments.vercel.app/static/media/englishtraining.214d88f425d1bbc2b318.png"

        )
    }
}