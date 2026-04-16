package POO.Encapsulacion.Ejemplo3_Private;

public class Vehiculos {
    // ATRIBUTOS PRIVADOS
    // Solo puedo usar estos atributos en la propia clase, no se puede usar en otra clase.
    private String marca = "Audi";
    private int anio = 2026;

    void datosVehiculos (){
        System.out.println("Marca: " + marca + "\nAño: " + anio);
    }

    static void main(String[] args) {
        Vehiculos auto1 = new Vehiculos();
        auto1.datosVehiculos();
        Tipo_Vehiculo tipo1 = new Tipo_Vehiculo();
        // System.out.println("Tipo: "+ tipo1.tipo1); NO SE PUEDE VER PORQUE SON ATRIBUTOS PRIVADOS.
        // System.out.println("Tipo: "+ tipo1.tipo2);
    }
}
