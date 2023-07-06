package com.example.cinematickets.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.cinematickets.R
import com.example.cinematickets.Screen
import com.example.cinematickets.composable.ActorImageItem
import com.example.cinematickets.composable.FilmBookingButton
import com.example.cinematickets.composable.FilmScreenHeader
import com.example.cinematickets.composable.TagsChips
import com.example.cinematickets.composable.TextCentered
import com.example.cinematickets.composable.TextRating
import com.example.cinematickets.viewModels.FilmViewModel
import com.example.cinematickets.viewModels.state.FilmUIState

@Composable
fun FilmScreen(
    navController: NavController,
    viewModel: FilmViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()

    FilmContent(state = state,
        onBookingButtonClicked = { navController.navigate(Screen.BookingScreen.route) },
        onExitButtonClicked = { navController.popBackStack(Screen.HomeScreen.route, false) },
    )
}

@Composable
fun FilmContent(
    state: FilmUIState,
    onBookingButtonClicked: () -> Unit,
    onExitButtonClicked: () -> Unit
) {

    Box(
        modifier = Modifier.fillMaxSize()

    ) {

        Box {
            Image(
                painter = rememberAsyncImagePainter(model = state.imageUrl),
                contentDescription = "Movie Image",
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(.5f),
                contentScale = ContentScale.FillBounds,
            )

            FilmScreenHeader(onExitButtonClicked)

            IconButton(
                onClick = {},
                modifier = Modifier
                    .align(Alignment.Center)
                    .clip(CircleShape)
                    .size(48.dp)
                    .background(Color(0xffff5524)),

                ) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_play_button),
                    contentDescription = "Play",
                    tint = Color(0xFFFFFFFF),
                    modifier = Modifier
                        .size(24.dp)
                        .align(Alignment.Center)
                )
            }
        }


        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(topEnd = 24.dp, topStart = 24.dp))
                .background(Color(0xFFFFFFFF))
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Bottom
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                TextRating("6.8", "IMDb", "/10")
                TextRating("63%", "Rotten Tomatoes")
                TextRating("4", "IGN", "/10")
            }

            TextCentered(text = state.name, size = 26)

            TagsChips(state.tags)

            TextCentered(text = state.description, size = 14)

            Spacer(modifier = Modifier.height(16.dp))

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                contentPadding = PaddingValues(horizontal = 24.dp),
            ) {
                items(state.itemsCast) {
                    ActorImageItem(it)
                }
            }

            FilmBookingButton(
                text = "Booking",
                onBookingButtonClicked = onBookingButtonClicked,
                modifier = Modifier.padding(vertical = 16.dp)
            )

        }

    }
}