package com.example.crypto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crypto.databinding.ListItemBinding

const val RUB_SYMBOL = "\t₽"
const val EUR_SYMBOL = "\t€"
const val USD_SYMBOL = "\t$"

class CurrencyListAdapter(private val moneyAmount: List<Float>) :
    RecyclerView.Adapter<CurrencyListVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyListVH {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyListVH(binding)
    }

    override fun onBindViewHolder(holder: CurrencyListVH, position: Int) {
        holder.bind(
            //money = moneyAmount[position],
            money = when (position) {
                0 -> {
                    moneyAmount[0].toString() + RUB_SYMBOL
                }
                1 -> {
                    moneyAmount[1].toString() + EUR_SYMBOL

                }
                else -> {
                    moneyAmount[2].toString() + USD_SYMBOL
                }
            },

            name = when (position) {
                0 -> {
                    "Рубли"
                }
                1 -> {
                    "Евро"
                }
                else -> {
                    "Доллары"
                }
            }
        )
    }

    override fun getItemCount(): Int = 3

}

class CurrencyListVH(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(name: String, money: String) {
        with(binding) {
            //TODO using binidng set text view values
        }
    }
}

