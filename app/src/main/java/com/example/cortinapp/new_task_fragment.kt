package com.example.cortinapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.core.widget.addTextChangedListener
import androidx.navigation.Navigation
import com.example.cortinapp.room_database.VentasDatabase
import androidx.room.*
import com.example.cortinapp.room_database.Ventas
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [new_task_fragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class new_task_fragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_new_task_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val spiTask: Spinner = view.findViewById(R.id.spiTask)
        val edtNombre: EditText = view.findViewById(R.id.edtNombre)
        val edtFecha: EditText = view.findViewById(R.id.edtFecha)
        val edtPrecio: EditText = view.findViewById(R.id.edtPrecio)
        val edtAlto: EditText = view.findViewById(R.id.edtAlto)
        val edtAncho: EditText = view.findViewById(R.id.edtAncho)
        val edtArea: EditText = view.findViewById(R.id.edtArea)
        val edtCuotas: EditText = view.findViewById(R.id.edtCuotas)
        val edtpreciometro2: EditText = view.findViewById(R.id.edtpreciomt2)
//        val edtDocumentoCliente: EditText = view.findViewById(R.id.edtdocumentocli)
//        val edtDocumentoVendedor: EditText = view.findViewById(R.id.edtdocumentoven)
        val btnNewTask: Button = view.findViewById(R.id.btn_new_task)
      edtAlto.addTextChangedListener{

            if ( edtAlto.text!!.toString() != "" && edtAncho.text!!.toString() != ""){
                var areaCortina = edtAlto.text!!.toString().toDouble()*edtAncho.text!!.toString().toDouble()
                edtArea.setText(""+ areaCortina)
            }
        }
        edtAncho.addTextChangedListener{

            if ( edtAlto.text!!.toString() != "" && edtAncho.text!!.toString() != ""){
                var areaCortina = edtAlto.text!!.toString().toDouble()*edtAncho.text!!.toString().toDouble()
                edtArea.setText(""+ areaCortina)
            }
        }
        edtpreciometro2.addTextChangedListener{

            if ( edtArea.text!!.toString() != "" && edtpreciometro2.text!!.toString() != ""){
                var precioTotal = edtpreciometro2.text!!.toString().toDouble()*edtArea.text!!.toString().toDouble()
                edtPrecio.setText(""+ precioTotal)
            }
        }
//        var ventas = arrayOf("Venta de Cortinas", "Venta de Persianas", "Venta de Estores")
        var ventas: ArrayList<Task> = ArrayList()
        ventas.add(Task(1, "Venta de Cortinas", "Venta 1", "06/12/21",
            "2", "32", "", "650000", "6", "75085830", "10253698"))
        ventas.add(Task(2, "Cortina Italiana", "Venta 2", "07/12/21",
            "2", "12", "", "650000", "6", "10254899", "10253698"))
        ventas.add(Task(3, "Cortina Francesa", "Venta 3", "08/12/21",
            "2", "10", "", "650000", "6", "11225566", "10253698"))
        val taskAdapter = ArrayAdapter(context?.applicationContext!!, android.R.layout.simple_spinner_item, ventas)
        taskAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item)
        spiTask.adapter = taskAdapter
        btnNewTask.setOnClickListener {
            var tareaSeleccionada: Task = spiTask.selectedItem as Task
            val room: VentasDatabase = Room.databaseBuilder(context?.applicationContext!!, VentasDatabase::class.java, "VentasDatabase").build()
            var VentasDao = room.ventasDao()
            var tarea = Ventas(0,tareaSeleccionada.tarea, edtNombre.text.toString(), edtFecha.text.toString(), edtAlto.text.toString(), edtAncho.text.toString(), edtArea.text.toString(), edtPrecio.text.toString(), edtCuotas.text.toString(), edtPrecio.text.toString())
            runBlocking {
                launch {
                    var result = VentasDao.insertTask(tarea)
 //                   Toast.makeText(context?.applicationContext!!, "" + result, Toast.LENGTH_LONG)
                }
            }
            Navigation.findNavController(view).navigate(R.id.nav_todo)



//            Toast.makeText(context?.applicationContext!!, tareaSeleccionada.nombre, Toast.LENGTH_LONG)
        }

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment new_task_fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            new_task_fragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}