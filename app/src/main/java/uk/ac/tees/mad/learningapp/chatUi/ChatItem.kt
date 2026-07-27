package uk.ac.tees.mad.learningapp.chatUi

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import uk.ac.tees.mad.learningapp.R

@Composable
@Preview(showBackground = true)
fun ChatItem() {
    Row(
        modifier = Modifier.fillMaxWidth(),
//        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Image(
            painter = painterResource(R.drawable.empty_profile),
            contentDescription = "profile picture",
            modifier = Modifier
                .clip(shape = CircleShape)
        )
        Spacer(Modifier.width(12.dp))
        Column(
            modifier = Modifier
                .padding(10.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Siya Kapoor",
                fontWeight = FontWeight.SemiBold,
                fontSize = 26.sp

            )
            Spacer(Modifier.height(12.dp))
            Text(
                text = "Hey! What's up? Lorem epsum smthg nihh",
                fontWeight = FontWeight.ExtraLight,
            )
        }
    }

}