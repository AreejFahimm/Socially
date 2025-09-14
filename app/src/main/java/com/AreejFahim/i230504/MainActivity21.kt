package com.AreejFahim.i230504

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity21 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.followingnotifs)

        val you = findViewById<TextView>(R.id.You)

        you.setOnClickListener{
            val intent = Intent(this, MainActivity22::class.java)
            startActivity(intent)
        }

    }
}