package Unidad2;

import java.util.Scanner;

/**
 * Tema2
 * Actividad resuelta 2.7
 * Pedir tres números y mostrarlos ordenados de mayor a menor.
 */
public class ActividadResuelta2_7 {
    public static void main(String[] args) {

        //Declaramos el escaner
        Scanner sc=new Scanner(System.in);

        //Inicializamos las variables enteras
        int numero1, numero2, numero3;

        //Pedimos el primero numero
        System.out.print("Escribe el primer numero entero=");
        numero1= sc.nextInt();

        System.out.print("Escribe el segundo numero entero=");
        numero2= sc.nextInt();

        System.out.print("Escribe el tercer numero entero=");
        numero3= sc.nextInt();

        if (numero1>numero2 && numero2>numero3){
            System.out.println(numero1 + ", " + numero2 + ", " + numero3);
        } else if (numero1 > numero3 && numero3 > numero2) {
            System.out.println(numero1 + ", " + numero3 + ", " +numero2);
        } else if (numero2 > numero1 && numero1 > numero3) {
            System.out.println(numero2 + ", " + numero1 + ", " + numero3);
        } else if (numero2 > numero3 && numero3 > numero1) {
            System.out.println(numero2 + ", " + numero3 + ", " + numero1);
        } else if (numero3 > numero1 && numero1>numero2) {
            System.out.println(numero3 + ", " + numero1 + ", " + numero2);
        } else if (numero3 > numero2 && numero2 > numero1) {
            System.out.println(numero3 + ", " + numero2 + ", " + numero1);
        }

    }
}
