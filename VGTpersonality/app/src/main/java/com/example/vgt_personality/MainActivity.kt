package com.example.vgt_personality

import CarouselAdapter
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.carousel.CarouselSnapHelper

class MainActivity : AppCompatActivity() {

    private lateinit var carouselRecyclerView: RecyclerView
    private lateinit var button_tela_perguntas: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupCarouselRecyclerView()

        button_tela_perguntas = findViewById(R.id.button_tela_perguntas)

        button_tela_perguntas.setOnClickListener {
            val intent = Intent(this, Perguntas::class.java)
            startActivity(intent)
        }
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