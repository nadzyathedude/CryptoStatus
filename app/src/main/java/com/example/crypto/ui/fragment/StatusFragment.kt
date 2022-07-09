package com.example.crypto.ui.fragment

import android.os.Bundle
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.crypto.R
import com.example.crypto.databinding.StatusFragmentBinding
import com.example.crypto.ui.adapter.CollectionAdapter
import com.example.crypto.ui.adapter.CurrencyListAdapter
import com.example.crypto.ui.base.BaseFragment
import com.example.crypto.ui.main.MainActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.main_activity.*
import kotlinx.android.synthetic.main.status_fragment.view.*


class StatusFragment(private val convertFrom: String) :
    BaseFragment<StatusFragmentBinding>(StatusFragmentBinding::inflate),
    StatusView {

    @InjectPresenter
    lateinit var statusPresenter: StatusPresenter
    private lateinit var convertedMoneyAmount: List<Float>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        statusPresenter.loadData(convertFrom)
        setOnResfreshListener()

    }

    private fun setOnResfreshListener() {
        //TODO set refresh layout listener
    }

    override fun initRecycler(currencyStatusResponse: List<Float>) {
        convertedMoneyAmount = listOf(
            currencyStatusResponse[0],
            currencyStatusResponse[1],
            currencyStatusResponse[2]
        )
        binding.recycler.adapter = CurrencyListAdapter(convertedMoneyAmount)
    }

    override fun showProgressBarState() {
        //TODO create fun to show progress state
    }

    override fun showContentState() {
        //TODO create fun to show conent state
    }

}



