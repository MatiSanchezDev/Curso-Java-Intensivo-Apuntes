package Manejo_Archivos;

import java.io.File;

public class BorrarArchivos {
    static void main(String[] args) {
        File archivo = new File("ejemplo2.txt");

        if (archivo.delete()){
            System.out.println("Archivo borrado: " + archivo.getName());
        } else {
            System.out.println("No se pudo borrar el archivo");
        }

    }
}
