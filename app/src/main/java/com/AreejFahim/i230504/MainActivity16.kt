package com.AreejFahim.i230504

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity16 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.myprofilescreen)

        val hg = findViewById<CircleImageView>(R.id.acc)
        val hg2 = findViewById<CircleImageView>(R.id.acc2)
        val hg3 = findViewById<CircleImageView>(R.id.acc3)
        val hg4 = findViewById<CircleImageView>(R.id.acc4)
        val menu = findViewById<Button>(R.id.editbtn)

        val story = findViewById<CircleImageView>(R.id.acc1)


        menu.setOnClickListener{
            val intent = Intent(this, MainActivity19::class.java)
            startActivity(intent)

        }

        hg.setOnClickListener{
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)


        }
        hg2.setOnClickListener{
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)


        }
        hg3.setOnClickListener{
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)


        }
        hg4.setOnClickListener{
            val intent = Intent(this, MainActivity8::class.java)
            startActivity(intent)


        }

        story.setOnClickListener{
            val intent = Intent(this, MainActivity11::class.java)
            startActivity(intent)

        }


    }
}