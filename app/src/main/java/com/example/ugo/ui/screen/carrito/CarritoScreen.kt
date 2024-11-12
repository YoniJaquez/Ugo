package com.example.ugo.ui.screen.carrito

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ugo.R
import com.example.ugo.ui.component.navigation_bar.NavegationBarContent
import com.example.ugo.ui.screen.experiencias.TarjExperiencia
import com.example.ugo.ui.screen.experiencias.TarjQuitarExperiencia
import com.example.ugo.ui.screen.home.TopBar


@Preview
@Composable
fun CarritoScreenPreview(){
    CarritoScreen(rememberNavController()){}
}
@Composable
fun CarritoScreen(
    navigation: NavHostController, modifier: Modifier = Modifier
    .fillMaxSize()
    .background(Color.White),

    confirmarClick: () -> Unit
){
    val roundShape = RoundedCornerShape(10.dp)

    Column(
        modifier = Modifier.background(color = Color(0xFFE2E2E2))
    ) {

        TopBar(
            modifier = Modifier.height(50.dp),
            onBuscar = {}
        )

        LazyColumn(
            modifier = Modifier.weight(1f)
        ) {
            for (i in 0..20) {

                item {
                    TarjQuitarExperiencia(quitarClick = { /*TODO*/ }, disminuirClick = { /*TODO*/ }) {
                        //click ver opciones
                    }
                }
            }

        }


        Button(onClick = { confirmarClick () },
            modifier = Modifier.padding(0.dp),
            colors = ButtonDefaults.buttonColors( Color(0xffffcf15))
        ){
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(0.dp),
                text = "Confirmar",
                textAlign = TextAlign.Center
            )

        }


        NavegationBarContent(navigation, Modifier.height(70.dp))
    }
}