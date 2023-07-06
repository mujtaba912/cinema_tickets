package com.example.cinematickets


import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.cinematickets.screens.BookingScreen
import com.example.cinematickets.screens.FilmScreen
import com.example.cinematickets.screens.HomeScreen

@Composable
fun CinemaTicketsApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.HomeScreen.route) {
        composable(Screen.HomeScreen.route) { HomeScreen(navController) }
        composable(Screen.FilmScreen.route) { FilmScreen(navController) }
        composable(Screen.BookingScreen.route) { BookingScreen(navController) }
    }

}