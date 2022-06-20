package com.example.crypto.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.crypto.databinding.ListItemBinding

class CurrencyListAdapter(private val moneyAmount: List<String>) :
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
                2 -> {
                    "Доллары"
                }
                else -> {
                    "Йен"
                }
            }
        )
    }

    override fun getItemCount(): Int = 4

}

class CurrencyListVH(private val binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(name: String, money: String) {
        with(binding) {
            moneyAmount.text = money
            currencyName.text = name.toString()
        }
    }
}

