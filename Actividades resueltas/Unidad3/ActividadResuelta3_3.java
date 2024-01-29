package Unidad3;

/**
 * Tema 3
 * Actividad resuelta 3.3
 * Codificar el juego «el número secreto», que consiste en acertar un número entre 1 y 100
 * (generado aleatoriamente). Para ello se introduce por teclado una serie de números, para
 * los que se indica: «mayor» o «menor», según sea mayor o menor con respecto al número
 * secreto. El proceso termina cuando el usuario acierta o cuando se rinde (introduciendo un -1)
 *
 */

import java.util.Scanner;

public class ActividadResuelta3_3 {
    public static void main(String[] args) {

        //Declaramos el Escaner
        Scanner sc = new Scanner(System.in);

        //Inicializamos las variables
        int numero, numAleatorio, numintentos= 0;
        numAleatorio= (int) (Math.random()*100+1);

        //Pedimos que intente adivinar un numero aleatorio con numAleatorio= (int) (Math.random()*100+1)
        System.out.println("Vamos a adivinar un numero aleatorio entre el 1 y el 100");
        System.out.print("Introduce un numero entero= ");
        numero=sc.nextInt();

        //Utilizamos el bucle while para que tenga dos opciones que adivine el numero o que ponga el -1 para salirse
        while (numero!=numAleatorio && numero!=-1 ){
            // Utilizamos el if-else para saber si el numero aleatorio es mayor o menor al numero que ponemos
            if (numero>numAleatorio){
                System.out.println("El numero es menor");
            } else {
                System.out.println("El numero es mayor");
            }
            //
            numintentos++;
            System.out.println("");

            System.out.println("Intentalo otra vez= ");
            numero=sc.nextInt();
        }
        System.out.println("El numero que intentas adivar es= " + numAleatorio);
        System.out.println("El numero de intentos que lo has conseguido es= " + numintentos);
        
        
    }
}
