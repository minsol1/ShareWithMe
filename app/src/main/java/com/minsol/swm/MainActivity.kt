package com.minsol.swm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_myprofile.*
import com.minsol.swm.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var tab1:homeFragment
    lateinit var tab2:writeFragment
    lateinit var tab3:chatFragment
    lateinit var tab4:myprofileFragment
    lateinit var profileBtn1:modifyProfileFragment
    lateinit var profileBtn2:myPostListFragment
    lateinit var profileBtn3:TransInfoFragment
    lateinit var profileBtn4:CsWriteFragment
    lateinit var profileBtn5:logoutFragment

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        tab1=homeFragment()
        tab2=writeFragment()
        tab3=chatFragment()
        tab4=myprofileFragment()
        profileBtn1=modifyProfileFragment()
        profileBtn2=myPostListFragment()
        profileBtn3=TransInfoFragment()
        profileBtn4=CsWriteFragment()
        profileBtn5=logoutFragment()

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

    fun openFragment(int: Int) {
        val transaction = supportFragmentManager.beginTransaction()
        when(int){
            1 -> transaction.replace(R.id.tabContent, profileBtn1)
            2 -> transaction.replace(R.id.tabContent, profileBtn2)
            3 -> transaction.replace(R.id.tabContent, profileBtn3)
            4 -> transaction.replace(R.id.tabContent, profileBtn4)
            5 -> transaction.replace(R.id.tabContent, profileBtn5)
        }
        transaction.commit()
    }
}