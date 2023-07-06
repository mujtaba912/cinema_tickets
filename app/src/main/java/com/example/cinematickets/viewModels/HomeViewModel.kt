package com.example.cinematickets.viewModels

import androidx.lifecycle.ViewModel
import com.example.cinematickets.R
import com.example.cinematickets.viewModels.state.HomeUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(HomeUIState())
    val state = _state.asStateFlow()
    private val images = listOf(R.drawable.photo_1, R.drawable.photo_2, R.drawable.photo_3)
    private val filmLength = "2h 23m"
    private val filmName = "Fantastic Beasts: The Secrets of Dumbledore"
    private val filmTags = listOf("Fantasy", "Adventure")

    init {
        _state.update {
            it.copy(
                imagesList = images,
                filmLength = filmLength,
                filmName = filmName,
                filmTags = filmTags
            )
        }
    }

    fun onPageChanged(newValue: Int) {
        _state.update { it.copy(pagePosition = newValue) }
    }

}



