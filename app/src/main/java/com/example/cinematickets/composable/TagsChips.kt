package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TagsChips(filmTags: List<String>) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        userScrollEnabled = true,
        horizontalArrangement = Arrangement.Center
    ) {
        items(filmTags) {
            Chip(
                text = it,
                isSelected = false,
                textColor = Color(0xFF000000),
                modifier = Modifier.padding(horizontal = 4.dp)
            )
        }
    }
}