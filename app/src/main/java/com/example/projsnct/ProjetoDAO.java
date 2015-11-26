package com.example.projsnct;

import com.example.projsnct.TrabalhoOH;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class ProjetoDAO {
	private Open helper;
	
	public void Open (Context ctx){
		
		helper = new TrabalhoXD(ctx);
	}
	
	public void inserir(Projeto projeto){
		
		SQLiteDatabase bd = helper.getWritableDatabase();
		
		ContentValues valor = new ContentValues();
		
		valor.put(Open.NOME,projeto.getAvaliar());
		
		valor.put(Open.ID ,projeto.getId());
		
		valor.put(Open.NOTA ,projeto.getNota());
		
		valor.put(Open.TITUlO,projeto.getTitulo());
		
		valor.put(Open.COMENTARIO,projeto.getComentario());
		
		bd.insert(Open.AVALIAR, null, valor);
		
		bd.close();
		
	}
}