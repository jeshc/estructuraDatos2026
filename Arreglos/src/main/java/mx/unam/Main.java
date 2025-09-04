package mx.unam;

import mx.unam.adts.ArrayADT;

import java.util.ArrayList;

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

        // lo mismo pero con ArrayList
        System.out.println("Array list.");
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(33);
        System.out.println(a2.toString());
        System.out.println(a2.get(0));
        a2.add(44);
        a2.add(55);
        System.out.println(a2.toString());
        a2.add(1,38);
        System.out.println(a2.toString());
        Integer valor = a2.get(2);
        System.out.println( "Valor: " + valor);
        System.out.println(a2.toString());
        //Eliminar un elemento
        a2.remove(2);
        System.out.println(a2.toString());

    }
}