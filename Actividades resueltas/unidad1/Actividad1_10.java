package unidad1;

import java.util.Scanner;

/**
 * Actividad 1_10
 *  Diseñar un algoritmo que nos indique si podemos salir a la calle. Existen aspectos que
 *  influirán en esta decisión: si está lloviendo y si hemos terminado nuestras tareas. Solo
 *  podremos salir a la calle si no está lloviendo y hemos finalizado nuestras tareas. Existe una
 *  opción en la que, indistintamente de lo anterior, podremos salir a la calle: el hecho de que
 *  tengamos que ir a la biblioteca (para realizar algún trabajo, entregar un libro, etc.).
 *  Solicitar al usuario (mediante un booleano) si llueve, si ha finalizado las tareas y si necesita ir
 *  a la biblioteca. El algoritmo debe mostrar mediante un booleano (tru o false) si es
 *  posible que se le otorgue permiso para ir a la calle.
 *
 */


public class Actividad1_10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean llover, terminarTarea, irBiblioteca;

        System.out.println("¿Esta lloviendo? (true/false)");
        llover=sc.nextBoolean();
        System.out.println("");
        System.out.println("¿Has terminado tus deberes? (true/false)");
        terminarTarea=sc.nextBoolean();
        System.out.println("");








    }
}
