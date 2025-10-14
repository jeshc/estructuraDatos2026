package mx.unam.adts.pruebas;

import mx.unam.adts.ColaADT;
import mx.unam.genericos.Libro;

public class ProbarColas {
    public static void main(String[] args) {
        ColaADT<Libro> cola = new ColaADT<>();
        cola.encolar(new Libro("El perfume", "Patrik Süskind"));
        cola.encolar(new Libro("El principito", "Exuperri"));
        cola.encolar(new Libro("Fuego y sangre", "George R. Martin"));
        cola.encolar(new Libro("A", "George R. Martin"));
        cola.encolar(new Libro("B", "George R. Martin"));

        System.out.println(cola);

        System.out.println(cola.desencolar());
        System.out.println("----- el estado despues de sacar un libro");
        System.out.println(cola);

    }
}
