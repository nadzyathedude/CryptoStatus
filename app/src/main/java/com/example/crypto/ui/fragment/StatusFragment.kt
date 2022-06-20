package com.example.crypto.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.viewpager2.widget.ViewPager2
import com.arellomobile.mvp.presenter.InjectPresenter
import com.example.crypto.R
import com.example.crypto.databinding.StatusFragmentBinding
import com.example.crypto.domain.modules.ConvertedCurrency
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
//    lateinit var convertedMoneyAmount: List<String>


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //   statusPresenter.loadData(getTabLabel())
     //   initRecycler()

    }

//    private fun getTabLabel(): String {
//        var tabLabel = ""
//        val tabLayout = (activity as MainActivity).tabLayout
//        val viewPager = (activity as MainActivity).viewPager
//        TabLayoutMediator(tabLayout, viewPager) { _, position ->
//            tabLabel = if (position == 1) {
//                resources.getString(R.string.eth)
//            } else {
//                resources.getString(R.string.btc)
//            }
//        }
//        return resources.getString(R.string.eth)
//    }

//    private fun initRecycler() {
//        binding.recycler.adapter = CurrencyListAdapter(listOf("123", "321", "556", "90"))
//    }

    override fun extractConvertedMoneyResult(currencyStatusResponse: List<ConvertedCurrency>) {
        TODO("Not yet implemented")
    }

//    override fun extractConvertedMoneyResult(currencyStatusResponse: List<ConvertedCurrency>) {
//        convertedMoneyAmount = listOf(
//            currencyStatusResponse[0].currencyCost.toString(),
//            currencyStatusResponse[1].currencyCost.toString(),
//            currencyStatusResponse[2].currencyCost.toString(),
//            currencyStatusResponse[3].currencyCost.toString()
//        )
//    }

}