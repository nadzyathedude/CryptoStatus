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


class StatusFragment : BaseFragment<StatusFragmentBinding>(StatusFragmentBinding::inflate),
    StatusView {

    @InjectPresenter
    lateinit var statusPresenter: StatusPresenter
    lateinit var collectionAdapter: CollectionAdapter
    lateinit var viewPager: ViewPager2

    //    lateinit var selectedTabLabel: String
    private lateinit var convertedMoneyAmount: List<Float>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        statusPresenter.loadData("ETH")

    }

    private fun getTabLabel(): String {
        var tabLabel = ""
        val tabLayout = (activity as MainActivity).tabLayout
        val viewPager = (activity as MainActivity).viewPager
        TabLayoutMediator(tabLayout, viewPager) { _, position ->
            tabLabel = if (position == 1) {
                resources.getString(R.string.eth)
            } else {
                resources.getString(R.string.btc)
            }
        }
        return resources.getString(R.string.eth)
    }
    //сделать enum -> передается во фрагмент как параметр

     override fun initRecycler(currencyStatusResponse: List<Float>) {
         convertedMoneyAmount = listOf(
             currencyStatusResponse[0],
             currencyStatusResponse[1],
             currencyStatusResponse[2]
         )
        binding.recycler.adapter = CurrencyListAdapter(convertedMoneyAmount)
    }

}



