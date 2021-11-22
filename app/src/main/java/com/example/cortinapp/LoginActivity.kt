package com.example.cortinapp

import android.app.AlertDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {

    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

        fun onLogin(btnLogin: View) {
            if (edtUsername.text.toString()
                    .equals("josearias@gmail.com") && edtPassword.text.toString().equals("1234")
            ) {
                val intento = Intent(this, VentasActivity::class.java)
                intento.putExtra("Username", edtUsername.text.toString())
                startActivity(intento)
            } else {
                var dialog = AlertDialog.Builder(this)
                    .setTitle(R.string.text_error)
                    .setMessage(R.string.text_error_message)
                    .create()
                    .show()
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












