package com.example.recreationcompose.ui.screen.home

import androidx.compose.foundation.clickable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.recreationcompose.di.Injection
import com.example.recreationcompose.model.RecreationPlace
import com.example.recreationcompose.ui.ViewModelFactory
import com.example.recreationcompose.ui.common.UiState
import com.example.recreationcompose.ui.components.RecreationPlaceItem

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    viewModel: HomeViewModel = viewModel(
        factory = ViewModelFactory(Injection.provideRepository())
    ),
    navigateToDetail: (Long) -> Unit,
) {
    viewModel.uiState.collectAsState(initial = UiState.Loading).value.let { uiState ->
        when(uiState) {
            is UiState.Loading -> {
                viewModel.getAllRecreationPlaces()
            }
            is UiState.Success -> {
                HomeContent(
                    places = uiState.data,
                    modifier = modifier,
                    navigateToDetail = navigateToDetail
                )
            }
            is UiState.Error -> {}
        }
    }
}

@Composable
fun HomeContent(
    places: List<RecreationPlace>,
    modifier: Modifier = Modifier,
    navigateToDetail: (Long) -> Unit,
) {
    LazyColumn(modifier = modifier) {
        items(places, key = { it.id }) { place ->
            RecreationPlaceItem(
                name = place.name,
                image = place.image,
                description = place.detail,
                modifier = Modifier.clickable {
                    navigateToDetail(place.id)
                }
            )
        }
    }
}