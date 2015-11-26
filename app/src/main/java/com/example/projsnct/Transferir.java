package com.example.projsnct;

import java.io.Serializable;
public class Transferir implements Serializable {
private static final long serialVersionUID = 1633833011084400384L;
int id;
int nota;
String avaliar;
String titulo;
String comentario;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getNota() {
	return nota;
}
public void setNota(int nota) {
	this.nota = nota;
}
public String getAvaliar() {
	return avaliar;
}
public void setAvaliar(String avaliador) {
	this.avaliar = avaliar;
}
public String getTitulo() {
	return titulo;
}
public void setTitulo(String titulo)
public String getComentario() {
	return comentario;
}
public void setComentario(String comentario) {
	this.comentario = comentario;
}






}

