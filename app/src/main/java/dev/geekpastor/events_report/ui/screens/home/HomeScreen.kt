package dev.geekpastor.events_report.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dev.geekpastor.events_report.ui.components.PostComponent

@Composable
fun HomeScreenRoute(){
    HomeScreen()
}


@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn{
            items(12){
                PostComponent()
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginScreenPreview(){
    HomeScreen()
}