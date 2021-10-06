package com.minsol.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class ProfileAdapter (val profileList:ArrayList<Profiles>): RecyclerView.Adapter<ProfileAdapter.CustomViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileAdapter.CustomViewHolder {//
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view)
    }
    override fun getItemCount(): Int {
        return profileList.size
    }
    override fun onBindViewHolder(holder: ProfileAdapter.CustomViewHolder, position: Int) {
        holder.image.setImageResource(profileList.get(position).image)
//        holder.title.text = profileList.get(position).title
//        holder.content.text = profileList.get(position).content
//        holder.loc.text = profileList.get(position).loc
//        holder.time.text = profileList.get(position).time
//        holder.money.text = profileList.get(position).money
//        holder.people.text = profileList.get(position).people

    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image = itemView.findViewById<ImageView>(R.id.iv_mypost)
//        val title = itemView.findViewById<TextView>(R.id.tv_mypost_title)
//        val content = itemView.findViewById<TextView>(R.id.tv_mypost_content)
//        val loc = itemView.findViewById<TextView>(R.id.tv_mypost_loc)
//        val time = itemView.findViewById<TextView>(R.id.tv_mypost_time)
//        val money = itemView.findViewById<TextView>(R.id.tv_mypost_money)
//        val people = itemView.findViewById<TextView>(R.id.tv_mypost_people)

    }
}