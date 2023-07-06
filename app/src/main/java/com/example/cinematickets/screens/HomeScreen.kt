package com.example.cinematickets.screens

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.cinematickets.Screen
import com.example.cinematickets.composable.BottomNav
import com.example.cinematickets.composable.FilmName
import com.example.cinematickets.composable.HomeBlur
import com.example.cinematickets.composable.HomeScreenPager
import com.example.cinematickets.composable.HomeTopChips
import com.example.cinematickets.composable.RowFilmLength
import com.example.cinematickets.composable.TagsChips
import com.example.cinematickets.viewModels.HomeViewModel
import com.example.cinematickets.viewModels.state.HomeUIState


@Composable
fun HomeScreen(
    navController: NavController,
    viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(
        state,
        onPageChanged = viewModel::onPageChanged,
        onClickImage = { navController.navigate(Screen.FilmScreen.route) }
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeContent(
    state: HomeUIState, onPageChanged: (Int) -> Unit, onClickImage: () -> Unit
) {
    HomeBlur(imagesList = state.imagesList, pagePosition = state.pagePosition)

    Column(modifier = Modifier.fillMaxSize()) {

        HomeTopChips()

        Spacer(modifier = Modifier.height(32.dp))


        HomeScreenPager(
            imagesList = state.imagesList,
            pagerState = rememberPagerState(initialPage = 1),
            onPageChanged = onPageChanged,
            onClickImage = onClickImage
        )

        Spacer(modifier = Modifier.height(32.dp))

        RowFilmLength(filmLength = state.filmLength)

        FilmName(filmName = state.filmName)

        TagsChips(filmTags = state.filmTags)

        Spacer(modifier = Modifier.weight(1f))

        BottomNav()
    }
}
