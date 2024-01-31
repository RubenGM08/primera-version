package Unidad3;

/**
 * Actividades De Ampliacion
 * Tema 3
 * Actividad 1.12
 * Modifica la Actividad de aplicación 3.11 para que el usuario pueda introducir un número
 * en binario y el programa muestre su conversión a decimal.
 */


import java.util.Scanner;

public class Actividad3_12_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Indica el numero binario para convertirlo en decimal -> ");
        int binario=sc.nextInt();
        int decimal=0;
        int base=1;
        while (binario!=0){
            int unidadBinaria=binario%2;
            binario/=10;
            decimal+=base*unidadBinaria;
            base*=2;
        }
            System.out.println("El numero binario en decimal es -> " + decimal);

    }
}