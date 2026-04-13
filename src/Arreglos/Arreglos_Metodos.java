package Arreglos;

import java.util.Arrays;

public class Arreglos_Metodos {
    static void main(String[] args) {
        int[] numeros = {3,2,6,4,5,1,8,7};
        String[] letras = {"b", "c", "a", "h", "d", "e"};

        // Ver el array entero como texto:
        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array original: " + Arrays.toString(letras));

        // Organizar un array de enteros.
        Arrays.sort(numeros);
        System.out.println("Array Organizado: " + Arrays.toString(numeros));

        // Organizar un array de letras
        Arrays.sort(letras);
        System.out.println("Array Organizado: " + Arrays.toString(letras));

        // Comparar si los arrays si son exactamente iguales. Return boolean
        int[] numeros1 = {1,2,3,4};
        int[] numeros2 = {1,2,3,4};
        boolean iguales = Arrays.equals(numeros1, numeros2);

        System.out.println("Los arrays de números son iguales? " + iguales);

        // Llenar un array automáticamente
        int[] llenar = new int[5];
        Arrays.fill(llenar,1);
        System.out.println("Array llenado: "+ Arrays.toString(llenar));

        // Copiar un array
        int[] original= {1,2,3};
        int[] copia = Arrays.copyOf(original, original.length + 2);

        System.out.println("Array copiado: "+ Arrays.toString(copia));
    }
}
