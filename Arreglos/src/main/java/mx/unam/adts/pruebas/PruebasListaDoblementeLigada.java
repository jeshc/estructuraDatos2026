package mx.unam.adts.pruebas;

import mx.unam.adts.DoubleLinkedList;

public class PruebasListaDoblementeLigada {
    public static void main(String[] args) {
        DoubleLinkedList<Integer> ldl = new DoubleLinkedList<>();
        ldl.agregarAlInicio(10);
        ldl.agregarAlInicio(20);
        ldl.agregarAlInicio(30);
        ldl.transversal(2);
        System.out.println("\nSe agrega el 5 al final");
        ldl.agregarAlFinal(5);
        ldl.transversal(2);
    }
}
