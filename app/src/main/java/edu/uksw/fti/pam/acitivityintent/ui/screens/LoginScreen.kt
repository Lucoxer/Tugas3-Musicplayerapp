package edu.uksw.fti.pam.acitivityintent.ui.screens

import android.content.Intent
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import edu.uksw.fti.pam.acitivityintent.HomeActivity
import edu.uksw.fti.pam.acitivityintent.Homee
import edu.uksw.fti.pam.acitivityintent.contracts.SignUpContract
import edu.uksw.fti.pam.acitivityintent.ui.theme.PAMAcitivityIntentTheme
import edu.uksw.fti.pam.acitivityintent.R

internal fun doAuth(
    username: String,
    password: String,
): Boolean {
    return (username.equals("admin") && password.equals("admin"))
}

@Composable
fun LoginForm() {
    val lContext = LocalContext.current

    var usernameInput by remember { mutableStateOf("") }
    var passwordInput by remember { mutableStateOf("") }

    val getUsernameFromSignUpForm = rememberLauncherForActivityResult(
        contract = SignUpContract(),
        onResult = { usernameInput = it!!} )

    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color(20, 34, 53))) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(100.dp))
                .size(width = 500.dp, height = 650.dp)
                .padding(20.dp)
                .padding(top = 150.dp)
                .background(Color(2,64,99).copy(alpha = 0.20f)),

            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                modifier = Modifier
                    .padding(start = 25.dp)
                    .padding(bottom = 50.dp, top = 20.dp),
                text = "DeZabut", color = Color.White, fontSize = 80.sp)
            OutlinedTextField(
                value = usernameInput.toString(),
                onValueChange = { usernameInput = it },
                shape = RoundedCornerShape(20.dp),
                label = { Text(text = stringResource(R.string.username)) },
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
                label = { Text(text = stringResource(R.string.password)) },
                visualTransformation = PasswordVisualTransformation(),
                shape = RoundedCornerShape(20.dp),
                modifier = Modifier
                    .fillMaxWidth(),
                colors = TextFieldDefaults.textFieldColors(
                    textColor = Color.White,
                    unfocusedLabelColor = Color.White,
                    backgroundColor = Color(75,127,131,).copy(alpha = 0.20f)
                )
            )
            Row(horizontalArrangement = Arrangement.SpaceAround,
                modifier = Modifier.padding(start = 180.dp))
            {
                Button(
                    modifier = Modifier.padding(end = 10.dp),
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        backgroundColor = Color(42,179,181).copy(alpha = 0.20f)
                    ),
                    onClick = {
                        getUsernameFromSignUpForm.launch("")
                    }
                ) {
                    Text(text = stringResource(R.string.SignUp))
                }

                Button(
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color.White,
                        backgroundColor = Color(42,179,181).copy(alpha = 0.20f)
                    ),

                    onClick = {
                        val isAuthtenticated = doAuth(usernameInput, passwordInput)
                        if (isAuthtenticated) {
                            lContext.startActivity(
                                Intent(lContext, Homee::class.java)
                                    .apply {
                                        putExtra("username", usernameInput)
                                    }
                            )
                        }
                    }
                ) {
                    Text(text = stringResource(R.string.login))
                }
            }


        }
    }

}

@Preview(showBackground = true)
@Composable
fun LoginFormPreview() {
    PAMAcitivityIntentTheme {
        LoginForm()
    }
}