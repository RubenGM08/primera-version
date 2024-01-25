package Unidad2;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {

        int opcion, valor1=0, valor2=0;
        double resultado = 0;
        Scanner sc= new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("***** Menú de la Calculadora  *****");
        System.out.println("** 1. Sumar                      **");
        System.out.println("** 2. Restar                     **");
        System.out.println("** 3. Multiplicar                **");
        System.out.println("** 4. Dividir                    **");
        System.out.println("** 5. Salir                      **");
        System.out.println("***********************************");
        System.out.print(" Indica tu opcion->");
        opcion= sc.nextInt();
        if (opcion>=1 && opcion<=4){
            System.out.print(" Indica el valor de 1= ");
            valor1= sc.nextInt();
            System.out.print(" Indica el valor de 2= ");
            valor2= sc.nextInt();
        }
        switch (opcion){
            case 1: {
                resultado=valor1+valor2;
                break;
            }
            case 2: {
                resultado=valor1-valor2;
                break;
            }
            case 3: {
                resultado=valor1*valor2;
                break;
            }
            case 4: {
                resultado=valor1/valor2;
                break;
            }
            case 5: {
                System.out.println("Adios.........");
                break;
            }
            default:{
                System.out.println("La selección del menú solo es del 1 al 5");
                break;
            }

        }
        System.out.println("El resultado de la operación selecionada es= " + resultado);

    }
}
