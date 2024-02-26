package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.4
 * Diseñar una funcion que recibe como parametros dos numeros enteros y devuelve el
 * maximo de ambas
 */

public class ActividadResuelta4_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        System.out.println("Dame un numero entero -> ");
        num1= sc.nextInt();

        System.out.println("Dame el segundo numero entero ->");
        num2= sc.nextInt();

        System.out.println("El numero mayor es ->" + numeroMayor(num1, num2));
    }

    public static int numeroMayor(int num1, int num2) {

        int mayor;
        if (num1>num2){
            mayor=num1;
            System.out.println(mayor);
        } else {
            mayor=num2;
            System.out.println(mayor);
        }
        return (mayor);
    }

}
