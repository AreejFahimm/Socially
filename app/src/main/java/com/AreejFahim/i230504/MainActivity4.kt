package com.AreejFahim.i230504

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.loginscreen)

        val main = findViewById<Button>(R.id.loginbtn)

        main.setOnClickListener {
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
            finish()
        }
    }
}