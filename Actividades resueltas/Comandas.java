import java.util.Scanner;

/**
 * Enunciado: Crear un programa que permita a traves de un menu (Tortilla, Croquetas, Jamón y Queso,Bebidas)
 * Indicar lo que el cliente solicita, y mostrar el total de su pedido, tomando en cuentam, los precios:
 * Tortilla: 2€
 * Croquetras: 8€
 * Jamon y Queso: 15€
 * Bebidas: 3€
 */

public class Comandas {
    public static void main(String[] args) {

        //Variables
        int cuenta=0;
        byte opcion=0;
        double iva= 0.21;
        int cantidad= 0;
        String detallePedido="";
        System.out.println("****************************");
        System.out.println("***** Carta del Menu    ****");
        System.out.println("** 1. Tortilla        3€  **");
        System.out.println("** 2. Croqutas        8€  **");
        System.out.println("** 3. Jamon y Queso  15€  **");
        System.out.println("** 4. Bebida          3€  **");
        System.out.println("** 5. Nada Más            **");
        System.out.println("****************************");
        /* Crear un bucle con el menu */
        do {
            System.out.println("");
            System.out.println("¿Que desea pedir del menu?");
            Scanner sc = new Scanner (System.in);
            opcion=sc.nextByte();

            switch (opcion){
                case 1->{
                    System.out.println("Cantidad -> ");
                    cantidad= sc.nextInt();
                    cuenta+=(3*cantidad);
                    detallePedido+=cantidad + " Tortilla\n";
                }
                case 2->{
                    System.out.println("Cantidad -> ");
                    cantidad= sc.nextInt();
                    cuenta+=(8*cantidad);
                    detallePedido+=cantidad + "Croquetas\n";
                }
                case 3->{
                    System.out.println("Cantidad -> ");
                    cantidad= sc.nextInt();
                    cuenta+=(15*cantidad);
                    detallePedido+=cantidad + "Jamón y Queso\n";
                }
                case 4->{
                    System.out.println("Cantidad -> ");
                    cantidad= sc.nextInt();
                    cuenta+=(3*cantidad);
                    detallePedido+=cantidad + "Bebida\n";
                }
                case 5->{
                    System.out.println(".....Generando su cuenta.....");
                }

                default -> {
                    System.err.println("Opcion no valida");
                }
            }
        }while (opcion!=5);
        System.out.println("\n\n******** Factura Simplificada *******");
        System.out.println("\tPedido-> \n" + detallePedido);
        System.out.println("\tImporte a pagar-> \n" + cuenta + "€");
        System.out.println("\tCon Iva es -> " + (cuenta*iva) + "€");
        System.out.println("************************************");

//        System.out.printf("%15.2f",iva);







    }
}
