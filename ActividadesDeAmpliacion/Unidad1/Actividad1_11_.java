package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.11
 * Un economista te ha encargado un programa para realizar cálculos con el IVA. La aplicación
 * debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla el
 * importe correspondiente al IVA y al total.
 */

public class Actividad1_11_ {
    public static void main(String[] args) {

        // Crear un objeto Scanner para la entrada de datos
        Scanner scanner = new Scanner(System.in);

        // Solicitar la base imponible al usuario
        System.out.print("Ingrese la base imponible: ");
        double baseImponible = scanner.nextDouble();

        // Solicitar el porcentaje de IVA al usuario
        System.out.print("Ingrese el porcentaje de IVA: ");
        double porcentajeIVA = scanner.nextDouble();

        // Calcular el importe correspondiente al IVA
        double iva = (baseImponible * porcentajeIVA) / 100;

        // Calcular el total sumando la base imponible y el importe de IVA
        double total = baseImponible + iva;

        // Mostrar los resultados
        System.out.println("Importe de IVA: " + iva);
        System.out.println("Total: " + total);
    }
}
