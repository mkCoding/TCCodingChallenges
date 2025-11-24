package com.example.tccodingchallenges.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

/*
Make a small login form:

Fields: Email and Password

A “Login” button

Show error text if either field is empty when clicking Login.
 */


@Composable
fun CodingChallengeScreen3(){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        //verticalArrangement = Arrangement.Center
    ) {
        // Username Text and TextField
        var username by remember { mutableStateOf("") }
        var password by remember {mutableStateOf("")}
        val context = LocalContext.current
        var showError by remember {mutableStateOf(false)}

        // Page Title
        Text("Login", fontSize = 40.sp, modifier = Modifier.padding(16.dp))

        TextField(
            placeholder = {Text("Username")},
            value = username,
            onValueChange = {username = it}
        )

        Spacer(modifier = Modifier.height(20.dp))
        TextField(
            placeholder = {Text("Password")},
            value = password,
            onValueChange = {password = it}
        )

        // Error message if applicable
        if(showError) {
            Text(
                color = Color.Red,
                text = "Error on 1 of the fields - Empty",
                modifier = Modifier.padding(16.dp)
            )
        }

        // Login Button
        Button(
            modifier = Modifier.padding(16.dp),
            onClick = {
                // update showError mutable state
                showError = shouldShowErrorMessage(
                    username = username,
                    password = password
                )
            }) {
            Text("Login")
        }

    }
}

fun shouldShowErrorMessage(
    username:String,
    password:String
): Boolean{
    return username.isEmpty() || password.isEmpty()
}

@Preview(showBackground = true)
@Composable
fun CodingChallengeScreen3Preview(){
    CodingChallengeScreen3()
}


