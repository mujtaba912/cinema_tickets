package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun HomeTopChips() {
    Row(
        modifier = Modifier
            .padding(top = 48.dp, start = 48.dp, end = 48.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Chip(text = stringResource(R.string.now_showing), isSelected = true)

        Chip(
            text = stringResource(R.string.coming_soon),
            isSelected = false,
            borderColor = Color(
                0x4DE5E5E5
            )
        )
    }
}