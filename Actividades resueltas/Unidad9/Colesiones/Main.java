package Unidad9.Colesiones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * Para crear un ArrayList
         */
        ArrayList<String> color = new ArrayList<>();

        //color.add va añadiendo colores a las lista de Array
        color.add("Red");
        color.add("Blue");
        color.add("Green");

        //Mostrar lo que muestra en el Array List
        System.out.println("Array List: " + color);


        /**
         * Para quitar un Array List, pidiendo la posicion que queramos
         */
        ArrayList<String> colors = new ArrayList<>();
        System.out.println(" ");
        System.out.println("Metodo para quitar un ArrayList pidiendo la posicion que queramos quitar");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");

        //Crear una variable String y quitar el color en la posicion 1.
        //Se va ha quitar el "Blue"
        String quitarColor = colors.remove(1);

        //Mostrar lo que muestra en el Array List
        System.out.println("Array List: " + colors);
        //Mostrar el Array que hemos quitado de la lista
        System.out.println("Quitar color: " + quitarColor);


        //Crear un ArrayList
        ArrayList<String> clothes = new ArrayList<>();
        System.out.println(" ");
        System.out.println("ArrayList para mostrarnos lo que busacmos en la posicion indica");
        clothes.add("Jacket");
        clothes.add("Shirt");
        clothes.add("Pullover");
        System.out.println("Array List: " + clothes);
        //Crear una variable String que nos va ha mostrar con la posicion que hemos dado
        //lo que hay en esa posicion con la funcion .get
        //Ejemplo= clothes.get(2) -> Pullover
        String str = clothes.get(2);

        //Nos muestra con el ,get lo que hemos pedido en la posicion
        System.out.println("Elemento at index 2: " + str);

        /**
         * Metodo para cambiar el color por su posicion
         * Ejemplo: Cambiar en la posicion 2 Green -> Yellow
         */
        ArrayList<String> colores = new ArrayList<>();

        System.out.println(" ");
        System.out.println("Metodo para mdificar el color de nuestro ArrayList");
        System.out.println("Con nuestra posicion y el color que nueo que vamos a poner en esa posicion:");
        //color.add va añadiendo colores a las lista de Array
        colores.add("Red");
        colores.add("Blue");
        colores.add("Green");

        System.out.println("Array List: " + colores);

        //Crear una variable String y quitar el color en la posicion 1.
        //Se va ha quitar el "Blue"
        String modificarColores = colores.set(2, "Yellow");

        //Mostrar lo que muestra en el Array List
        System.out.println("Array List: " + colores);
        //Mostrar el Array que hemos quitado de la lista
        System.out.println("Modificar Color: " + modificarColores);


        /**
         * Metodo para saber la longitud de nuestro ArrayList se utiliza el
         * metodo .size()
         */
        ArrayList<String> colorPosicion = new ArrayList<>();
        System.out.println(" ");
        System.out.println("Metodo para saber la longitud de nuestro ArrayList");
        //color.add va añadiendo colores a las lista de Array
        colorPosicion.add("Red");
        colorPosicion.add("Blue");
        colorPosicion.add("Green");

        //Mostrar lo que muestra en el Array List
        System.out.println("Array List: " + colorPosicion);
        //Para saber la longitud de nuestro ArrayList se utiliza "colorPosicion.size()"
        System.out.println("Longitud del ArrayList: " + colorPosicion.size());


        /**
         * Metodo para ordenar un ArrayList tipo Interger
         */
        ArrayList<Integer> ages = new ArrayList<>();
        System.out.println(" ");
        System.out.println("Metodo para ordenar un ArrayList tipo Interger");
        ages.add(34);
        ages.add(25);
        ages.add(15);
        ages.add(5);

        System.out.println(ages);
        Collections.sort(ages);

        for (int i : ages) {
            System.out.println(i);
        }

    }
}
