package com.example.ugo.ui.component.tu_busqueda

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.absolutePadding
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.util.Preconditions
import com.example.ugo.R

@Composable
@Preview
fun  TuBusquedasPreview (){
    TuBusquedas(onFiltrar = {})

}
@Composable
fun TuBusquedas (
    onFiltrar: () -> Unit
) {

Box(
    modifier = Modifier
        .fillMaxSize()
        .background(color = Color(0x66E2E2E2))
){

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.7f)
            .background
                (
                color = Color(0xFFf0f0f0),
                shape = RoundedCornerShape(0.dp)
            )
            .padding(10.dp)
    ) {
        item{

            Row (
                verticalAlignment = Alignment.CenterVertically
            ){
                Icon(
                    painter = painterResource(R.drawable.ic_back) ,
                    contentDescription = null,
                    modifier = Modifier.size(35.dp)
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Tus Busquedas",
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 25.sp
                    )
                )
            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Lugar",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp
                )
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
                .padding(10.dp)
            ){

                Icon(
                    painter = painterResource(R.drawable.ic_back) ,
                    contentDescription = null,)

                Text(text = " Search for experiences ")

            }
            //Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Fecha de inicio",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp
                )
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
                .padding(10.dp)
            ){

                Icon(
                    painter = painterResource(R.drawable.ic_back) ,
                    contentDescription = null,)

                Text(text = " Search for experiences ")

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = "Fecha de fin",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp
                )
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
                .padding(10.dp)
            ){

                Icon(
                    painter = painterResource(R.drawable.ic_back) ,
                    contentDescription = null,)

                Text(text = " Search for experiences ")

            }
            Spacer(modifier = Modifier.height(10.dp))
            Text(

                text = "Viajeros",
                style = TextStyle(
                    fontWeight = FontWeight.Normal,
                    fontSize = 20.sp
                )
            )
            Row(modifier = Modifier
                .fillMaxWidth()
                .border(1.dp, Color.DarkGray, RoundedCornerShape(35.dp))
                .padding(10.dp)
            ){

                Icon(
                    painter = painterResource(R.drawable.ic_back) ,
                    contentDescription = null,)

                Text(text = " Search for experiences ")

            }
            Spacer(modifier = Modifier.height(10.dp))


            Button(onClick = { onFiltrar() },
                modifier = Modifier
                    .fillMaxWidth()            ,
                colors = ButtonDefaults.buttonColors( Color(0xffff9500))
            ){
                Text(
                    modifier = Modifier.padding(0.dp),
                    text = "Explorar",)

            }
            Spacer(modifier = Modifier.height(10.dp))

            //region Refine Your Search
            Row(
            ) {
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Refine your search",
                    style = TextStyle(
                        fontWeight = FontWeight.Normal,
                        fontSize = 20.sp
                    )
                )

                Text(
                    text = "Clear",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )

            }

            Row(
                modifier = Modifier
                    .padding(0.dp)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {}
                )
                Text(
                    text = "Pet friendly",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {}
                )
                Text(
                    text = "Paquete todo incluido",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Transporte",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Comida",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            //endregion Refine Your Search

            //region Price Range
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Price Range per",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Under $50",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "$50 - $100",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "$100 - 150",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Above $150",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            //endregion Price Range

            //region Ratings
            Text(
                modifier = Modifier.padding(10.dp),
                text = "Ratings",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp
                )
            )
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Any Rating",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Excellent",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Very Good",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = false,
                    onCheckedChange = {},

                    )
                Text(
                    text = "Good",
                    style = TextStyle(
                        fontWeight = FontWeight.ExtraLight,
                        fontSize = 20.sp
                    )
                )
            }
            //endregion Ratings
        }

    }
}


}