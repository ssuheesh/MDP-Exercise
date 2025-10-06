package com.example.lab5_alphabet.ui

data class AlphabetUiState (
    val alphabet: Char,
    val word: String,
    val isCompleted: Boolean = false,
)