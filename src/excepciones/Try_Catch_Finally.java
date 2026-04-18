package excepciones;

public class Try_Catch_Finally {
    static void main(String[] args) {
        try {
            int[] valores = new int[3];
            valores[5] = 10;
            // Si acá hay un error, lo que haya abajo del error no se va a procesar nunca.
            // Por más que esté el catch
            System.out.println(valores.length);
            System.out.println("Sigo adelante");
        } catch (ArrayIndexOutOfBoundsException error ){
            System.out.println("Error: " + error);

        // Para eso usamos el finally, si necesitas que se ejecute algún código por más que haya un error
        // Nota: Usar finally si es un error simple o no muy importante.
        } finally {
            System.out.println("Fin del programa");
        }
    }
}
