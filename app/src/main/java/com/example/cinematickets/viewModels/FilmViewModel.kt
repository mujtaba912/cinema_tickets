package com.example.cinematickets.viewModels

import androidx.lifecycle.ViewModel
import com.example.cinematickets.viewModels.state.FilmUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class FilmViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(FilmUIState())
    val state = _state.asStateFlow()

    private val items = listOf(
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
        "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png",
    )

    private val tags = listOf("Fantasy", "Adventure")


    init {
        _state.update {
            it.copy(
                itemsCast = items,
                tags = tags,
                name = "Fantastic Beasts:The Secrets Of Dumbledore",
                description = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him from",
                imageUrl = "https://i.ibb.co/9vzxD4f/250568264-101026cf-20f9-4f13-8235-b7674664ddc5.png"
            )
        }
    }


}