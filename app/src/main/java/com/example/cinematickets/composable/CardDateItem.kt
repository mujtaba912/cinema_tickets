package com.example.cinematickets.composable

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CardDateItem(date: String, day: String) {
    Card(
        shape = RoundedCornerShape(24.dp),
        border = BorderStroke(1.dp, Color(0xCC787878)),
        modifier = Modifier
            .height(64.dp)
            .width(54.dp)
    ) {
        ColumnFillInCard {
            TextCenteredInCard(date)
            TextCenteredInCard(day)
        }
    }
}
