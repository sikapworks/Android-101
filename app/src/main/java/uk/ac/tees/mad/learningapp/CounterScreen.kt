package uk.ac.tees.mad.learningapp

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
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

@Composable
@Preview(showBackground = true)
fun CounterScreen() {
    var count by remember { mutableStateOf(0) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header()
        Counter(
            count = count,
            onIncrement = { count++ }

        )
        Footer()
    }

}

@Composable
@Preview(showBackground = true)
fun Header() {
    Text(
        text = "Counter Screen",
        style = MaterialTheme.typography.headlineLarge
    )
    Log.d("ComposeLearn", "Header")
}

@Composable
@Preview(showBackground = true)
fun Footer() {
    Text(
        text = "Footer",
        style = MaterialTheme.typography.headlineLarge
    )
    Log.d("ComposeLearn", "Footer")
}
