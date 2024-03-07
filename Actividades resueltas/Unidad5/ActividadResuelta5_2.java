package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.2
 * Diseñar un programa que solicite al usuario por teclado 5 números
 * decimales. A continuacion, mostrar los números en el mismo orden que se han introducido.
 *
 */

public class ActividadResuelta5_2 {
    
    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {

        double numero[];
        numero=new double[5];
        for (int i = 0; i < numero.length; i++) {
            System.out.println("Escribe el " + (i + 1) + "º numero con decimales->");
            numero[i]= sc.nextDouble();
        }

        System.out.println(Arrays.toString(numero));
    }
    
}
