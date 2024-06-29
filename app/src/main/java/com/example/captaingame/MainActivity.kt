package com.example.captaingame

import android.app.Notification
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.captaingame.ui.theme.CaptainGameTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CaptainGameTheme {
                // A surface container using the 'background' color from the theme
                CaptainGame()
                }
            }
        }


@Composable
fun CaptainGame(){
    var treasuresFound by remember { mutableStateOf(0) }
    var direction by remember { mutableStateOf("North") }
    var stormORtreasure by remember { mutableStateOf("") }
    Column {
        Text(text = "Treasures Found: ${treasuresFound}")
        Text(text = "Current Direction: ${direction}")
        Text(text = "${stormORtreasure}")

        Button(onClick = { direction = "East"
            if(Random.nextBoolean() ){
                treasuresFound +=1
                stormORtreasure = "We Found a Treasure !!!"
            } else{
                stormORtreasure = "Storm Ahead !!! "
            }
        }) {
            Text(text = "Sail East")
        }
//      Next Button
        Button(onClick = { direction = "West"
            if(Random.nextBoolean() ){
                treasuresFound +=1
                stormORtreasure = "We Found a Treasure !!!"
            } else{
                stormORtreasure = "Storm Ahead !!! "
            }
        }) {
            Text(text = "Sail West")
        }
//      Next Button
        Button(onClick = { direction = "North"
            if(Random.nextBoolean() ){
                treasuresFound +=1
                stormORtreasure = "We Found a Treasure !!!"
            } else{
                stormORtreasure = "Storm Ahead !!! "
            }
        }) {
            Text(text = "Sail North")
        }
//      Next Button
        Button(onClick = { direction = "South"
            if(Random.nextBoolean() ){
                treasuresFound +=1
                stormORtreasure = "We Found a Treasure !!!"
            } else{
                stormORtreasure = "Storm Ahead !!! "
            }
        }) {
            Text(text = "Sail South")
        }
    }
  }
}




