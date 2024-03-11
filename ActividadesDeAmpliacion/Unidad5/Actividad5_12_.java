package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Actividades De Ampliacion
 * Tema 3
 * Actividad 5.12
 * Escribe la función void desordenar(int t[]), que cambia de forma aleatoria los
 * elementos contenidos en la tabla t. Si la tabla estuviera ordenada, dejaría de estarlo.
 */

public class Actividad5_12_{

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
        return tabla;
    }

    public static void mostrar(String texto) { System.out.println("\t" + texto); }
    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }

}
