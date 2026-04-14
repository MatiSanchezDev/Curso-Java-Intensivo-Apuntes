# ☕ Curso Java Intensivo + Apuntes

Repositorio con todas las clases y ejemplos del curso intensivo de Java. Cada archivo `.java` cubre un tema específico con ejemplos comentados listos para ejecutar.

> **Entorno:** IntelliJ IDEA · Java 17+  
> **Estructura:** fuentes en `src/`, organizados por paquete temático

```
src/
├── Fundamentos/       # Saludo, Comentarios, Variables, Var_Java, Costantes
├── Tipos_Datos/       # Casting
├── Operadores/        # Oper_Aritmeticos, Oper_Comparacion, Oper_incremento, Oper_Logicos
├── Strings/           # Concatenacion, Clase_String
├── Entrada_Datos/     # Input_Datos, Input_Dato_2, Metodo_Nextline
├── Condicionales/     # Condicional_If_*, Condicional_Switch*
├── Bucles/            # Bucle_*, Break_Continue, For_Ejercicio, While_Ejercicio
├── Clase_Math/        # Clase_Math
├── Arreglos/          # Arreglos_*, Matrices*
└── POO/               # Automoviles
```

---

## Índice de contenidos

| # | Tema | Archivo(s) |
|---|------|-----------|
| 1 | [Fundamentos](#1-fundamentos) | `Saludo`, `Comentarios`, `Variables`, `Var_Java`, `Costantes` |
| 2 | [Tipos de datos y casting](#2-tipos-de-datos-y-casting) | `Variables`, `Var_Java`, `Casting` |
| 3 | [Operadores](#3-operadores) | `Oper_Aritmeticos`, `Oper_Comparacion`, `Oper_incremento`, `Oper_Logicos` |
| 4 | [Strings y concatenación](#4-strings-y-concatenación) | `Concatenacion`, `Clase_String` |
| 5 | [Entrada de datos](#5-entrada-de-datos) | `Input_Datos`, `Input_Dato_2`, `Metodo_Nextline` |
| 6 | [Condicionales](#6-condicionales) | `Condicional_If_And/Or/Not`, `Condicional_Switch`, `Condicional_Switch_Mejorado` |
| 7 | [Bucles](#7-bucles) | `Bucle_For`, `Bucle_While`, `Bucle_Do_While`, `Break_Continue` |
| 8 | [Ejercicios de bucles](#8-ejercicios-de-bucles) | `For_Ejercicio`, `While_Ejercicio` |
| 9 | [Clase Math](#9-clase-math) | `Clase_Math` |
| 10 | [Arreglos (Arrays)](#10-arreglos-arrays) | `Arreglos_Enteros`, `Arreglos_caracteres`, `Arreglos_Bucles`, `Arreglos_Combinacion`, `Arreglos_Mayor_Valor`, `Arreglos_Metodos`, `Arreglos_Operaciones` |
| 11 | [Matrices](#11-matrices) | `Matrices`, `Matrices_For` |

---

## 1. Fundamentos

### `Saludo.java` — Hola Mundo
El punto de entrada más básico de Java.
```java
System.out.println("Hola mundo");
```

### `Comentarios.java` — Comentarios en Java
Cómo documentar el código con comentarios de una línea y multilínea.
```java
// Comentario de una línea

/*
   Comentario
   de varias líneas
*/
```

### `Variables.java` — Tipos de variables primitivas
Declaración y uso de los tipos más comunes: `String`, `int`, `double`, `char`, `boolean`.
```java
String nombre  = "Hola";
int valor      = 100;
double precio  = 20.50;
char letra     = 'A';
boolean activo = true;
```

### `Var_Java.java` — Inferencia de tipos con `var`
Desde Java 10, `var` deja que el compilador deduzca el tipo automáticamente.
```java
var nombre = "Mattdev";  // String inferido
var numero = 10;         // int inferido
var cifra  = 10.50;      // double inferido
```

### `Costantes.java` — Constantes con `final`
Las constantes se declaran con `final` y no pueden cambiar de valor.
```java
final double gravedad = 9.8;
final double pi       = 3.14;
```

---

## 2. Tipos de datos y casting

### `Casting.java` — Conversión entre tipos
| Conversión | Ejemplo |
|-----------|---------|
| `String` → `int` | `Integer.parseInt("123")` |
| `int` → `String` | `String.valueOf(456)` |
| `double` → `int` | `(int) 45.50` → `45` (trunca decimales) |
| `int` → `double` | `(double) 567` → `567.0` |

> **Ojo:** convertir `double` a `int` **trunca** los decimales, no redondea.

---

## 3. Operadores

### `Oper_Aritmeticos.java` — Operadores aritméticos
```java
resultado = a + b;  // Suma
resultado = a - b;  // Resta
resultado = a * b;  // Multiplicación
resultado = a / b;  // División (entera si ambos son int)
resultado = a % b;  // Módulo / Residuo
```

### `Oper_Comparacion.java` — Operadores de comparación
Siempre devuelven `true` o `false`.
```java
a == b   // Igual
a != b   // Distinto
a >  b   // Mayor que
a <  b   // Menor que
a >= b   // Mayor o igual
a <= b   // Menor o igual
```

### `Oper_incremento.java` — Operadores de incremento/decremento
```java
valor++;     // Postfijo: usa el valor, luego incrementa
++valor;     // Prefijo: incrementa primero, luego usa
valor += 2;  // Suma y asigna
valor -= 2;  // Resta y asigna
valor *= 2;  // Multiplica y asigna
valor /= 2;  // Divide y asigna
```

### `Oper_Logicos.java` — Operadores lógicos
```java
a && b   // AND  — ambos deben ser true
a || b   // OR   — al menos uno true
!a       // NOT  — invierte el valor
a ^  b   // XOR  — solo uno puede ser true (si ambos son true → false)
```

---

## 4. Strings y concatenación

### `Concatenacion.java` — Unir cadenas de texto
```java
// Con operador +
String saludo = "Hola " + nombre + " " + apellido;

// Con método concat()
nombre.concat(" " + apellido);
```

### `Clase_String.java` — Métodos esenciales de String

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `equals(s)` | Compara exacto (mayúsculas importan) | `"Hola".equals("hola")` → `false` |
| `equalsIgnoreCase(s)` | Compara sin importar mayúsculas | `"Hola".equalsIgnoreCase("hola")` → `true` |
| `compareTo(s)` | Diferencia alfabética (0 = igual) | `"abc".compareTo("abc")` → `0` |
| `charAt(i)` | Carácter en posición `i` | `"Java".charAt(0)` → `'J'` |
| `length()` | Cantidad de caracteres | `"Java".length()` → `4` |
| `substring(i, j)` | Subcadena entre posiciones | `"Java".substring(0,2)` → `"Ja"` |
| `indexOf(s)` | Posición de `s` (-1 si no existe) | `"Java".indexOf("av")` → `1` |
| `toUpperCase()` | Todo en mayúsculas | `"java".toUpperCase()` → `"JAVA"` |
| `toLowerCase()` | Todo en minúsculas | `"JAVA".toLowerCase()` → `"java"` |

---

## 5. Entrada de datos

### `Input_Datos.java` — Leer desde consola con `Scanner`
```java
Scanner input = new Scanner(System.in);
String nombre = input.next();      // Lee una palabra
int edad      = input.nextInt();   // Lee un entero
```

### `Input_Dato_2.java` — Ventana gráfica con `JOptionPane`
```java
// Cuadro de entrada
String nombre = JOptionPane.showInputDialog(null, "Ingrese su nombre...");
int edad = Integer.parseInt(
    JOptionPane.showInputDialog(null, "Ingrese su edad...")
);

// Cuadro de mensaje
JOptionPane.showMessageDialog(null, "Nombre: " + nombre);
```
> `JOptionPane` siempre retorna `String`, por eso hay que parsear números con `Integer.parseInt()`.

### `Metodo_Nextline.java` — `next()` vs `nextLine()`
| Método | Lee | Ejemplo |
|--------|-----|---------|
| `next()` | Una sola palabra (hasta espacio) | `"Hola"` de `"Hola mundo"` |
| `nextLine()` | La línea entera (hasta Enter) | `"Hola mundo"` completo |

---

## 6. Condicionales

### `Condicional_If_And.java` — `if / else if / else` con AND (`&&`)
```java
if (edad < 12) {
    // niño
} else if (edad > 12 && edad < 19) {
    // adolescente
} else {
    // adulto
}
```

### `Condicional_If_Or.java` — Condición OR (`||`)
```java
if (domingo == true || vacaciones == true || licencia == true) {
    // acceso denegado
}
```

### `Condicional_If_Not.java` — Negación (`!`)
```java
if (!enLinea) {  // si enLinea es false → entra
    System.out.println("FUERA DE SERVICIO");
}
```

### `Condicional_Switch.java` — Switch clásico
```java
switch (diaSemana) {
    case 1: System.out.println("Lunes"); break;
    case 2: System.out.println("Martes"); break;
    // ...
    default: System.out.println("Día inválido");
}
```

### `Condicional_Switch_Mejorado.java` — Switch con flechas (Java 14+)
Sintaxis más limpia, sin necesidad de `break`.
```java
switch (diaSemana) {
    case 1 -> System.out.println("Lunes");
    case 2 -> System.out.println("Martes");
    case 1 -> {
        // bloque con varias líneas
        System.out.println("Lunes");
        System.out.println("Revisá la landing page");
    }
    default -> System.out.println("Día inválido");
}
```

---

## 7. Bucles

### `Bucle_For.java` — Bucle `for`
```java
// Ascendente
for (int i = 0; i <= 10; i++) { ... }

// Descendente
for (int i = 10; i >= 0; i--) { ... }
```
**Ejercicio del archivo:** suma todos los números pares entre 0 y 20.

### `Bucle_While.java` — Bucle `while`
Se ejecuta **mientras** la condición sea verdadera.
```java
while (condicion) {
    // código
}
```
**Ejercicio del archivo:** sistema de login que repite hasta ingresar usuario y contraseña correctos.

### `Bucle_Do_While.java` — Bucle `do...while`
Se ejecuta **al menos una vez**, luego evalúa la condición.
```java
do {
    // código (se ejecuta mínimo 1 vez)
} while (condicion);
```
**Ejercicio del archivo:** pide ingresar el número 5 hasta que el usuario lo haga bien.

### `Break_Continue.java` — Control de flujo dentro de bucles
```java
break;    // Sale del bucle completamente
continue; // Salta a la siguiente iteración
```
**Ejemplo:** recorrer del 0 al 20 y mostrar solo los impares usando `continue` para saltear los pares.

---

## 8. Ejercicios de bucles

### `For_Ejercicio.java` — Validación de email con `for`
Bucle `for` que valida que el email ingresado (vía `JOptionPane`) cumpla estas reglas:
- Debe ser de `gmail` o `hotmail`
- Debe contener `@`
- Debe terminar en `.com`

### `While_Ejercicio.java` — Login con límite de intentos
Sistema de login con `JOptionPane` que:
- Permite máximo **3 intentos**
- Muestra cuántos intentos quedan
- Notifica si se superó el límite

---

## 9. Clase Math

### `Clase_Math.java` — Operaciones matemáticas

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `Math.sqrt(n)` | Raíz cuadrada | `Math.sqrt(9)` → `3.0` |
| `Math.pow(b, e)` | Potencia | `Math.pow(2, 3)` → `8.0` |
| `Math.abs(n)` | Valor absoluto | `Math.abs(-2.5)` → `2.5` |
| `Math.max(a, b)` | El mayor de dos valores | `Math.max(50, 3)` → `50` |
| `Math.min(a, b)` | El menor de dos valores | `Math.min(50, 3)` → `3` |
| `Math.round(n)` | Redondeo normal | `Math.round(5.6)` → `6` |
| `Math.floor(n)` | Redondea hacia abajo | `Math.floor(5.9)` → `5.0` |
| `Math.ceil(n)` | Redondea hacia arriba | `Math.ceil(5.1)` → `6.0` |
| `Math.random()` | Número aleatorio entre 0 y 1 | `Math.random() * 10` → entre 0 y 10 |
| `Math.PI` | Constante π | `3.141592653589793` |
| `Math.sin(a)` | Seno del ángulo | `Math.sin(90)` |
| `Math.cos(a)` | Coseno del ángulo | `Math.cos(180)` |
| `Math.tan(a)` | Tangente del ángulo | `Math.tan(70)` |
| `Math.log(n)` | Logaritmo natural | `Math.log(100)` |
| `Math.log10(n)` | Logaritmo base 10 | `Math.log10(100)` → `2.0` |

---

## 10. Arreglos (Arrays)

### `Arreglos_Enteros.java` — Arrays de enteros
```java
// Declarar y crear
int[] numeros = new int[5];

// Inicializar posición por posición
numeros[0] = 56;
numeros[1] = 354;

// Inicializar directo
int[] valores = {234, 144, 86, 990};

// Ordenar
Arrays.sort(numeros);

// Acceder
System.out.println(numeros[0]);
```

### `Arreglos_caracteres.java` — Arrays de Strings
```java
String[] productos = new String[5];
productos[0] = "Manzanas";
// ...

Arrays.sort(productos);  // Ordena alfabéticamente
```

> Para usar `Arrays.sort()` hay que importar `java.util.Arrays`.

### `Arreglos_Bucles.java` — Recorrer arrays con bucles
Muestra cómo iterar un array con `for` y con `while`.
```java
String[] productos = {"Martillo", "Destornillador", "Taladro", "Llave Inglesa", "Pinzas"};

// Con for
for (int i = 0; i < productos.length; i++) {
    System.out.println("Producto Nro. " + (i + 1) + ": " + productos[i]);
}

// Con while
int f = 0;
while (productos.length > f) {
    System.out.println("Producto Nro. " + (f + 1) + ": " + productos[f]);
    f++;
}
```
> Usar `i + 1` al imprimir evita que el índice arranque desde 0 visualmente.

### `Arreglos_Combinacion.java` — Combinar dos arrays con condiciones
Recorre dos arrays en paralelo (productos y precios) y aplica lógica condicional en cada iteración.
```java
String[] productos = {"Martillo", "Destornillador", "Taladro", "Llave Inglesa", "Pinzas"};
double[] precios   = {12.50, 10.20, 200.00, 40.20, 5.40};

for (int i = 0; i < productos.length; i++) {
    if (precios[i] < 100) {
        System.out.println(productos[i] + ": $" + precios[i] + " - No paga impuestos.");
    } else {
        System.out.println(productos[i] + ": $" + precios[i] + " - Paga impuestos.");
    }
}
```

### `Arreglos_Mayor_Valor.java` — Encontrar el mayor valor
El usuario ingresa 5 números; el programa va comparando en cada vuelta del `for` si el número ingresado supera al mayor actual.
```java
int mayor = 0;
for (int i = 0; i < 5; i++) {
    numeros[i] = entrada.nextInt();
    if (numeros[i] > mayor) {
        mayor = numeros[i];
    }
}
System.out.println("El mayor es: " + mayor);
```

### `Arreglos_Metodos.java` — Métodos de la clase `Arrays`

| Método | Descripción | Ejemplo |
|--------|-------------|---------|
| `Arrays.toString(arr)` | Convierte el array a texto legible | `[3, 2, 6, 4]` |
| `Arrays.sort(arr)` | Ordena el array (asc) | `[1, 2, 3, 4]` |
| `Arrays.equals(a, b)` | Compara dos arrays elemento a elemento | `true` / `false` |
| `Arrays.fill(arr, val)` | Llena todo el array con el mismo valor | `[1, 1, 1, 1, 1]` |
| `Arrays.copyOf(arr, len)` | Copia el array con nueva longitud | posiciones extras quedan en `0` |

```java
int[] original = {1, 2, 3};
int[] copia = Arrays.copyOf(original, original.length + 2);
// copia → [1, 2, 3, 0, 0]
```

### `Arreglos_Operaciones.java` — Operaciones aritméticas entre arrays
Opera dos arrays de ventas en paralelo: suma y resta posición a posición, acumulando el total.
```java
int[] ventas1 = {110, 320, 280, 150, 210};
int[] ventas2 = {550, 830, 300, 650, 380};

for (int i = 0; i < ventas1.length; i++) {
    totalVentas[i] = ventas1[i] + ventas2[i];
    suma += totalVentas[i];
}
System.out.println("Total: " + suma);
```

---

## 11. Matrices

### `Matrices.java` — Matrices bidimensionales
Una matriz es un array de arrays: se declara con `tipo[filas][columnas]`.
```java
int[][] numeros = new int[3][3];

// Llenar celda por celda
numeros[0][0] = 1;  numeros[0][1] = 0;  numeros[0][2] = 0;
numeros[1][0] = 0;  numeros[1][1] = 1;  numeros[1][2] = 0;
numeros[2][0] = 0;  numeros[2][1] = 0;  numeros[2][2] = 1;

// Acceder: numeros[fila][columna]
System.out.println(numeros[0][0]); // 1
```
**Ejercicio del archivo:** representa el tablero de ta-te-ti (Tic-Tac-Toe) con `1` en la diagonal principal → situación de victoria.

### `Matrices_For.java` — Recorrer matrices con `for` anidado
Inicialización literal y recorrido con dos `for` anidados: el externo maneja filas, el interno columnas.
```java
int[][] cantidades = {
    {10, 20, 80},
    {50, 70, 40},
    {20, 40, 90}
};

for (int fila = 0; fila < cantidades.length; fila++) {
    for (int columna = 0; columna < cantidades[fila].length; columna++) {
        System.out.print(cantidades[fila][columna] + " ");
    }
    System.out.println();
}
```
> Usar `cantidades[fila].length` en el for interno es más robusto que `cantidades.length` si la matriz no es cuadrada.

---

## Cómo ejecutar los archivos

1. Abrí el proyecto en **IntelliJ IDEA**
2. Navegá a `src/` y abrí el archivo que querés probar
3. Hacé clic derecho sobre la clase → **Run**

> Los archivos que usan `JOptionPane` abren ventanas gráficas; los que usan `Scanner` leen desde la consola de IntelliJ.
