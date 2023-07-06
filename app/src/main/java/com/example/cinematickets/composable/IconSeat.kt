package com.example.cinematickets.composable

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.example.cinematickets.R

@Composable
fun IconSeat(modifier: Modifier = Modifier) {
    androidx.compose.material3.Icon(
        modifier = modifier.fillMaxSize(),
        painter = painterResource(id = R.drawable.ic_seat),
        contentDescription = "seat",
        tint = Color(0xCC787878),
    )
}
