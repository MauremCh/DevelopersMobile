package com.example.cortinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(findViewById(R.id.my_toolbar))

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

    }

    fun onLogin(botonLogin: View) {
        if (edtUsername.text.toString().equals("josearias@gmail.com") && edtPassword.text.toString()
                .equals("1234")
        ) {
            val intento = Intent(this, MainActivity2::class.java)
            intento.putExtra("Username", edtUsername.text.toString())
            startActivity(intento)
        }
        //else{
        //var dialog = AlertDialog.Builder(this)
        //.setTitle(R.string.text_error)
        //.setMessage(R.string.text_error_message)
        //.create()
        //.show()
        // }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }
}