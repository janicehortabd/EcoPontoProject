package com.example.ecopontoproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
    Column(
        modifier = modifier,
    ) {
        if (page == 1)
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    "Tipo",
                    fontWeight = FontWeight.Bold,
                    fontSize = 30.sp,

                    )
                Spacer(modifier = Modifier.height(40.dp))

                Text("1-Residuos de Papel e Cartao")
                Text("2-Embalagens de Plastico")
                Text("3-Embalagens de Vidro")
                Text("4-Aparelhos Eletricos")

                Spacer(modifier = Modifier.height(40.dp))
                Text(
                    "Escolhe uma apção: ",
                    fontSize = 30.sp
                )
            }
        Row(
            modifier = Modifier.padding(vertical = 30.dp, horizontal = 30.dp)
        ) {
            Button(
                modifier = Modifier.weight(1F),
                onClick = { page = 2; option = 1 }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(stringResource(id = R.string.um))
                    Text(stringResource(id = R.string.azul).uppercase())
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                modifier = Modifier.weight(1F),
                onClick = { page = 2; option = 2 }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(stringResource(id = R.string.dois))
                    Text(stringResource(id = R.string.amarelo).uppercase())

                }
            }
        }
        Row(
            modifier = Modifier.padding(vertical = 30.dp, horizontal = 30.dp)
        ) {
            Button(
                modifier = Modifier.weight(1F),
                onClick = { page = 3; option = 3 }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(stringResource(id = R.string.tres))
                    Text(stringResource(id = R.string.verde).uppercase())


                }
            }
            Spacer(modifier = Modifier.width(20.dp))

            Button(
                modifier = Modifier.weight(1F),
                onClick = { page = 4; option = 4 }) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(stringResource(id = R.string.quatro))
                    Text(stringResource(id = R.string.laranja).uppercase())


                }
            }
        }
    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    EcoPontoProjectTheme {
        EcoPonto(modifier = Modifier.fillMaxSize())
    }
}