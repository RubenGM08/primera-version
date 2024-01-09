package controlador;
import java.lang.*;
import java.time.LocalTime;
import java.time.LocalDate;
import java.util.Scanner;

public class Segundo {
    public static void main(String[] args) {

        String nombre = "Rubén";
        String apellido1 = "García";
        String apellido2 = " Matéos";
        System.out.println("Mi nombre es= " + nombre + " y mis apellidos son " + apellido1 + apellido2);
        System.out.println("Mi nombre es= " + nombre.toUpperCase() + " y mis apellidos son " + apellido1.toUpperCase() + apellido2.toUpperCase());
        System.out.println("Mi nombre es= " + nombre.toLowerCase() + " y mis apellidos son " + apellido1.toLowerCase() + apellido2.toLowerCase());
        LocalDate hoy=LocalDate.now(); // el ide automaticamente te importa la api que necesitas
        System.out.println(hoy);
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("El valor de c es= " + c );
        c= c - a; //c=6 -> La variable puede cambiar de valor mientras se ejecuta el programa
        System.out.println("Ahora el valor de c es= " + c);
        /* CONSTANTES-> al valor una vez declarado no cambia mientras se ejecuta el programa*/
        final int MAYORDEEDAD= 18;
        LocalTime hora= LocalTime.now();
        System.out.println("La hora es= " + hora);
        Double calculo=Math.pow(5,3);
        System.out.println(calculo);
        //para calcular la raiza cuadrada de un número es Math.squrt(numero)
        Double raizCuadrada=Math.sqrt(16);
        System.out.println("La raiz cuadrada de 16 es " + raizCuadrada);
        System.out.print("Es una prueba");
        System.out.print("Es otra prueba");
        System.out.println("");//salto de linea
        System.out.print("");// no hay salto de linea

        /* Entrada de datos por consola con la Clase Scanner*/
        Scanner sc= new Scanner(System.in); // tipo System.in indica que captura los datos del teclado
//        System.out.print("Indica tu nombre -> ");
//        // La siguiente linea lo indica es qeue los que escriba el usuario se guardara en la variable nombreUsuario
//        String nombreUsuario=sc.nextLine();
//        System.out.println("El usuario se llama " + nombreUsuario);
//        System.out.print("Indica tu edad: ");
//        short edad= sc.nextByte();
//        System.out.println("Tu edad es " + edad);
//        short nuevaEdad= (short) (edad+1);
//        System.out.println("El año que viene tendras " + nuevaEdad + " años.");
//        System.out.println("Indica el año de nacimiento -> ");
//        short anioNac= sc.nextShort();
//        short edadCalculada = (short) (2024-anioNac);
//        System.out.println("Tu edad calculada es " + edadCalculada + " años.");

        System.out.println("Indica el precio del articulo ->");
        Double precio = sc.nextDouble();

    }
}
