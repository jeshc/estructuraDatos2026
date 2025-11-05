package mx.unam.adts.pruebas.recursi;

public class Recursividad {

    public int factorial(int n){
        if(n==0) return 1;
        else return factorial(n-1) * n;
    }

    public int fibonacci(int n){
        if(n==0 || n == 1){
            return n;
        }else{
            return fibonacci(n-1) + fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
        Recursividad test = new Recursividad();
        for (int i = 0; i <= 10; i++) {

            System.out.println(test.factorial(i));
        }

        System.out.println("Fibo");
        for (int i = 0; i < 10; i++) {
            System.out.println(test.fibonacci(i));
        }
    }
}
