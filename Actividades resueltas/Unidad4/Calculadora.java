package Unidad4;

import java.util.Scanner;

public class Calculadora {
    static double resultado;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.println(" _______________________");
        System.out.println("|  Calculadora en Java  |");
        System.out.println("|                       |");
        System.out.println("|  1. Sumar             |");
        System.out.println("|  2. Restar            |");
        System.out.println("|  3. Multiplicar       |");
        System.out.println("|  4. Dividir           |");
        System.out.println("|  5. Raiz Cuadrada     |");
        System.out.println("|  6. Exponencial       |");
        System.out.println("|_______________________|");
        System.out.print  ("Indica la opcion ------->");
        int opcion=sc.nextInt();
        operaciones(opcion);
    }


    public static void operaciones(int opcion) {
        int numero1=0, numero2=0, base=0, exponente=0;
        if (opcion >=1 && opcion <=4){
            System.out.println("Ingrese el valor del numero1");
            numero1=sc.nextInt();

            System.out.println("Ingrese el valor del numero2");
            numero2=sc.nextInt();

        }
        switch (opcion){
            case 1-> resultado=numero1+numero2;
            case 2-> resultado=numero1-numero2;
            case 3-> resultado=numero1*numero2;
            case 4-> resultado=numero1/numero2;
            case 5-> {
                System.out.println("Ingrese el número a calcular la la Raiz Cuadrada->");
                base=sc.nextInt();
                resultado=Math.sqrt(base);
            }
            case 6->{
                System.out.println("Ingrese la base-> ");
                base= sc.nextInt();
                System.out.println("Ingrese el exponenete -> ");
                exponente= sc.nextInt();
                resultado=Math.pow(base,exponente);
            }
            default -> {
                System.out.println("Opcion no válida");
                menu();
            }
        }

        System.out.println("El resultado es -> " + resultado);
        menu();
    }

}
