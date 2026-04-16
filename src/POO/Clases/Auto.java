package POO.Clases;
// Importar otros objetos en JAVA
import POO.Clases.Alumnos;
// Importar todos los objetos de un paquete
import java.util.*;

class Auto {
    String marca, modelo;
    int anio;


    // Atributos que se ponen por defecto sin parametros
    public Auto(){
        marca= "Toyota";
        modelo = "Corolla";
        anio = 2026;
    }

    // Atributos que los agrego arbitrariamente con parametros
    public Auto (String marca, String modelo, int anio){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

    void MostrarInfo (){
        System.out.println("Marca: "+ marca+"\nModelo: "+ modelo+ "\nAño: "+ anio);
    }

    static void main(String[] args) {
        System.out.println("--- Objeto Creado en el archivo actual --- ");
        Auto auto1 = new Auto();
        Auto auto2 = new Auto("Peugeot", "408", 2026);
        auto1.MostrarInfo();
        auto2.MostrarInfo();
        // Usando objeto importada
        System.out.println("--- Objeto Importado --- ");
        Alumnos persona1 = new Alumnos();
        persona1.DimeDatos();
    }
}
