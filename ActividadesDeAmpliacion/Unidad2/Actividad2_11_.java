package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.11
 * Escribe una aplicación que solicite al usuario un número comprendido entre 0 y 9999. La
 * aplicación tendrá que indicar si el número introducido es capicúa.
 *
 */


import java.util.Scanner;

public class Actividad2_11_ {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        boolean capicua= false;
        // Numero entero entre 0 y 9999
        int num,u,d,c,um;
        /***********************/
        System.out.println("----- C A P I C U A ------");
        System.out.println("Indica un número entero entre 0 y 9999");
        num= sc.nextInt();

        //Evaluamos
        u=num%10; //obtengo las unidades
        num/=10;  // elimino la unidad de num
        d=num%10; //obtengo las decenas
        num/=10;  // elimino la decenas de num
        c=num%10; //obtengo las centnas
        num/=10;  // elimino la centenas de num
        um=num;   // obtengo las unidades de millar

        // Evaluación Logica
        if (um==u && d==c){
            capicua=true;
        } else if (um==0 && c==u) {
           capicua=true;
        } else if (um==0 && c==0 && d==u) {
            capicua=true;
        } else if (um==0 && c==0 && d==0) {
            capicua=true;
        }

        if (capicua){ // if (capicua == true)
            System.out.println("El número escrito es capicua");
        } else {
            System.out.println("El número no es capicua");
        }


    }
}
