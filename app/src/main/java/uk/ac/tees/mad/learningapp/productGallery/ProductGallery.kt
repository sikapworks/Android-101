package uk.ac.tees.mad.learningapp.productGallery

import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
@Preview(showBackground = true)
fun ProductGallery() {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2)
    ) {
        items(25) {
            ProductCard()
        }
    }
}