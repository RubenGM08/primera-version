package Unidad3;

import java.util.Scanner;

public class SalidasAnticipadasContinuas {
    /**
     * Hacer una lista de la clase, y saltar los que se llamen "Manuel"
     *
     *
     */
    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        String nombres="";
        String todosLosNombres="";
        for (byte i=1; i<=14; i++){
            System.out.print("Indica tu nombre -> ");
            nombres=sc.nextLine();
            if (nombres.equals("Manuel")|| nombres.equals("manuel")){
                continue;
            }
            todosLosNombres+=nombres+"\n";
        }
    System.out.println("****Alumnos ****\n" + todosLosNombres);
    }
}
