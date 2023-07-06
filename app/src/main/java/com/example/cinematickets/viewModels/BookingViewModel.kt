package com.example.cinematickets.viewModels

import androidx.lifecycle.ViewModel
import com.example.cinematickets.R
import com.example.cinematickets.viewModels.state.BookingUIState
import com.example.cinematickets.viewModels.state.DateUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class BookingViewModel @Inject constructor() : ViewModel() {
    private val _state = MutableStateFlow(BookingUIState())
    val state = _state.asStateFlow()
    private val dateItems = listOf(
        DateUIState("17", "Sun"),
        DateUIState("18", "Mon"),
        DateUIState("19", "Tues"),
        DateUIState("20", "Wed"),
        DateUIState("21", "Thurs"),
        DateUIState("22", "Fri"),
        DateUIState("23", "Sat"),

        )
    private val timeItems = listOf("10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00")

    init {
        _state.update {
            it.copy(
                bookingDateItems = dateItems,
                timeItems = timeItems,
                price = 100.00,
                availableTickets = 4
            )
        }
    }

}