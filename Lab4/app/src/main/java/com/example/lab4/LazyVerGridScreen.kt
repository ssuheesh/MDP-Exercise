package com.example.lab4


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.lab4.data.DataSource

@Composable
fun LazyVerGridScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        LazyHorizontalGrid (
//            rows = GridCells.Fixed(2),
            rows = GridCells.Adaptive(200.dp),
            modifier = modifier
                .padding(innerPadding)
        ){
            var my_items = DataSource.loadData() + DataSource.loadData() + DataSource.loadData()
            items(my_items) {
                Card(modifier=Modifier.padding(10.dp).width(200.dp) ) {
                    Text(
                        text = stringResource(it.title),
                        fontSize = 15.sp
                    )
                    Image(
                        painter = painterResource(id = it.image),
                        contentDescription = stringResource(it.title),
                        modifier = Modifier.fillMaxHeight(),
                        contentScale = ContentScale.Crop
                    )
                }
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun LazyVerGridScreenPreview() {
    LazyVerGridScreen()
}
