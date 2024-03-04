package Unidad5;

import java.util.Scanner;

/**
 * Tema 3
 * Actividad propuesta 5.3
 * Introduce por teclado un número n; a continuación, solicita al usuario que teclee n números.
 * Realiza la media de los números positivos, la media de los negativos y cuenta el
 * número de ceros introducidos
 */

public class ActividadPropuesta5_3 {

    public static void main(String[] args) {
        //socilitar cuantos números a insertar
        Scanner sc = new Scanner(System.in);
        mostrar("Indica el número de elementos a insertar -> ");
        int longitud= sc.nextInt();
        int numero[]=new  int[longitud];
        int contadorCeros=0;
        int contadorNegativos=0;
        int contadorPositivos=0;
        double mediaPositivos=0;
        double mediaNegativos=0;
        for (int i = 0; i < longitud; i++) {
            mostrar("Indica eñ elemento Nº" + i);
            numero[i]= sc.nextInt();
            if (numero[i]<0) {
                mediaNegativos+=numero[i];
                contadorNegativos++;
            } else if (numero[i]>0) {
                mediaPositivos+=numero[i];
                contadorPositivos++;
            } else {
                contadorCeros++;
            }
        }
        mediaNegativos/=contadorNegativos;
        mediaPositivos/=contadorPositivos;
        mostrar("La media de los " + contadorNegativos + " números Negativos ->" + mediaNegativos);
        mostrar("La media de los " + contadorPositivos + " números Negativos ->" + mediaPositivos);
        mostrar("Los 0 insertados son-> " + contadorCeros);

    }

    public static void mostrar(String texto) {
        System.out.println(texto);
    }
}
