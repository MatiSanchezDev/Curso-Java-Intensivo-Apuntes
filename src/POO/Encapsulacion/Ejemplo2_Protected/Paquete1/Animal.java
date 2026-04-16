package POO.Encapsulacion.Ejemplo2_Protected.Paquete1;

public class Animal {

    // ATRIBUTOS PROTEGIDOS
    protected String nombreProtegido = "Pelusa"; // Solo accesibles desde la misma clase, clases del mismo paquete y subclases.
    String nombreFamiliar = "Manchitas";// Este atributo solo es accesible para clases que estén en el mismo package
    public String nombrePublico = "Garabato"; // Este para todos los packages


    //METODOS PROTEGIDOS
    // Este metodo está como protected y la clase public.
    // Se puede instanciar el objeto porque es "public" pero no puede usar el metodo caminar() porque está "protected"
    protected void camina(){
        System.out.println("Este animal camina");
    }

    public void maulla(){
        System.out.println("Este animal maulla");
    }
}
