package mx.unam.adts.pruebas;

import mx.unam.adts.SetADT;

public class PruebasSet {
    public static void main(String[] args) {
        SetADT<Integer> conjunto = new SetADT<>();
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(2);
        conjunto.agregar(23);
        conjunto.agregar(23);
        conjunto.agregar(22);
        conjunto.agregar(22);
        conjunto.agregar(11);
        conjunto.agregar(11);
        conjunto.agregar(22);
        System.out.println(conjunto);
    }
}
