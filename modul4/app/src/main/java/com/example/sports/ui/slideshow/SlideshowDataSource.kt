package com.example.sports.ui.slideshow

import com.example.sports.R

class SlideshowDataSource() {

    fun loadSports(): List<SlideshowViewModel> {
        return listOf<SlideshowViewModel>(
            SlideshowViewModel(R.string.karasuno1, R.string.des1, R.drawable.karasu1),
            SlideshowViewModel(R.string.karasuno2, R.string.des2, R.drawable.karasu2),
            SlideshowViewModel(R.string.karasuno3, R.string.des3, R.drawable.karasu3),
            SlideshowViewModel(R.string.karasuno4, R.string.des4, R.drawable.karasu4),
            SlideshowViewModel(R.string.karasuno5, R.string.des5, R.drawable.karasu5),
            SlideshowViewModel(R.string.karasuno6, R.string.des6, R.drawable.karasu6),
            SlideshowViewModel(R.string.karasuno7, R.string.des7, R.drawable.karasu7),
            SlideshowViewModel(R.string.karasuno8, R.string.des8, R.drawable.karasu8),
        )
    }
}