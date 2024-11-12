package com.example.ugo.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ugo.ui.component.navigation_bar.NavegationBarContent
import com.example.ugo.ui.screen.carrito.CarritoScreen
import com.example.ugo.ui.screen.experiencias.ExperienciasScreen
import com.example.ugo.ui.screen.home.HomeScreen

@Composable
fun Navigation(navigation: NavHostController){
    Column(){
        NavHost(
            navController = navigation,
            startDestination = "home"
        ){
            composable("home"){
                HomeScreen(navigation = navigation)
            }
            composable("experiencias"){
                ExperienciasScreen(navigation = navigation)
            }
            composable("carrito"){
                CarritoScreen(navigation = navigation){}
            }
        }

        Spacer(modifier = Modifier.height(50.dp))

        NavegationBarContent(navigation = navigation, modifier = Modifier.height(70.dp))
    }
}