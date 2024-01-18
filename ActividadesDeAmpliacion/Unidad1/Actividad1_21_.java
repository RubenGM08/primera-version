package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.21
 * Pide dos números al usuario: a y b. Debera mostrase true si ambos numeros son iguales y
 * false en caso contrario.
 * */

public class Actividad1_21_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Tienes que poner dos numeros si son iguales acertaras" +
                "si son distintos te pondran que has fallado:");

        System.out.print("Pon el primer numero entero: ");
        double a= sc.nextDouble();

        System.out.print("Pon el segundo numero entero: ");
        double b = sc.nextDouble();

        String mismoNumero= a==b ? "Son iguales": "No son iguales has fallado";

        System.out.println(mismoNumero);
    }
}
