package com.example.cortinapp

data class Task ( val id: Int, val tarea: String, val nombre: String, val fecha: String, val alto: String,
                  val ancho: String, val area: String, val precio: String, val cuotas: String,
                  val documentoCliente: String, val documentoVendedor: String){
    override fun toString(): String {
        return tarea
    }
}