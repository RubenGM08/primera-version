package Unidad7.Actividad_IVA_ENUM.Controller;

import Unidad7.Actividad_IVA_ENUM.Clases.Producto;
import Unidad7.Actividad_IVA_ENUM.Clases.TipoIva;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //crear un producto
        Scanner sc = new Scanner (System.in);
        System.out.print("Indica el nombre del producto-> ");
        String proT= sc.next();sc.nextLine();
        System.out.print("Indica la base del producto-> ");
        double baseT= sc.nextDouble();
        System.out.println("Indica el Iva-> \n1. General \n2. Reducida \n3. Super Reducido \n4. Excento");
        String iva= sc.next();sc.nextLine();
        Producto p1=new Producto(proT,baseT,TipoIva.valueOf(iva));
        System.out.println(p1.toString());
        System.out.println(p1.calcularIVA(baseT,p1.getIva().getPorcentaje()));
    }
}
