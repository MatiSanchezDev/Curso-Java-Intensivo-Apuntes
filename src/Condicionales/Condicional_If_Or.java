package Condicionales;

import javax.swing.*;

public class Condicional_If_Or {
    static void main(String[] args) {
        boolean Domingo = false;
        boolean Vacaciones = false, Licencia = true;

        // Ingresando datos
        if(Domingo == true || Vacaciones == true || Licencia == true){
            System.out.println("Acceso denegado al server de la empresa");
        } else {
            System.out.println("Acceso concedido");
        }
    }
}
