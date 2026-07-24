package uk.ac.tees.mad.learningapp.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun Buttons() {
    Column(modifier = Modifier.padding(16.dp).fillMaxSize()) {
        Button(onClick = { /*TODO*/ }, enabled = true) {
            Text(text = "Login")
        }
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { /*TODO*/ }, enabled = false) {
            Text(text = "Sign up")
        }
    }
}