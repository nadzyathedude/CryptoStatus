package com.example.crypto.ui.main

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.arellomobile.mvp.MvpAppCompatActivity
import com.arellomobile.mvp.MvpView
import com.example.crypto.R
import com.example.crypto.databinding.MainActivityBinding
import com.example.crypto.ui.adapter.CollectionAdapter
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : MvpAppCompatActivity(), MvpView {


    private lateinit var binding: MainActivityBinding
    lateinit var collectionAdapter: CollectionAdapter
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = (ContextCompat.getColor(this, R.color.tab_layout))
        collectionAdapter = CollectionAdapter(this)
        viewPager = binding.pager
        viewPager.adapter = collectionAdapter
        TabLayoutMediator(binding.tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = resources.getString(R.string.eth)
            } else {
                tab.text = resources.getString(R.string.btc)
            }

        }.attach()


    }
}


