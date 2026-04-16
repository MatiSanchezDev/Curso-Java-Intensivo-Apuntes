package POO.Clases;

class Alumnos {
    String nombre, asignatura;
    int nota;

    // Creando metodo constructor. Requiere tener el mismo nombre que la clase. En este caso Alumnos Clase Alumnos metodo contrstuctor.
    public Alumnos(){
        nombre = "Matias";
        asignatura = "Lengua";
        nota = 80;
    }

    String cambiaNota (int nuevaNota){
        this.nota = nuevaNota;
        return "Nueva nota: "+ nota;
    }

    void DimeDatos(){
        System.out.println("Nombre: "+nombre+"\nAsignatura: "+ asignatura+"\nNota: "+nota);
    }


    static void main(String[] args) {
        Alumnos persona1 = new Alumnos();
        persona1.cambiaNota(85);
        persona1.DimeDatos();


    }
}
