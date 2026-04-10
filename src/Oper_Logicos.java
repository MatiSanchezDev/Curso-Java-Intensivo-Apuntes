public class Oper_Logicos {
    static void main(String[] args) {
        boolean a = true, b = false;

        // Operador AND (Y) Todas deben ser True.
        System.out.println(a && b);

        // Operador OR (o) alguna de las comparaciones debe ser True.
        System.out.println(a || b);

        // Operador NOT (NO) Cambia una comparación de true a false o viceversa.
        System.out.println(!a);
        System.out.println(!b);

        // XOR LÓGICO Solo una debe ser verdadera, no las dos como el OR Si ambas son verdaderas da false.
        System.out.println(a ^ b);
    }
}
