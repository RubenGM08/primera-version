package Unidad9.Colesiones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EjemploTry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion=0;
        do {
            System.out.println("____________________________________________");
            System.out.println("|           C R U D   DE   SOCIOS          |");
            System.out.println("|   1. Alta de Socio                       |");
            System.out.println("|   2. Listar Socios Ordenado por Id       |");
            System.out.println("|   3. Actualizar Socio por Id             |");
            System.out.println("|   4. Eliminar Socio por Id               |");
            System.out.println("|   5. Eliminar                            |");
            System.out.println("|__________________________________________|");

            try {
                System.out.println("Indique su opcion-> ");
                opcion=sc.nextInt();

            }catch (Exception e){
                System.out.println("Error->" + e);
                System.out.println("Solo se aceptan opciones del 1 al 5");
                sc.next();
            }


        }while(opcion==0);

    }
}