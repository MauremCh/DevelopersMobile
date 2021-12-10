package com.example.cortinapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class NewTaskActivity : AppCompatActivity() {
    lateinit var editTextCodigo:EditText
    lateinit var editTextAncho:EditText
    lateinit var editTextAlto:EditText
    lateinit var editTextArea:EditText
    lateinit var editTextCuotaSemanal:EditText
    lateinit var editTextSaldo:EditText
    lateinit var editTextCantidadCuotas:EditText
    lateinit var editTextCuotaActual:EditText
    lateinit var editTextDocumentoDelCliente:EditText
    lateinit var editTextDocumentoDelVendedor:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_task)
        editTextCodigo = findViewById(R.id.editTextCodigo)
        editTextAncho = findViewById(R.id.editTextAncho)
        editTextAlto = findViewById(R.id.editTextAlto)
        editTextArea = findViewById(R.id.editTextArea)
        editTextCuotaSemanal = findViewById(R.id.editTextCuotaSemanal)
        editTextSaldo = findViewById(R.id.editTextSaldo)
        editTextCantidadCuotas = findViewById(R.id.editTextCantidadCuotas)
        editTextCuotaActual = findViewById(R.id.editTextCuotaActual)
        editTextDocumentoDelCliente = findViewById(R.id.editTextDocumentoDelCliente)
        editTextDocumentoDelVendedor = findViewById(R.id.editTextDocumentoDelVendedor)

    }
    fun onSave(view: View) {
        //val db = VentasDatabase.getDatabase(this)

        //val todoDAO = db.todoDAO()
        //val task = Ventas(editTextCodigo.text.toString(), editTextAncho.text.toString(), editTextAlto.text.toString(), editTextArea.text.toString(), editTextCuotaSemanal.text.toString(),
            //editTextSaldo.text.toString(), editTextCantidadCuotas.text.toString(), editTextCuotaActual.text.toString(), editTextDocumentoDelCliente.text.toString(),
           // editTextDocumentoDelVendedor.text.toString())

        runBlocking {
            launch {
               // var result = todoDAO.insertTask(task)
               // if(result!=-1L){
                    setResult(Activity.RESULT_OK)
                    finish()
                }
            }
        }
}