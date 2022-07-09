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
        collectionAdapter = CollectionAdapter(this)
        viewPager = binding.pager
        viewPager.adapter = collectionAdapter

        attachTabLayout()

    }

    private fun attachTabLayout() {
        //TODO create fun to attach tab layout using TabLayoutMediator
    }
}


