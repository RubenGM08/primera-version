package unidad1;

import java.util.Scanner;

/**
 * Actividad 1_11
 * Un frutero necesita calcular los beneficios anuales que obtiene de la venta de manzanas
 * y peras. Por este motivo, es necesario diseñar una aplicación que solicite las ventas (en
 * kilos) de cada semestre para cada fruta. La aplicación mostrará el importe total
 * sabiendo que el precio del kilo de manzanas está fijado en 2,35 € y el kilo de peras en 1,95 €.
 */

public class Actividad1_11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final double PRECIOMANZANAS= 2.35;
        final double PRECIOPERAS= 1.95;
        /*
        double semestre1Manzanas, semestre2Manzanas, intTotalMan;
        double semestre1Peras, semestre2Peras, intTotalPer;
        double totalLosDos;

        //Te pide el kilos vendidos de Manzanas del 1ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Cuantas ventas has vendido en kilos de Manzanas en el 1ºtrimestre: ");
        semestre1Manzanas= sc.nextDouble();
        semestre1Manzanas*=PRECIOMANZANAS;
        System.out.println("El precio es: " + semestre1Manzanas);
        System.out.println("");

        //Te pide el kilos vendidos de Manzanas del 2ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Cuantas ventas has vendido en kilos de Manzanas en el 2ºtrimestre: ");
        semestre2Manzanas= sc.nextDouble();
        semestre2Manzanas*=PRECIOMANZANAS;
        System.out.println("El precio es: " + semestre2Manzanas);
        System.out.println("");

        //Te pide el kilos vendidos de peras del 1ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Cuantas ventas has vendido en kilos de Peras en el 1ºtrimestre: ");
        semestre1Peras= sc.nextDouble();
        semestre1Peras*=PRECIOPERAS;
        System.out.println("El precio es: " + semestre1Peras);
        System.out.println("");

        //Te pide el kilos vendidos de peras del 2ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Cuantas ventas has vendido en kilos de Peras en el 2ºtrimestre: ");
        semestre2Peras= sc.nextDouble();
        semestre2Peras*=PRECIOPERAS;
        System.out.println("El precio es: " + semestre2Peras);
        System.out.println("");


        // Muestra el dinero conseguido de Manzanas de los dos trimestres
        intTotalMan= semestre1Manzanas + semestre2Manzanas;
        System.out.println("El dinero conseguido de Manzanas de los dos trimestres es: " + intTotalMan);

        //Muestra el dinero conseguido de peras de los dos trimestres
        intTotalPer= semestre1Peras + semestre2Peras;
        System.out.println("El dinero conseguido de peras de los dos trimestres es: " + intTotalPer);

        //Total de los dos
        totalLosDos = intTotalMan + intTotalPer;
        System.out.println("El precio total de los dos es: " + totalLosDos);
        */

        double semestrePeras, semestreManzas;

        //Te pide el kilos vendidos de Peras del 1ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Ventas  kilos de Peras del 1ºtrimestre: ");
        semestrePeras= sc.nextDouble();
        System.out.println("Ventas  kilos de Peras del 2ºtrimestre: ");
        semestrePeras+=sc.nextDouble();
        System.out.println("El total de kilos es: " + semestrePeras);
        semestrePeras*= PRECIOPERAS;
        System.out.println("El precio es: " + semestrePeras);
        System.out.println("");

        //Te pide el kilos vendidos de Manzanas del 1ºTrimestre y lo multiplica por el precio y lo muestra en pantalla
        System.out.println("Ventas  kilos de Manzanas del 1ºtrimestre: ");
        semestreManzas= sc.nextDouble();
        System.out.println("Ventas  kilos de Manzanas del 2ºtrimestre: ");
        semestreManzas+=sc.nextDouble();
        System.out.println("El total de kilos es: " + semestreManzas);
        semestreManzas*= PRECIOMANZANAS;
        System.out.println("El precio es: " + semestreManzas);

        System.out.println("");



    }
}
