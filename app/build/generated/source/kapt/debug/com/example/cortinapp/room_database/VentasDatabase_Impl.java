package com.example.cortinapp.room_database;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.RoomOpenHelper.ValidationResult;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.Class;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class VentasDatabase_Impl extends VentasDatabase {
  private volatile VentasDAO _ventasDAO;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `Ventas` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `Nombre` TEXT NOT NULL, `fecha` TEXT NOT NULL, `alto` TEXT NOT NULL, `ancho` TEXT NOT NULL, `area` TEXT NOT NULL, `precio` TEXT NOT NULL, `cuotas` TEXT NOT NULL, `documentoCliente` TEXT NOT NULL, `documentoVendedor` TEXT NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1c63c3eb0ab7e8cab5aef68a9457cc0a')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `Ventas`");
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onDestructiveMigration(_db);
          }
        }
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsVentas = new HashMap<String, TableInfo.Column>(10);
        _columnsVentas.put("id", new TableInfo.Column("id", "INTEGER", true, 1, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("Nombre", new TableInfo.Column("Nombre", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("fecha", new TableInfo.Column("fecha", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("alto", new TableInfo.Column("alto", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("ancho", new TableInfo.Column("ancho", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("area", new TableInfo.Column("area", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("precio", new TableInfo.Column("precio", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("cuotas", new TableInfo.Column("cuotas", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("documentoCliente", new TableInfo.Column("documentoCliente", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        _columnsVentas.put("documentoVendedor", new TableInfo.Column("documentoVendedor", "TEXT", true, 0, null, TableInfo.CREATED_FROM_ENTITY));
        final HashSet<TableInfo.ForeignKey> _foreignKeysVentas = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesVentas = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoVentas = new TableInfo("Ventas", _columnsVentas, _foreignKeysVentas, _indicesVentas);
        final TableInfo _existingVentas = TableInfo.read(_db, "Ventas");
        if (! _infoVentas.equals(_existingVentas)) {
          return new RoomOpenHelper.ValidationResult(false, "Ventas(com.example.cortinapp.room_database.Ventas).\n"
                  + " Expected:\n" + _infoVentas + "\n"
                  + " Found:\n" + _existingVentas);
        }
        return new RoomOpenHelper.ValidationResult(true, null);
      }
    }, "1c63c3eb0ab7e8cab5aef68a9457cc0a", "997fd50b22ae0d1c534578116eb0d268");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "Ventas");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `Ventas`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
    final HashMap<Class<?>, List<Class<?>>> _typeConvertersMap = new HashMap<Class<?>, List<Class<?>>>();
    _typeConvertersMap.put(VentasDAO.class, VentasDAO_Impl.getRequiredConverters());
    return _typeConvertersMap;
  }

  @Override
  public VentasDAO ventasDao() {
    if (_ventasDAO != null) {
      return _ventasDAO;
    } else {
      synchronized(this) {
        if(_ventasDAO == null) {
          _ventasDAO = new VentasDAO_Impl(this);
        }
        return _ventasDAO;
      }
    }
  }
}
