package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividad resuelta 2.3
 * Solicitar dos números distintos y mostrar cuál es el mayor.
 *
 */

public class ActividadResuelta2_3 {
    public static void main(String[] args) {

        //Declaramos el escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos la variables que sean numeros enteros
        int numero1, numero2;

        System.out.println("Pon dos numeros enteros");
        //Pedimos el primer numero
        System.out.print("El primer número es= ");
        numero1= sc.nextInt();
        //Pedimos el segundo numero
        System.out.print("El segundo número es= ");
        numero2= sc.nextInt();

        //Utilizamos el condicional if-else para mira cual es el mayor entre los dos
        if (numero1>numero2){
            System.out.println("El numero = " + numero1 + ", es mayor que el numero " + numero2);
        } else {
            System.out.println("El numero = " + numero2 + ", es mayor que el numero " + numero1);
        }
    }
}
