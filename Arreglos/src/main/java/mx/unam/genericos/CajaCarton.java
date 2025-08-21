package mx.unam.genericos;

public class CajaCarton<T>{
    private T contenido;

    public CajaCarton(T contenido){
        this.contenido = contenido;
    }
    public T getContenido(){
        return contenido;
    }
    public void setContenido(T contenido){
        this.contenido = contenido;
    }


}
