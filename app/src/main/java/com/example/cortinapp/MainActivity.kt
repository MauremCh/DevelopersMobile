package com.example.cortinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))

        val boton1=findViewById<Button>(R.id.btn_uno)
        boton1.setOnClickListener {
            val lanzar = Intent(this, RegistroActivity::class.java)
            startActivity(lanzar)
        }
        val boton11=findViewById<Button>(R.id.btn_once)
        boton11.setOnClickListener {
            val lanzar = Intent(this, MainActivity2::class.java)
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
                val intento = Intent(this, DrawerActivity::class.java)
                startActivity(intento)
                return true
            }
            R.id.action_settings ->{
                Toast.makeText(this, R.string.text_action_settings, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_logout ->{
                val intento = Intent(this, ToDoActivity::class.java)
                startActivity(intento)
                return true
            }
            else -> return super.onOptionsItemSelected(item)


        }

    }


}
