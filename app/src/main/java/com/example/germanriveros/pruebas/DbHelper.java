package com.example.germanriveros.pruebas;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by germanriveros on 26-05-16.
 */
public class DbHelper extends SQLiteOpenHelper
{

    private static final String DB_NAME = "PROYECTO_TENTENVILU";
    private static final int DB_SCHEME_VERSION = 1;


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DbHelper(Context context)
    {

        super(context, DB_NAME, null, DB_SCHEME_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db)
    {

        db.execSQL(DataBaseManager.CREATE_TABLE_A);
        db.execSQL(DataBaseManager.CREATE_TABLE_B);
        db.execSQL(DataBaseManager.CREATE_TABLE_C);
        db.execSQL(DataBaseManager.CREATE_TABLE_D);
        db.execSQL(DataBaseManager.CREATE_TABLE_E);
        db.execSQL(DataBaseManager.CREATE_TABLE_F);
        db.execSQL(DataBaseManager.CREATE_TABLE_G);
        db.execSQL(DataBaseManager.CREATE_TABLE_H);
        db.execSQL(DataBaseManager.CREATE_TABLE_I);
        db.execSQL(DataBaseManager.CREATE_TABLE_J);
        //db.execSQL(DataBaseManager.CREATE_TABLE_K);
        db.execSQL(DataBaseManager.CREATE_TABLE_L);
        //db.execSQL(DataBaseManager.CREATE_TABLE_LL);
        db.execSQL(DataBaseManager.CREATE_TABLE_M);
        db.execSQL(DataBaseManager.CREATE_TABLE_N);
        //db.execSQL(DataBaseManager.CREATE_TABLE_Ñ);
        db.execSQL(DataBaseManager.CREATE_TABLE_O);
        db.execSQL(DataBaseManager.CREATE_TABLE_P);
        db.execSQL(DataBaseManager.CREATE_TABLE_Q);
        db.execSQL(DataBaseManager.CREATE_TABLE_R);
        db.execSQL(DataBaseManager.CREATE_TABLE_S);
        db.execSQL(DataBaseManager.CREATE_TABLE_T);
        db.execSQL(DataBaseManager.CREATE_TABLE_U);
        db.execSQL(DataBaseManager.CREATE_TABLE_V);
        //db.execSQL(DataBaseManager.CREATE_TABLE_W);
        //db.execSQL(DataBaseManager.CREATE_TABLE_X);
        db.execSQL(DataBaseManager.CREATE_TABLE_Y);
        db.execSQL(DataBaseManager.CREATE_TABLE_Z);

        db.execSQL(Tablas.INSERTAR_LETRA_A);
        db.execSQL(Tablas.INSERTAR_LETRA_B);
        db.execSQL(Tablas.INSERTAR_LETRA_C);
        db.execSQL(Tablas.INSERTAR_LETRA_D);
        db.execSQL(Tablas.INSERTAR_LETRA_E);
        db.execSQL(Tablas.INSERTAR_LETRA_F);
        db.execSQL(Tablas.INSERTAR_LETRA_G);
        db.execSQL(Tablas.INSERTAR_LETRA_H);
        db.execSQL(Tablas.INSERTAR_LETRA_I);
        db.execSQL(Tablas.INSERTAR_LETRA_J);
//        db.execSQL(Tablas.INSERTAR_LETRA_K);
        db.execSQL(Tablas.INSERTAR_LETRA_L);
//        db.execSQL(Tablas.INSERTAR_LETRA_LL);
        db.execSQL(Tablas.INSERTAR_LETRA_M);
        db.execSQL(Tablas.INSERTAR_LETRA_N);
//        db.execSQL(Tablas.INSERTAR_LETRA_Ñ);
        db.execSQL(Tablas.INSERTAR_LETRA_O);
        db.execSQL(Tablas.INSERTAR_LETRA_P);
        db.execSQL(Tablas.INSERTAR_LETRA_Q);
        db.execSQL(Tablas.INSERTAR_LETRA_R);
        db.execSQL(Tablas.INSERTAR_LETRA_S);
        db.execSQL(Tablas.INSERTAR_LETRA_T);
        db.execSQL(Tablas.INSERTAR_LETRA_U);
        db.execSQL(Tablas.INSERTAR_LETRA_V);
//        db.execSQL(Tablas.INSERTAR_LETRA_W);
//        db.execSQL(Tablas.INSERTAR_LETRA_X);
        db.execSQL(Tablas.INSERTAR_LETRA_Y);
        db.execSQL(Tablas.INSERTAR_LETRA_Z);


    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {}
}
