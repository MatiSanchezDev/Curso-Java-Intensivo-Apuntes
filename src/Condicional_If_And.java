import javax.swing.*;

public class Condicional_If_And {
    static void main(String[] args) {
        String nombre;
        int edad;

        nombre = JOptionPane.showInputDialog(null, "Ingrese tu nombre..");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese tu edad...");
        edad = Integer.parseInt(edad2);

        // Analizando datos
        if (edad < 12){
            JOptionPane.showMessageDialog(null, "Eres un niño(a)");
        } else if (edad >12 && edad<19){
            JOptionPane.showMessageDialog(null, "Eres un adolescente");
        } else {
            JOptionPane.showMessageDialog(null, "Eres un adulto");
        }

    }
}
