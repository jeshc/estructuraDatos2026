package mx.unam.adts.pruebas;

import mx.unam.adts.NodoArbolBinario;

public class PruebasArbolBinario {
    public static void main(String[] args) {
        NodoArbolBinario<String> arbol = new NodoArbolBinario<>();
        arbol.setData("R");
        arbol.setIzquierdo(new NodoArbolBinario<>("C",null,null));
        arbol.setDerecho(new NodoArbolBinario<>("H",null,null));

        //imprimir hijo izquierdo''

        System.out.println(arbol.getDerecho().getData());

        // arbol de ejempo
        System.out.println("---------------");
        NodoArbolBinario<String> ejemplo= new NodoArbolBinario<>("Juana",new NodoArbolBinario<>("Ceverino", new NodoArbolBinario<>("Oscar",null,null),new NodoArbolBinario<>("Angel",null,new NodoArbolBinario<>("Fernanda",null, null))), null);
        System.out.println("La futura hija de Ángel es:");

        System.out.println(ejemplo.getIzquierdo().getDerecho().getDerecho().getData());
    }
}
