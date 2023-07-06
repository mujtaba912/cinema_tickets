package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.cinematickets.R

@Composable
fun ColumnSeats(modifier: Modifier = Modifier, rowsNum: Int, rotation: Float = 0f) {
    Column(
        modifier = modifier.fillMaxSize(),
    ) {
        for (i in 1..rowsNum) {
            RowSeat(rotation = rotation, modifier = Modifier.weight(1f))
//            Icon(icon = R.drawable.ic_seat_back, tint = Color(0xCC787878))
        }

    }
}