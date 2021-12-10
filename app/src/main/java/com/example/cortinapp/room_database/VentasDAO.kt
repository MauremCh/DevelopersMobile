package com.example.cortinapp.room_database

import androidx.room.*

@Dao
interface VentasDAO {
    @Query("SELECT * FROM Ventas")
    suspend fun getAllTasks(): List<Ventas>

    @Query("SELECT * FROM Ventas WHERE id = :id")
    suspend fun findById(id:Int): Ventas

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertTask(task: Ventas): Long

    @Update
    suspend fun updateTask(task: Ventas)

    @Delete
    suspend fun deleteTask(task: Ventas)
}