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
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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
    var page by remember { mutableStateOf(1) }
    var option by remember { mutableStateOf(0) }


    val message = when (option) {
        1 -> stringResource(id = R.string.azul)
        2 -> stringResource(id = R.string.amarelo)
        3 -> stringResource(id = R.string.verde)
        4 -> stringResource(id = R.string.laranja)
        else -> "Vazio"

    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EcoPontoProjectTheme {
        EcoPonto(modifier = Modifier.fillMaxSize())
    }
}