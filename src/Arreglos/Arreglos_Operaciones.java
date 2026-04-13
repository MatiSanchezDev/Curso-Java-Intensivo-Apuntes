package Arreglos;

public class Arreglos_Operaciones {
    static void main(String[] args) {
        int[] ventas1 = {110, 320, 280, 150, 210};
        int[] ventas2 = {550, 830, 300, 650, 380};
        int[] totalVentas = new int[ventas1.length];
        int suma = 0;
        int suma2 = 0;

        // Suma de valores
        System.out.println("--- Suma de valores ---");
        for (int i = 0; i < ventas1.length; i++) {
            int nroVenta = i + 1;
            int resultado = ventas1[i] + ventas2[i];
            totalVentas[i] = resultado;
            suma = suma + totalVentas[i];

            System.out.println("Venta nro." + nroVenta + ": " + totalVentas[i]);
        }
        System.out.println("Total de ventas: " + suma + "\n");

        System.out.println("--- Resta de valores ---");
        for (int i = 0; i < ventas1.length; i++) {
            int nroVenta = i + 1;
            int resultado = ventas2[i] - ventas1[i];
            totalVentas[i] = resultado;
            suma2 = suma2 + totalVentas[i];

            System.out.println("Venta nro." + nroVenta + ": " + totalVentas[i]);
        }
        System.out.println("Total de ventas: " + suma2);
    }
}
