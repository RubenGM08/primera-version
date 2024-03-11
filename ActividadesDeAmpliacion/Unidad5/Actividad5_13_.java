package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 3
 * Actividad 5.13
 * Modifica la Actividad de aplicación 5.12 para que la función no modifique la tabla que se
 * pasa como parámetro y, en su lugar, cree y devuelva una copia de la tabla donde se han
 * desordenado los valores de los elementos.
 */

public class Actividad5_13_ {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int tabla[]= crearTabla();
        mostrar("Asi seria la tabla ordenada");
        mostrar(Arrays.toString(tabla));
        mostrar("Asi seria la tabla desordenada");
        mostrar(Arrays.toString(desordenar(tabla)));

    }

    public static int[] crearTabla() {
        mostrarSinLn("Indique el número de elementos a insertar->");
        int longitud= sc.nextInt(); // preguntamos la longitud
        int tabla[]=new int[longitud]; //creamos la tabla con la longitud indicada
        for (int i = 0; i < tabla.length; i++) { //recorremos la tabla para insertar los datos
            mostrarSinLn("Indique el elemento " + (i + 1) + "-> ");
            tabla[i]= sc.nextInt(); //leemos el dato e insertamos en el indice i
        }
        Arrays.sort(tabla);
        return tabla;
    }
    //Metodo que desordena la tabla generada en el metodo anterior
    // Mediante un bucle de recorrido por toda la tabla.
    // valor1 / valor2= Random con dos valores multiplicados por la longitud de la tablaç
    //variable auxiliar=valor1
    //valor1=valor2
    //valor2=aux;
    public static int[] desordenar(int tabla[]) {
        for (int i = 0; i < tabla.length; i++) {
            int valor1=(int) (Math.random()* tabla.length);
            int valor2=(int) (Math.random()* tabla.length);
            int auxiliar=tabla[valor1];
            tabla[valor1]=tabla[valor2];
            tabla[valor2]=auxiliar;
        }
        int desordenada[]= Arrays.copyOf(tabla,tabla.length);
        return desordenada;
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}