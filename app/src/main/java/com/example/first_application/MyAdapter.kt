package com.example.first_application

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class MyAdapter(fragmentManager:FragmentManager,lifecycle:Lifecycle):FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int {
            return  3
    }

    override fun createFragment(position: Int): Fragment {
            when(position){
                0->return HillStationFragment()
                1->return TempleFragment()
                2->return WonderstFragment()
                else->return HillStationFragment()

            }
    }


}