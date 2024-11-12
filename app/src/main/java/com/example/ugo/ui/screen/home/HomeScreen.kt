package com.example.ugo.ui.screen.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ugo.R
import com.example.ugo.ui.component.navigation_bar.NavegationBarContent
import com.example.ugo.ui.component.tarjeta_experiencia.TarjetaExperienciaContent

@Preview
@Composable
fun HomeScreenPreview(){
//    HomeScreen()
}
@Composable
fun HomeScreen(navigation: NavHostController, modifier: Modifier = Modifier
    .fillMaxSize()
    .background(Color.White)){
    Column(
        modifier = modifier
    ) {
        TopBar(modifier = Modifier.height(50.dp))
        //inicio contenido
        LazyColumn(
            modifier = Modifier.weight(1f)
        ){
            item{
                Box(modifier = Modifier.height(250.dp)) {
                    Image(painter = painterResource(R.drawable.banner) ,
                        contentDescription = "",
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                shape = RoundedCornerShape(15.dp),
                                color = Color(0xAAFFEEAA)
                            )
                            .clip(shape = RoundedCornerShape(15.dp)),
                        contentScale = ContentScale.Crop
                    )

                    Column(modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(0.7f)
                        .background(
                            shape = RoundedCornerShape(15.dp),
                            color = Color(0xAAFFEEAA)
                        )
                        .padding(10.dp)
                    ){
                        Text(
                            text = "Encuentra tu proxima aventura",
                            fontSize = 35.sp,
                            color = Color.Black
                        )
                        Spacer(modifier = Modifier.weight(1f))
                        Button(onClick = {},
                            colors = ButtonDefaults.buttonColors( Color(0xffff9500))
                        ){
                            Text(text = "Descubre")
                        }
                    }
                }
            }
            item {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier
                        .background(Color(0xFFf0f0f0), shape = RoundedCornerShape(15.dp))
                        .padding(8.dp)

                ) {
                    Row {
                        ItemFiltro(titulo = "Lugar", descripcion = "Destino")
                        Spacer(modifier = Modifier.weight(1f))
                        ItemFiltro(titulo = "Fechas", descripcion = "selecciona fecha")
                        Spacer(modifier = Modifier.weight(1f))
                        ItemFiltro(titulo = "Viajeros", descripcion = "Numeros de viajeros")
                    }
                    Button(onClick = {},
                        colors = ButtonDefaults.buttonColors( Color(0xffff9500))
                    ){
                        Text( text = "Buscar",)
                    }
                }
            }


            item{
                Text(text = "Categorias",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 35.sp
                    ),
                    textAlign = TextAlign.Center,
                    modifier = Modifier.fillMaxWidth()
                )
                Row(modifier = Modifier.fillMaxWidth()) {
                    CategoriaCard(R.drawable.ic_umbrella, "Escape Playero")
                    CategoriaCard(R.drawable.ic_camp, "Escape Playero", modifier = Modifier.fillMaxWidth(1f))
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    CategoriaCard(R.drawable.ic_surf, "Escape Playero")
                    CategoriaCard(R.drawable.ic_boat, "Escape Playero", modifier = Modifier.fillMaxWidth(1f))
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    CategoriaCard(R.drawable.ic_rocket, "Escape Playero")
                    CategoriaCard(R.drawable.ic_mountain, "Escape Playero", modifier = Modifier.fillMaxWidth(1f))
                }
            }
            item {
                Box() {
                    Column(horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .background(
                                color = Color(0xffFFEEAA),
                                shape = RoundedCornerShape(25.dp)
                            )
                            .padding(10.dp)
                    ) {

                        Text(text = "Explora Tandil",
                            style = TextStyle(
                                fontWeight = FontWeight.Bold,
                                fontSize = 35.sp
                            ),
                            textAlign = TextAlign.Center,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Carrusel(arrayListOf(R.drawable.img, R.drawable.img_1, R.drawable.img_2))
                        Text(
                            text = buildAnnotatedString {
                                append("Paseo a caballo por las sierras\nDesde ")
                                withStyle(style = SpanStyle(fontWeight = FontWeight.Bold, fontSize = 25.sp)) {
                                    append("$10")
                                }
                                append(" /persona")
                            },
                            fontSize = 25.sp,
                            modifier = Modifier.padding(20.dp, 0.dp)
                        )

                        Button(onClick = {},
                            colors = ButtonDefaults.buttonColors( Color(0xffff9500))
                        ){
                            Text(text = "Descubre")
                        }
                    }
                    Box(
                        modifier = Modifier
                            .padding(10.dp, 30.dp)
                            .size(80.dp)
                            .background(
                                color = Color(0xffff9500),
                                shape = RoundedCornerShape(50.dp)
                            )
                            .align(Alignment.TopEnd)
                    ){
                        Text(
                            modifier = Modifier
                                .align(Alignment.Center),

                            text = "Oferta",
                            textAlign = TextAlign.Center,
                            style = TextStyle(
                                color = Color.White,
                                fontSize = 15.sp
                            ),
                        )
                    }



                }

            }

            item {
                Row(modifier = Modifier.fillMaxWidth()) {
                    TarjetaExperienciaContent(
                        imagen = R.drawable.tour_oaxaca,
                        titulo = "Tour por el pueblo",
                        lugar = "Oaxaca",
                        precio = 40.0,
                        modifier = Modifier
                            .fillMaxWidth(.5f)
                            .height(150.dp)
                            .padding(2.dp)
                    )
                    TarjetaExperienciaContent(
                        imagen = R.drawable.tour_villa_carlos_paz,
                        titulo = "Tour & picni",
                        lugar = "Villa Carlos paz",
                        precio = 30.0,
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(150.dp)
                            .padding(2.dp)
                    )
                }
                Row(modifier = Modifier.fillMaxWidth()) {
                    TarjetaExperienciaContent(
                        imagen = R.drawable.tour_antioquia,
                        titulo = "Visita guiada",
                        lugar = "Jerico,Antioquia",
                        precio = 25.0,
                        modifier = Modifier
                            .fillMaxWidth(.5f)
                            .height(150.dp)
                            .padding(2.dp)
                    )
                    TarjetaExperienciaContent(
                        imagen = R.drawable.tour_playa,
                        titulo = "Un dia de sol",
                        lugar = "Punta cana",
                        precio = 40.0,
                        modifier = Modifier
                            .fillMaxWidth(1f)
                            .height(150.dp)
                            .padding(2.dp)
                    )
                }
            }
        }



        //fin ncontenido
        NavegationBarContent(navigation, Modifier.height(70.dp))
    }
}

