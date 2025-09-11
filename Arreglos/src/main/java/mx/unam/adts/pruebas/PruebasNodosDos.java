package mx.unam.adts.pruebas;

import mx.unam.adts.Nodo;

public class PruebasNodosDos {
    public static void main(String[] args) {
        Nodo<Integer> cabeza = new Nodo<>(10, new Nodo<>(20, new Nodo<>(30, new Nodo<>(40))));
        Nodo<Integer> currNode = cabeza;

        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();

        }
        System.out.println(".-.-.--. version dos");
        Nodo<Integer> cabezaDos = new Nodo<>(10);

        currNode = cabezaDos;
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();

        }
        System.out.println("agregar el 20");
        // agregamos el nodo 20
        cabezaDos.setSiguiente(new Nodo<>(20));
        currNode = cabezaDos;
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();

        }

        System.out.println("agregar 30 y 40");
        cabezaDos.getSiguiente().setSiguiente(new Nodo<>(30));
        cabezaDos.getSiguiente().getSiguiente().setSiguiente(new Nodo<>(40));
        currNode = cabezaDos;
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();

        }
        System.out.println("---> insertar el 25 entre el 20 y el 30");

        currNode = cabezaDos;
        while(currNode.getData() != 20){
            currNode = currNode.getSiguiente();
        }
        System.out.println(currNode);
        currNode.setSiguiente(new Nodo<>(25,currNode.getSiguiente()));
        System.out.println("Transversal");
        currNode = cabezaDos;
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();

        }
        currNode = cabezaDos;
        while(currNode.getData() != 30){
            currNode = currNode.getSiguiente();
        }
        System.out.println(currNode);
        currNode.setSiguiente(new Nodo<>(35,currNode.getSiguiente()));
        System.out.println("Transversal");
        currNode = cabezaDos;
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();
        }
        Nodo<Integer> nuevo =new Nodo<>(5);
        nuevo.setSiguiente(cabezaDos);
        cabezaDos=nuevo;
        currNode = cabezaDos;
        System.out.println("Transversal");
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();
        }

        System.out.println("Agregar el 100 al final");
        currNode=cabezaDos;
        while (currNode.getSiguiente() !=null) {
            System.out.print(currNode);
            currNode=currNode.getSiguiente();
        }

        currNode.setSiguiente(new Nodo<>(100));
        System.out.println("Transversal");
        currNode = cabezaDos;
        System.out.println("Transversal");
        while (currNode != null){
            System.out.print(currNode.getData() + " --> ");
            currNode = currNode.getSiguiente();
        }
    }

}
