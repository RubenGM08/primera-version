package Unidad4;

import java.util.Scanner;

/**
 * Tema 4
 * Actividad resuelta 4.5
 * Crear una funcion que, mediante un booleaan, indique si el cará´cter que se pasa como
 * parametro de entrada corresponde con una vocal
 */

public class ActividadResuelta4_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String leer;
        System.out.print("Escribe una letra -> S");
        leer= sc.nextLine();

        System.out.println("La letra es " + esVocal(leer.charAt(0)));

    }

    public static boolean esVocal(char c) {
        boolean resultado; //true si es una vocal y false en caso contrario

        if (c=='a' || c == 'A'|| c == 'e' || c == 'E' || c == 'i'
                || c == 'I' || c == 'o' || c == 'O' || c == 'u' || c == 'U' ) {
            resultado = true;
        } else {
            resultado =false;
        }
        return resultado;
    }
}
