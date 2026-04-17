package Recursividad;

public class Factorial {

    public int factorial (int n){
        System.out.println(n);
        if (n == 0){
            return 1;
        }
        return n * factorial(n -1);
    }

    static void main(String[] args) {
        Factorial valor = new Factorial();
        System.out.println(valor.factorial(5));
    }
}
