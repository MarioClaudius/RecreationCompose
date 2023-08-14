package com.example.recreationcompose.ui.screen.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recreationcompose.data.RecreationPlaceRepository
import com.example.recreationcompose.model.RecreationPlace
import com.example.recreationcompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch

class HomeViewModel(
    private val repository: RecreationPlaceRepository
) : ViewModel() {
    private val _uiState : MutableStateFlow<UiState<List<RecreationPlace>>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<List<RecreationPlace>>>
        get() = _uiState

    fun getAllRecreationPlaces() {
        viewModelScope.launch {
            repository.getAllRecreationPlaces()
                .catch {
                    _uiState.value = UiState.Error(it.message.toString())
                }
                .collect { places ->
                    _uiState.value = UiState.Success(places)
                }
        }
    }
}