package com.example.ugo.ui.component.navigation_bar
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ugo.R

@Preview
@Composable
fun NavegationBarPreview(){
    NavegationBarContent(rememberNavController(), Modifier.height(70.dp))
}

@Composable
fun NavegationBarContent(
    navigation: NavHostController,
    modifier: Modifier
) {
    val navBackStackEntry by navigation.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route


    Row(
        modifier = modifier
            .fillMaxWidth()
            .background(color = Color.White, shape = RoundedCornerShape(8.dp)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Spacer(modifier = Modifier.weight(1f))
        BotonMenu(texto =  "Experiencias", drawable = R.drawable.compass, onClick = { navigation.navigate("experiencias") })
        Spacer(modifier = Modifier.weight(1f))
        BotonMenu(texto = "Carrito", drawable = R.drawable.cart_shopping, onClick = { navigation.navigate("carrito") })
        Spacer(modifier = Modifier.weight(1f))
        Column(
            modifier = Modifier
                .background(color = Color.White)
                .fillMaxHeight()
                .clickable { navigation.navigate("home") },
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Image(
                modifier = Modifier
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop,
                painter =painterResource(R.drawable.hugo_logo) , contentDescription = null,
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        BotonMenu(texto = "Historial", drawable = R.drawable.clock, onClick = {})
        Spacer(modifier = Modifier.weight(1f))
        BotonMenu(texto = "Configuracion", drawable = R.drawable.gear, onClick = {})
        Spacer(modifier = Modifier.weight(1f))
    }
}

@Composable
fun BotonMenu(texto: String, drawable: Int, onClick: () -> Unit){
    Column(
        modifier = Modifier.background(color = Color.White).clickable { onClick() },
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Image(
            painter =painterResource(drawable) , contentDescription = null,
            modifier = Modifier.height(25.dp)
        )

        Text(
            text = texto,
            color = Color(0xFF000000),
            style = TextStyle(
                fontWeight = FontWeight.Bold,
                fontSize = 12.sp
            )
        )
    }
}