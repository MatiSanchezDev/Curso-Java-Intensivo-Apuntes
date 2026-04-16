package POO.Encapsulacion.Ejemplo1_Public.Otro_Package;

public class Persona {

    String nombre = "Matias";

    // Para permitir que se pueda usar el metodo en diferente package hay que poner la palabra public
    public void dimeNombre(){
        System.out.println("Nombre: " + nombre);
    }

}
