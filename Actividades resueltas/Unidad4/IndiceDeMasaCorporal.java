package Unidad4;

import java.util.Scanner;

public class IndiceDeMasaCorporal {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Vamos a medir tu masa muscular");
        System.out.println("Primero vamos a pedir sus datos");
        System.out.print("\tNombre-> ");
        String nombre= sc.next();
        System.out.print("\t1ªApellido-> ");
        String primerapellido= sc.next();
        System.out.print("\t2ªApellido-> ");
        String segundoapellido= sc.next();
        System.out.print("\tSexo-> ");
        String sexo= sc.next();
        System.out.print("\tEdad-> ");
        byte edad= sc.nextByte();

        System.out.println("Muchas gracias por los datos-> " + nombre + " " + primerapellido + " " + segundoapellido + " :)");

        tablaIMC();
        System.out.println("\nEsta es la tabla de Indice de Masa Corporal");
        pedirDatos();

    }
    
    public static void pedirDatos() {
        System.out.println("\nAhora vamos a mirar tu IMC");
        System.out.print("Cual es tu peso-> ");
        double peso=sc.nextDouble();
        System.out.print("Cual es tu altura-> ");
        double altura= sc.nextDouble();

        double IMC= peso/(Math.pow(altura, 2));
        System.out.println(IMC);

        if (IMC<=15){
            System.err.println("Delgadez muy severa");
        } else if (IMC>15 && IMC<=15.9) {
            System.err.println("Delgadez severa");
        } else if (IMC>=16 && IMC<=18.4) {
            System.out.println("Delgadez ");
        } else if (IMC>=18.5 && IMC<=24.9) {
            System.out.println("Peso Saludable");
        } else if (IMC>=25 && IMC<=29.9) {
            System.err.println("Sobrepeso");
        } else if (IMC>=30 && IMC<=34.9) {
            System.err.println("Obesidad Moderada");
        } else if (IMC>=35 && IMC<=39.9) {
            System.err.println("Obesidad Severa");
        } else if (IMC>=40) {
            System.err.println("Obesidad muy severa (obesidad mórbida)");
        }


    }

    public static void tablaIMC() {
        System.out.println("____________________________________________________________________");
        System.out.println("| Índice de Masa Corporal |                 Tu rango               |");
        System.out.println("|                         |                                        |");
        System.out.println("|  menos de 15    ->      | Delgadez muy severa                    |");
        System.out.println("|  15--15,9       ->      | Delgadez severa                        |");
        System.out.println("|  16--18,4       ->      | Delgadez                               |");
        System.out.println("|  18,5--24,9     ->      | Peso Saludable                         |");
        System.out.println("|  25--29,9       ->      | Sobrepeso                              |");
        System.out.println("|  30--34,9       ->      | Obesidad Moderada                      |");
        System.out.println("|  35--39,9       ->      | Obesidad severa                        |");
        System.out.println("|  40 o más       ->      | Obesidad muy severa (obesidad mórbida) |");
        System.out.println("|_________________________|________________________________________|");

    }


}
