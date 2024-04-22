package com.mycompany.libropoo;

import java.util.Scanner;

public class Principal {
public static void main(String[] args){
Scanner sc= new Scanner (System.in);

    System.out.println("Ingrese el título: ");
    String titulo = sc.nextLine();
    System.out.println("Ingrese el autor del libro: ");
    String autor = sc.nextLine();
    System.out.println("Ingrese el año de publicación: ");
    int anoPublicacion = sc.nextInt();
    System.out.println("Ingrese el género del libro: ");
    String genero= sc.nextLine();

Libro libro1 = new Libro(titulo,autor,genero,anoPublicacion);
    System.out.println(libro1.mostrarInformacion());
    libro1.marcarLeido();
    System.out.println(libro1.esAntiguo());
    boolean esLeido = libro1.isLeido();
    if(esLeido == true ){
        System.out.println("El libro ya fue leido");
        }
    else{
        System.out.println("El libro no ha sido leido");
    }
    
    sc.close();
}
}
