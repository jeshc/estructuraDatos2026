package mx.unam.ejemplos.productos.conadt;

import mx.unam.adts.ArrayADT;

public class ArrayProductosADT<T> extends ArrayADT<T> {
    private Double promedio;

    public ArrayProductosADT(int tamanio) {
        super(tamanio);
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio() {
        Double suma = 0d;
        for (int i = 0; i < this.longitud(); i++) {
            suma += ((Producto)this.obtenerElemento(i)).getPrecio();
        }
        this.promedio = suma / this.longitud();
    }
}
