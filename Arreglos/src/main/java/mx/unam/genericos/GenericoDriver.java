package mx.unam.genericos;

import java.util.ArrayList;

public class GenericoDriver {
    public static void main(String[] args) {
        CajaCarton<String> myBox = new CajaCarton<String>("Hola");
        System.out.println(myBox.getContenido());

        CajaCarton<Libro> myBoxMoving = new CajaCarton<>(new Libro("El Perfume", "Patrik Süskind"));
        System.out.println("Título: " +myBoxMoving.getContenido().getTitulo());
        System.out.println("Autor: " + myBoxMoving.getContenido().getAutor());

        ArrayList<Libro> myList = new ArrayList<>();
        myList.add(new Libro("El Perfume", "Patrik Süskind"));
        myList.add(new Libro("qwe", "Patrik Süskind"));
        myList.add(new Libro("Ewere", "Patrik Süskind"));
        myList.add(new Libro("El tsdfdsf", "Patrik Süskind"));


    }
}
