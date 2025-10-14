package mx.unam.adts.pruebas;

import mx.unam.adts.ColaConPrioridadAcotada;
import mx.unam.genericos.Libro;

public class ProbarColaPrioridadAcotada {
    public static void main(String[] args) {
        ColaConPrioridadAcotada<Libro> cpa = new ColaConPrioridadAcotada<>(4);
        cpa.encolar(1, new Libro("El perfume","PS"));
    }
}
