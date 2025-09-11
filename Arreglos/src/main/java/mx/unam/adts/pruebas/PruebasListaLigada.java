package mx.unam.adts.pruebas;

import mx.unam.adts.ListaLigada;

public class PruebasListaLigada {
    public static void main(String[] args) {
        ListaLigada<Integer> ll = new ListaLigada<>();
        System.out.println("Esta vacia ? = " + ll.estaVacia() );
        ll.agregar(5);
        ll.agregar(10);
        ll.agregar(15);
        ll.agregar(25);
        ll.agregar(35);
        ll.trasversal();
        System.out.println(ll.buscar(25));
        System.out.println(ll.actualizar(15,16));
        ll.trasversal();

    }
}
