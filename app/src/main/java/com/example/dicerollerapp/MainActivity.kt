package com.example.dicerollerapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val button: Button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

        button.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
        val rolling = Random.nextInt(1, 7)

        if (rolling == 1) {
            imageView.setImageResource(R.drawable.dice1)
        } else if (rolling == 2) {
            imageView.setImageResource(R.drawable.dice2)
        } else if (rolling == 3) {
            imageView.setImageResource(R.drawable.dice3)
        } else if (rolling == 4) {
            imageView.setImageResource(R.drawable.dice4)
        } else if (rolling == 5) {
            imageView.setImageResource(R.drawable.dice5)
        } else if (rolling == 6) {
            imageView.setImageResource(R.drawable.dice6)
        }
    }
}
