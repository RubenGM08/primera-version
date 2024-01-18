package unidad1;

/**Enunciado: 3.
 * Teniendo como base, que el 100% de un colegio esta formado por todos los alumnos, solicita cuantas niñas y cuantos niños hay, e indica el porcentaje de cada uno. Por ejemplo:
 *
 * Existe 84 niñas y 78 niños, el 100% de los niños del colegio son 162 niños,
 *
 *
 * 51.85% son niñas
 * 48.14%son niños
 *
 * Recordemos que la regla de tres : 162 total - 100%
 * 				  84 niñas - x%
 */

import java.util.Scanner;

public class Enunciado3 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        int numerosNinas;
        int numerosNinos;
        double totalAlumnos;
        double porcentaAlumnosNinas, porcentaAlumnosNinos;

        System.out.println("Hay un 100% de alumnos en un colego, escribe cuantos niños y niñas hay en el colegio");

        System.out.print("Cuantas niñas hay en el centro es: ");
        numerosNinas = sc.nextInt();

        System.out.print("Cuantos niños hay en el centro es: ");
        numerosNinos = sc.nextInt();

        totalAlumnos = numerosNinas + numerosNinos;
        System.out.println("El total de niños es: " + totalAlumnos);

        porcentaAlumnosNinas = ((100*numerosNinas)/totalAlumnos);
        System.out.println("El porcentaje de alumnos niñas es: " + porcentaAlumnosNinas);

        porcentaAlumnosNinos = ((100*numerosNinos)/totalAlumnos);
        System.out.println("El porcentaje de alumnos niñas es: " + porcentaAlumnosNinos);

        System.out.println("");
        System.out.println("Otra forma");
        System.out.println("__________________________________________________");
        System.out.println("El porcentaje de alumnos niñas es: " + porcentaAlumnosNinas);
    }
}

