package com.example.lab5_alphabet.ui

import androidx.lifecycle.ViewModel
import com.example.lab5_alphabet.data.AlphabetData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class AlphabetUiModel: ViewModel() {
    private val alphabetData = AlphabetData.alphabetData
    private val _alphabetUiState = MutableStateFlow(alphabetData[0])
    val alphabetUiState = _alphabetUiState.asStateFlow()
    fun nextAlphabet() {
        val currentIndex = alphabetData.indexOf(_alphabetUiState.value)
        _alphabetUiState.update { alphabetData[(currentIndex + 1) % alphabetData.size] }
        if(currentIndex == alphabetData.size - 2) {
            _alphabetUiState.update { it.copy(isCompleted = true) }
        }
    }

}