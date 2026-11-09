package com.pmdm.GestionColecciones.ui.features.presentacion

import android.R.attr.fontFamily
import android.R.attr.fontWeight
import android.R.attr.letterSpacing
import android.R.attr.lineHeight
import android.R.attr.maxLines
import android.R.attr.minLines
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Shield
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import coil3.compose.AsyncImage
import com.pmdm.GestionColecciones.data.PiezaRepository
import com.pmdm.GestionColecciones.models.Pieza
import com.pmdm.GestionColecciones.ui.theme.MiColeccionTheme


@Composable
fun PresentacionScreen(
    pieza : Pieza,
    onEntradaClick : () -> Unit
)
{
    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxHeight()
            .fillMaxWidth()
            .padding(20.dp)


        )
    {
        Column(
            modifier = Modifier
                .padding(5.dp)
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()

        ) {
            Text(
                text = "El santuario del manga y el anime en una sola app",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.error,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center

            )
            Text(
                text = "Explora miles de capítulos de tus series favoritas en alta calidad y sin interrupciones.\n" +
                        "Guarda tus mangas preferidos en la biblioteca y recibe alertas con cada nuevo estreno.\n" +
                        "Lee a tu propio ritmo gracias a la lectura sin conexión y a un visor totalmente personalizable.",
                style = MaterialTheme.typography.labelLarge,
                modifier = Modifier
                    .padding(5.dp)
            )

            OutlinedCard() {
                Box( modifier = Modifier
                    .fillMaxWidth()
                    .padding(25.dp))
                {
                    BadgedBox(
                        badge = { Badge() },
                        modifier = Modifier.align(Alignment.CenterStart)
                    ){
                        Icon(Icons.Filled.Shield, contentDescription = "Escudo")

                    }
                    Text(
                        text = "Cantidad de Piezas: ${PiezaRepository().getAll().size}",
                        modifier = Modifier.align(Alignment.Center),
                        style = MaterialTheme.typography.bodyLarge,
                        fontWeight = FontWeight.Bold


                    )
                }
            }
        }
        Column(
            //modifier = Modifier.align( Alignment.Horizontal )


        )
        {

            ElevatedCard () {
                AsyncImage(
                    model = pieza.imageURL,
                    contentDescription = pieza.nombre,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(260.dp)

                )
                Text(
                    text = pieza.descripcion,
                    textAlign = TextAlign.Justify,
                    style = MaterialTheme.typography.labelMedium,
                    modifier = Modifier.padding(5.dp)


                )
            }

        }

        Column(
            modifier = Modifier.align(Alignment.CenterHorizontally)
                .padding(5.dp)


        ) {
            FilledTonalButton(onClick = {}) {Text("Crear Cuenta") }
            OutlinedButton(onClick = {}) {Text("Iniciar Sesion") }

        }


    }

}

@Preview(showBackground = true)
@Composable
fun PresentacionScreenPreview()
{
    MiColeccionTheme() {
        PresentacionScreen(
            pieza = PiezaRepository().getAll().random(),
            onEntradaClick = {}
        )
    }

}