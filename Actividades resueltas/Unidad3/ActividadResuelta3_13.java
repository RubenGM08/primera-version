package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.13
 * Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota igual a
 * cuatro) y suspensos
 *
 */

import java.util.Scanner;

public class ActividadResuelta3_13 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);
        int aprobados = 0, suspensos = 0, condicionados = 0; //contadores

        for (int i=1; i<=7; i++){
            System.out.println("Nota del alumno número " + i + ": ");
            //Inicializamos la variable
            int nota = sc.nextInt();
            if (nota == 4) { //comprobaremos en que caso nos encontramos
                condicionados++;
            } else if (nota >= 5) {
                aprobados++;
            } else if (nota < 4) { //este if es redundante , al ser el único caso posible
                suspensos++;
            }
        }
        System.out.println("Aprobados: " + aprobados);
        System.out.println("Suspensos: " + suspensos);
        System.out.println("Condicionados: " + condicionados);
    }
}
