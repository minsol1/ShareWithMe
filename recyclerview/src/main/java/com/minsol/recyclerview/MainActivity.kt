package com.minsol.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),
            Profiles(R.drawable.profile,"넷플","같이해요","영대","10시","1000원","1/4"),

            )
        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        rv_profile.setHasFixedSize(true)
        rv_profile.adapter= ProfileAdapter(profileList)
    }
}