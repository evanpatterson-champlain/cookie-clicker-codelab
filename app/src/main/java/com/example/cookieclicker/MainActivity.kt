package com.example.cookieclicker

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import kotlin.math.min

internal class MainActivity : AppCompatActivity() {

    private var currentScore = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgCookie = findViewById<ImageView>(R.id.imgCookie)
        imgCookie.setOnClickListener {
            currentScore++
            Toast.makeText(this@MainActivity, "your score is $currentScore", Toast.LENGTH_SHORT)
                .show()
            val a = min(currentScore * 10, 255)
            imgCookie.setColorFilter(Color.argb(a, 0, 255, 255))
        }

    }
}