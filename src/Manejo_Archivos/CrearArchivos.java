package Manejo_Archivos;

import java.io.File;
import java.io.IOException;

public class CrearArchivos {
    static void main(String[] args) {
        // Definiendo variable de archivo
        File archivo = new File("ejemplo2.txt");

        if (archivo.exists()){
            System.out.println("El archivo ya existe");
        }else {
            try {
                // Creando el archivo
                boolean creado = archivo.createNewFile();
                if (creado){
                    System.out.println("Archivo creado" + archivo.getName());
                }else {
                    System.out.println("Error al crear un archivo");
                }
                // Controlando fallo al crear el archivo
            }catch (IOException error){
                System.out.println("ERROR: "+ error);
                System.out.println("Error al crear un archivo");
            }
        }
    }
}
