package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.15
 * Dado el siguiente polinomio de segundo grado:
 *          y = ax2 + bx + c
 * crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el
 * valor correspondiente de y.
 */

public class Actividad1_15_ {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        double a, b, x ,y ,c;


        System.out.println("Vamos a calcular un polinomio de segundo grado");
        System.out.println("");

        System.out.println("Dame el coeficiente de a con decimales:");
        a= sc.nextDouble();

        System.out.println("Dame el coeficiente de b con decimales:");
        b= sc.nextDouble();

        System.out.println("Dame el coeficiente de c:");
        c= sc.nextDouble();

        // Pedimos el valor de x
        System.out.print("Introduzca el valor de x: ");
        x = sc.nextDouble();

        // Calculamos el valor de y
        y = a * x * x + b * x + c;

        // Imprimimos el resultado
        System.out.println("El valor de y es: " + y);



    }
}
