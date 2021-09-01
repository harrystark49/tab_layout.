package com.example.tab

import androidx.appcompat.view.SupportActionModeWrapper
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class frag_adapter(var supportfragment:FragmentManager,var list:ArrayList<frag_model>):FragmentPagerAdapter(supportfragment,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    override fun getCount(): Int {

        return list.size
    }

    override fun getItem(position: Int): Fragment {
        var frag=list[position]
        return frag.frag
    }

}