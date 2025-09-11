package mx.unam.adts;

public class ListaLigada<T> {
    Nodo<T> head;
    int tamanio = 0;
    Nodo<T> currNode;

    public ListaLigada() {
    }

    public boolean estaVacia(){
        return head == null;
    }

    public int getTamanio(){
        return this.tamanio;
    }

    public void agregar(T valor){
        if (this.head == null){
            // head = nuevo
            this.head = new Nodo<>(valor);
            this.tamanio++;
        }else {
            // encontrar el iultimo y agregar en nuevo
            currNode = this.head;
            while (currNode.getSiguiente() != null){
                currNode = currNode.getSiguiente();
            }
            currNode.setSiguiente(new Nodo<>(valor));
            this.tamanio++;
        }
    }

    public int buscar(T valor){
        currNode = this.head;
        int contador = 0;
        while (currNode != null){
            if(currNode.getData() == valor){
                return contador;
            }
            contador++;
            currNode = currNode.getSiguiente();
        }
        return -1;
    }

    public boolean actualizar(T actual, T nuevo){
        currNode = this.head;
        while (currNode != null){
            if(currNode.getData() == actual){
                currNode.setData(nuevo);
                return true;
            }
            currNode = currNode.getSiguiente();
        }
        return false;
    }
    public void trasversal(){
        currNode = this.head;
        while (currNode != null){
            System.out.print(currNode);
            currNode = currNode.getSiguiente();
        }
        System.out.println();
    }
}
