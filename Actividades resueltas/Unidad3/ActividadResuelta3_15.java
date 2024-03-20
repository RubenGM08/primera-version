package Unidad3;

import java.util.Scanner;

/**
 * Tema 3
 * Actividad Resuelta 3.15
 * Pedir por consola un número n y dibujar un triángulo resctángulo de n elementos de lado,
 * utilizando para ello asteriscos (*). por ejemplo, para n = 4:
 *
 *  * * * *
 *  * * *
 *  * *
 *  *
 *
 */
public class ActividadResuelta3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Indica cuantos números de  * tendra el triangulo -> ");
        int n=sc.nextInt();
        //bucles dependientes
        for (int fila=1; fila<=n;fila++){
            for (int col=fila; col<=n;col++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
