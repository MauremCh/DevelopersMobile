package com.example.cortinapp.room_database

import androidx.room.*


@Entity
data class Ventas (
    @PrimaryKey(autoGenerate = true)
    val id:Int,
    val Nombre: String,
    val fecha: String,
    val alto: String,
    val ancho: String,
    val area: String,
    val precio: String,
    val cuotas: String,
    val documentoCliente: String,
    val documentoVendedor: String,
)