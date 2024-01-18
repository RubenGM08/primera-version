package unidad1;

import java.util.Scanner;

/**
 * Actividad 13
 * Escribir un programa que solicite las notas del primer, segundo y tercer trimestre (notas
 * enteras que se solicitarán al usuario). El programa debe mostrar la nota media del curso
 * como se utiliza en el boletín de calificaciones (solo la parte entera) y como se usa en el
 * expediente académico (con decimales).
 *
 */

public class Actividad1_13 {
    public static void main(String[] args) {

        int notaTrimestre1, notaTrimestre2, notaTrimestre3;
        double expedienteAcademico;
        int boletinAcademico;

        Scanner sc= new Scanner(System.in);

        System.out.println("Dime cual fue la nota en el Primer trimestre: ");
        notaTrimestre1= sc.nextInt();
        System.out.println("Dime cual fue la nota en el Segundo trimestre: ");
        notaTrimestre2= sc.nextInt();
        System.out.println("Dime cual fue la nota en el Tercer trimestre: ");
        notaTrimestre3= sc.nextInt();

        //Calculamos la media con los decimales
        expedienteAcademico = (notaTrimestre1 + notaTrimestre2 + notaTrimestre3) / 3.0;
        System.out.println("El expediente academico del alumno es: " + expedienteAcademico);

        //Mostrar el boletin de calificaciones solo la parte entera
        expedienteAcademico = (int) expedienteAcademico;
        System.out.println("El boletin de calificaciones es: " + expedienteAcademico);
    }
}
