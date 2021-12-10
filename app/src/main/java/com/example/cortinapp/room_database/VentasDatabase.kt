package com.example.cortinapp.room_database

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase


@Database(entities = arrayOf(Ventas::class), version=1)
abstract class VentasDatabase: RoomDatabase(){
    abstract fun ventasDao(): VentasDAO

/*
    companion object{
       @Volatile
        private var INSTANCE: VentasDatabase? = null

        fun getDatabase(context:Context):VentasDatabase{
            return INSTANCE ?: syncro
        }
    }
*/
}