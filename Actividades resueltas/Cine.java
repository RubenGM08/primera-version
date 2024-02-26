import java.util.Scanner;

/**
 *          |---Mayores -----> 6 €
 * Peliculs|
 *          |---Menores -----> 4,50€
 * <p>
 * Miercoles----> 4,50€
 * <p>
 *                          |--- Mayores de edad solo
 * Cartelera----> Pelicula |
 *                          |--- Menores de edad solo
 * <p>
 * Carnet joven/Senior ---> 4,50€
 * <p>
 * Ferrari (TP)                 -Pobres Criaturas (+18)
 * Piscilla (+12)               -La Piscina (+18)
 * Peppa´s Cinema Party (TP)    -Cazadores de Demonios(+18)
 */

public class Cine {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        //Variables
        final double precioNino= 4.50;
        double precioAdulto= 6.0; // no lo hacemos final porque si es miercoles, lo actualizamos a 4.50
        double totalEntrada=0;
        int adultos, ninos;
        byte miercoles;
        byte opcion;
        /* Menu de opcion */
        System.out.println("************************************");
        System.out.println("******      Cartelera Cine     *****");
        System.out.println("*** 1. Ferrari                   ***");
        System.out.println("*** 2. Piscilla                  ***");
        System.out.println("*** 3. Peppa´s Cinema Party      ***");
        System.out.println("*** 4. Pobres Criaturas          ***");
        System.out.println("*** 5. La Piscina                ***");
        System.out.println("*** 6. Cazadores de Demonios     ***");
        System.out.println("*** 6. Facturar y Salir          ***");
        System.out.println("************************************");
        System.out.println("¿Es miércoles?");
        System.out.println("\t1. Si \n\t2. No");
        System.out.print("Respuesta ->");
        miercoles= sc.nextByte();
        if (miercoles==1){
            precioAdulto=4.50;
        }
        do{
            System.out.print("Indica la Pelicula a ver->");
            opcion = sc.nextByte();
            switch (opcion){
                case 1,2,3->{
                    System.out.println("Nº de niños ->");
                    ninos= sc.nextInt();
                    totalEntrada=ninos*precioNino;
                    System.out.println("Nº de adultos ->");
                    adultos= sc.nextInt();
                    totalEntrada=adultos*precioAdulto;
                }
                case 4,5,6->{
                    System.out.println("Nº de adultos->");
                    adultos= sc.nextInt();
                    totalEntrada=adultos*precioAdulto;
                }
                case 7-> System.out.println("...... Imprimiendo sus entradas........");

                default -> System.err.println("Opcion no valida");

            }
        } while (opcion!=7);
        System.out.println("--------Entradas --------------");
        System.out.println("Importe a pagar-> " + totalEntrada);
        System.out.println("-------------------------------");

    }
}
