package com.minsol.swm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var tab1:homeFragment
    lateinit var tab2:writeFragment
    lateinit var tab3:chatFragment
    lateinit var tab4:myprofileFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tab1=homeFragment()
        tab2=writeFragment()
        tab3=chatFragment()
        tab4=myprofileFragment()

        supportFragmentManager.beginTransaction().add(R.id.tabContent, tab1).commit()

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val transaction=supportFragmentManager.beginTransaction()
                when (tab?.position){
                    0->{
                        supportFragmentManager.beginTransaction().replace(R.id.tabContent, tab1).commit()
                    }
                    1->{
                        supportFragmentManager.beginTransaction().replace(R.id.tabContent, tab2).commit()
                    }
                    2->{
                        supportFragmentManager.beginTransaction().replace(R.id.tabContent, tab3).commit()
                    }
                    3->{
                        supportFragmentManager.beginTransaction().replace(R.id.tabContent, tab4).commit()
                    }
                }
                transaction.commit()
            }
            override fun onTabReselected(tab:TabLayout.Tab?){

            }
            override fun onTabUnselected(tab:TabLayout.Tab?){

            }
        })
    }
}