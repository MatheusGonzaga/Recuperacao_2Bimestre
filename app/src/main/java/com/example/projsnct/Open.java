package com.example.projsnct;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class Open extends SQLiteOpenHelper {

    public Open(Context context, String name, CursorFactory factory,
                      int version) {
        super(context, name, factory, version);
        // TODO Auto-generated constructor stub
    }

    private static final String Nome_BD = "SNCT";
    private static final int Versao_BD = 1;

    public static final String TB_AVALIAR = "TB_AVALIAR";
    public static final String ID = "ID";
    public static final String NOME = "NOME";
    public static final String NOTA = "NOTA";
    public static final String COMENTARIO = "COMENTARIO";
    public static final String TITUlO = "TITULO";



    public TrabalhoXD(Context ctx) {
        super(ctx, Nome_BD, null, Versao_BD);
    }

    @Override
    public void onCreate(SQLiteDatabase bd) {
        bd.execSQL(
                " CREATE TABLE " + TB_AVALIAR
                        + " (" +
                        ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                        +  NOME + " TEXT NOT NULL," +
                        NOTA+ " TEXT NOT NULL," +
                        COMENTARIO + " TEXT NOT NULL,"+
                        TITUlO + "TEXT NOT NULL)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2) {
    }
}