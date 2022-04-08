package com.example.sports.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Sports (
    @StringRes val stringResourceId: Int,
    @StringRes val stringResourceIds: Int,
    @DrawableRes val imageResourceId: Int
)