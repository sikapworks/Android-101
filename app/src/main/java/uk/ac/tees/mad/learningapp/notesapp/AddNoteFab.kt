package uk.ac.tees.mad.learningapp.notesapp

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun AddNoteFab(
    onAddClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    FloatingActionButton(
        onClick = { onAddClick },
        containerColor = MaterialTheme.colorScheme.primary,
        contentColor = MaterialTheme.colorScheme.onPrimary
    ) {
        Text("+")
    }
}

@Composable
@Preview(showBackground = true)
fun AddNoteFabPreview() {
    AddNoteFab()
}