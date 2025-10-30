package mx.unam.adts;

import java.util.Objects;

public class NodoArbolBinario<T> {
    private T data;
    private NodoArbolBinario<T> izquierdo;
    private NodoArbolBinario<T> derecho;

    public NodoArbolBinario() {
    }

    public NodoArbolBinario(T data, NodoArbolBinario<T> izquierdo, NodoArbolBinario<T> derecho) {
        this.data = data;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public NodoArbolBinario<T> getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(NodoArbolBinario<T> izquierdo) {
        this.izquierdo = izquierdo;
    }

    public NodoArbolBinario<T> getDerecho() {
        return derecho;
    }

    public void setDerecho(NodoArbolBinario<T> derecho) {
        this.derecho = derecho;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        NodoArbolBinario<?> that = (NodoArbolBinario<?>) o;
        return Objects.equals(data, that.data) && Objects.equals(izquierdo, that.izquierdo) && Objects.equals(derecho, that.derecho);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data, izquierdo, derecho);
    }

    @Override
    public String toString() {
        return "NodoArbolBinario{" +
                "data=" + data +
                ", izquierdo=" + izquierdo +
                ", derecho=" + derecho +
                '}';
    }
}
