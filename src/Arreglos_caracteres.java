import java.lang.reflect.Array;
import java.util.Arrays;

public class Arreglos_caracteres {
    static void main(String[] args) {
        String[] productos = new String[5];

        productos[0] = "Manzanas";
        productos[1] = "Peras";
        productos[2] = "Uvas";
        productos[3] = "Bananas";
        productos[4] = "Sandias";

        Arrays.sort(productos);

        System.out.println("Producto 1: " + productos[0]);
        System.out.println("Producto 2: " + productos[1]);
        System.out.println("Producto 3: " + productos[2]);
        System.out.println("Producto 4: " + productos[3]);
        System.out.println("Producto 5: " + productos[4]);



    }
}
