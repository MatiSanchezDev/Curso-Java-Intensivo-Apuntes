package Condicionales;

public class Condicional_If_Not {
    static void main(String[] args) {
        System.out.println("==== MONITOREO EL SISTEMA ====");
        var enLinea = true;

        if (!enLinea){ //Acá se está preguntando si enlinea es false
            System.out.println("FUERA DE SERVICIO");
        } else {
            System.out.println("SERVICIO ACTIVO");
        }

    }
}
