package com.example.cinematickets.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun Cinema(modifier: Modifier = Modifier,  onExitButtonClicked: () -> Unit) {
    Box(modifier = modifier) {

        Column(
            modifier = Modifier.fillMaxSize()
        ) {

            Image(
                painter = painterResource(id = R.drawable.photo_4),
                contentDescription = "Cinema",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(top = 58.dp)
                    .fillMaxHeight(.1f)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(2f)
                    .padding(top = 16.dp, end = 20.dp, start = 20.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                ColumnSeats(rowsNum = 5, rotation = 10f, modifier = Modifier.weight(1f))
                ColumnSeats(rowsNum = 5, modifier = Modifier.weight(1f))
                ColumnSeats(rowsNum = 5, rotation = -10f, modifier = Modifier.weight(1f))
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(0.3f)
                    .padding(vertical = 16.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ) {
                RowIconText(text = "Available", iconColor = Color(0xFFFFFFFF))
                RowIconText(text = "Taken", iconColor = Color(0xE6A7A7A7))
                RowIconText(text = "Selected", iconColor = Color (0xFFff5524))
            }


        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 46.dp, start = 16.dp, end = 16.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ExitButton(onExitButtonClicked = onExitButtonClicked)
        }


    }
}