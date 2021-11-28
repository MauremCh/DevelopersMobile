package com.example.cortinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val boton6=findViewById<Button>(R.id.btn_seis)
        boton6.setOnClickListener {
            val lanzar = Intent(this, VentasActivity::class.java)
            startActivity(lanzar)
        }
        val boton7=findViewById<Button>(R.id.btn_siete)
        boton7.setOnClickListener {
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }
        val boton8=findViewById<Button>(R.id.btn_ocho)
        boton8.setOnClickListener {
            val lanzar = Intent(this, RegistroActivity::class.java)
            startActivity(lanzar)
        }
        val boton9=findViewById<Button>(R.id.btn_nueve)
        boton9.setOnClickListener {
            val lanzar = Intent(this, ArticulosActivity::class.java)
            startActivity(lanzar)
        }
    }

}