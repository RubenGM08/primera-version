package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.9
 * Repetir la Actividad resulta 4.4 con una versión que calcule el máximo de tres números.
 */

public class ActividadResuelta4_9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num1, num2, num3;
        System.out.print("Dame un numero entero -> ");
        num1= sc.nextInt();

        System.out.print("Dame un segundo numero entero -> ");
        num2= sc.nextInt();

        System.out.print("Dame un tercer numero entero -> ");
        num3= sc.nextInt();

        System.out.println("El numero mayor entre los tres numeros selecionados es -> " + numeroMayor(num1, num2, num3));

    }

    public static int numeroMayor(int numero1, int numero2, int numero3) {

        int mayor = 0;

        if (numero1 > numero2 && numero1 > numero3){
            mayor=numero1;
        } else if (numero2 > numero1 && numero2 > numero3) {
            mayor=numero2;
        } else if (numero3 > numero2 && numero3 > numero1) {
            mayor=numero3;
        }
        return mayor;


    }


}
