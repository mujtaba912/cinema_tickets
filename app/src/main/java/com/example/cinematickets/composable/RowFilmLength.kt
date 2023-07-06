package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun RowFilmLength(filmLength: String) {

    Row(
    modifier = Modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.Center,
    ) {
        Icon(
            icon = R.drawable.ic_clock,
            tint = Color(0xFFB5B5B5)
        )
        Text(text = filmLength, modifier = Modifier.padding(horizontal = 4.dp))
    }
}