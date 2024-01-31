package Unidad3;

/**
 * Actividades De Ampliacion
 * Tema 3
 * Actividad 1.11
 * Realiza un programa que convierta un número decimal en su representación binaria. Hay
 * que tener en cuenta que desconocemos cuántas cifras tiene el número que introduce el
 * usuario.
 * Por simplicidad, iremos mostrando el número binario con un dígito por línea.
 */


import java.util.Scanner;

public class Actividad3_11_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el numero decimal -> ");
        int numero=sc.nextInt();

        while (numero!=0){
            int unidadBinaria=numero%2;
            numero/=2;
            System.out.println(unidadBinaria);
        }

    }
}
