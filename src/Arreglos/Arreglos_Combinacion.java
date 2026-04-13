package Arreglos;

public class Arreglos_Combinacion {
    static void main(String[] args) {
        String[] productos = {"Martillo", "Destornillador", "Taladro", "Llave Inglesa", "Pinzas"};
        double[] precios = {12.50, 10.20,200.00,40.20,5.40};

        // Bucle for
        System.out.println("---- Blucle For ----");
        // Combinar dos arrays Ejemplo; producto y precio
        for (int i=0; productos.length > i; i++){
            int nro = i + 1;
            if (precios[i] < 100){
                System.out.println("Producto Nro. "+ nro + " " + productos[i] + ": $" + precios[i]+ " - No paga impuestos.");

            }else {
                System.out.println("Producto Nro. "+ nro + " " + productos[i] + ": $" + precios[i]+ " - Paga impuestos.");
            }
        }

        // Bucle while
        System.out.println("---- Blucle While ----");
        int f = 0;
        while (productos.length> f){
            int nro = f + 1;
            if (precios[f] < 100){
                System.out.println("Producto Nro. "+ nro + " " + productos[f] + ": $" + precios[f]+ " - No paga impuestos.");

            }else {
                System.out.println("Producto Nro. "+ nro + " " + productos[f] + ": $" + precios[f]+ " - Paga impuestos.");
            }
            f++;
        }

    }
}
