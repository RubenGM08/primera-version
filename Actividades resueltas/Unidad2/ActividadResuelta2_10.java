package Unidad2;

/**
 * Tema 2
 * Actividades resueltas 2.10
 * Pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma: insuficiente (de 0 a 4),
 * suficiente (5), bien (6), notable (7 y 8) y sobresaliente (9 y 10).
 *
 */

import java.util.Scanner;

public class ActividadResuelta2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;
        System.out.println("Vamos a mirar si has aprobado el examen");
        System.out.println("¿Cual es tu nota?= ");
        nota= sc.nextInt();
        
        if (0 <= nota && nota < 5){
            System.out.println("Te toca repetir el examen ;(");
        } else if (nota==5) {
            System.out.println("Al palo no lo tienes que recuperar");
        } else if (nota==6) {
            System.out.println("No esta mal vamos mejorando no tienes que recuperar");
        } else if (nota == 7 || nota == 8) {
            System.out.println("Felicidades un tremendo notable");
        } else if (nota == 9 || nota == 10) {
            System.out.println("Sobresaliente. Tu te matas estudiando sal a la calle un rato");
        }
    }
}
