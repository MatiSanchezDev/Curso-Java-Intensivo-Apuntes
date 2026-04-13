package Arreglos;

public class Arreglos_Bucles {
    static void main(String[] args) {
        String[] productos = {"Martillo", "Destornillador", "Taladro", "Llave Inglesa", "Pinzas"};


        // Recorrer array con bucle for
        System.out.println("---- Bucle For -----");
        for (int i = 0; i < productos.length ; i++) {
            // La variable nro es para evitar que se muestre el cero como primer valor
            int nro = i + 1;
            System.out.println("Producto Nro. "+ nro + ": " + productos[i]);
        }

        // Recorrer array con bucle while
        System.out.println("---- Bucle While -----");
        int f= 0;

        while (productos.length > f){
            // La variable nro es para evitar que se muestre el cero como primer valor
            int nro = f + 1;
            System.out.println("Producto Nro. "+ nro + ": " + productos[f]);
            f ++;
        }

    }
}
