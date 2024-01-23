package Unidad2;

import java.util.Scanner;

/**
 * Tema 2
 * Actividades resueltas 2.5
 * Pedir dos números y mostrarlos ordenados de forma decreciente.
 *
 */
public class ActividadResuelta2_5 {
    public static void main(String[] args) {

        //Declaramos el escaner
        Scanner sc=new Scanner(System.in);

        //Inicializamos las variables con numeros enteros
        int numero1, numero2;

        //Pedimos el primer numero
        System.out.print("Pon el primer numero entero= ");
        numero1 = sc.nextInt();

        //Pedimos el segundo numero
        System.out.print("Pon el segundo numero entero= ");
        numero2 = sc.nextInt();

        //Mostramos con un if ordenados de forma decreciente
        if (numero1<numero2){
            System.out.println(numero1 + ", " +numero2);
        } else {
            System.out.println(numero2 + ", " +numero1);
        }



    }
}
