package com.example.cortinapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.example.cortinapp.room_database.VentasDatabase
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ToDoFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ToDoFragment : Fragment() {
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
        val fragmento: View = inflater.inflate(R.layout.fragment_to_do, container, false)
 /*       val detail1: Button = fragmento.findViewById(R.id.btn_detail_1)
        val detail2: Button = fragmento.findViewById(R.id.btn_detail_2)
        val detail3: Button = fragmento.findViewById(R.id.btn_detail_3)
        detail1.setOnClickListener { it ->
            val datos = Bundle()
            datos.putString("Tarea", "Ir al supermercado")
            datos.putString("Hora", "10:00 am")
            datos.putString("Lugar", "Exito")
            activity?.supportFragmentManager?.beginTransaction()
                ?.replace(R.id.fragmentContainerView2, DetailFragment::class.java, datos, "detail")
                ?.addToBackStack("")
                ?.commit()


        }*/
        return fragmento
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerTodoList: RecyclerView = view.findViewById(R.id.recyclerTodoList)
        var datos: ArrayList<Task> = ArrayList()
        val room: VentasDatabase = Room.databaseBuilder(context?.applicationContext!!, VentasDatabase::class.java, "VentasDatabase").build()
        var VentasDao = room.ventasDao()
        runBlocking {
            launch {
                var result = VentasDao.getAllTasks()
                for (Ventas in result){
                    datos.add(Task(Ventas.id, Ventas.Nombre, Ventas.fecha, Ventas.alto, Ventas.ancho,Ventas.area,
                        Ventas.precio, Ventas.cuotas, Ventas.documentoCliente, Ventas.documentoVendedor, Ventas.documentoCliente))

                }
            }
        }


/*
        datos.add(Task(1, "Venta de Cortinas", "Venta 1", "06/12/21", "564000"))
        datos.add(Task(2, "Venta de Persianas", "Venta 2", "07/12/21", "725000"))
        datos.add(Task(3, "Venta de Estores", "Venta 3", "08/12/21", "692000"))
*/
        var taskAdapter = TaskAdapter(datos){
            val datos = Bundle()
            datos.putInt("id", it.id)



/*            datos.putString("Nombre", it.nombre)
            datos.putString("Fecha", it.fecha)
            datos.putString("Precio", it.precio)*/
            Navigation.findNavController(view).navigate(R.id.nav_detail, datos)


        }
        recyclerTodoList.setHasFixedSize(true)
        recyclerTodoList.adapter = taskAdapter
        recyclerTodoList.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ToDoFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ToDoFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}