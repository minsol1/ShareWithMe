package com.minsol.swm


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class PostAdapter (val postList:ArrayList<Posts>): RecyclerView.Adapter<PostAdapter.CustomViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostAdapter.CustomViewHolder {//
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }
    override fun getItemCount(): Int {
        return postList.size
    }
    override fun onBindViewHolder(holder: PostAdapter.CustomViewHolder, position: Int) {
        holder.image.setImageResource(postList.get(position).image)
        holder.title.text = postList.get(position).title
        holder.content.text = postList.get(position).content
        holder.loc.text = postList.get(position).loc
        holder.time.text = postList.get(position).time
        holder.money.text = postList.get(position).money
        holder.people.text = postList.get(position).people

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.iv_mypost)
        val title = itemView.findViewById<TextView>(R.id.tv_mypost_title)
        val content = itemView.findViewById<TextView>(R.id.tv_mypost_content)
        val loc = itemView.findViewById<TextView>(R.id.tv_mypost_loc)
        val time = itemView.findViewById<TextView>(R.id.tv_mypost_time)
        val money = itemView.findViewById<TextView>(R.id.tv_mypost_money)
        val people = itemView.findViewById<TextView>(R.id.tv_mypost_people)

    }
}