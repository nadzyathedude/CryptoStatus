package com.example.crypto.ui.fragment

import android.os.Bundle
import android.view.View
import com.example.crypto.databinding.StatusFragmentBinding
import com.example.crypto.ui.base.BaseFragment

private const val ARG_OBJECT = "object"

class StatusFragment : BaseFragment<StatusFragmentBinding>(StatusFragmentBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            binding.text.text = getInt(ARG_OBJECT).toString()
        }
    }
}