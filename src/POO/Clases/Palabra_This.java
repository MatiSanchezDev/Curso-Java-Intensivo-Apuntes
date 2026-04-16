package POO.Clases;

class Palabra_This {

    String nombre = "Maria";

    // Metodo GET
    String DimeNombre (String nombre){
        this.nombre = nombre;
        return nombre;
    }

    // Metodo SET
    void MuestraNombre (){
        System.out.println("Nombre: " + nombre);
    }


    static void main(String[] args) {
        Palabra_This persona1 = new Palabra_This();
        persona1.DimeNombre("Matias");
        persona1.MuestraNombre();
    }
}
