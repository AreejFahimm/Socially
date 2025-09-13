package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity20 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.uploadscreen)

        val post = findViewById<ImageView>(R.id.imgpost)

        post.setOnClickListener{
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

    }
}