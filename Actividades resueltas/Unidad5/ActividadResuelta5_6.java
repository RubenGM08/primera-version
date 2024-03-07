package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Tema 5
 * Actividad resuelta 5.6
 * Definir una función que tome parametros dos tablas, la primera con los 6 números
 * de una apuesta de la primitiva, y la segunda (ordenada) con los 6 números de la
 * combinación ganador. La función devolvera el número de aciertos.
 */
public class ActividadResuelta5_6 {
    public static void main(String[] args) {
        int conbinacionGandora[]=new int [6];
        int numero;
        for (int i = 0; i < 6; i++) {
            numero =(int) (Math.random()*49+1);
            //si el random duplica un numero en l aprimitiva eso se da, por lo que hay que validar!
            //hay que hacer una busqueda en el array
            int indice=0;
            while (indice< conbinacionGandora.length && conbinacionGandora[indice]!=(numero)){
                indice++; // se incrementa el indice para ir recorriendo las posiciones del arry
            }
            if (indice>=conbinacionGandora.length){
                conbinacionGandora[i]=numero;
            } else {
                i--;
            }
        }
        Scanner sc = new Scanner(System.in);
        mostrar("- Indice tu apuesta -");
        int apuesta[]=new int[6];
        for (int i = 0; i < apuesta.length; i++) {
            mostrarSinLn("Número " + (i+1) + " ");
            apuesta[i]= sc.nextInt();

        }

        mostrar(Arrays.toString(apuesta));mostrar(Arrays.toString(conbinacionGandora));
        mostrar("Numero de Aciertos en tu Apuesta " + primitiva(apuesta,conbinacionGandora));
    }

    public static int primitiva(int apuesta[], int ganadora[]) {
        int aciertos=0;
        Arrays.sort(apuesta);
        Arrays.sort(ganadora);
        for (int ele:apuesta){
            //como la tabla ganadora esta ordenada utilizando el binarySearch
            if (Arrays.binarySearch(ganadora,ele)>=0){
                aciertos++; //hemos acertado ese numero
            }
        }

        return aciertos;
    }

    public static void mostrar(String texto) { System.out.print("\t" + texto); }

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }






}
