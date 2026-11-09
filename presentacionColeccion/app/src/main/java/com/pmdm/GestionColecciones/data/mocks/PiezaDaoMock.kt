package com.pmdm.GestionColecciones.data.mocks


//Las imagenes estan hardcodeadas de internet hay que cambiarlas a ngix mas adelante

class PiezaDaoMock {

    private val piezas : List<PiezaMock> = listOf(
        PiezaMock(
            id = 1,
            nombre = "Bleach",
            descripcion = "Anime bien chingon",
            imageURL = "http://10.0.2.2/imagenes/bleach.jpg"
        ),
        PiezaMock(
            id = 2,
            nombre = "Black Clover",
            descripcion = "Un tipo sin magia en un mundo de magia obtiene magia de Biceps",
            imageURL = "http://10.0.2.2/imagenes/blackClover.jpg"
        ),
        PiezaMock(
            id = 3,
            nombre = "Los diarios de la boticaria",
            descripcion = "Detective conan pero en china",
            imageURL = "http://10.0.2.2/imagenes/boticaria.jpg"
        ),
        PiezaMock(
            id = 4,
            nombre = "Snowball earth",
            descripcion = "Monster hunter con pokemon y mechas",
            imageURL = "http://10.0.2.2/imagenes/snowballEarth.jpg"
        ),
        PiezaMock(
            id = 5,
            nombre = "Frieren",
            descripcion = "Elfa de mas de 8 siglos le entra crisis de la mediana edad",
            imageURL = "http://10.0.2.2/imagenes/frieren.jpg"
        )


    )

    fun getAll() : List<PiezaMock> = piezas
}