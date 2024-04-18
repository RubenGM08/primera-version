package Unidad9.Actividad9_7R_y_9_8R.Controller;

import Unidad9.Actividad9_7R_y_9_8R.Modell.Socio;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    //Voy a crear socios en alta, y lo agrego a esta lista...
    static ArrayList<Socio> Lista=new ArrayList<>();
    static int opcion;
    static String nombre, fnT;
    public static void main(String[] args) {

//        Socio s1 = new Socio(4, "Manuel", "23/03/2005");
//        Socio s2 = new Socio(5, "Jose " , "15/02/2000");
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1);
//        System.out.println(s2);

        /**
         * Crear un menu, insertar los datos, despues guardarlos....ArrayList->Colección
         *
         *          C R U D     CREAR - LEER - ACTUALIZAR - BORRAR
         *          R E P E
         *          E A O L
         *          A D A E
         *          T   T T
         *          E   E E
         */
        menu();
    }

    public static void menu(){
        do {
        mostrar("C R U D   DE    SOCIOS");
        mostrar("1. Alta de Socio");
        mostrar("2. Listas Socios");
        mostrar("3. Actualizar Socio por Id");
        mostrar("4. Eliminar Socio por Id");
        mostrar("5. Salir");
        mostrar("Elige tu opcion-> ");
        opcion= sc.nextInt();
            switch (opcion){
                case 1->Lista.add(altaSocio());

                case 2->mostrarListaSocio();
                case 3->{
                    //Para buscar un elemento y nos diga su posicion, utilizar si es de tipo String indexOf
                    int idA= leerID();
                    for (Socio e:Lista){
                        if (e.getId() == idA){
                            System.out.println(e.toString());
                            int posicion= Lista.indexOf(e);
                            mostrar("Posicion-> " + posicion);
                            break;
                        }
                    }
                }
            }
        }while (opcion!=5);

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

    public static int leerID(){
        int idLeido;
        mostrarSinLn("Indique el Id del Socio->");
        idLeido=sc.nextInt();
        return idLeido;
    }

    public static Socio altaSocio(){
        int idT=leerID();
        mostrarSinLn("Nombre->");
        nombre= sc.next();sc.nextLine();
        mostrarSinLn("Fecha de nacimiento-> (yyyy-MM-dd)");
        fnT= sc.next();sc.nextLine();
        Socio socio1=new Socio(idT,nombre,fnT);
        return socio1;
    }


    public static void mostrarListaSocio(){
        for (Socio e:Lista){
            System.out.println(e.toString()+"\n");
        }
    }

}
