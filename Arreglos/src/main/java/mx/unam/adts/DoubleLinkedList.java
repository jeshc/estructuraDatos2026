package mx.unam.adts;

public class DoubleLinkedList<T> {
    private NodoDoble<T> head;
    private NodoDoble<T> tail;
    private int tamanio;

    public DoubleLinkedList() {
    }

    public void agregarAlInicio(T dato){
        if(this.head== null){
            this.head = new NodoDoble<>(dato);
            this.tail = this.head;
            this.tamanio++;
        }else{
            this.head = new NodoDoble<>(dato,this.head,null);
            this.head.getSiguiente().setAnterior(this.head);
            this.tamanio++;
        }
    }
    public void agregarAlFinal(T dato){
        if(this.head== null){
            this.head = new NodoDoble<>(dato);
            this.tail = this.head;
            this.tamanio++;
        }else{
            this.tail = new NodoDoble<>(dato, null, this.tail);
            this.tail.getAnterior().setSiguiente(this.tail);
            this.tamanio++;
        }
    }

    /**
     *
     * @param direccion 1 de izquierda a derecha, 2 de derecha a izq.
     */
    public void transversal(int direccion){
        NodoDoble<T> currNodo;
        if (direccion == 1){
            currNodo = this.head;
            while (currNodo != null){
                System.out.print(currNodo);
                currNodo= currNodo.getSiguiente();
            }
        }
        if (direccion == 2){
            currNodo = this.tail;
            while (currNodo != null){
                System.out.print(currNodo);
                currNodo=currNodo.getAnterior();
            }
        }
    }
}
