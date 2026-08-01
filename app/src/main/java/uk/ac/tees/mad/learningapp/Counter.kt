package uk.ac.tees.mad.learningapp

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment

@Composable
fun Counter(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = count.toString())
        Log.d("ComposeLearn", "Counter")
        Button(onClick = onIncrement) {
            Text("Increment")
        }
        Button(onClick =  onDecrement) {
            Text("Decrement")
        }
//        Text("Welcome")
    }
}