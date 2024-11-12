package com.example.ugo.ui.screen.experiencias

import android.widget.EditText
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ugo.R

@Composable
@Preview
fun  TarjExperienciaPreview (){
    TarjExperiencia( verOpcionesClick = {}

    )
}
@Composable
fun TarjExperiencia(
    verOpcionesClick: () -> Unit
){


    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(2.dp)
        .height(120.dp)
    ) {

        Row(
            modifier = Modifier
                .padding(2.dp)
                .background(Color(0xFFffffff), shape = RoundedCornerShape(16.dp)),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                modifier = Modifier
                    .size(100.dp)
                    .padding(5.dp)
                    .fillMaxWidth(.3f)
                    .background(
                        color = Color(0xfffffafa)
                    )
                    .clip(shape = RoundedCornerShape(15.dp))
                ,
                contentScale = ContentScale.Crop,
                painter = painterResource(R.drawable.img_1),
                contentDescription = null
            )
            Column(
                modifier = Modifier.fillMaxSize(1f)
            ) {
                Row {
                    Text(
                        modifier = Modifier.weight(1f),
                        text = "Expeciencia Haven",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    )

                    Text(
                        text = "3 horas , 2 viajeros ",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraLight,
                            fontSize = 10.sp
                        )
                    )
                }
                Column {

                    Text(
                        text = "0.4Km From city center",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraLight,
                            fontSize = 10.sp
                        )

                    )
                    Text(
                        text = "Tour por el valle + comidas y bebidas + transportebebidas + transportebebidas + transporte",
                        style = TextStyle(
                            fontWeight = FontWeight.ExtraLight,
                            fontSize = 10.sp
                        )

                    )

                }

                Row {
                    Text(
                        modifier = Modifier
                           // .weight(1f)
                            .align(Alignment.CenterVertically)
                            ,
                        text = "$30 por persona ",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )

                    )

                    Button(onClick = { verOpcionesClick() },
                        modifier = Modifier.padding(0.dp)
                        ,
                        colors = ButtonDefaults.buttonColors( Color(0xffff9500))
                    ){
                        Text(
                            modifier = Modifier.padding(0.dp),
                            text = "ver opciones",)

                    }
                }

            }
        }




    }




}