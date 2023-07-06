package com.example.cinematickets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun ExitButton( onExitButtonClicked: () -> Unit) {
    IconButton(
        onClick = {onExitButtonClicked()},
        modifier = Modifier
            .wrapContentWidth(Alignment.Start)
            .clip(CircleShape)
            .size(38.dp)
            .background(Color(0x33FFFFFF))
    ) {
        Icon(
            painter = painterResource(id = R.drawable.ic_exit),
            contentDescription = null,
            tint = Color(0xFFf5ede4),
            modifier = Modifier.size(24.dp)
        )
    }
}