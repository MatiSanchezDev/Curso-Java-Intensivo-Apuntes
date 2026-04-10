public class Concatenacion {
    static void main(String[] args) {
        String nombre = "Homero", apellido = "Simpson";
        String saludo = "Hola " + nombre + " " + apellido;

        System.out.println(nombre + " " + apellido);
        System.out.println(saludo);
        System.out.println(nombre.concat(" " + apellido));
    }
}
