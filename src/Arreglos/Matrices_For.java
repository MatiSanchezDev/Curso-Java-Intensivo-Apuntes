package Arreglos;

public class Matrices_For {
    static void main(String[] args) {
        // Otra forma de inicializar matrices. Más intuitiva
        int[][] cantidades = {
                {10,20,80},
                {50,70,40},
                {20,40,90}
        };

        // System.out.println(cantidades[0][2]); // 80

        // Este For maneja los índices de fila
        for (int fila = 0; fila < cantidades.length; fila++ ){
            // Este For maneja los índices de columnas
            for (int columna = 0; columna< cantidades.length; columna++){
                System.out.print(cantidades[fila][columna]+ " ");
            }
            System.out.println(" ");
        }
    }
}
