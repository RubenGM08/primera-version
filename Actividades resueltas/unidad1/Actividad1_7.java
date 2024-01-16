package unidad1;

import java.util.Scanner;

public class Actividad1_7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pedir el radio del circulo
        System.out.print("Pon un number para el radio del circulo = ");
        double radioCirculo;
        radioCirculo = sc.nextDouble();
        System.out.println("El radio que has elegido es= " + radioCirculo);

        final double pi=3.14;

        //Calcula la longitud
        double longitud= (2*pi)*radioCirculo;
        System.out.println("La longitud del circulo es= " + longitud);

        //Calcula el área
        double area= pi * (radioCirculo * radioCirculo);
        System.out.println("El area del circulo es= " + area);


    }
}
