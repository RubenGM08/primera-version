package unidad1;

/**Enunciado: 1.
 *Solicita al usuario que ingrese dos numeros enteros y luego muestre la suma de esos dos
 *numeros con un mensaje "El resultado de la suma de a + b es "
 */

import java.util.Scanner;

public class Enunciado1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.println("Escribe dos numeros enteros");
        System.out.print("Escribe el primer numero: ");
        a = sc.nextInt();

        System.out.print("Escribe el segundo numero: ");
        b= sc.nextInt();

        c = a + b;
        System.out.println("La suma de estos dos numeros es: " + c);


        //Codigo optimizado
        int cc; // solo declaro la varicable c
        System.out.print("Escribe el primer numero: ");
        cc = sc.nextInt(); // leemos y acumulamos el valor cc

        System.out.print("Escribe el segundo numero: ");
        cc=cc+sc.nextInt(); // leemos el segundo numero y se lo sumamos al valor de cc

        System.out.println("La suma de estos dos numeros es: " + cc);



    }
}
