package com.minsol.swm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_my_post.*
import kotlinx.android.synthetic.main.fragment_write.*


class MyPostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_post)

        val postList = arrayListOf(
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Posts(R.drawable.img_profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            )
        rv_post.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_post.setHasFixedSize(true)
        rv_post.adapter= PostAdapter(postList)

    }
}