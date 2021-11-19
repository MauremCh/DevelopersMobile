package com.example.cortinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class RegistroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        val boton2=findViewById<Button>(R.id.btn_cuatro)
        boton2.setOnClickListener {
            val lanzar = Intent(this, MainActivity::class.java)
            startActivity(lanzar)
        }

        val boton3=findViewById<Button>(R.id.btn_cuatro)
        boton3.setOnClickListener {
            val lanzar = Intent(this, VentasActivity::class.java)
            startActivity(lanzar)
        }

    }
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.action_search ->{
                Toast.makeText(this, R.string.text_action_search, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_settings ->{
                Toast.makeText(this, R.string.text_action_settings, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_logout ->{
                Toast.makeText(this, R.string.text_action_logout, Toast.LENGTH_LONG).show()
                return true
            }
            else -> return super.onOptionsItemSelected(item)


        }

    }
}