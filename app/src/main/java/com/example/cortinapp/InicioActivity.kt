package com.example.cortinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.EditText
import android.view.View
import androidx.appcompat.app.AlertDialog
import android.widget.Toast
import android.content.DialogInterface
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity


class InicioActivity : AppCompatActivity() {
    private lateinit var edtUsername: EditText
    private lateinit var edtPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtUsername = findViewById(R.id.edtUsername)
        edtPassword = findViewById(R.id.edtPassword)

        fun onLogin(View: View) {
            if(edtUsername.text.toString().equals("josearias@gmail.com") && edtPassword.text.toString().equals("1234")){

            }


        }

    }


    }




