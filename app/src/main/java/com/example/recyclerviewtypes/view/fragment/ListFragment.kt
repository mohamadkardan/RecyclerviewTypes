package com.example.recyclerviewtypes.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import android.widget.Toast.LENGTH_LONG
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewtypes.R
import com.example.recyclerviewtypes.adapter.FoodAdapter
import com.example.recyclerviewtypes.databinding.FragmentListBinding
import com.example.recyclerviewtypes.model.Food
import com.example.recyclerviewtypes.viewmodel.ListViewModel

class ListFragment : Fragment() {

    private lateinit var binding: FragmentListBinding
    private lateinit var listViewModel: ListViewModel
    private lateinit var foodAdapter: FoodAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_list, container, false)
        setViewModel()
        setRecyclerview()
        observeData()
        return binding.root
    }

    private fun setViewModel() {
        listViewModel = ViewModelProvider(this)[ListViewModel::class.java]
    }

    private fun setRecyclerview() {
        foodAdapter = FoodAdapter()

        when (requireArguments().getString("type")) {
            "horizontal" -> binding.recyclerviewFragmentList.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

            "vertical" -> binding.recyclerviewFragmentList.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)

            "grid" -> binding.recyclerviewFragmentList.layoutManager =
                GridLayoutManager(requireContext(), 2)
        }

        binding.recyclerviewFragmentList.adapter = foodAdapter
    }

    private fun observeData() {
        listViewModel.getFoods().observe(viewLifecycleOwner, Observer {
            if (!it.isNullOrEmpty()) {
                foodAdapter.addFoodList(it)
            }
        })
    }
}