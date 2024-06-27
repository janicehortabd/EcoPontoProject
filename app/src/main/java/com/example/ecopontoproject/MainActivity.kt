package com.example.ecopontoproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ecopontoproject.ui.theme.EcoPontoProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EcoPontoProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    EcoPonto(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxHeight()
                    )
                }
            }
        }
    }
}



@Composable
fun EcoPonto(modifier: Modifier = Modifier) {

}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EcoPontoProjectTheme {
        EcoPonto(modifier = Modifier.fillMaxSize())
    }
}