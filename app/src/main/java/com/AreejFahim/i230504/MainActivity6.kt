package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity6 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.chatscreen)

        val call = findViewById<ImageView>(R.id.call)

        call.setOnClickListener{
            val intent = Intent(this, MainActivity7::class.java)
            startActivity(intent)

        }

        val back = findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)
        }

    }
}