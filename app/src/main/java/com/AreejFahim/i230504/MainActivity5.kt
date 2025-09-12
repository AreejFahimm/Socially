package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity5 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.mainpage)

        val search = findViewById<ImageView>(R.id.search)
        val profile = findViewById<CircleImageView>(R.id.profile)
        val story = findViewById<CircleImageView>(R.id.acc1)
        val inbox = findViewById<TextView>(R.id.inbox)
        val camera = findViewById<TextView>(R.id.cam)
        val urstory = findViewById<CircleImageView>(R.id.acc3)
        val post = findViewById<ImageView>(R.id.post)


        val follow= findViewById<TextView>(R.id.joshua2)

        post.setOnClickListener{
            val intent = Intent(this, MainActivity10::class.java)
            startActivity(intent)
        }

        follow.setOnClickListener{
            val intent = Intent(this, MainActivity13::class.java)
            startActivity(intent)
        }

        search.setOnClickListener {
            val intent = Intent(this, MainActivity15::class.java)
            startActivity(intent)
        }

        profile.setOnClickListener {
            val intent = Intent(this, MainActivity16::class.java)
            startActivity(intent)
        }

        story.setOnClickListener{
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)
        }

        inbox.setOnClickListener{
            val intent = Intent(this, MainActivity18::class.java)
            startActivity(intent)
        }
        camera.setOnClickListener {
            val intent = Intent(this, MainActivity12::class.java)
            startActivity(intent)
        }

        urstory.setOnClickListener{
            val intent = Intent(this, MainActivity9::class.java)
            startActivity(intent)

        }
    }
}