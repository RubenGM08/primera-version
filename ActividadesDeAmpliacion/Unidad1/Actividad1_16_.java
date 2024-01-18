package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.16
 * Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos.
 * La aplicación debe mostrar cuántas horas, minutos y segundos hay en el número de
 * segundos introducidos por el usuario.
 */

public class Actividad1_16_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int seg,min,hor;

        System.out.println("Introduce una cantidad de segundos: ");
        seg=sc.nextInt();
        min=seg/60;
        seg%=60; // se utiliza el modulo para obtener el resto entre los segundos y los min y hora
        hor=min/60; //bien
        min%=60;
        // 1 hora tiene 3600 seg
        System.out.println("Los segundos son: " + seg);
        System.out.println(seg + " Son " + min + " minutos, " + hor + " horas.");
    }
}
