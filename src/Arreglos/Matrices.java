package Arreglos;

import java.util.Arrays;

public class Matrices {
    static void main(String[] args) {

        int[][] numeros = new int[3][3];

        // Llenando fila 1 de la matríz.
        numeros[0][0] = 1;
        numeros[0][1] = 0;
        numeros[0][2] = 0;

        // Llenando fila 2 de la matríz.
        numeros[1][0] = 0;
        numeros[1][1] = 1;
        numeros[1][2] = 0;

        // Llenando fila 3 de la matríz.
        numeros[2][0] = 0;
        numeros[2][1] = 0;
        numeros[2][2] = 1;

        // Como ver matríz
        // Ta-te-ti o Tic - Tac - Toe = 1 Win
        System.out.println(numeros[0][0] + " " + numeros[0][1] + " " + numeros[0][2]);
        System.out.println(numeros[1][0] + " " + numeros[1][1] + " " + numeros[1][2]);
        System.out.println(numeros[2][0] + " " + numeros[2][1] + " " + numeros[2][2]);

    }
}
