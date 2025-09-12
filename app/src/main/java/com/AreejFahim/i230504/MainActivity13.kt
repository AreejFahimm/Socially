package com.AreejFahim.i230504

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity13 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.followprofilescreen)

        val following = findViewById<Button>(R.id.follow)

        following.setOnClickListener{
            val intent = Intent(this, MainActivity14::class.java)
            startActivity(intent)
        }

    }
}