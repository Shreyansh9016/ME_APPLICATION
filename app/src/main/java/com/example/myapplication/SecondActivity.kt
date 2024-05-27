package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val img = findViewById<ImageView>(R.id.imageviewn)
        val img1 = findViewById<ImageView>(R.id.imageView1)
        val img2 = findViewById<ImageView>(R.id.imageView2)
        val img3 = findViewById<ImageView>(R.id.imageView3)
        val img4 = findViewById<ImageView>(R.id.imageView4)
        val img5 = findViewById<ImageView>(R.id.imageView5)
        val img6 = findViewById<ImageView>(R.id.imageView6)
        val img7 = findViewById<ImageView>(R.id.imageView7)
        val img8 = findViewById<ImageView>(R.id.imageView8)
        val img9 = findViewById<ImageView>(R.id.imageView9)
        val lay = findViewById<LinearLayout>(R.id.main)

        img1.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh1)
        }
        img2.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh2)
        }
        img3.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh3)
        }
        img4.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh11)
        }
        img5.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh5)
        }
        img6.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh6)
        }
        img7.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh7)
        }
        img8.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh8)
        }
        img9.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh9)
        }
        lay.setOnClickListener {
            img.setImageResource(R.drawable.shreyansh4)
        }
        fun gotoUrl(s: String) {
            val uri = Uri.parse(s)
            startActivity(Intent(Intent.ACTION_VIEW, uri))
        }

        val linked = findViewById<ImageView>(R.id.linkedin)
        val insta = findViewById<ImageView>(R.id.instagram)
        val git = findViewById<ImageView>(R.id.github)
        val hack = findViewById<ImageView>(R.id.hack)
        val ex = findViewById<ImageView>(R.id.implicit)

        ex.setOnClickListener({
            val intent=Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        })

        linked.setOnClickListener {
            gotoUrl("https://www.linkedin.com/in/shreyansh-singh-729b0b198/")
        }

        insta.setOnClickListener {
            gotoUrl("https://www.instagram.com/shreyansh9016/")
        }

        git.setOnClickListener {
            gotoUrl("https://github.com/Shreyansh9016?tab=repositories")
        }
        hack.setOnClickListener {
            gotoUrl("https://www.hackerrank.com/profile/meeshreyanshsin1")
        }
    }
}

