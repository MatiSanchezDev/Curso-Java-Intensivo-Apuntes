package Manejo_Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirArchivos {
    static void main(String[] args) {
        try {

            // Lo que hace el true al final es que lo que agregues con el metodo write se agregará al final
            // Y si no se coloca ese true, al usar el metodo write, lo que va a pasar es que el archivo va a ser
            // Reescrito cada vez que se termine de cerrar el archivo.
            FileWriter escribir = new FileWriter("ejemplo1.txt");

            escribir.write("Saludos a todos\n");
            escribir.write("Saludos a todas");
            escribir.close();
            System.out.println("Escritura exitosa.");
        } catch (IOException error) {
            System.out.println("Error: " + error);
        }
    }
}
