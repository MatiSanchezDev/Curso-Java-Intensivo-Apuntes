package Bucles;

import javax.swing.*;

public class For_Ejercicio {
    static void main(String[] args) {
        boolean validar = false;

        for (int i= 0; !validar; i++){
            String email = JOptionPane.showInputDialog(null, "Ingresá tu email.");

            if (!email.contains("hotmail")){
                if (!email.contains("gmail")){
                    JOptionPane.showMessageDialog(null, "Debe ingresar un gmail o hotmail.");
                    continue;
                }
            }

            if (!email.contains("@")){
                JOptionPane.showMessageDialog(null, "Falta un '@' en el email que ingresaste.");
                continue;
            }

            if(!email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Falta el '.com' en el email que ingresaste.");
                continue;
            }

            if (email.contains("@") && email.endsWith(".com")){
                JOptionPane.showMessageDialog(null, "Email ingresado correctamente.");
                JOptionPane.showMessageDialog(null, "Bienvenido "+ email);
                validar=true;
            }

        }
    }
}
