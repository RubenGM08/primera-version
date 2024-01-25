package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.16
 * Utiliza el operador ternario para calcular el valor absoluto de un número que se solicita al
 * usuario por teclado.
 *
 */


import java.util.Scanner;

public class Actividad2_16_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc =new Scanner(System.in);

        //Inicializamos las variables
        int numero;

        System.out.print("Escribe un numero positivo o negativo= ");
        numero= sc.nextInt();

        if (numero<0){
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es positivo");
        }

    }
}
