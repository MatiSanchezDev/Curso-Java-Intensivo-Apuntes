package Manejo_Archivos;

import java.io.File;
import java.text.SimpleDateFormat;

public class Informacion {
    static void main(String[] args) {
        File infoArchivo = new File("C:/Users/Matias/Downloads/Curso_Java/proyecto_1/Proyecto_1/src/Registros.txt");

        if (infoArchivo.exists()){
            System.out.println("Nombre del archivo: " + infoArchivo.getName());
            System.out.println("Ruta: "+ infoArchivo.getPath());
            System.out.println("Puede leerse: " + infoArchivo.canRead());
            System.out.println("Puede escribirse: " + infoArchivo.canWrite());
            System.out.println("Puede ejecutarse: " + infoArchivo.canExecute());
            System.out.println("Tamaño: "+ infoArchivo.length());


            // Verificar si un archivo es un directorio
            boolean esDirectorio = infoArchivo.isDirectory();
            System.out.println("Es directorio: " + esDirectorio);

            // Verificar si es un archivo
            System.out.println("Es archivo: "+ infoArchivo.isFile());

            // Última fecha de modificación
            System.out.println("Modificado por última vez: " + infoArchivo.lastModified());
            // Acá formateo la fecha para poder verla bien.
            SimpleDateFormat fechaModif = new SimpleDateFormat("dd/MM/yyyy");
            String fechaMOdif2 = fechaModif.format(infoArchivo.lastModified());
            System.out.println("Modificado por última vez: " + fechaMOdif2);

        } else {
            System.out.println("El archivo no existe");
        }
    }
}
