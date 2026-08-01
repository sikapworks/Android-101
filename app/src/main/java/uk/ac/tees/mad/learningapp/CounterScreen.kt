package uk.ac.tees.mad.learningapp

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
@Preview(showBackground = true)
fun CounterScreen() {
    var count by rememberSaveable { mutableStateOf(0) }
    val isEven by remember { derivedStateOf { count % 2 == 0 } }
    val isPositive by remember { derivedStateOf { count >= 0 } }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Header(count = count)
        Counter(
            count = count,
            onIncrement = { count++ },
            onDecrement = { count-- }
        )
        Footer(count = count, isEven = isEven, isPositive = isPositive)
    }

}

@Composable
fun Header(count: Int) {
    Text(
        text = "Counter App",
        style = MaterialTheme.typography.headlineLarge
    )
    Text(
        text = "Current Count: $count",
        style = MaterialTheme.typography.headlineMedium
    )
    Log.d("ComposeLearn", "Header")
}

@Composable
fun Footer(count: Int, isEven: Boolean, isPositive: Boolean) {
    Text(
        text = if (isEven) "Even" else "Odd",
        style = MaterialTheme.typography.headlineLarge
    )
    Text(
        text = if (isPositive) "Positive" else "Negative",
        style = MaterialTheme.typography.headlineLarge
    )
    Log.d("ComposeLearn", "Footer")
}
