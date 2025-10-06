package com.example.lab5.ui

data class CounterUiState (
    val count: Int,
    val isLoading: Boolean = false,
    val errorMessage: String? = null,
    val isCompleted: Boolean = false,
)