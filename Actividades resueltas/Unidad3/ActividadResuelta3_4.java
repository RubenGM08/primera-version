package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.4
 * Un centro de investigación de la flora urbana necesita una aplicación que muestre cuál es
 * el árbol más alto. Para ello se introducirá por teclado la altura (en centímetros) de cada
 * árbol (terminando la introducción de datos cuando se utilice −1 como altura). Los árboles
 * se identifican mediante etiquetas con números únicos correlativos, comenzando en 0.
 * Diseñar una aplicación que resuelva el problema planteado.
 */

import java.util.Scanner;

public class ActividadResuelta3_4 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int alturaArbol, alturaArbolMasAlto = 0;
        int etiqueta=0, etiquetaArbolMasAlto;

        System.out.print("Introduce la altura del arbol (con centimeros)= ");
        alturaArbol=sc.nextInt();

        while (alturaArbol>=0){
            if (alturaArbol >= alturaArbolMasAlto){
                alturaArbolMasAlto= alturaArbol;
                etiquetaArbolMasAlto=etiqueta;
            }
            etiqueta++;





            System.out.print("Introduce la altura del arbol (con centimeros)= ");
            alturaArbol=sc.nextInt();
        }








    }
}
