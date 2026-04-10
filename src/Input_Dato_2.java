import javax.swing.*;

public class Input_Dato_2 {
    static void main(String[] args) {
        String nombre;
        int edad;

        // Ingreso de datos

        nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre...");
        String edad2 = JOptionPane.showInputDialog(null, "Ingrese su edad...");

        // Convertimos la edad que ingreso el usuario, porque ingresa como string nomas el jOptionPane
        edad = Integer.parseInt(edad2);

        // Mostrar datos
        JOptionPane.showMessageDialog(null, "Nombre: "+ nombre + "\n" + "Edad: " + edad);

    }
}
