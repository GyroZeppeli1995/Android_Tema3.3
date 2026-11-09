package com.pmdm.GestionColecciones.data

import com.pmdm.GestionColecciones.data.mocks.PiezaMock
import com.pmdm.GestionColecciones.models.Pieza

//Me costo pillarlo, pero esto es una clase estatica realmente, no una clase aparte
fun PiezaMock.toPieza() = Pieza(id,nombre,descripcion,imageURL)

