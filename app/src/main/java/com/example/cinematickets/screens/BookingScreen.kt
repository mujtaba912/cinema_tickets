package com.example.cinematickets.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematickets.Screen
import com.example.cinematickets.composable.BookingBottomSheet
import com.example.cinematickets.composable.Cinema
import com.example.cinematickets.viewModels.BookingViewModel
import com.example.cinematickets.viewModels.state.BookingUIState

@Composable
fun BookingScreen(
    navController: NavController,
    viewModel: BookingViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    BookingContent(
        state = state, onExitButtonClicked = { navController.popBackStack(Screen.HomeScreen.route, false) })
}

@Composable
fun BookingContent(state: BookingUIState, onExitButtonClicked: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF000000))
    ) {

        Cinema(modifier = Modifier.weight(2f), onExitButtonClicked)

        BookingBottomSheet(state, Modifier.weight(0.8f))
    }
}


















