package com.example.ugo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.ugo.ui.Navigation
import com.example.ugo.ui.theme.UgoTheme
import com.example.ugo.ui.component.navigation_bar.NavegationBarContent
import com.example.ugo.ui.component.tarjeta_experiencia.TarjetaExperienciaContent
import com.example.ugo.ui.screen.carrito.CarritoScreen
import com.example.ugo.ui.screen.experiencias.ExperienciasScreen
import com.example.ugo.ui.screen.home.HomeScreen

class MainActivity : ComponentActivity() {
    lateinit var navigation: NavHostController
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            navigation = rememberNavController()

            UgoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    Box(modifier = Modifier.fillMaxSize()){
                        Navigation(navigation)

                    }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
val
        navigation = rememberNavController()
    Box(modifier = Modifier.fillMaxSize()){
        Navigation(navigation)

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    UgoTheme {
        Greeting("Android")
    }
}