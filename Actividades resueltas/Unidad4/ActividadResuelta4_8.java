package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.8
 * Diseñar la funcion calculadora(), a la que se le pasen dos números reales (operandos)
 * y qué operación se desea reaizar con ellos. Las operaciones disponibles son: sumar, restar,
 * multiplicar o dividir. Estas se especifican mediante un número: 1 para la suma, 2 para
 * la resta, 3 para la multiplicacion y 4 para la division. La funcion devolvera el resultado de la
 * operación mediante un número real.
 */

public class ActividadResuelta4_8 {
    public static void main(String[] args) {

        System.out.println("******************************");
        System.out.println("****      Calculadora     ****");
        System.out.println("** 1. Sumar                 **");
        System.out.println("** 2. Restar                **");
        System.out.println("** 3. Multiplicar           **");
        System.out.println("** 4. Dividir               **");
        System.out.println("**                          **");
        System.out.println("******************************");

        Scanner sc = new Scanner(System.in);
        System.out.print("Cual operaciones quieres hacer -> ");
        byte opcion= sc.nextByte();

        System.out.print("Has elegido la opcion de ");
        if (opcion==1){
            System.out.println("Sumar");
        } else if (opcion==2) {
            System.out.println("Restar");
        } else if (opcion==3) {
            System.out.println("Multiplicar");
        } else if (opcion==4) {
            System.out.println("Dividir");
        }

        System.out.println("Dame un numero real -> ");
        int primerNumero= sc.nextInt();
        System.out.println("Dame otro numero real -> ");
        int segundoNumero= sc.nextInt();


        calculador(primerNumero, segundoNumero, opcion);


    }

    public static double calculador(double a, double b, byte opcion) {

        double resultado = 0;

        switch (opcion){
            case 1 -> {
                resultado= a + b;
                System.out.println("La suma del numero " + a + " + " + b + " es -> " + resultado);
            }
            case 2 -> {
                resultado= a - b;
                System.out.println("La resta del numero " + a + " - " + b +" es -> " + resultado);
            }
            case 3 -> {
                resultado= a * b;
                System.out.println("La multiplicación del numero " + a + " * " + b +" es -> " + resultado);
            }
            case 4 -> {
                resultado= a / b;
                System.out.println("La división del numero " + a + " / " + b +" es -> " + resultado);
            }

            default -> System.err.println("Solo se puede elegir la opcion del 1 al 4");

        }

        return resultado;
    }

}
