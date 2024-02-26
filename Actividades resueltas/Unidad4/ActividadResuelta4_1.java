package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.1
 * Diseñar la funcion eco() a la que le pasa como parámetro un número n, y muestra por
 * pantalla n veces el mensaje *Eco...*
 */

public class ActividadResuelta4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantas veces quieres repetir eco ->");
        byte veces= sc.nextByte();

        eco(veces);

    }

    public static void eco(byte veces) {
        for ( int i=0; i<=veces; i++){
            System.out.println("Eco....");
        }

    }
}
