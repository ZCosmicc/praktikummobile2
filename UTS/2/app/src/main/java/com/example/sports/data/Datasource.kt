package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sports

class Datasource() {

    fun loadSports(): List<Sports> {
        return listOf<Sports>(
            Sports(R.string.sports1, R.string.desc1, R.drawable.image1),
            Sports(R.string.sports2, R.string.desc2, R.drawable.image2),
            Sports(R.string.sports3, R.string.desc3, R.drawable.image3),
            Sports(R.string.sports4, R.string.desc4, R.drawable.image4),
            Sports(R.string.sports5, R.string.desc5, R.drawable.image5),
            Sports(R.string.sports6, R.string.desc6, R.drawable.image6),
            Sports(R.string.sports7, R.string.desc7, R.drawable.image7),
            Sports(R.string.sports8, R.string.desc8, R.drawable.image8),
            Sports(R.string.sports9, R.string.desc9, R.drawable.image9),
            Sports(R.string.sports10, R.string.desc10, R.drawable.image10),
        )
    }
}