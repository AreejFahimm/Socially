package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RelativeLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity18 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.inboxscreen)

        val chat = findViewById<RelativeLayout>(R.id.chat1)
        val chat2 = findViewById<RelativeLayout>(R.id.chat2)
        val chat3 = findViewById<RelativeLayout>(R.id.chat3)
        val chat4 = findViewById<RelativeLayout>(R.id.chat4)
        val chat5 = findViewById<RelativeLayout>(R.id.chat5)
        val chat6 = findViewById<RelativeLayout>(R.id.chat6)

        val back= findViewById<ImageView>(R.id.back)

        back.setOnClickListener{
            val intent = Intent(this, MainActivity5::class.java)
            startActivity(intent)
        }

        chat.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        chat2.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        chat3.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        chat4.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        chat5.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }
        chat6.setOnClickListener{
            val intent = Intent(this, MainActivity6::class.java)
            startActivity(intent)
        }


    }
}