package Bucles;

import javax.swing.*;

public class While_Ejercicio {
    static void main(String[] args) {
        final String u_correcto = "usuario01";
        final String p_correcto = "Gunbound12!";

        String username, password;
        int intentos = 0;
        final int max_intentos = 3;

        while(intentos < max_intentos){
            username = JOptionPane.showInputDialog(null, "Ingrese nombre de usuario");
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña");

            if (u_correcto.equals(username) && p_correcto.equals(password)){
                JOptionPane.showMessageDialog(null, "Usuario logeado exitosamente");
                break;
            }
            intentos++;
            int intentos_disponibles = max_intentos - intentos;
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos, intentos disponibles: "+intentos_disponibles);

            if (intentos > 2){
                JOptionPane.showMessageDialog(null, "Excediste el límite de intentos, contactar a soporte.");
            }
        }
    }
}
