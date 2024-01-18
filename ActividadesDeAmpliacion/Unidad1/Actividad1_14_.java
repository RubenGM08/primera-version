package Unidad1;

import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Actividad 1.14
 * Crea un programa que pida la base y la altura de un triángulo y muestre su área
 */

public class Actividad1_14_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double baseTriangulo, alturaTriangulo, areaTriangulo;
        //Pedimos la base de un triangulo
        System.out.println("Dame la base de un triangulo: ");
        baseTriangulo= sc.nextDouble();
        System.out.println("");
        //Pedimos la altura de un triangulo
        System.out.println("Dame la altura de un triangulo: ");
        alturaTriangulo= sc.nextDouble();
        System.out.println("");
        //Calculamos el area de un triangulo
        areaTriangulo= (baseTriangulo*alturaTriangulo)/2.0;
        System.out.println("El area del triagulo es: " + areaTriangulo);

    }
}
