package com.example.lab5.ui

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class CounterViewModel: ViewModel() {
    private val _counterUiState = MutableStateFlow(CounterUiState(0)) // emits the data
    val counterUiState = _counterUiState.asStateFlow() // exposes the data as read only
    fun increment() {
        _counterUiState.update { it.copy(count = it.count + 1, errorMessage = null)  }
    }
    fun decrement() {
        if(counterUiState.value.count == 0) {
            _counterUiState.update { it.copy(errorMessage = "Counter cannot be negative") }
        } else {
            _counterUiState.update { it.copy(count = it.count - 1, errorMessage = null) }
        }
    }


}