package com.example.sports.ui.gallery

import com.example.sports.R

class GalleryDataSource() {

    fun loadSports(): List<GalleryViewModel> {
        return listOf<GalleryViewModel>(
            GalleryViewModel(R.string.sports1, R.string.desc1, R.drawable.image1),
            GalleryViewModel(R.string.sports2, R.string.desc2, R.drawable.image2),
            GalleryViewModel(R.string.sports3, R.string.desc3, R.drawable.image3),
            GalleryViewModel(R.string.sports4, R.string.desc4, R.drawable.image4),
            GalleryViewModel(R.string.sports5, R.string.desc5, R.drawable.image5),
            GalleryViewModel(R.string.sports6, R.string.desc6, R.drawable.image6),
            GalleryViewModel(R.string.sports7, R.string.desc7, R.drawable.image7),
            GalleryViewModel(R.string.sports8, R.string.desc8, R.drawable.image8),
            GalleryViewModel(R.string.sports9, R.string.desc9, R.drawable.image9),
            GalleryViewModel(R.string.sports10, R.string.desc10, R.drawable.image10),
        )
    }
}