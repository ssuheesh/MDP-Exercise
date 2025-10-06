package com.example.lab4

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.data.DataSource

@Composable
fun LazyColumnScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyColumn (
            modifier = modifier
                .padding(innerPadding)

        ){
            items(DataSource.loadData()) {
                Card(modifier=Modifier.padding(10.dp)) {
                    Text(
                        text = stringResource(it.title),
                        fontSize = 20.sp
                    )
                    Image(
                        painter = painterResource(id = it.image),
                        contentDescription = stringResource(it.title),
                        modifier = Modifier.fillMaxWidth(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LazyColumnScreenPreview() {
    LazyColumnScreen()
}
