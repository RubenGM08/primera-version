package Unidad7.Actividad7_8R.Controller;

import Unidad7.Actividad7_8R.Clases.SintonizadorFM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion, opcionRadio;
        int contador=0;
        double frecuenciaRadio;

        SintonizadorFM sintonizadorFM= new SintonizadorFM();
        do {
            mostrar("_____________________________");
            mostrar("|        - M E N Ú -        |");
            mostrar("|         -----------    |");
            mostrar("|    1    -----------    |");
            mostrar("|         -----------    |");
            mostrar("|         -----------         |");
            mostrar("|                           |");
            mostrar("|___________________________|");
            mostrarSinLn("Vamos a escuchar la radio:"+"\n\t1. Para encenderla"+"\n\t2. Para apagarla"+"\n\tIndica tu opcion-> ");
            opcion=sc.nextInt();
            if(opcion==1){
            contador++;
            mostrarSinLn("Cual es la frecuencia que buscas-> ");
            frecuenciaRadio= sc.nextInt();
            sintonizadorFM.setFrecuencia(frecuenciaRadio);
                do {
                    mostrar("   ***** RADIO FM *****  ");
                    mostrar("");
                    mostrar("1. Aumentar la frecuencia");
                    mostrar("2. Bajar la frecuencia");
                    mostrar("3. Mostrar frecuencia");
                    mostrar("4. Dejar frecuencia");
                    mostrarSinLn("Indica la opcion-> ");
                    opcionRadio=sc.nextInt();

                    switch (opcionRadio){
                        case 1:{
                            sintonizadorFM.up();
                            break;
                        }
                        case 2:{
                            sintonizadorFM.down();
                            break;
                        }
                        case 3:{
                            sintonizadorFM.display();
                            break;
                        }
                        case 4:{
                            mostrar("Dejando frecuencia.......");
                        }
                        default:{
                            System.out.println("Solo puedes elegir la opcion del 1 al 4");
                        }
                    }
                } while (opcionRadio!=4);

            } else if (opcion==2) {
                if (contador>=1){
                    mostrar("Apagando la radio");
                } else {
                    mostrar("\n\tLa radio ya esta apagada");
                }
            }


        } while (opcion!=2);
    }

    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrar(String texto) { System.out.println("\t" + texto); }


    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }


}
