package Metodos;

public class MetodoVarArgs {


    // Metodo para poder tener parámetros variables
    public void ImprimeNumeros (String mensaje, int... numeros){

        // Puede ser multivalor, por lo que puedo pasar string, boolean, int, etc...
        System.out.println(mensaje);

        // Esta es la forma incorrecta de ver los valores, acá solo va a imprimir un dato guardado en memoria.
        // Porque al valor numeros, java lo está tomando como un array.
        System.out.println("Valores: "+ numeros);

        // Esta es la forma de imprimir por pantalla y ver esos valores
        System.out.print("Valores: ");
        for (int i: numeros){
            System.out.print(i+" ");
        }

    }

    static void main(String[] args) {
        MetodoVarArgs valores = new MetodoVarArgs();

        valores.ImprimeNumeros("Este es otro valor variable.",20,30,40,50,60,70);
    }
}