@Composable
fun ItemFiltro(titulo:String, descripcion: String){
    Column() {
        Text(text = titulo,
            color = Color(0xFF000000),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 20.sp
            )
        )
        Text(
            text = descripcion,
            fontSize = 15.sp,
            color = Color(0xFF222222)
        )
    }
}

@Composable
fun TopBar(
    modifier: Modifier,
    onMenuClick: (() -> Unit)? = null,
    onBuscar: (() -> Unit)? = null
){
    Row(modifier = modifier
        .fillMaxWidth()
        .background(Color.White, shape = RoundedCornerShape(10.dp))
        .padding(5.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center,

        ) {
        if(onMenuClick != null){
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .clickable { onMenuClick() },
                contentScale = ContentScale.Fit,
                painter = painterResource(R.drawable.bars) , contentDescription = null
            )
        }
        Image(
            modifier = Modifier.weight(1f),
            contentScale = ContentScale.Fit,
            painter = painterResource(R.drawable.ugo_logo_horizontal) , contentDescription = null
        )

        if(onBuscar != null){
            Image(
                modifier = Modifier
                    .width(20.dp)
                    .clickable { onBuscar() },
                contentScale = ContentScale.Fit,
                painter = painterResource(R.drawable.magnifying_glass) , contentDescription = null
            )
        }
    }
}

@Composable
fun CategoriaCard(
    icon: Int,
    text: String,
    modifier: Modifier = Modifier
        .fillMaxWidth(.5f)
){
    Box(modifier = modifier
        .aspectRatio(1f)
        .padding(10.dp)
        .shadow(elevation = 10.dp, shape = RoundedCornerShape(25.dp), clip = false)
        .background(Color(0xfffafafa), shape = RoundedCornerShape(25.dp))
    ) {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Icon(modifier = Modifier.size(40.dp),
                tint = Color(0xffff9500),
                painter =  painterResource(icon),
                contentDescription = null)
            Text(
                text = text
            )

        }

    }
}

@Composable
fun Carrusel(imagenes: List<Int>){
    LazyRow(){
        imagenes.forEach{
            item {
                ImagenCarrusel(imagen = it)
                Spacer(modifier = Modifier.width(10.dp))
            }
        }
    }
}

@Composable
fun ImagenCarrusel(imagen: Int){
    Box(
        modifier = Modifier
            .height(100.dp)
            .width(180.dp)
    ){

        Image(
            painter = painterResource(imagen),
            contentDescription =null,
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(15.dp)),
            contentScale = ContentScale.Crop
        )
    }
}
