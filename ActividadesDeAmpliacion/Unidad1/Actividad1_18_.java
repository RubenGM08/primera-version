package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.18
 * Un biólogo está realizando un estudio de distintas especies de invertebrados y necesita
 * una aplicación que le ayude a contabilizar el número de patas que tienen en total todos
 * los animales capturados durante una jornada de trabajo. Par ello, te ha solicitado que
 * escribas una aplicación a la que hay que proporcionar:
 *      El número de hormigas capturadas (6 patas).
 *      El número de arañas capturadas (8 patas).
 *      El número de cochinillas capturadas (14 patas).
 * La aplicación debe mostrar el número total de patas.
 */

public class Actividad1_18_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de hormigas capturadas:");
        int hormigas = sc.nextInt();

        System.out.println("Introduce el número de arañas capturadas:");
        int aranas = sc.nextInt();

        System.out.println("Introduce el número de cochinillas capturadas:");
        int cochinillas = sc.nextInt();

        int patasTotales = hormigas * 6 + aranas * 8 + cochinillas * 14;

        System.out.println("El número total de patas es: " + patasTotales);
    }
}