package com.example.ugo.ui.component.tarjeta_experiencia

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ugo.R

@Preview
@Composable
fun TarjetaExperienciaPreview(){
    TarjetaExperienciaContent(R.drawable.tour_oaxaca, "Tour por el pueblo", "OAXACA", 40.0)
}

@Composable
fun TarjetaExperienciaContent(
    imagen: Int = R.drawable.tour_antioquia,
    titulo: String = "",
    lugar: String = "",
    precio: Double = 0.0,
    modifier: Modifier = Modifier.fillMaxSize().padding(2.dp)
){
    val roundShape = RoundedCornerShape(10.dp)

    Box(modifier = modifier){
        Column() {
            Image(
                painter = painterResource(imagen),
                contentDescription = null,
                modifier = Modifier.weight(1f).clip(shape = RoundedCornerShape(8.dp)),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.height(25.dp))
        }
        Column {
            Spacer(modifier = Modifier.weight(1f))
            Row {

                Spacer(modifier = Modifier.width(10.dp))
                Box( modifier = Modifier
                    .weight(1f)
                    .background(Color(0xFFFFEEAA), shape = roundShape)
                    .padding(8.dp)

                ) {
                    Column(
                    ) {
                        Text(text = titulo,
                            color = Color(0xFF222222),
                            style = TextStyle(
                                fontSize = 8.sp
                            )
                        )
                        Text(text = lugar,
                            color = Color(0xFF000000),
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 14.sp
                            )
                        )
                        Row(
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(text = "Desde",
                                color = Color(0xFF000000),
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 8.sp
                                )
                            )
                            Spacer(modifier = Modifier.width(5.dp))

                            Text(text = "$${precio}",
                                color = Color(0xFF000000),
                                style = TextStyle(
                                    fontWeight = FontWeight.Light,
                                    fontSize = 14.sp
                                )
                            )
                        }

                    }
                }

                Spacer(modifier = Modifier.width(10.dp))
            }
        }


    }


}