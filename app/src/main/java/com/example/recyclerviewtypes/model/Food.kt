package com.example.recyclerviewtypes.model

import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.makeramen.roundedimageview.RoundedImageView

data class Food(val imageUrl: String, val name: String, val rate: String, val price: String) {

    companion object {
        @JvmStatic
        @BindingAdapter("imageUrl")
        fun loadImage(imageView: RoundedImageView, url: String?) {
            Glide.with(imageView.context)
                .load(url)
                .into(imageView)
        }
    }


}