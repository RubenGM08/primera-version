package Unidad6;

import java.util.Scanner;

/**
 * Tema 6
 * Actividad resuelta 6.2
 * Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la que
 * contiene menos caracteres.
 */
public class ActividadResuelta6_2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    String frase1, frase2;
    mostrar("Escribe la primera frase -> ");
    frase1= sc.next();sc.nextLine();

    mostrar("Escribe la segunda frase -> ");
    frase2= sc.next();sc.nextLine();

    int longitud1,longitud2;
    longitud1=frase1.length();
    longitud2=frase2.length();

        if (longitud1>longitud2){
            mostrar("La primera frase es mas larga");
        } else if (longitud2>longitud1){
            mostrar("La segunda frase es mas larga");
        } else if (longitud1==longitud2) {
            mostrar("Las dos frases son igual de largas");
        }
    }


    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
