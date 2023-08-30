package com.example.iuconelementoscomponibles

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iuconelementoscomponibles.ui.theme.IUConElementosComponiblesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IUConElementosComponiblesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TaskCompletedScreen()
                }
            }
        }
    }
}

@Composable
fun TaskCompletedScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.fondo_oscuro),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.empresa),
                color = Color.White,
                fontSize = 45.sp
            )
            Text(
                text = stringResource(R.string.rubro),
                color = Color.White,
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.dueño),
                color = Color.White,
                fontSize = 35.sp
            )
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            val image = painterResource(R.drawable.dio_icon)
            Image(painter = image, contentDescription = null,
                modifier = Modifier
                    .width(150.dp)
                    .height(150.dp))
            Spacer(modifier = Modifier.height(16.dp))
            Text(
                text = stringResource(R.string.nombre), color = Color(0xFFFFFFFF),
                fontSize = 50.sp
            )
            Text(
                text = stringResource(R.string.empleo), color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(30.dp))
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),

            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.telefono), color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )
            Text(
                text = stringResource(R.string.mencion), color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )
            Text(
                text = stringResource(R.string.correo), color = Color(0xFFFFFFFF),
                fontSize = 16.sp
            )
            Spacer(modifier = Modifier.height(16.dp))
        }
    }


}

@Preview(showBackground = true)
@Composable
fun TaskCompletedPreview() {
    IUConElementosComponiblesTheme {
        TaskCompletedScreen()
    }
}