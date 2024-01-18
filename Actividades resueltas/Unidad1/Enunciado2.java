package unidad1;

/**Enunciado: 2.
 * En una tienda, se requiere calcular el porcentaje de descuento de un producto, por lo que debes
 * solicitar el precio del producto y el porcentaje a aplicar, y calcular el precio total
 */

import java.util.Scanner;

public class Enunciado2 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        double precioProducto, descuentoProducto, totalProducto, restaProducto= 0, finalProducto;

        System.out.println("Vamos a realizar una compra y quiero que pongas el precio y el descuento.");
        System.out.println("");

        System.out.print("Escribe le precio del producto: ");
        precioProducto = sc.nextDouble();

        System.out.print("Escribe el descuento que quieres aplicar: ");
        descuentoProducto = sc.nextDouble();

        totalProducto= ((precioProducto * descuentoProducto)/100);
        restaProducto= totalProducto - restaProducto;
        finalProducto= precioProducto - restaProducto;
        System.out.println("El precio del producto con el descuento es: " + restaProducto);

        System.out.println("ç");
        System.out.println("El precio del producto es: " + precioProducto);
        System.out.println("El final es: " + finalProducto);


    }
}
