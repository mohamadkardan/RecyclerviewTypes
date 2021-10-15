package com.example.recyclerviewtypes.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtypes.R
import com.example.recyclerviewtypes.databinding.ItemListBinding
import com.example.recyclerviewtypes.model.Food

class FoodAdapter : RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    var foods: List<Food> = ArrayList()

    fun addFoodList(foodList: List<Food>) {
        foods = foodList
        notifyDataSetChanged()
    }

    class ViewHolder(val binding: ItemListBinding) : RecyclerView.ViewHolder(binding.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)

        val binding = ItemListBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food: Food = foods[position]
        holder.binding.model = food
    }

    override fun getItemCount(): Int {
        return foods.size
    }

}