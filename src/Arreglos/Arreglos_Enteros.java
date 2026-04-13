package Arreglos;

import java.util.Arrays;

public class Arreglos_Enteros {
    static void main(String[] args) {
        // Declaración de un array
        //numeros = new int[5];
        // Creación de un array
        int[] numeros = new int[5];


        // Inicializar un array forma 1
        numeros[0] = 56;
        numeros[1] = 354;
        numeros[2] = 756;
        numeros[3] = 1223;
        numeros[4] = 17;

        // Inicializar un array forma 2
        int[] valores = {234,144,86,990};
        Arrays.sort(numeros);
        Arrays.sort(valores);

        // Consultar arrays
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        System.out.println(numeros[3]);
        System.out.println(numeros[4]);
        System.out.println(valores[0]);
        System.out.println(valores[1]);
        System.out.println(valores[2]);
        System.out.println(valores[3]);


    }
}
