package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.2
 * Implementar una aplicación para calcular datos estadísticos de las edades de los alumnos
 * de un centro educativo. Se introducirán datos hasta que uno de ellos sea negativo, y
 * se mostrará: la suma de todas las edades introducidas, la media, el número de alumnos
 * y cuántos son mayores de edad.
 */

import java.util.Scanner;

public class ActividadResuelta3_2 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc= new Scanner(System.in);

        //Inicializamos las variables
        int edadAlumnos, totalEdad = 0, numeroAlumnos= 0, mayorDeEdad=0, menorDeEdad=0;
        double media;

        //Pedimos el la edad de los Alumnos
        System.out.print("Indica la edad del alumno= ");
        edadAlumnos= sc.nextInt();

        while (edadAlumnos>=0){
            //Cada edad que el usuario ponga en el teclado se ira sumando las edades en total
            totalEdad=edadAlumnos+totalEdad;
            //Cada edad que el usuario ponga en el teclado se sumara 1 al numeroAlumnos.
            numeroAlumnos++;
            //Miramos cuantos alumnos son mayores de edad
            if (edadAlumnos>=18){
                mayorDeEdad++;
            } else {
                menorDeEdad++;
            }

            System.out.println("");
            System.out.print("Indica la edad del alumno= ");
            edadAlumnos= sc.nextInt();
            System.out.println("");

        }
        System.out.println("El numero de alumnos que hay es= "+numeroAlumnos);
        System.out.println("El total de edad de todos los alumnos es= " + totalEdad);
        media= (double) totalEdad /numeroAlumnos;
        System.out.println("La media de los alumnos es= "+media);
        System.out.println("Hay en total= " + mayorDeEdad + " personas mayores de edad.");
        System.out.println("Hay en total= " + menorDeEdad + " personas menores de edad.");






    }
}
