package uk.ac.tees.mad.learningapp.productGallery

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.learningapp.R

@Composable
@Preview(showBackground = true)
fun ProductCard(
//    painter: Painter,
//    title: String,
//    price: String
) {
    val painter = R.drawable.purse
    val title = "Purse"
    val price = 700

    Column(
        modifier = Modifier
//            .fillMaxSize()
            .padding(8.dp),
        horizontalAlignment = Alignment.Start

    ) {
        Image(
            painter = painterResource(painter),
            contentDescription = title,

            )
        Spacer(Modifier.height(6.dp))
        Text(
            text = title,
            fontWeight = FontWeight.SemiBold,
            fontSize = 16.sp
        )
        Spacer(Modifier.height(4.dp))
        Text(
            text = "$$price",
            fontWeight = FontWeight.Medium,
            fontSize = 12.sp
        )
    }

}