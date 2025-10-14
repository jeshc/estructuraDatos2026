package mx.unam.adts;

public class ColaConPrioridadAcotada<T> {
    private ColaADT<T> [] colas;
    private int maxPrioridad;

    public ColaConPrioridadAcotada(int mp) {
        this.maxPrioridad = mp;
        colas = new ColaADT[this.maxPrioridad];
        for (int i = 0; i < colas.length; i++) {
            colas[i] = new ColaADT<>();
        }
    }

    public boolean estaVacia(){
        for (int i = 0; i < colas.length; i++) {
            if( !colas[i].estaVacia()){
                return false;
            }
        }
        return true;
    }

    public void encolar(int prioridad, T elem){
        if(prioridad >= 0 && prioridad<this.maxPrioridad){
            colas[prioridad].encolar(elem);
        }
    }


}
