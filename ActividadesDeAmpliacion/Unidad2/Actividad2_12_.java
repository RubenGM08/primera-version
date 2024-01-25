package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.12
 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La
 * aplicación tendrá que indicar si el número introducido es capicúa.
 *
 */

import java.util.Scanner;

public class Actividad2_12_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numeroDni, calculo;
        String letra = null;
        System.out.print("Indica el número del Dni= ");
        numeroDni= sc.nextInt();

        calculo=numeroDni%23; // 0 al 22
        switch (calculo){
            case 0->letra="T";
            case 1->letra="R";
            case 2->letra="W";
            case 3->letra="A";
            case 4->letra="G";
            case 5->letra="M";
            case 6->letra="Y";
            case 7->letra="F";
            case 8->letra="P";
            case 9->letra="D";
            case 10->letra="X";
            case 11->letra="V";
            case 12->letra="N";
            case 13->letra="J";
            case 14->letra="Z";
            case 15->letra="S";
            case 16->letra="Q";
            case 17->letra="V";
            case 18->letra="H";
            case 19->letra="L";
            case 20->letra="C";
            case 21->letra="K";
            case 22->letra="E";
        }
        System.out.println("La letra del DNI " +numeroDni + " es= " + letra);

    }
}
