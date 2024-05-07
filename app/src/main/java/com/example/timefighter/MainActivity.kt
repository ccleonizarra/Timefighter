package com.example.timefighter

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PreviewMessageCard()
        }
    }
}

data class Message(val author: String, val body: String)

@Composable
@Preview
fun PreviewMessageCard() {
    MessageCard(
        msg = Message("My name is Nico", "Jetpack Compose is great!")
    )

}

@Composable
fun MessageCard(msg: Message) {
    Row {
        Column(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(R.drawable.nico),
                contentDescription = "Picture",
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .border(1.5.dp, MaterialTheme.colorScheme.secondary, CircleShape)
            )
            Spacer(modifier = Modifier.height(4.dp))

            Column {

                Text(
                    text = msg.author,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )

                Spacer(modifier = Modifier.height(4.dp))

                Text(
                    text = msg.body,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.titleSmall
                )
                
                TheButton {

                }
            }
        }
    }
}
@Composable
fun TheButton(onClick: () -> Unit) {
    Row {
        Button(onClick = { onClick() }) {
            Text("Click")
        }
        Spacer(modifier = Modifier.height(2.dp))

    }
}