package com.pmdm.GestionColecciones

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.pmdm.GestionColecciones.data.PiezaRepository
import com.pmdm.GestionColecciones.ui.features.presentacion.PresentacionScreen
import com.pmdm.GestionColecciones.ui.theme.MiColeccionTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MiColeccionTheme {
                PresentacionScreen(
                    pieza = PiezaRepository().getAll().random()

                ) { }
            }
        }
    }
}
