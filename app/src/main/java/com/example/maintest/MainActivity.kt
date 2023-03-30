package com.example.maintest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.maintest.tests.TrayParallaxImage
import com.example.maintest.ui.theme.MainTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    TrayParallaxImage(
                        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR6i3w1czjIIaTA_s09kb8EtosDupmfRNYCRAZIk-PJxOiXqpSj",
                        resPlaceholder = R.drawable.img,
                        modifier = Modifier.height(100.dp).fillMaxWidth().padding(10.dp))
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainTestTheme {
        Greeting("Android")
    }
}