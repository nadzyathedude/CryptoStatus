package com.example.crypto.ui

import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.example.crypto.R
import com.example.crypto.databinding.MainActivityBinding
import com.example.crypto.ui.adapter.CollectionAdapter
import com.example.crypto.ui.base.BaseActivity
import moxy.presenter.InjectPresenter

class MainActivity : BaseActivity(), MainView {
    @InjectPresenter
    lateinit var presenter: MainPresenter

    private lateinit var binding: MainActivityBinding
    private lateinit var collectionAdapter: CollectionAdapter
    private lateinit var viewPager: ViewPager2


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivityBinding.inflate(layoutInflater)
        setContentView(binding.root)
        window.statusBarColor = (ContextCompat.getColor(this, R.color.tab_layout));
        collectionAdapter = CollectionAdapter(this)
        viewPager = binding.pager
        viewPager.adapter = collectionAdapter

    }



}
