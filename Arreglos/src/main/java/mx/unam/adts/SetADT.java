package mx.unam.adts;

import java.util.ArrayList;

public class SetADT <T>{
    public ArrayList<T> data;

    public SetADT() {
        data = new ArrayList<>();
    }

    public int longitud(){
        return data.size();
    }

    public void agregar(T elemento){
        if(!this.contiene(elemento)){
            data.add(elemento);
        }
    }
    public boolean contiene(T elemento){
        return data.contains(elemento);
    }

    public void eliminar(T elemento){
        data.remove(elemento);
    }

    public String toString(){
        String resultado= "";
        for (T t: data){
            resultado += "," + t.toString();
        }
        return resultado;
    }

    // continuar desde aqui

}
