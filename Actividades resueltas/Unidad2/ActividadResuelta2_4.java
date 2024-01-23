package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividad resuelta 2.4
 * Implementar un programa que pida por teclado un número decimal e indique si es un número
 * casi-cero, que son aquellos, positivos o negativos, que se acercan a 0 por menos de
 * 1 unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de número
 * casi-cero son el 0,3, el −0,99 o el 0,123; algunos números que no se consideran
 * casi-ceros son: el 12,3, el 0 o el −1.
 */
public class ActividadResuelta2_4 {
    public static void main(String[] args) {

        //Declaramos el escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos la variable decimal
        double numero;

        //Pedimos que ponga un numero decimal
        numero= sc.nextDouble();

        if (-1 < numero && numero < 1 && numero != 0) {
            System.out.println("Es un número casi-cero");
        } else {
            System.out.println("No es un casi-cero");
        }

    }
}
