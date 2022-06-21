package com.example.crypto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crypto.databinding.ListItemBinding

class CurrencyListAdapter(private val moneyAmount: List<Float>) :
    RecyclerView.Adapter<CurrencyListVH>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CurrencyListVH {
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CurrencyListVH(binding)
    }

    override fun onBindViewHolder(holder: CurrencyListVH, position: Int) {
        holder.bind(
            money = moneyAmount[position],
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

    fun bind(name: String, money: Float) {
        with(binding) {
            moneyAmount.text = money.toString()
            currencyName.text = name
        }
    }
}

