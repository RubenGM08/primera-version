package Unidad2;

/**
 * Tema 2
 * Actividades resueltas 2.11
 * Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que tener en
 * cuenta que existen meses con 28, 30 y 31 días (no se considerará los años bisiestos).
 *
 */

import java.util.Scanner;

public class ActividadResuelta2_12 {
    public static void main(String[] args) {

        //Declaramos el escaner
        Scanner sc= new Scanner(System.in);

        //Inicializamos las variables enteras y boolean
        int dia, mes, ano;
        boolean fechaCorrecta;


        //Pedimos el día que es
        System.out.print("Cual día es= ");
        dia=sc.nextInt();

        //Pedimos el mes que es
        System.out.print("Cual mes es= ");
        mes=sc.nextInt();

        //Pedimos el año que es
        System.out.print("Cual año es= ");
        ano=sc.nextInt();

        if (ano == 0){ // el único año que no existe es el 0
            fechaCorrecta= false;
        } else if (mes == 2 && (1 <= dia && dia <= 28)) { //veremos si es un mes de 30 días
            fechaCorrecta=true;
        } else if ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && (1 <= dia && dia <= 31)) { // veremos si un mes tiene 30 días
            fechaCorrecta= true;
        } else { // en cualquier otro caso
            fechaCorrecta= false;
        }
        if (fechaCorrecta) {
            System.out.println("Fecha OK: " + dia + "/" + mes + "/" + ano);
        } else {
            System.out.println("Fecha incorrecta");
        }

    }
}
