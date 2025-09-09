package mx.unam.adts.pruebas;

import mx.unam.adts.Nodo;

public class PruebasNodo {
    public static void main(String[] args) {
        Nodo<Integer> head = new Nodo<>(30);
        head.setSiguiente(new Nodo<>(50));
        head.getSiguiente().setSiguiente(new Nodo<>(25));
        head.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(17));
        Nodo<Integer> currNode = head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println("Agregar el valor 88");
        currNode = head;
        while (currNode.getSiguiente() != null){
            currNode = currNode.getSiguiente();
        }
        currNode.setSiguiente(new Nodo<>(88));
        System.out.println("Transversal");
        currNode = head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }

        System.out.println("Insertar 77 despues del 50");

        currNode = head;
        while (currNode.getData() != 50){
            currNode= currNode.getSiguiente();
        }
        System.out.println(currNode);
        Nodo<Integer> tmp = currNode.getSiguiente();
        currNode.setSiguiente(new Nodo<>(77));
        currNode.getSiguiente().setSiguiente(tmp);
        System.out.println("Tarnsversal despues de insertar 77 despues de 50");
        currNode = head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
    }
}
