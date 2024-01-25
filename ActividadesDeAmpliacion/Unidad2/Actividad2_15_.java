package Unidad2;

/**
 * Actividades De Ampliacion
 * Tema 2
 * Actividad 1.15
 * Escribe una aplicación que solicite por consola  dos números reales que corresponden a
 * la base y la altura de un triángulo. Deberá mostrarse su área, comprobando que lo números
 * introducidos por el usuario no son negativos, algo que no tendría sentido.
 */


import java.util.Scanner;

public class Actividad2_15_ {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        double area, base, altura;

        System.out.print("Pon la base del triangulo= ");
        base= sc.nextDouble();
        System.out.println("");

        System.out.print("Pon la altura del triangulo= ");
        altura= sc.nextDouble();
        System.out.println("");

        area= (base*altura)/2;

        if (base<=0 && altura<=0){
            System.out.println("No se puede hacer operaciones negativas");
        } else {
            System.out.println("El area del triangulo es= " +area);
        }



    }
}
