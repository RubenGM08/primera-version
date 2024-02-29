package Unidad4;

import java.util.Scanner;

public class PasarMetros {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

    System.out.println("Vamos a pasar de kilos a Toneladas, Libras, Onza, Gramo o Miligramos");
    System.out.println("Cuantos kilos quieres pasar a las cantidades -> ");
    double kilos= sc.next().charAt(0);
    convertir(kilos);

    }


    public static void convertir(double kilos) {

        char opcionP;
        do {
            System.out.println("-------CONVERSOR DE MASA-------");
            System.out.println("\ta-> Toneladas");
            System.out.println("\tb-> Libras");
            System.out.println("\tc-> Onza");
            System.out.println("\td-> Gramo");
            System.out.println("\te-> Miligramos");
            System.out.println("Indica la moneda a convertir");
            opcionP= sc.next().charAt(0);

            switch (opcionP){
                case 'a' -> {
                    System.out.println(kilos+ "kg = " + kilos/1000+" Toneladas");
                    break;
                }
                case 'b' -> {
                    System.out.println(kilos+ "kg = " + kilos*2.205+" Libras");
                    break;
                }
                case 'c' -> {
                    System.out.println(kilos+ "kg = " + kilos*35.274 +" Onza");
                    break;
                }
                case 'd' -> {
                    System.out.println(kilos+ "kg = " + kilos*1000+" Gramo");
                    break;
                }
                case 'e' -> {
                    System.out.println(kilos+ "kg = " + kilos*1e+6 +" Miligramos");
                    break;
                }
                case 'x' -> {
                    System.out.println("¿Estas seguro de salir?");
                    opcionP= sc.next().charAt(0);
                    if (opcionP!='x'){
                        convertir(kilos);
                    }
                }
                default -> System.out.println("Opcion no V A L I D A");
            }

        } while (opcionP!='x');











    }
}

