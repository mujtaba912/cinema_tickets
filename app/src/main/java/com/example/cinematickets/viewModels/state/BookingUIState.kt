package com.example.cinematickets.viewModels.state

import androidx.annotation.DrawableRes

data class BookingUIState(
    val bookingDateItems: List<DateUIState> = emptyList(),
    val timeItems: List<String> = emptyList(),
    val price: Double = 0.0,
    val availableTickets: Int = 0
)

data class DateUIState(
    val date: String,
    val day: String
)
