package Unidad1;
/**
 * Actividades De Ampliacion
 * Actividad 1.12
 * Escribe un programa que tome como entrada un número entero e indique qué cantidad
 * hay que sumarle para que el resultado sea múltiplo de 7.
 */


import java.util.Scanner;

public class Actividad1_12_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, operacion;
        int multiplo = 7;

        System.out.println("Pon el numero que tu quieras:");
        numero= sc.nextInt();


        operacion = multiplo - (numero % multiplo);
        System.out.println("Hay que sumarle: " + operacion);

    }
}
