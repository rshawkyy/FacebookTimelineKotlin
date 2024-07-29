package com.example.facebooktimelinekotlin

import android.app.Activity
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val postViews = listOf(
            Post(
                proPic = R.drawable.profile,
                name = "Rawan",
                date = "2 hours ago",
                contentOne = "This is the first post caption.",
                contentTwo = "This is the second post caption.",
                image = R.drawable.profile
            ),
            // Add more PostItem objects as needed
        )

        val recyclerView: RecyclerView = findViewById(R.id.postV)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PostAdapter(postViews)
    }


}


