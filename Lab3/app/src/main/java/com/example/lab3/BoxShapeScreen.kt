package com.example.lab3

import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxShapeScreen(modifier: Modifier = Modifier) {
    Scaffold { innerPadding ->
        Column (modifier = modifier
                .padding(innerPadding)
                .verticalScroll(state= rememberScrollState())
        )
        {
            Box(modifier = Modifier
                .border(width = 2.dp, color = Color.Red, shape= CircleShape)
                .size(200.dp)){
                Text(text="MyBox1", modifier=Modifier.align(Alignment.Center))

//                Text(text="AMyBox", modifier=Modifier.align(Alignment.Center))
            }

            Box(modifier = Modifier
                .border(width = 2.dp, color = Color.Red, shape= RoundedCornerShape(size=30.dp))
                .size(200.dp),
                contentAlignment = Alignment.BottomCenter){
                Text(text="YourShape")
            }

            Box(modifier = Modifier
                .border(width = 2.dp, color = Color.Red, shape= CutCornerShape(size=20.dp))
                .size(200.dp),
                contentAlignment = Alignment.TopCenter){
                Text(text="CutCorner")
            }

            Box(modifier = Modifier
                .border(width = 2.dp, color = Color.Red, shape= CircleShape)
                .size(200.dp),
                contentAlignment = Alignment.Center){
                Text(text="MyBox")
            }

            Box(modifier = Modifier
                .border(width = 2.dp, color = Color.Red, shape= RoundedCornerShape(size=30.dp))
                .size(200.dp),
                contentAlignment = Alignment.BottomCenter){
                Text(text="YourShape")
            }



        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun BoxShapeScreenPreview() {
    BoxShapeScreen()
}