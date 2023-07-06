package com.example.cinematickets.composable

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun Icon(@DrawableRes icon: Int, tint: Color,modifier: Modifier = Modifier ) {
    Icon(
        modifier = modifier.size(24.dp),
        painter = painterResource(id = icon),
        contentDescription = null,
        tint = tint
    )
}