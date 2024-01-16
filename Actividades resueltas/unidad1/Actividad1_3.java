package unidad1;

import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Pregunta la edad que tiene el usuario
        int edad;
        System.out.print("Escribe tu edad= " );
        edad= sc.nextInt();
        System.out.println("Tu edad es = " + edad + " años");

        //Te dice la edad que tiene el proximo año
        int edadSiguienteAño;
        edadSiguienteAño= ++edad;
        System.out.println("El siguiente año tendras = " +edadSiguienteAño + " años");
    }
}
