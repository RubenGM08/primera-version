package MF0964_3_EV_PRACTICA.Controller;

import MF0964_3_EV_PRACTICA.Clases.Calculadora;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in); // DECLARACIÓN DE SCANNER: Se declara como estático para uso global en la clase.

    public static void main(String[] args) {
        menu(); // LLAMADA AL MÉTODO MENU: Inicia el programa.
    }

    public static void menu(){
        // VARIABLES DE CONTROL
        int contador=0; // Contador para verificar si la calculadora está encendida o apagada.
        int opcion, opcionCalculadora; // Variables para las opciones del menú y la calculadora.
        double num1, num2; // Variables para almacenar los números ingresados.
        Calculadora calculadora; // Instancia de la clase Calculadora.

        // MENÚ PRINCIPAL
        do {
            System.out.println("  ");
            System.out.println("_______________________________");
            System.out.println("|  - C A L C U L A D O R A -  |");
            System.out.println("|                             |");
            System.out.println("|   1. Encender Calculadora   |"); // CORRECCIÓN: "Encender" en lugar de "Enceder".
            System.out.println("|   2. Apagar                 |");
            System.out.println("|                             |");
            System.out.println("|_____________________________|");
            System.out.print("Indica la opción -> ");
            opcion = sc.nextInt(); // Selecciona la opción del menú.

            if (opcion == 1) {
                contador++;
                // MENÚ DE OPERACIONES
                do {
                    System.out.println(" ");
                    System.out.println("Vamos a realizar una operación");
                    System.out.print("Pon el Primer número -> ");
                    num1 = sc.nextDouble(); // Se ingresa el primer número.
                    System.out.print("Pon el Segundo número -> ");
                    num2 = sc.nextDouble(); // Se ingresa el segundo número.
                    calculadora = new Calculadora(num1, num2); // Se crea una instancia de la calculadora.
                    System.out.println(" ");
                    System.out.println("_______________________________");
                    System.out.println("|  - C A L C U L A D O R A -  |");
                    System.out.println("|                             |");
                    System.out.println("|   1. Sumar                  |");
                    System.out.println("|   2. Restar                 |");
                    System.out.println("|   3. Multiplicar            |");
                    System.out.println("|   4. Dividir                |");
                    System.out.println("|   5. Resto                  |");
                    System.out.println("|   6. Exponente              |");
                    System.out.println("|   7. Salir                  |");
                    System.out.println("|_____________________________|");
                    System.out.print("¿Qué operación quieres realizar? -> ");
                    opcionCalculadora = sc.nextInt(); // Selecciona la operación deseada.
                    switch (opcionCalculadora) {
                        case 1 -> calculadora.calcularSuma(); // Ejecuta la operación de suma.
                        case 2 -> calculadora.calcularResta(); // Ejecuta la operación de resta.
                        case 3 -> calculadora.calcularMultiplicacion(); // Ejecuta la operación de multiplicación.
                        case 4 -> calculadora.calcularDividion(); // Ejecuta la operación de división.
                        case 5 -> calculadora.calcularResto(); // Ejecuta la operación de resto.
                        case 6 -> calculadora.calcularExponente(); // Ejecuta la operación de exponente.
                        case 7 -> System.out.println("Adiós"); // Sale del menú.
                        default -> System.out.println("Solo se puede elegir la opción del 1 al 7"); // Mensaje de error para opciones inválidas.
                    }
                } while (opcionCalculadora != 7); // Continúa mostrando el menú hasta que se seleccione "Salir".
            } else if (contador == 0) {
                System.out.println("La calculadora ya está apagada"); // Mensaje si se intenta operar la calculadora antes de encenderla.
            } else if (opcion > 2) {
                System.out.println("Solo puedes elegir una opción del 1 al 2 😎"); // Mensaje de error para opciones inválidas en el menú principal.
            }
        } while (opcion != 2); // Sale del programa cuando se selecciona "Apagar".

        System.out.println("¡Adiós! 😎 ✌️✌️️✌️"); // Mensaje de despedida al salir del programa.
    }
}
