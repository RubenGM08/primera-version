package unidad1;

import java.util.Scanner;

/**
 * Actividad 14
 * Realizar un programa que pida como entrada un número decimal y lo muestre redondeado
 * al entero más próximo.
 */

public class Actividad1_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Pon un numero con decimales");
        double numero= sc.nextDouble();
        System.out.println("");
        int variable= (int)  Math.round(numero);

        System.out.println("El redonde de ese numero es: " + variable);


    }
}
