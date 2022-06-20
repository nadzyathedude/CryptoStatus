package com.example.crypto.ui.adapter

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.crypto.domain.modules.ConvertResponse
import com.example.crypto.domain.modules.ConvertedCurrency
import com.example.crypto.ui.main.MainActivity
import com.example.crypto.ui.fragment.StatusFragment

private const val ARG_OBJECT = "object"

class CollectionAdapter(activity: MainActivity) :
    FragmentStateAdapter(activity) {

    override fun getItemCount(): Int = 2


    override fun createFragment(position: Int): Fragment {
        return StatusFragment()
    }

}