package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.unit.dp

@Composable
fun RowSeat(modifier: Modifier = Modifier, rotation: Float = 0f) {

    Row(
        modifier = modifier
            .fillMaxSize()
            .rotate(rotation)
            .padding(PaddingValues(12.dp)),
        Arrangement.spacedBy(8.dp)
    ) {
        IconSeat(modifier = Modifier.weight(1f))
        IconSeat(modifier = Modifier.weight(1f))
    }
}

