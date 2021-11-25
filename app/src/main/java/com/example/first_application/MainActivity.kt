package com.example.first_application

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TableLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    var tabTitle= arrayOf("HillStation ","Temple","Wonderst ")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var pager=findViewById<ViewPager2>(R.id.viewPager2)
        pager.adapter=MyAdapter(supportFragmentManager,lifecycle)
        var tablayout=findViewById<TabLayout>(R.id.tabLayout)

        pager.setOffscreenPageLimit(3)

        TabLayoutMediator(tablayout,pager){
            tab, position ->
                tab.text = tabTitle[position]
        }.attach()
    }


}