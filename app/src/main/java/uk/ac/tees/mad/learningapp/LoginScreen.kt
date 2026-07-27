package uk.ac.tees.mad.learningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun LoginScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.android),
            contentDescription = "Android logo",
            modifier = Modifier.size(120.dp)
        )
        Spacer(Modifier.height(16.dp))
        Text(
            text = "Welcome back!"
        )
        Spacer(Modifier.height(6.dp))
        Text(
            text = "Login to continue"
        )
        Spacer(Modifier.height(16.dp))
        OutlinedTextField(state = rememberTextFieldState(initialText = "Username"), label = { Text("Username") })
        Spacer(Modifier.height(6.dp))
        OutlinedTextField(state = rememberTextFieldState(initialText = "Password"), label = { Text("Password") })
        Spacer(Modifier.height(26.dp))
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text("Login")
        }
        Spacer(Modifier.height(160.dp))
        Text(
            text = "Don'1 have an account?"
        )
        Button(onClick = {}, modifier = Modifier.fillMaxWidth()) {
            Text("Sign up")
        }
    }
}