package unidad1;

import java.util.Scanner;

/**
 * Pregunta al usuario si es mayor de edad
 * Si lo es puedes pasar
 * Si no lo es hay que poner "vete a dormir bebe"
 *
 */

public class Enunciado4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Pon tu edad= ");
        short edad= sc.nextShort();

        String mayorDeEdad= 18<=edad ? "Puedes pasar": "Vete a dormir bebe";
        System.out.println(mayorDeEdad);

    }
}
