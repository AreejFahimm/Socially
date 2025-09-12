package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity15 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.explorescreen)

        val search = findViewById<EditText>(R.id.messageInput)

        search.setOnClickListener{
            val intent = Intent(this, MainActivity17::class.java)
            startActivity(intent)

        }

    }
}