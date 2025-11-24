package com.example.tccodingchallenges.screens

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
Create a Compose UI that shows:

A Column with a greeting Text “Hello Compose!”

Inside the column, create a Row with two Texts (“A” and “B”)

Add a Button at the bottom that prints “Clicked” in Logcat.
 */

@Composable
fun CodingChallengeScreen1(){
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text("Hello Compose", fontSize = 30.sp)

        Row{
            Text("A", fontSize = 30.sp )
            Text("B", fontSize = 30.sp)
        }

        Spacer(modifier = Modifier.height(20.dp))
        Button(onClick = {
            Log.i("ClickMeButton", "Clicked")
        }) {
            Text(
                "Click Me!",
                fontSize = 30.sp,
                modifier = Modifier.padding(16.dp)

                )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun CodingChallengeScreen1Preview(){
  CodingChallengeScreen1()
}