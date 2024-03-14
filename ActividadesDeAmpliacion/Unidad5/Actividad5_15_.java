package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 5
 * Actividad 5.15
 * Debes desarrollar una aplicación que ayude a gestionar las notas de un centro educativo.
 * Los alumnos se organizan en grupos compuestos por 5 personas. Leer las notas (núme
 * ros enteros) del primer, segundo y tercer trimestre de un grupo. Debes mostrar al final la
 * nota media del grupo en cada trimestre y la media del alumno que se encuentra en una
 * posición dada (que el usuario introduce por teclado).
 *
 */

public class Actividad5_15_ {

    static Scanner sc = new Scanner(System.in);

    static int notas[][]=new int[3][5];
    public static void main(String[] args) {
        altaNotas();

    }

    //Metodo para insertar notas

    public static int[][] altaNotas() {
        int trimestre;
        for (trimestre = 0; trimestre < 3; trimestre++) {
            mostrar("Indica el trimestre->" + (trimestre + 1) + "-> ");
            leerNotas(notas, trimestre);

        }

        buscarAlumno(notas, trimestre);
        return notas;
    }

    //Metodo para leer las notas
    public static void leerNotas(int notas[][], int trimestre) {
        for (int i = 0; i < notas[trimestre].length; i++) {
            mostrarSinLn("Alumno ("+(i+1)+")-> ");
            notas[trimestre][i]= sc.nextInt();
        }
        //mostrar(Arrays.deepToString(notas));
        //Despues de leer las notas, nos piden la media por trimestre
        int media[]= new int[3];
        for (int alu=0; alu<5; alu++){
            for (int trim = 0; trim < 3; trim++) {
                media[trim]+=notas[trim][alu];
            }
        }
        mostrar("La media del Primer trimestre-> "+ (media[0]/5.0));
        mostrar("La media del Segundo trimestre-> "+ (media[1]/5.0));
        mostrar("La media del Tercer trimestre-> "+ (media[2]/5.0));

    }

    public static void buscarAlumno(int[][] notas, int trimestre) {
        mostrar("Indique la pisicion del alumno->");
        int pos= sc.nextInt();
        double mediaA=(notas[0][pos-1]+notas[1][pos-1]+notas[2][pos-1])/3.0;
        mostrarSinLn("La media del alumno " + pos + " es-> ");
        System.out.printf("%.2f",mediaA);
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }


}
