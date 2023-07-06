package com.example.cinematickets

sealed class Screen(val route: String){
    object HomeScreen : Screen("HomeScreen")
    object FilmScreen : Screen("FilmScreen")
    object BookingScreen : Screen("BookingScreen")
}
