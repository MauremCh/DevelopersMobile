package com.example.cortinapp.room_database;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Long;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class VentasDAO_Impl implements VentasDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Ventas> __insertionAdapterOfVentas;

  private final EntityDeletionOrUpdateAdapter<Ventas> __deletionAdapterOfVentas;

  private final EntityDeletionOrUpdateAdapter<Ventas> __updateAdapterOfVentas;

  public VentasDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfVentas = new EntityInsertionAdapter<Ventas>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR IGNORE INTO `Ventas` (`id`,`Nombre`,`fecha`,`alto`,`ancho`,`area`,`precio`,`cuotas`,`documentoCliente`,`documentoVendedor`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ventas value) {
        stmt.bindLong(1, value.getId());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getFecha() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFecha());
        }
        if (value.getAlto() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAlto());
        }
        if (value.getAncho() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAncho());
        }
        if (value.getArea() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArea());
        }
        if (value.getPrecio() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPrecio());
        }
        if (value.getCuotas() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCuotas());
        }
        if (value.getDocumentoCliente() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDocumentoCliente());
        }
        if (value.getDocumentoVendedor() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDocumentoVendedor());
        }
      }
    };
    this.__deletionAdapterOfVentas = new EntityDeletionOrUpdateAdapter<Ventas>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `Ventas` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ventas value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfVentas = new EntityDeletionOrUpdateAdapter<Ventas>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `Ventas` SET `id` = ?,`Nombre` = ?,`fecha` = ?,`alto` = ?,`ancho` = ?,`area` = ?,`precio` = ?,`cuotas` = ?,`documentoCliente` = ?,`documentoVendedor` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Ventas value) {
        stmt.bindLong(1, value.getId());
        if (value.getNombre() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getNombre());
        }
        if (value.getFecha() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFecha());
        }
        if (value.getAlto() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getAlto());
        }
        if (value.getAncho() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getAncho());
        }
        if (value.getArea() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getArea());
        }
        if (value.getPrecio() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getPrecio());
        }
        if (value.getCuotas() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getCuotas());
        }
        if (value.getDocumentoCliente() == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, value.getDocumentoCliente());
        }
        if (value.getDocumentoVendedor() == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, value.getDocumentoVendedor());
        }
        stmt.bindLong(11, value.getId());
      }
    };
  }

  @Override
  public Object insertTask(final Ventas task, final Continuation<? super Long> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Long>() {
      @Override
      public Long call() throws Exception {
        __db.beginTransaction();
        try {
          long _result = __insertionAdapterOfVentas.insertAndReturnId(task);
          __db.setTransactionSuccessful();
          return _result;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteTask(final Ventas task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfVentas.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateTask(final Ventas task, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfVentas.handle(task);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object getAllTasks(final Continuation<? super List<Ventas>> continuation) {
    final String _sql = "SELECT * FROM Ventas";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<Ventas>>() {
      @Override
      public List<Ventas> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "Nombre");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final int _cursorIndexOfAlto = CursorUtil.getColumnIndexOrThrow(_cursor, "alto");
          final int _cursorIndexOfAncho = CursorUtil.getColumnIndexOrThrow(_cursor, "ancho");
          final int _cursorIndexOfArea = CursorUtil.getColumnIndexOrThrow(_cursor, "area");
          final int _cursorIndexOfPrecio = CursorUtil.getColumnIndexOrThrow(_cursor, "precio");
          final int _cursorIndexOfCuotas = CursorUtil.getColumnIndexOrThrow(_cursor, "cuotas");
          final int _cursorIndexOfDocumentoCliente = CursorUtil.getColumnIndexOrThrow(_cursor, "documentoCliente");
          final int _cursorIndexOfDocumentoVendedor = CursorUtil.getColumnIndexOrThrow(_cursor, "documentoVendedor");
          final List<Ventas> _result = new ArrayList<Ventas>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final Ventas _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpFecha;
            if (_cursor.isNull(_cursorIndexOfFecha)) {
              _tmpFecha = null;
            } else {
              _tmpFecha = _cursor.getString(_cursorIndexOfFecha);
            }
            final String _tmpAlto;
            if (_cursor.isNull(_cursorIndexOfAlto)) {
              _tmpAlto = null;
            } else {
              _tmpAlto = _cursor.getString(_cursorIndexOfAlto);
            }
            final String _tmpAncho;
            if (_cursor.isNull(_cursorIndexOfAncho)) {
              _tmpAncho = null;
            } else {
              _tmpAncho = _cursor.getString(_cursorIndexOfAncho);
            }
            final String _tmpArea;
            if (_cursor.isNull(_cursorIndexOfArea)) {
              _tmpArea = null;
            } else {
              _tmpArea = _cursor.getString(_cursorIndexOfArea);
            }
            final String _tmpPrecio;
            if (_cursor.isNull(_cursorIndexOfPrecio)) {
              _tmpPrecio = null;
            } else {
              _tmpPrecio = _cursor.getString(_cursorIndexOfPrecio);
            }
            final String _tmpCuotas;
            if (_cursor.isNull(_cursorIndexOfCuotas)) {
              _tmpCuotas = null;
            } else {
              _tmpCuotas = _cursor.getString(_cursorIndexOfCuotas);
            }
            final String _tmpDocumentoCliente;
            if (_cursor.isNull(_cursorIndexOfDocumentoCliente)) {
              _tmpDocumentoCliente = null;
            } else {
              _tmpDocumentoCliente = _cursor.getString(_cursorIndexOfDocumentoCliente);
            }
            final String _tmpDocumentoVendedor;
            if (_cursor.isNull(_cursorIndexOfDocumentoVendedor)) {
              _tmpDocumentoVendedor = null;
            } else {
              _tmpDocumentoVendedor = _cursor.getString(_cursorIndexOfDocumentoVendedor);
            }
            _item = new Ventas(_tmpId,_tmpNombre,_tmpFecha,_tmpAlto,_tmpAncho,_tmpArea,_tmpPrecio,_tmpCuotas,_tmpDocumentoCliente,_tmpDocumentoVendedor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  @Override
  public Object findById(final int id, final Continuation<? super Ventas> continuation) {
    final String _sql = "SELECT * FROM Ventas WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<Ventas>() {
      @Override
      public Ventas call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfNombre = CursorUtil.getColumnIndexOrThrow(_cursor, "Nombre");
          final int _cursorIndexOfFecha = CursorUtil.getColumnIndexOrThrow(_cursor, "fecha");
          final int _cursorIndexOfAlto = CursorUtil.getColumnIndexOrThrow(_cursor, "alto");
          final int _cursorIndexOfAncho = CursorUtil.getColumnIndexOrThrow(_cursor, "ancho");
          final int _cursorIndexOfArea = CursorUtil.getColumnIndexOrThrow(_cursor, "area");
          final int _cursorIndexOfPrecio = CursorUtil.getColumnIndexOrThrow(_cursor, "precio");
          final int _cursorIndexOfCuotas = CursorUtil.getColumnIndexOrThrow(_cursor, "cuotas");
          final int _cursorIndexOfDocumentoCliente = CursorUtil.getColumnIndexOrThrow(_cursor, "documentoCliente");
          final int _cursorIndexOfDocumentoVendedor = CursorUtil.getColumnIndexOrThrow(_cursor, "documentoVendedor");
          final Ventas _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpNombre;
            if (_cursor.isNull(_cursorIndexOfNombre)) {
              _tmpNombre = null;
            } else {
              _tmpNombre = _cursor.getString(_cursorIndexOfNombre);
            }
            final String _tmpFecha;
            if (_cursor.isNull(_cursorIndexOfFecha)) {
              _tmpFecha = null;
            } else {
              _tmpFecha = _cursor.getString(_cursorIndexOfFecha);
            }
            final String _tmpAlto;
            if (_cursor.isNull(_cursorIndexOfAlto)) {
              _tmpAlto = null;
            } else {
              _tmpAlto = _cursor.getString(_cursorIndexOfAlto);
            }
            final String _tmpAncho;
            if (_cursor.isNull(_cursorIndexOfAncho)) {
              _tmpAncho = null;
            } else {
              _tmpAncho = _cursor.getString(_cursorIndexOfAncho);
            }
            final String _tmpArea;
            if (_cursor.isNull(_cursorIndexOfArea)) {
              _tmpArea = null;
            } else {
              _tmpArea = _cursor.getString(_cursorIndexOfArea);
            }
            final String _tmpPrecio;
            if (_cursor.isNull(_cursorIndexOfPrecio)) {
              _tmpPrecio = null;
            } else {
              _tmpPrecio = _cursor.getString(_cursorIndexOfPrecio);
            }
            final String _tmpCuotas;
            if (_cursor.isNull(_cursorIndexOfCuotas)) {
              _tmpCuotas = null;
            } else {
              _tmpCuotas = _cursor.getString(_cursorIndexOfCuotas);
            }
            final String _tmpDocumentoCliente;
            if (_cursor.isNull(_cursorIndexOfDocumentoCliente)) {
              _tmpDocumentoCliente = null;
            } else {
              _tmpDocumentoCliente = _cursor.getString(_cursorIndexOfDocumentoCliente);
            }
            final String _tmpDocumentoVendedor;
            if (_cursor.isNull(_cursorIndexOfDocumentoVendedor)) {
              _tmpDocumentoVendedor = null;
            } else {
              _tmpDocumentoVendedor = _cursor.getString(_cursorIndexOfDocumentoVendedor);
            }
            _result = new Ventas(_tmpId,_tmpNombre,_tmpFecha,_tmpAlto,_tmpAncho,_tmpArea,_tmpPrecio,_tmpCuotas,_tmpDocumentoCliente,_tmpDocumentoVendedor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, continuation);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
