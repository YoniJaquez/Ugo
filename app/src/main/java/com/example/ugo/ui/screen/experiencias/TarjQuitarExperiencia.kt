package com.example.ugo.ui.screen.experiencias

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun  TarjQuitarExperienciaPreview (){
    TarjQuitarExperiencia(
        quitarClick = {},
        disminuirClick = {},
        aumentarClick = {}
    )
}
@Composable
fun TarjQuitarExperiencia(
    quitarClick: () -> Unit,
    disminuirClick: () -> Unit,
    aumentarClick: () -> Unit
){
    var cantidad by remember { mutableStateOf(1) }

    Column(modifier = Modifier
        .padding(2.dp)
        .height(120.dp)
    ) {

        Row(
            modifier = Modifier
                .background(Color(0xFFFFFFFF), shape = RoundedCornerShape(16.dp))
                .padding(2.dp),
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

                    Row(
                        modifier = Modifier
                            .padding(5.dp)
                            .clickable { quitarClick() }
                    ) {
                        Text(
                            textAlign = TextAlign.Center,
                            text = "Quitar ",
                            style = TextStyle(
                                fontWeight = FontWeight.ExtraLight,
                                fontSize = 16.sp
                            )

                        )

                        Icon(

                            painter = painterResource(R.drawable.trash) ,
                            contentDescription = null,
                            modifier = Modifier
                                .size(15.dp)
                                .align(Alignment.CenterVertically)

                        )


                    }
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
                            .weight(1f)
                            .align(Alignment.CenterVertically)
                        ,
                        text = "$30 ",
                        style = TextStyle(
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                    )


                    Box(
                        modifier = Modifier
                            .padding(5.dp)
                            .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
                            .padding(5.dp)
                    ){
                        Row(
                            modifier = Modifier,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Icon(
                                painter = painterResource(R.drawable.ic_menos), "",
                                modifier = Modifier
                                    .clickable {
                                        disminuirClick()
                                        if(cantidad > 1){
                                            cantidad--
                                       }
                                    }
                            )
                            Spacer(modifier = Modifier.width(10.dp))
                            Text(
                                modifier = Modifier
                                    .align(Alignment.CenterVertically)
                                ,
                                text = cantidad.toString(),
                                style = TextStyle(
                                    fontWeight = FontWeight.Bold,
                                    fontSize = 18.sp
                                )
                            )
                            Spacer(modifier = Modifier.width(10.dp))

                            Icon(
                                painter = painterResource(R.drawable.ic_mas), "",
                                modifier = Modifier
                                    .clickable {
                                        aumentarClick()
                                        cantidad++
                                    }
                            )
                        }
                    }
                }

            }
        }


    }

    //verOpcionesClick()




}