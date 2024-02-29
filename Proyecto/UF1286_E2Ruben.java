import java.util.Scanner;

/**
 * Proyecto Final
 * Ruben Garcia Mateos
 * Una empresa que se dedica a la venta de Aceite de Oliva   necesita una aplicación en java
 * para gestionar las facturas. En cada factura figura: el código del artículo, la cantidad vendida
 * en litros y el precio por litro.
 */

public class UF1286_E2Ruben {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        byte opcion, opcionCompraProducto, totalBotellasUnLitro=0,totalBotellasTresLitro=0, totalBotellasCincoLitro=0, totalBotellas=0;
        final double unLitro= 9.99 ;
        final double tresLitros= 29.99 ;
        final double cincoLitros= 49.95 ;
        double preciototal=0;
        byte botellasUnLitro = 0, botellasTresLitros = 0, botellasCincoLitro = 0;




        do{

            /* Menu de opcion */
            System.out.println("***************************");
            System.out.println("******      Menú      *****");
            System.out.println("*** 1. Facturar         ***");
            System.out.println("*** 2. Salir y Pagar    ***");
            System.out.println("*****                 *****");
            System.out.println("***************************");
            System.out.println("\nElige la opcion que quieras -> ");
            opcion= sc.nextByte();

            if (opcion==1){
                System.out.println("\n¿Caul Producto quieres elegir?");
                System.out.println("1. 1 botella de un litro ");
                System.out.println("2. 1 garrafa de 3 litros");
                System.out.println("3. 1 garrafa de 5 litros");
                do {
                    System.out.println("Elige la opcion que quieras -> ");
                    opcionCompraProducto= sc.nextByte();
                    switch (opcionCompraProducto){
                        case 1 ->{
                            System.out.println("Has elegido la opcion 1 -> 1 botella de 1 litro ");
                            System.out.print("¿Cuantas botellas de 1 litro desea comprar? -> ");
                            botellasUnLitro= sc.nextByte();
                            preciototal+= botellasUnLitro * unLitro;
                            totalBotellasUnLitro+= botellasUnLitro;
                            System.out.println("El precio de la cesta es -> " + preciototal + "€");
                            System.out.println(" ");
                            System.out.println("¿Desea seguir comprar o quiere pagar ya?");
                            System.out.println("\t-Si quiere comprar mas garrafas pulse 1");
                            System.out.println("\t-Si dessea terminar la compra pulse 2\n");
                        }

                        case 2 -> {
                            System.out.println("Has elegido la opcion 2 -> 1 botella de 3 litro ");
                            System.out.print("¿Cuantas botellas de 3 litros desea comprar? -> ");
                            botellasTresLitros= sc.nextByte();
                            preciototal+= botellasTresLitros * tresLitros;
                            totalBotellasTresLitro+= botellasTresLitros;
                            System.out.println("El precio de la cesta es -> " + preciototal + "€");
                            System.out.println(" ");
                            System.out.println("¿Desea seguir comprar o quiere pagar ya?");
                            System.out.println("\t-Si quiere comprar mas garrafas pulse 1");
                            System.out.println("\t-Si dessea terminar la compra pulse 2\n");
                        }

                        case 3 -> {
                            System.out.println("Has elegido la opcion 3 -> 1 garrafa de 5 litro ");
                            System.out.print("¿Cuantas botellas de 5 litros desea comprar? -> ");
                            botellasCincoLitro= sc.nextByte();
                            preciototal+= botellasCincoLitro * cincoLitros;
                            totalBotellasCincoLitro+= botellasCincoLitro;
                            System.out.println("El precio de la cesta es -> " + preciototal  + "€");
                            System.out.println(" ");
                            System.out.println("¿Desea seguir comprar o quiere pagar ya?");
                            System.out.println("\t-Si quiere comprar mas garrafas pulse 1");
                            System.out.println("\t-Si dessea terminar la compra pulse 2\n");
                        }
                        default -> System.err.println("Solo puedes elegir la opcion del 1 al 3");
                    }
                } while (opcionCompraProducto==1 && opcionCompraProducto==2 && opcionCompraProducto==3);
            } else if (opcion==2) {
                System.out.println("\n\n******** Factura Simplificada *******");
                System.out.println("Ha comprado un total de " + totalBotellas + " botellas");
                System.out.println("\tPedido-> ");
                System.out.println("\t-" + totalBotellasUnLitro + " botellas de 1 litro");
                System.out.println("\t-" + totalBotellasTresLitro + " botellas de 3 litros");
                System.out.println("\t-" + totalBotellasCincoLitro + " botellas de 5 litros");
                System.out.println("El precio total de la compra que ha realizado es -> " + preciototal);
                System.out.println("\nGracias por su compra ❤\uFE0F");
                System.out.println("************************************");
            } else {
                System.err.println("Solo puedes elegir una opcion del 1 al 2");
            }

        } while (opcion!=2);


    }
}
