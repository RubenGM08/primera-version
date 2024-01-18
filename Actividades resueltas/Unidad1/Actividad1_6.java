package unidad1;

import java.util.Scanner;

public class Actividad1_6 {
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int n1 , n2;

        System.out.print("Nota 1º= ");
        n1 = sc.nextInt();


        System.out.print("Nota 2º= ");
        n2 = sc.nextInt();

        double mediarAritmetica= (n1 + n2) / 2.0;
        System.out.println("La media arítmetica de los dos numero que has puesto es = " + mediarAritmetica);

    }
}
