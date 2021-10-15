package com.example.recyclerviewtypes.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.example.recyclerviewtypes.R
import com.example.recyclerviewtypes.databinding.FragmentHomeBinding
import com.example.recyclerviewtypes.viewmodel.HomeViewModel

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)
        setViewModel()
        return binding.root
    }

    private fun setViewModel() {
        homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        binding.viewModel = homeViewModel
    }
}