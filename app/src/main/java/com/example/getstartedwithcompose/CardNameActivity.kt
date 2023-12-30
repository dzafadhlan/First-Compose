package com.example.getstartedwithcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.getstartedwithcompose.ui.theme.GetStartedWithComposeTheme

class CardNameActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GetStartedWithComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CardName()
                }
            }
        }
    }
}
@Composable
fun CardName(modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.ic_launcher_background)
    val iconTelp= painterResource(id = androidx.core.R.drawable.ic_call_answer)
    val iconEmail = painterResource(id = androidx.core.R.drawable.ic_call_answer_video)
        Column(verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxSize()
        ) {
            Image(painter = image, contentDescription = null)
            Text(text = "M DzaFadlan F Muzakki", Modifier.padding(18.dp))
            Text(text = "Android Developer")
        }
        Column(verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
            ) {
            Row(verticalAlignment = Alignment.CenterVertically){
                Image(painter = iconTelp, contentDescription = null)
                Text(text = "hehehehe", Modifier.padding(16.dp))
            }
            Row (verticalAlignment = Alignment.CenterVertically){
                Image(painter = iconEmail, contentDescription = null)
                Text(text = "hehehe2", Modifier.padding(16.dp))
            }
            Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier.padding(bottom = 20.dp)){
                Image(painter = iconEmail, contentDescription = null)
                Text(text = "hehehe4",modifier.padding(16.dp))
            }

        }

}


@Preview(showBackground = true)
@Composable
fun GreetingPreview4() {
    GetStartedWithComposeTheme {
        CardName()
    }
}