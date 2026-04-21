package Manejo_Archivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LeerArchivos {
    static void main(String[] args) {
        try {
            File archivo = new File("ejemplo1.txt");
            Scanner lector = new Scanner(archivo);

            // El metodo hasNextLine() devuelve true por cada linea que pueda leer, cuando una linea no tiene contenido
            // Devuelve false.
            while (lector.hasNextLine()){
                String linea = lector.nextLine();
                System.out.println(linea);
            }
            // Limpia la memoria usada al usar el scanner para leer, asi evitar usar recursos del sistema.
            lector.close();

        } catch ( FileNotFoundException error){
            System.out.println("ERROR: Archivo no encontrado");
            System.out.println("ERROR: " + error);
        }
    }
}
