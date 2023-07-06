package com.example.cinematickets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Chip(
    modifier: Modifier = Modifier,
    text: String,
    isSelected: Boolean,
    textColor: Color = Color(0xDEFFFFFF),
    borderColor: Color = Color(0xFFE5E5E5)
) {
    if (isSelected) {
        ChipBox(
            text = text,
            modifier = modifier
                .background(
                    color = Color(0xFFFF5524),
                    shape = RoundedCornerShape(size = 24.dp)
                ),
            textColor = textColor
        )
    } else {
        ChipBox(
            text = text,
            modifier = modifier
                .border(
                    width = 1.dp,
                    borderColor,
                    shape = RoundedCornerShape(size = 24.dp)
                ),
            textColor = textColor
        )
    }
}

@Composable
fun ChipBox(text: String, modifier: Modifier, textColor: Color) = Box(
    modifier = modifier.wrapContentSize(Alignment.Center)
        .padding(horizontal = 12.dp, vertical = 8.dp)
) {
    Text(
        text = text,
        fontSize = 16.sp,
        color = textColor
    )
}