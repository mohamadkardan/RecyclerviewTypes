package com.example.recyclerviewtypes.viewmodel;

import android.os.Bundle
import android.view.View;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.navigation.Navigation
import com.example.recyclerviewtypes.R

class HomeViewModel : ViewModel() {

    private var bundle: Bundle = Bundle()

    fun onClickVerticalItem(view: View) {
        bundle.putString("type", "vertical")
        Navigation.findNavController(view).navigate(R.id.listFragment, bundle)
    }

    fun onClickHorizontalItem(view: View) {
        bundle.putString("type", "horizontal")
        Navigation.findNavController(view).navigate(R.id.listFragment, bundle)
    }

    fun onClickGridItem(view: View) {
        bundle.putString("type", "grid")
        Navigation.findNavController(view).navigate(R.id.listFragment, bundle)
    }

}
