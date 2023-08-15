package com.example.recreationcompose.ui.screen.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recreationcompose.data.RecreationPlaceRepository
import com.example.recreationcompose.model.RecreationPlace
import com.example.recreationcompose.ui.common.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class DetailViewModel(private val repository: RecreationPlaceRepository) : ViewModel() {
    private val _uiState: MutableStateFlow<UiState<RecreationPlace>> = MutableStateFlow(UiState.Loading)
    val uiState: StateFlow<UiState<RecreationPlace>>
        get() = _uiState

    fun getRecreationPlaceById(recreationId: Long) {
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            _uiState.value = UiState.Success(repository.getRecreationPlaceById(recreationId))
        }
    }
}