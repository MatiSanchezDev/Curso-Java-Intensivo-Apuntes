package Operadores;

public class Oper_incremento {
    static void main(String[] args) {

        int valor1 = 5;
        System.out.println("Suma");
        System.out.println("Valor original: " + valor1);


        // Incrementando valor1 postfijo (Suma)
        valor1++;
        System.out.println("Valor incrementado: " + valor1);

        // Incrementando valor1 prefijo
        ++valor1;
        System.out.println("Valor incrementado: " + valor1);

        valor1+= 2;
        System.out.println("Valor incrementado en 2: " + valor1);

        System.out.println("-----------------------------------------");

        //decremento postfijo (Resta)
        int valor2 = 5;
        System.out.println("Resta");
        System.out.println("Valor original: " + valor2);

        valor2--;
        System.out.println("Valor decrementado: "+ valor2);

        //decremento prefijo
        --valor2;
        System.out.println("Valor decrementado: "+ valor2);

        valor2-=2;
        System.out.println("Valor decrementado en dos: "+ valor2);

        System.out.println("-----------------------------------------");
        // Operador incremento fijo (Multiplicación)
        int valor3 = 5;
        System.out.println("Multiplicación");
        System.out.println("Valor original: " + valor3);

        valor3*=2;
        System.out.println("Valor multiplicado: " + valor3);

        System.out.println("-----------------------------------------");

        // Operador incremento fijo (División)
        System.out.println("División");
        valor3/=2;
        System.out.println("Valor dividido: " + valor3);
    }
}
