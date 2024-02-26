import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        //tipos de datos -> Las declaraciones de las variables tienen que ser llamadas con su tuipo de dato. Ej int total;
        int total= 0; //se puede inicializar en el momento de declaracion o luego dentro de la ejecucion del programa
        String poblacion;
        String nombreUsuario;
        int habitantes;

        //Luego tenemos las declaraciones de la clase Scanner que nos permite leer la informacion que solicitamos, siempre
        //relacionado con el tipo de dato que se va ha escribir
        //Declaración
        Scanner sc = new Scanner (System.in);
        //Ej: Solicita el Nombre, la pblación y el numero de habitantes, y acumulado hasta que sean las 5 capitales de provincias de CLM
        //Sumar el total de habitantes de las 5 capitales


        //condicionales

        //bucles
        //Utilizamos un bucle desde 1 hasta 5 y lee los datos.
        for (int i=1; i<=5; i++){

            System.out.println("Indica la provincia->");
            poblacion=sc.nextLine();
            System.out.println("Indica el número de habitantes ->");
            habitantes=sc.nextInt();sc.nextLine();
            System.out.println("Indica el nombre->");
            nombreUsuario= sc.nextLine();
            //Condicional -> si el numero de habitantes es menor que 20000, indicar que hay un error y restar 1 a i para que vuelva a solicitar la inf.
            if (habitantes<20000){
                i--;
                System.out.println("Los habitantes de " + poblacion + " son mas de " + habitantes + ". Vuelve a insertar la informacion.");
            } else {
                total += habitantes;
            }

        }
        System.out.println("El numero de habitantes de CLM es -> " + total);

    }
}
