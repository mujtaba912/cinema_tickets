package com.example.cinematickets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

@Composable
fun TextWithIcon(
    text: String,
    image: Painter,
    imageAlignment: ImageAlignment = ImageAlignment.Start,
    modifier: Modifier = Modifier,
) {
    Row(
        modifier = modifier.background(Color(0xCC787878), shape = RoundedCornerShape(16.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        if (imageAlignment == ImageAlignment.Start) {
            IconText(image)
        }
        Text(
            text = text, color = Color(0xB2F0F0F0),
            modifier = modifier.padding(top = 4.dp, end = 8.dp, start = 8.dp, bottom = 4.dp),
        )
        if (imageAlignment == ImageAlignment.End) {
            IconText(image)
        }
    }
}

@Composable
private fun IconText(
    image: Painter,
) {
    androidx.compose.material3.Icon(
        painter = image,
        contentDescription = null,
        modifier = Modifier
            .padding(start = 8.dp)
            .size(16.dp),
        tint = Color(0xE6A7A7A7),
    )
}


enum class ImageAlignment {
    Start, End
}