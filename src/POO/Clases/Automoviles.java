package POO.Clases;
// Creando una nueva clase
public class Automoviles {

    // Definiendo atributos de una clase
    String marca = "Honda";
    String model = "CRV";
    int anio = 2026;
    int cant_ruedas = 4;
    boolean camara = true;




    static void main(String[] args) {
        // Instanciar una clase
        Automoviles auto1 = new Automoviles();
        Automoviles auto2 = new Automoviles();

        // Consultar valores de un objeto
        System.out.println("Marca: " + auto1.marca);
        System.out.println("Modelo: " + auto1.model);
        System.out.println("año: " + auto1.anio);
        System.out.println("Cantidad de Ruedas: " + auto1.cant_ruedas);
        System.out.println("Camara: " + auto1.camara);
    }
}
