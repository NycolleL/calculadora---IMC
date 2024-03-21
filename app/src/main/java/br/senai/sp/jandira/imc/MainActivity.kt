package br.senai.sp.jandira.imc

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.AlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.imc.ui.theme.IMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {

    Column {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Blue),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.calculadora),
                contentDescription = ("Icon"),
                modifier = Modifier
                    .width(80.dp)
                    .height(80.dp)
                    .padding(top = 20.dp)
            )

            Text(
                text = "Calculadora IMC",
                fontSize = 30.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(15.dp)
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 40.dp)
                .offset(x = 0.dp, y = -32.dp)
                .background(Color.LightGray),
        ) {

            Row(
                modifier = Modifier
                    .padding(start = 80.dp)
                    .padding(top = 20.dp)
            ) {
                Text(
                    text = "Seus Dados",
                    fontSize = 30.sp,
                    color = Color.Blue,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                modifier = Modifier.padding(16.dp)
            ) {
                TextField(
                    value = "Seu peso em Kg",
                    onValueChange = {},
                    label = {
                        Text(text = "Seu peso")
                    }
                )

                Spacer(modifier = Modifier.height(30.dp))

                OutlinedTextField(
                    value = "Sua altura em cm",
                    onValueChange = {},
                    label = {
                        Text(text = "Sua altura")
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Blue
                    )
                )

                Spacer(modifier = Modifier.height(35.dp))

                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(bottom = 32.dp)
                        .fillMaxWidth()
                ) {
                    Text(text = "CALCULAR", fontWeight = FontWeight.ExtraBold, fontSize = 20.sp)
                }
            }
        }

            Column(
                modifier = Modifier
                    .width(300.dp)
                    .height(50.dp)
                    .padding(start = 110.dp)
                    .background(Color.Yellow)
            ) {
                Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "Resultado",
                        color = Color.Black,
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 20.sp,
                        modifier = Modifier.padding(start = 38.dp)
                    )
                }
            }
        }


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMCTheme {
        Greeting()
    }
}