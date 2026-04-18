package excepciones;

public class MultiExcepciones {
    static void main(String[] args) {
        try {
            String texto = "Saludos";
            System.out.println("Texto: " + texto.length());
            int[] numeros = new int[5];
            System.out.println(numeros[7]);
            // Manejo de error de excepciones null
        } catch (NullPointerException e){
            System.out.println("Error: " + e);
            System.out.println("Error: El texto tiene valor null");
            // Manejo de error de excepciones de array
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Error: "+ e);
            System.out.println("Error: Este elemento no existe");
        }
    }
}
