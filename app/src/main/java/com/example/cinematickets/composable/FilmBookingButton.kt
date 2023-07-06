package com.example.cinematickets.composable

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.cinematickets.R

@Composable
fun FilmBookingButton(text: String, onBookingButtonClicked: () -> Unit, modifier: Modifier = Modifier) {
    Button(
        onClick = {onBookingButtonClicked()},
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(containerColor = Color(color = 0xffff5524)),
        contentPadding = PaddingValues(vertical = 12.dp, horizontal = 16.dp),
    ) {
        androidx.compose.material3.Icon(
            painter = painterResource(id = R.drawable.ic_cridt_card),
            contentDescription = null,
            modifier = Modifier.size(20.dp),
        )
        Text(text = text, fontSize = 16.sp, modifier = Modifier.padding(start = 8.dp))
    }
}