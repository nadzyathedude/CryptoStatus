package com.example.crypto.ui.base

import com.example.crypto.ui.btc.BTCFragment
import com.example.crypto.ui.eth.ETHFragment
import com.github.terrakok.cicerone.androidx.FragmentScreen

object Screens {
    fun Bitcoin() = FragmentScreen { BTCFragment() }
    fun Ethereum() = FragmentScreen { ETHFragment() }
}