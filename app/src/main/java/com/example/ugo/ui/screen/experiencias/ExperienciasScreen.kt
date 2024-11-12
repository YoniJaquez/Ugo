package com.example.ugo.ui.screen.experiencias

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.ugo.ui.component.navigation_bar.NavegationBarContent
import com.example.ugo.ui.component.tu_busqueda.TuBusquedas
import com.example.ugo.ui.screen.home.TopBar


@Preview
@Composable
fun ExperienciasScreenPreview(){
    ExperienciasScreen(rememberNavController())
}
@Composable
fun ExperienciasScreen(navigation: NavHostController, modifier: Modifier = Modifier
    .fillMaxSize()
    .background(Color(0xffe2e2e2))
){
    var mostrarFiltros by remember { mutableStateOf(false) }

    Box(modifier = modifier){

        Column(
            modifier = modifier
        ) {
            TopBar(
                modifier = Modifier.height(50.dp),
                onMenuClick = {
                    mostrarFiltros = true
                }
            )
            //inicio contenido
            LazyColumn(
                modifier = Modifier.weight(1f)
            ) {
                for (i in 0..20) {

                    item {
                        TarjExperiencia {
                            //click ver opciones
                        }
                    }
                }

            }


            //fin ncontenido
            NavegationBarContent(navigation, Modifier.height(70.dp))
        }

        if(mostrarFiltros){
            TuBusquedas(onFiltrar = {
                mostrarFiltros = false
            })
        }
    }
}
