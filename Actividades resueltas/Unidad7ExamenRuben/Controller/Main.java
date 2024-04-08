package Unidad7ExamenRuben.Controller;

import Unidad7ExamenRuben.Clases.Calendario;

import java.util.Scanner;

/**
 * MF0964_3-UF1287-A14
 * @author Rubén García Mateos
 * Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La cla-se
 * debe disponer de los métodos:Calendario(int año, int mes, int dia): que crea un objeto
 * con los datos pasados como parámetros, siempre y cuando, la fecha que representen
 * sea correcta.void incrementarDia(): que incrementa en un día la fecha del
 * calendario.void incrementarMes(): que incrementa en un mes la fecha del
 * calendario.void incrementarAño(int cantidad): que incrementa la fecha del calendario en
 * el número de años especificados. Ten en cuenta que el año 0 no existió.void mostrar():
 * muestra la fecha por consola.boolean iguales(Calendario otraFecha): que determina si la
 * fecha invocante y la que se pasa como parámetro son iguales o distintas.Por
 * simplicidad, solo tendremos en consideración que existen meses con distinto núme-ro
 * de días, pero no tendremos en cuenta los años bisiestos.
 */


public class Main {
    public static void main(String[] args) {

        Calendario calendario;
        Scanner sc = new Scanner(System.in);
        int opcion, opcionMenu, dia, mes, ano;

        do {
            System.out.println("  ");
            System.out.println("_____________________________");
            System.out.println("|  - C A L E N D A R I O -  |");
            System.out.println("|                           |");
            System.out.println("|   1. Poner Fecha 👍       |");
            System.out.println("|   2. Salir 😒             |");
            System.out.println("|                           |");
            System.out.println("|___________________________|");
            System.out.print("Indica la opcion-> ");
            opcion= sc.nextInt();

            if (opcion==1){
                do {
                    System.out.println("Vamos a poner la Fecha que quieres");
                    System.out.print("Cual Dia quieres->");
                    dia= sc.nextInt();
                    System.out.print("Cual Mes quieres->");
                    mes= sc.nextInt();
                    System.out.print("Cual Año quieres->");
                    ano= sc.nextInt();
                    calendario=new Calendario(dia,mes,ano);

                }while (!calendario.comprobarCalendario());

                do {
                    System.out.println("");
                    System.out.println("_____________________________");
                    System.out.println("|  - C A L E N D A R I O -  |");
                    System.out.println("|                           |");
                    System.out.println("|   1. Icrementar dia       |");
                    System.out.println("|   2. Icrementar mes       |");
                    System.out.println("|   3. Icrementar año       |");
                    System.out.println("|   4. Terminar             |");
                    System.out.println("|                           |");
                    System.out.println("|___________________________|");
                    System.out.print("Cual opcion quieres-> ");
                    opcionMenu= sc.nextInt();
                    switch (opcionMenu){
                        case 1->{
                            calendario.incrementarDia();
                            calendario.fechaNopasar();
                            calendario.mostrarCalendario();
                        }
                        case 2->{
                            calendario.incrementarMes();
                            calendario.fechaNopasar();
                            calendario.mostrarCalendario();
                        }
                        case 3->{
                            calendario.incrementarAno();
                            calendario.fechaNopasar();
                            calendario.mostrarCalendario();

                        }
                        case 4-> System.out.println("Adios");

                        default -> System.out.println("Solo se puede elegir la opcion del 1 al 5");
                    }
                } while (opcionMenu!=5);

            } else if (opcion>2){
                System.out.println("Solo puedes elegir una opcion del 1 al 2 no mas😎");
            }

        }while (opcion!=2);

        System.out.println("Adios 😎 ✌️✌️️✌️");
    }
}
