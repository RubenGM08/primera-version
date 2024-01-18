package unidad1;

import java.util.Scanner;

/**
 * Actividad 1.8
 * Realizar una aplicación que solicite al usuario su edad y le indique si es mayor de
 * edad (mediante un literal booleano: true o false).
 */


public class Actividad1_8 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Escribe tu edad: ");
        int edad= sc.nextInt();
        boolean mayorDeEdad= edad >= 18;

        System.out.println("Mayoría de edad: " + mayorDeEdad);
    }
}
