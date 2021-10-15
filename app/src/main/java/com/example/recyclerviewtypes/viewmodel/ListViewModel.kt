package com.example.recyclerviewtypes.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerviewtypes.model.Food
import com.example.recyclerviewtypes.repository.FoodRepository

class ListViewModel : ViewModel() {
    private val foodRepository: FoodRepository = FoodRepository()

    fun getFoods(): MutableLiveData<List<Food>> {
        return foodRepository.requestGetFoods()
    }
}