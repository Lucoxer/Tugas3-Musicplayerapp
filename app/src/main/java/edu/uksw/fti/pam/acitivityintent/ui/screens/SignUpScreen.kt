package edu.uksw.fti.pam.acitivityintent.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*

import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R


@Composable
fun SignForm( btnOnClickAction: (String?) -> Unit) {
    val lContext = LocalContext.current

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(20,34,53)))
    {
        Column(
            modifier = Modifier
                .size(width = 500.dp, height = 700.dp)
                .padding(top = 100.dp)
                .padding(20.dp)
                .background(Color(2,64,99).copy(alpha = 0.20f)),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(modifier = Modifier.padding(bottom = 30.dp), text = "Create Your Account", color = Color.White, fontSize = 40.sp)
            Row(horizontalArrangement = Arrangement.SpaceBetween) {
                OutlinedTextField(
                    value = usernameInput.toString(),
                    onValueChange = { usernameInput = it },
                    label = { Text(text = stringResource(R.string.FirstN)) },
                    modifier = Modifier.width(150.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                    )
                )
                OutlinedTextField(
                    value = usernameInput.toString(),
                    onValueChange = { usernameInput = it },
                    label = { Text(text = stringResource(R.string.LastN)) },
                    modifier = Modifier
                        .width(200.dp)
                        .padding(start = 10.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        unfocusedLabelColor = Color.White,
                        backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                    )
                )
            }
            OutlinedTextField(
                value = usernameInput.toString(),
                onValueChange = { usernameInput = it },
                label = { Text(text = stringResource(id = R.string.username)) },
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = Color.White,
                    backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                )
            )

            OutlinedTextField(
                value = passwordInput.toString(),
                onValueChange = { passwordInput = it },
                label = { Text(text = stringResource(id = R.string.password)) },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                )
            )

            OutlinedTextField(
                value = passwordInput.toString(),
                onValueChange = { passwordInput = it },
                label = { Text(text = stringResource(R.string.confirmpassword)) },
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier.fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    unfocusedLabelColor = Color.White,
                    backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                )
            )





            Row(horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.padding(start = 260.dp))
            {
                Button(
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        backgroundColor = Color(42,179,181).copy(alpha = 0.20f)
                    ),
                    onClick = {
                        btnOnClickAction(usernameInput)
                    }
                ) {
                    Text(text = stringResource(R.string.SignUp))
                }

            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun SignFormPreview() {
    PAMAcitivityIntentTheme {
        SignForm({})
    }
}
