package com.example.cinematickets.viewModels.state

data class FilmUIState(
    val itemsCast: List<String> = emptyList(),
    val tags: List<String> = emptyList(),
    val name: String = "",
    val description: String = "",
    val imageUrl: String = "",
)