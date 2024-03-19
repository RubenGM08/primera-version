package Unidad6;

/**
 * Tema 6
 * Actividad resuelta 6.1
 * Escribir un programa que muestre todos los caracteres Unicode junto a su code point, cuyo
 * valor este comprendido entre \u0000 y \uFFFF.
 */
public class ActividadResuelta6_1 {
    public static void main(String[] args) {
        for(int codePoint = 0x0000; codePoint <= 0xFFFF; codePoint++) {
            String xxxx = Integer.toHexString(codePoint); //convierte un número en su
            //representación hexadecimal
            System.out.println("\\u" + xxxx + ": " + (char)codePoint);
        }
    }
}
