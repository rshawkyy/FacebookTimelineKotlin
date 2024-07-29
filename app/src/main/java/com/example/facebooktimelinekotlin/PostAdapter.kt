package com.example.facebooktimelinekotlin

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
import androidx.recyclerview.widget.RecyclerView
import de.hdodenhof.circleimageview.CircleImageView


class PostAdapter( var postsList: List<Post>) : RecyclerView.Adapter<PostAdapter.MyViewHolder>(){
    class MyViewHolder(val postView : View) : RecyclerView.ViewHolder(postView){

        private val profileImage: CircleImageView = postView.findViewById(R.id.imageV)
        private val username: TextView = postView.findViewById(R.id.username)
        private val postTime: TextView = postView.findViewById(R.id.timePost)
        private val postCaption: TextView = postView.findViewById(R.id.firstCaption)
        private val postCaptionTwo: TextView = postView.findViewById(R.id.captionTwo)
        private val postImage: ImageView = postView.findViewById(R.id.post)

        fun bind (post : Post){

            profileImage.setImageResource(post.proPic)
            username.text = post.name
            postTime.text = post.date
            postCaption.text = post.contentOne
            postCaptionTwo.text = post.contentTwo
            postImage.setImageResource(post.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val postView =
            LayoutInflater.from(parent.context).inflate(R.layout.post, parent, false)
        return MyViewHolder(postView)
    }

    override fun getItemCount(): Int {
        return postsList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val post = postsList[position]
        holder.bind(post)
    }
}