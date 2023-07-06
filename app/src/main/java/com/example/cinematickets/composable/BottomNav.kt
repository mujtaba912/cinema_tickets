package com.example.cinematickets.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.cinematickets.R

@Composable
fun BottomNav(){
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            Modifier
                .background(Color(0xFFFF5524), shape = RoundedCornerShape(50.dp))
                .wrapContentSize(Alignment.Center)
        ) {
            Icon(
                modifier = Modifier.padding(12.dp),
                icon = R.drawable.ic_home,
                tint = Color(0xDEFFFFFF)
            )
        }
        Icon(
            modifier = Modifier.fillMaxHeight(),
            icon = R.drawable.ic_search,
            tint = Color(0xDE000000)
        )

        Row(modifier = Modifier.fillMaxHeight(), Arrangement.spacedBy(4.dp), Alignment.CenterVertically) {
            Icon(
                modifier = Modifier.fillMaxHeight(),
                icon = R.drawable.ic_ticket,
                tint = Color(0xDE000000)
            )
            Box(
                modifier = Modifier
                    .width(20.dp)
                    .background(Color(0xFFFF5524), shape = CircleShape)
                    .wrapContentSize(Alignment.Center)
            ) {
                Text(text = "5", color = Color(0xDEFFFFFF), textAlign = TextAlign.Center)
            }
        }

        Icon(
            modifier = Modifier.fillMaxHeight(),
            icon = R.drawable.ic_profile,
            tint = Color(0xDE000000)
        )
    }
}