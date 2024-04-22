package com.mycompany.libropoo;

public class Libro {
private String titulo;
private String autor;
private String genero;
private int anoPublicacion;
boolean leido;

public Libro(String titulo,String autor,String genero,int anoPublicacion ){
this.titulo = titulo;
this.autor = autor;
this.genero = genero;
this.anoPublicacion = anoPublicacion;
this.leido= false;
}

public String mostrarInformacion(){
    return "Título: " +titulo+", Autor: "+autor+", Año publicación: "+anoPublicacion+", Género: "+genero;
    
}
public void marcarLeido(){
this.leido=true;
}
public boolean esAntiguo(){
int anoActual = java.time.Year.now().getValue();
return (anoActual-anoPublicacion)>50;
}
public boolean isLeido(){
return leido;
}
}
