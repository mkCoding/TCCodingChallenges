package com.example.tccodingchallenges.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
Create a simple counter app using Compose:

Show a number
A Button increases the number when clicked
State must persist during recomposition using remember.

 */
@Composable
fun CodingChallengeScreen2(){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
    ){
        // the remember keyword will persist during recomposition
        var count by remember { mutableStateOf(0) }

        // Text
        Text("Count: $count", fontSize = 30.sp, modifier = Modifier.padding(16.dp))
        
        // Button
        Button(onClick = {
            count++
        }) { Text("Click Me!", fontSize = 20.sp) }

    }
}


@Preview(showBackground = true)
@Composable
fun CodingChallengeScreen2Preview(){
    CodingChallengeScreen2()
}