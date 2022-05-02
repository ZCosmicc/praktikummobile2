package com.example.sports.ui.gallery

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class GalleryViewModel (
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceIds: Int,
    @DrawableRes val imageResourceId: Int
)