package com.example.cinematickets.viewModels.state

import androidx.annotation.DrawableRes

data class HomeUIState(
   @DrawableRes val imagesList: List<Int> = emptyList(),
    val pagePosition: Int = 1,
    val filmLength: String = "",
    val filmName: String = "",
    val filmTags: List<String> = emptyList()
)