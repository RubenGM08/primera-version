package Unidad3;

/**
 * Tema 3
 * Actividad propuesta 3.1
 * Diseña una aplicación que muestre la edad máxima y mínima de un grupo de alumnos. El
 * usuario introducirá las edades y terminará escribiendo un −1.
 */

import java.util.Scanner;

public class ActividadPropuesta3_1 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        byte edad, edadMinima, edadMaxima;
        System.out.print("Indica la edad= " ); //Esta linea se tiene que repetir
        edad= sc.nextByte();
        edadMaxima=edad;
        edadMinima=edad;
        while (edad!=-1){ //se repetira mientras el usuario no escriba el -1
            //condicional if
            if (edadMinima>edad){
                edadMinima=edad;
            }
            if (edadMaxima<edad){
                edadMaxima=edad;
            }
            System.out.print("Indica la edad= " ); //Esta linea se tiene que repetir
            edad= sc.nextByte();
        }
        System.out.println("La edad minima ingresada es= " + edadMinima);
        System.out.println("La edad maxima ingresada es= " + edadMaxima);
    }
}
