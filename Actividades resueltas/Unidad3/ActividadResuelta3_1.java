package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.1
 * Diseñar un programa que muestre, para cada número introducido por teclado, si es par, si
 * es positivo y su cuadrado. El proceso se repetirá hasta que el número introducido sea 0.
 */

import java.util.Scanner;

public class ActividadResuelta3_1 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int numero;
        String esPar, esPositivo;
        double cuadradoNumero;

        //Pedimos el numero
        System.out.print("Introduce el numero= " );
        numero= sc.nextInt();

        while (numero!=0){
            esPar= numero % 2 == 0 ? "Es par" : "Es impar";
            System.out.println("El numero introducido= " + numero + ", es= " + esPar);
            esPositivo= numero >= 0 ? "Es positivo" : "Es negativo";
            System.out.println("El numero introducido= " + numero + ", es= " + esPositivo);
            cuadradoNumero= numero*numero;
            System.out.println("El cuadrado del numero es= " + cuadradoNumero);
            System.out.println("");

            System.out.print("Introduce el numero= " );
            numero= sc.nextInt();
        }




    }
}
