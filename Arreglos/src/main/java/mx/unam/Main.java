package mx.unam;

import mx.unam.adts.ArrayADT;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Hello and welcome!");
        ArrayADT<Integer> a1 = new ArrayADT<>(5);
        System.out.println(a1.obtenerElemento(2));
        a1.establecerElemento(33,2);
        System.out.println(a1.obtenerElemento(2));
        a1.imprimir();
        a1.limpiar(0);
        a1.imprimir();
        System.out.println("El tam del arre: " + a1.longitud());

    }
}