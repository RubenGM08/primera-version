package Unidad4;


import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.2
 * Escribir una función a la que se le pasen dos enteros y muestre todos los números
 * comprendidos entre ellos.
 */

public class ActividadResuelta4_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Pon un numero entero ->");
        int num1= sc.nextInt();

        System.out.print("Pon otro numero entero ->");
        int num2=sc.nextInt();

        mostrar(num1, num2);

    }

    public static void mostrar(int num1, int num2) {

        int mayor, menor;

        if (num1 > num2){
            mayor=num1;
            menor=num2;
            System.out.println(mayor);
        } else {
            mayor=num2;
            menor=num1;
        }

        for (int i = menor; i <= mayor; i++) {
            System.out.print(i + ", ");
        }
    }
}
