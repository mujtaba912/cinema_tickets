package com.example.cinematickets.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun TextRating(rating: String, site: String ,maxRate:String= "") {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row {
            Text(text = rating, fontSize = (18.sp))
            if (maxRate.isNotEmpty()) Text(text = maxRate, color = Color(0xffbfbfbf),fontSize = (18.sp))
        }
        Text(text = site, color = Color(0xffbfbfbf),fontSize = (16.sp))
    }
}