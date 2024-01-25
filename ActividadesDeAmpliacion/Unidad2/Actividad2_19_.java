package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.19
 * MCrea una aplicación que solicite al usuario cuántos grados tiene un ángulo y muestre el
 * equivalente en radianes. Si el ángulo introducido por el usuario no se encuentra en el rango
 * de 0° a 360°, hay que transformarlo a dicho rango.
 * Nota: El operador módulo puede ayudarnos a convertir un ángulo a su equivalente en el
 * rango comprendido de 0° a 360°.
 */


import java.util.Scanner;

public class Actividad2_19_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //
        double grados;
        System.out.println(" Indica los grados del Ángulo");
        grados= sc.nextDouble();
        grados%=360;
        double radianes=grados*Math.PI/180;
        System.out.println("Los radianes son ");
        System.err.printf("%.4f %n",radianes);




    }
}
