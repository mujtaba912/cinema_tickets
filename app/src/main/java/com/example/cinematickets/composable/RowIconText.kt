package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun RowIconText(
    text: String,
    iconColor: Color,
    modifier: Modifier = Modifier
) {
    Row(

    ) {
        androidx.compose.material3.Icon(
            painter = painterResource(id = R.drawable.ic_circle),
            contentDescription = "Dot",
            modifier = modifier.size(20.dp),
            tint = iconColor
        )
        Text(text = text, color = Color(0xE6A7A7A7))
    }
}