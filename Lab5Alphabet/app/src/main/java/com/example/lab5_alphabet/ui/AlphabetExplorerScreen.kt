package com.example.lab5_alphabet.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.lab5_alphabet.ui.theme.Lab5AlphabetTheme


@Composable
fun AlphabetExplorerScreen(modifier: Modifier = Modifier) {
    Scaffold {
        innerPadding ->
        Column (
            modifier = modifier.padding(innerPadding)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
//            val alphabetUiModel: AlphabetUiModel = viewModel()
            val alphabetUiModel: AlphabetUiModel = viewModel {
                AlphabetUiModel()
            }
            val alphabetUiState by alphabetUiModel.alphabetUiState.collectAsState()
            Text("${alphabetUiState.alphabet.toString()} - ${alphabetUiState.word}")
            Spacer(modifier=Modifier.padding(10.dp))
            Button(onClick = { alphabetUiModel.nextAlphabet() }) {
                Text("Next")
            }

            when {
                alphabetUiState.isCompleted -> {
                    Text("You have completed the alphabet!")
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun AlphabetExplorerScreenPreview() {
    Lab5AlphabetTheme {
        AlphabetExplorerScreen()
    }
}

