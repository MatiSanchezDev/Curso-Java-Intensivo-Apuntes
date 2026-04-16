package POO.Clases;

// COLABORACIÓN ENTRE CLASES

import java.util.Scanner;

// Primer clase
class Cliente {
    String nombreCliente;


    // Metodo constructor
     Cliente(String nombre) {
        this.nombreCliente = nombre;
    }


    String dimeNombre () {
         return nombreCliente;
    }

}

// Segunda clase
class Prestamo {
    double cuota;

    // Metodo constructor
    Prestamo (double cuota) {
        this.cuota = cuota;
    }

    void analizaCuota () {
        if (cuota >= 10000){
            System.out.println("Deuda cancelada");
        } else {
            double pendiente = 10000 - cuota;
            System.out.println("Abono a deuda: " + cuota);
            System.out.println("Pendiente para saldo: " + pendiente);
        }
    }

}


class Principal {


    static void main() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese nombre...");
        Cliente persona = new Cliente(entrada.next());
        System.out.println("Ingrese cuota");
        Prestamo deposito = new Prestamo(entrada.nextDouble());
        System.out.println(persona.dimeNombre());
        deposito.analizaCuota();
    }
}
