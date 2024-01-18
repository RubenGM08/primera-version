package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.17
 * Solicita al usuario tres distancias:
 *      La primera, medida en milímetros.
 *      La segunda, medida en centímetros.
 *      La última, medida en metros.
 * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
 * centímetros).
 */

public class Actividad1_17_ {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int milimetros, centimetros, metros;
        double total;

        System.out.println("Vamos a insertar tres distancias:");

        //Pedimos los milimetros
        System.out.println("");
        System.out.println("La primera es en milimetros, ¿Cuantos milimetros quieres?");
        milimetros= sc.nextInt();

        //Pedimos los centimetros
        System.out.println("");
        System.out.println("La segunda es en centimetos, ¿Cuantos centimetos quieres?");
        centimetros= sc.nextInt();

        //Pedimos los metros
        System.out.println("");
        System.out.println("La tercera es en metros, ¿Cuantos metro quieres?");
        metros= sc.nextInt();

        //Vamos a pasar los centimetros y metros a milimetros
        System.out.println("");
        double pasarMeMil= metros*1000;
        double pasarCenMil= centimetros*10;

        System.out.println("Vamos a pasar los centimetros y metros a milimetros");
        System.out.println("Los Metros a milimetros son: " + pasarMeMil);
        System.out.println("Los Centimetros a milimetros son: " + pasarCenMil);
        System.out.println("");
        //Sumamos todas las distancias
        total = milimetros + pasarMeMil + pasarCenMil;
        System.out.println("El total de los tres juntos es: " + total);



    }
}
