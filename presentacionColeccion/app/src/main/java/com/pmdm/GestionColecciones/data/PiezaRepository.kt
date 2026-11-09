package com.pmdm.GestionColecciones.data

import com.pmdm.GestionColecciones.data.mocks.PiezaDaoMock
import com.pmdm.GestionColecciones.models.Pieza

class PiezaRepository(
    private val piezaDao : PiezaDaoMock = PiezaDaoMock()
)

{
    fun getAll() : List<Pieza> =  piezaDao.getAll().map { it.toPieza() }



}