package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.12
 * Modifica la Actividad de Aplicación 1.12 para que, indicando dos números n y m, diga
 * qué cantidad hay que sumarle a n para que sea múltiplo de m.
 */

public class Actividad1_13_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, operacion;
        int m;

        System.out.println("Pon el numero que tu quieras:");
        n= sc.nextInt();

        System.out.println("Pon otro numero que tu quieras:");
        m= sc.nextInt();


        operacion = m - (n % m);
        System.out.println("Hay que sumarle: " + operacion);

    }
}
