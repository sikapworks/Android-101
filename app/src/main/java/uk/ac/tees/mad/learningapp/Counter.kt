package uk.ac.tees.mad.learningapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun Counter() {
    var count by remember { mutableStateOf(0) }
    Column() {
        Text(text = "Count: $count")
        Button(onClick = {
            count++
        }) {
            Text("Increment")
        }
        Text("Welcome")
    }
}