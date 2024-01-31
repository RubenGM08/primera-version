package Unidad3;

import java.util.Scanner;

public class SalidasAnticipadas {
    public static void main(String[] args) {

        /**
         * Ejemplo: Indica la edad para entrar al pub, solo puede entrar los mayores de 18, y quiero saber cuantas personas
         * estan han entrado porque el aforo es de 100 personas
         *
         * Indica la edad -> si es menor de 18 no entra y no cuenta, si es mayor y el aforo lo permite, entra, sino.... el
         * programa se interrumpe porque no puede tener dentro del local mas de 100 personas....
         *
         *
         */
        //declaraciones
        Scanner sc = new Scanner(System.in);
        int edad;
        byte menores=0;
        for (int i=1; i<=5; i++){
            System.out.print("Indica la Edad ->");
            edad=sc.nextInt();
            if (edad<18){
                System.out.println("No tienes permitido el acceso al local");
                i--;
                menores++;
            }
            if (i==5){
                System.out.println("Han intentado entrar " + menores + "menores de edad");
                System.out.println("****** Aforo Completo ********");
                break;
            }





        }














    }
}
