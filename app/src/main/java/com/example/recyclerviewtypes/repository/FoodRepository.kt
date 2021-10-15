package com.example.recyclerviewtypes.repository

import androidx.lifecycle.MutableLiveData
import com.example.recyclerviewtypes.model.Food

class FoodRepository {

    fun requestGetFoods(): MutableLiveData<List<Food>> {
        val mutableLiveData: MutableLiveData<List<Food>> = MutableLiveData()
        val foods: MutableList<Food> = mutableListOf()
        foods.add(Food("https://media.architecturaldigest.in/wp-content/uploads/2020/04/Mumbai-restaurant-COVID-19-2-1.jpg", "hamburger", "4.5", "25$"))
        foods.add(Food("https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/20190503-delish-pineapple-baked-salmon-horizontal-ehg-450-1557771120.jpg", "kebab", "5", "50$"))
        foods.add(Food("https://img.webmd.com/dtmcms/live/webmd/consumer_assets/site_images/article_thumbnails/slideshows/worst_restaurant_meal_slideshow/1800x1200_worst_restaurant_meal_slideshow_alt.jpg", "pizza", "8.5", "30$"))
        foods.add(Food("https://cdn.pixabay.com/photo/2018/03/21/06/54/food-3245765_1280.jpg", "rice", "5.5", "10$"))
        foods.add(Food("https://img.webmd.com/dtmcms/live/webmd/consumer_assets/site_images/article_thumbnails/slideshows/worst_restaurant_meal_slideshow/1800x1200_worst_restaurant_meal_slideshow_alt.jpg", "pizza", "8.5", "30$"))
        foods.add(Food("https://cdn.pixabay.com/photo/2018/03/21/06/54/food-3245765_1280.jpg", "rice", "5.5", "10$"))
        mutableLiveData.postValue(foods)

        return mutableLiveData
    }

}