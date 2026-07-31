package uk.ac.tees.mad.learningapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.input.rememberTextFieldState
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
@Preview(showBackground = true)
fun LoginScreen() {
    Surface() {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
//        horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Image(
                painter = painterResource(R.drawable.android),
                contentDescription = "Android logo",
                modifier = Modifier
                    .size(120.dp)
                    .align(Alignment.CenterHorizontally)
            )
            Spacer(Modifier.height(16.dp))
            Column() {
                Text(
                    text = "Welcome back!",
                    style = MaterialTheme.typography.headlineMedium
                )
                Spacer(Modifier.height(6.dp))
                Text(
                    text = "Login to continue",
                    style = MaterialTheme.typography.bodySmall
                )
            }
            Spacer(Modifier.height(16.dp))
            LoginForm()
            Spacer(Modifier.height(160.dp))
            Text(
                text = "Don'1 have an account?",
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                modifier = Modifier
                    .align(Alignment.CenterHorizontally)
            )
            Button(onClick = {}, modifier = Modifier.fillMaxWidth(), shape = CardDefaults.shape) {
                Text("Sign up")
            }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun LoginForm() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
//            .size(50.dp),
        elevation = CardDefaults.cardElevation(12.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            OutlinedTextField(
                state = rememberTextFieldState(initialText = "Username"),
                label = { Text("Username") })
            Spacer(Modifier.height(6.dp))
            OutlinedTextField(
                state = rememberTextFieldState(initialText = "Password"),
                label = { Text("Password") })
            Spacer(Modifier.height(26.dp))
            Button(onClick = {}, modifier = Modifier.fillMaxWidth(), shape = CardDefaults.shape) {
                Text("Login")
            }
        }
    }

}