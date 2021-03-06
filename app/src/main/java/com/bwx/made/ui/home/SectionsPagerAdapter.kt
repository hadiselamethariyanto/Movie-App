package com.bwx.made.ui.home

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class SectionsPagerAdapter(
    private val fragmentList: List<Fragment>,
    activity: FragmentActivity
) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int) = fragmentList[position]


}