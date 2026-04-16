package POO.Encapsulacion.Ejemplo2_Protected.Paquete2;

import POO.Encapsulacion.Ejemplo2_Protected.Paquete1.Animal;

public class Gato {
    static void main(String[] args) {
        Animal gato1 = new Animal();
        //gato1.caminar(); //Este metodo está protegido por eso no se puede usar.
        gato1.maulla(); // Este está public por eso si puedo llamar al metodo.
        //.out.println("Nombre: " + gato1.nombre); //Este atributo está protegido por eso no se puede usar.
        //System.out.println("Nombre: " + gato1.nombrePublico); // Este está public por eso si puedo consultar.
        //System.out.println("Nombre: " + gato1.nombreFamiliar); // Este no está definido, pero por defecto queda público solo para -
                                                               // - clases del mismo package.
    }
}
