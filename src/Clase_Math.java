import java.util.Scanner;

public class Clase_Math {
    static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);

        //System.out.println("Ingrese valor a calcular");
        int valor = 9; //entrada.nextInt();

        // Cálculo de raíz cuadrada
        System.out.println("Raíz de: " + valor + " = "+ Math.sqrt(valor));

        // Cálculo de potencia
        var base = 2;
        var exponente = 3;
        System.out.println("Potencia de 2 a la 3 = " + Math.pow(base,exponente));


        // Valor absoluto
        var absoluto = -2.5;
        System.out.println("Valor absoluto de: "+ absoluto + " = " + Math.abs(absoluto) );

        // Identificar valor mayor
        var numero1 = 50.2;
        var numero2 = 3;

        System.out.println("Mayor valor: "+ Math.max(numero1,numero2));

        // Identificar valor menor
        System.out.println("Menor valor: "+ Math.min(numero1,numero2));

        // Redondear un valor entero más cercano
        var total = 5.2345;

        System.out.println(total + " redondeada: " + Math.round(total));

        // Redondear hacia abajo
        System.out.println(total + " redondeada hacia abajo: " + Math.floor(total));

        // Redondear hacia arriba a entero más cercano
        System.out.println(total + " redondeada hacia arriba: " + Math.ceil(total));

        // Número aleatorio
        var aleatorio = Math.random()*10;

        System.out.println("Valor aleatorio: "+aleatorio);

        // Función número PI

        System.out.println("Valor de PI: " + Math.PI);

        // Seno de un ángulo
        System.out.println("Seno de un angulo de 90: "+ Math.sin(90));

        // Coseno de un ángulo
        System.out.println("Coseno de un angulo de 180: "+ Math.cos(180));

        // Tangente de un ángulo
        System.out.println("Tangente de un angulo de 70: "+ Math.tan(180));

        // Logaritmo natural de un número
        var log = 100;
        System.out.println("Logaritmo de: "+ log + " = " + Math.log(log));

        // Logaritmo base 10 de un número
        var log_base = 100;
        System.out.println("Logaritmo base 10 de: "+ log_base + " = " + Math.log10(log_base));

    }
}
