package POO.Encapsulacion.Ejemplo1_Public;


// Si la clase está en otro package hay que importarlo
import POO.Encapsulacion.Ejemplo1_Public.Otro_Package.Persona;

public class Principal {
    static void main(String[] args) {
        Persona persona1 = new Persona();

        // Para acceder a este metodo desde otro package, en la clase hay que agregar el public
        // No sirve solo importar la clase.
        persona1.dimeNombre();
    }

}
