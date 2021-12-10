package com.example.cortinapp.room_database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.cortinapp.room_database.Ventas.class}, version = 1)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/cortinapp/room_database/VentasDatabase;", "Landroidx/room/RoomDatabase;", "()V", "ventasDao", "Lcom/example/cortinapp/room_database/VentasDAO;", "app_debug"})
public abstract class VentasDatabase extends androidx.room.RoomDatabase {
    
    public VentasDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.cortinapp.room_database.VentasDAO ventasDao();
}