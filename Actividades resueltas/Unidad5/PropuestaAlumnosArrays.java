package Unidad5;

import java.util.Scanner;

public class PropuestaAlumnosArrays {

    static Scanner sc = new Scanner (System.in);

    public static void main(String[] args) {

    mostrarAlumnos(alumnosDatos());

    }

    /* FUNCION LEEMOS LOS DATOS DE LOS ALUMNOS Y LO GUARDAMOS EN EL ARRAY */
    public static String[][] alumnosDatos(){
        String alumnos [][]= new String[13][4];
        for (int i = 0; i < 13; i++) {
            for (int j = 0; j < 4; j++) {
                //si es la columna 0-> Nombre
                if (j==0){
                    mostrarSinLn("Indica el Nombre del alumno " + (i+1) + "-> ");
                    alumnos[i][j]= sc.next();sc.nextLine();
                }
                //si es la columna 1-> Apellido
                if (j==1){
                    mostrarSinLn("Indica el Apellido del alumno " + (i+1) + "-> ");
                    alumnos[i][j]= sc.next();sc.nextLine();
                }
                //si es la columna 2-> Profesion
                if (j==2){
                    mostrarSinLn("Indica la profesion del alumno " + (i+1) + "-> ");
                    alumnos[i][j]= sc.next();sc.nextLine();
                }
                //si es la columna 3-> email
                if (j==3){
                    mostrarSinLn("Indica el Email del alumno " + (i+1) + "-> ");
                    alumnos[i][j]= sc.next();sc.nextLine();
                }
            }
        }


            return alumnos;
    }
    /*
    FUNCION QUE MUESTRA LA INFORMACION ORDENADA POR EL NOMBRE DE LOS ALUMNOS Y EN FORMA DE TABLA
    (foreach)
     */

    //forma de recorrer un Array bidimensional con un foreach
    public static void mostrarAlumnos(String alumnos[][]) {
        mostrar("| Nombre   | Apellido  | Profesion | Email");
        for (String[] fila:alumnos) {
            for (String col:fila){
                mostrarSinLn(col + " ");
            }
            mostrar("");
        }
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
