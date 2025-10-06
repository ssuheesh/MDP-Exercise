package com.example.lab3

import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarData
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.selects.RegistrationFunction

@SuppressLint("UnrememberedMutableState")
@Composable
fun RegistrationScreen(modifier: Modifier=Modifier){
    Scaffold {
        innerPadding ->
        Column(
            modifier = Modifier.padding(innerPadding).fillMaxWidth()
        ) {
            val context = LocalContext.current
            var username by remember { mutableStateOf("")}
            var usernameError by remember { mutableStateOf(false) }
            OutlinedTextField(
                value = username,
                onValueChange = {username=it},
                label={ Text(text="Username") },
                modifier=Modifier.padding(8.dp).fillMaxWidth(),
                isError = usernameError,
                supportingText = {
                    if (usernameError) {
                        Text(
                            text = "Username cannot be empty"
                        )
                    }
                },
                trailingIcon = {
                    if (usernameError) {
                        Text(
                            text = "Error",
                            color = androidx.compose.material3.MaterialTheme.colorScheme.error
                        )
                    }
                }
            )

            var password by remember { mutableStateOf("")}
            OutlinedTextField(
                value = password,
                onValueChange = {password=it},
                label={ Text(text="Password") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password ),
                visualTransformation = PasswordVisualTransformation(),
                modifier=Modifier.padding(8.dp).fillMaxWidth()
            )

            var otp by remember { mutableStateOf("")}
            OutlinedTextField(
                value = otp,
                onValueChange = {// Allow only digits and max length 4
                    data -> if (data.length <= 4 && data.all { it.isDigit() }) {
                        otp = data
                    }},
                label={ Text(text="OTP") },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                modifier=Modifier.padding(8.dp).fillMaxWidth()
            )
            var genders = listOf("Male","Female")
            var selectedGender by remember { mutableStateOf(genders[0])}
            Row(modifier=Modifier.padding(8.dp).fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
                genders.forEach { gender ->
                    Column {
                        RadioButton(selected = (selectedGender == gender),
                        onClick = { selectedGender = gender })
                        Text(
                            text = gender,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                }
            }
            Row(modifier = Modifier.padding(8.dp).fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalAlignment = Alignment.CenterVertically) {

                Button(
                    onClick = { username = ""; password = ""; otp = ""; selectedGender = genders[0] },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Clear")
                }

                Button(
                    onClick = {
                        if(username.isEmpty()){
                            usernameError = true
                        } else{
                            usernameError = false
                        }
                        if (!usernameError)
                            Toast.makeText(
                                context,
                                "Username: $username, Password: $password, OTP: $otp, Gender: $selectedGender",
                                Toast.LENGTH_SHORT
                            ).show()
                    },
                    modifier = Modifier.padding(8.dp)
                ) {
                    Text(text = "Register")
                }
            }
        }
    }
}


@Preview(showSystemUi = true)
@Composable
fun RegistrationScreenPreview(){
    RegistrationScreen()
}