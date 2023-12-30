package com.example.getstartedwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.getstartedwithcompose.ui.theme.GetStartedWithComposeTheme
import com.example.getstartedwithcompose.ui.theme.bg_1
import com.example.getstartedwithcompose.ui.theme.bg_2
import com.example.getstartedwithcompose.ui.theme.bg_3
import com.example.getstartedwithcompose.ui.theme.bg_4

class KuadranTextActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetStartedWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeQuadrant()
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(modifier.fillMaxSize()) {
        Row(modifier.weight(1f)) {
            Greeting2(
                title = "Text composable",
                description = "Displays text and follows the recommended Material Design guidelines.",
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(bg_1)
                    .padding(16.dp)

            )
            Greeting2(
                title = "Image composable",
                description = "Creates a composable that lays out and draws a given Painter class object.",

                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(bg_2)
                    .padding(16.dp)
            )
        }
        Row(modifier.weight(1f)) {
            Greeting2(
                title = "Row composable",
                description = "A layout composable that places its children in a horizontal sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(bg_3)
                    .padding(16.dp)
            )
            Greeting2(
                title = "Column composable",
                description = "A layout composable that places its children in a vertical sequence.",
                modifier = Modifier
                    .weight(1f)
                    .fillMaxHeight()
                    .background(bg_4)
                    .padding(16.dp)
            )
        }

    }
}

@Composable
fun Greeting2(
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = description,
            modifier = Modifier
                .padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify

        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    GetStartedWithComposeTheme {
        ComposeQuadrant()
    }
}