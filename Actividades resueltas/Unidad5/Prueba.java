package Unidad5;
import java.util.Arrays;
import java.util.Scanner;

public class Prueba {

    public static void main(String[] args) {
        // La declaracion de un array a tabla debe contener 3 elementos
        //1. El tipo de edad
        //2. El nombre de la variables
        //3. La longitud

        int[] edad=new int[5];
        edad[0]=23;
        edad[1]=52;
        edad[2]=18;
        edad[3]=32;
        edad[4]=15;

        System.out.println(Arrays.toString(edad));
        //Ejemplo, solicitar con Scanner las edades..
        //Solicitar 1º cuantas edades voy a insertar..
        Scanner sc = new Scanner(System.in);
        mostrar("Indique el número de edades a insertar");
        int longitud= sc.nextInt();//se guarda la longitud con que voy a crear el array
        byte[] edades=new byte[longitud]; //creamos el array con la longitud leida
        //necesitamos preguntar las edades, para ello vamos a crear un bucle for sencillo para
        //que recorra las posiciones del array e inserte los valores
        for (int i=0;i<longitud;i++){
            mostrar("Indique la Edad Nº " + (i+1));
            edades[i]= sc.nextByte();
        }
//        System.out.println(Arrays.toString(edades));
        //bucle foreach    : bucle para recorrer tablas
        for (int ed:edades){ //se declara una variable llamada elemento y que recorre el array
            System.out.println("La edad insertadaº"+ ed);
        }
        //Metodos de la API de Java sobre los arrays
        //Conocer la longitud de un arry
        mostrar("Longitud del array Edad-> " + edad.length);
        mostrar("Longitud del array Edades-> " + edades.length);
        for (int i=0; i<edad.length;i++){
            mostrar("La edad insertada en la posicion "+ (i+1)+" es-> " +edad[i]);
        }
        //Referencias en los arrays, variables, etc
        mostrar("*************REFERENCIAS DE MEMORIA*************");
        System.out.println(edad);
        System.out.println(edades);
    }

    public static void mostrar(String texto) {
        System.out.println("\t"+texto);
    }


}
