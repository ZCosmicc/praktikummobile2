package com.example.sports.ui.slideshow

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class SlideshowViewModel (
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceIds: Int,
    @DrawableRes val imageResourceId: Int
)