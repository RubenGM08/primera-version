package Unidad9.Actividad9_7R_y_9_8R.Controller;

import Unidad9.Actividad9_7R_y_9_8R.Modell.Socio;

import java.util.ArrayList;
import java.util.Scanner;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.InputMismatchException;
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
            System.out.println("____________________________________________");
            System.out.println("|           C R U D   DE   SOCIOS          |");
            System.out.println("|   1. Alta de Socio                       |");
            System.out.println("|   2. Listar Socios Ordenado por Id       |");
            System.out.println("|   3. Actualizar Socio por Id             |");
            System.out.println("|   4. Eliminar Socio por Id               |");
            System.out.println("|   5. Eliminar                            |");
            System.out.println("|__________________________________________|");

            try {
                System.out.println("Indique su opcion-> ");
                opcion=sc.nextInt();
            }catch (Exception e){
                System.out.println("Error->" + e);
                System.out.println("Solo se aceptan opciones del 1 al 5");
                sc.next();
            }
            switch (opcion){
                case 1->{
                    int idT=idExiste(leerID());
                    Lista.add(altaSocio(idT));
                }
                case 2->mostrarListaSocio();
                case 3->{
                    int idA= leerID();
                    altualizarEliminar(idA,3);
                }
                case 4->{
                    int idA= leerID();
                    altualizarEliminar(idA,4);
                }
                case 5-> {
                    System.out.println("Adios.........");
                }
                default -> System.out.println("Opcion no valida");
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
        int idLeido=-1;
        do {
            try {
                mostrarSinLn("Indique el Id del Socio->");
                idLeido=sc.nextInt();

            }catch (InputMismatchException e){
                mostrar("**El formato no es correcto, solo números**");
                sc.next();
            }
        }while (idLeido==-1);
        return idLeido;
    }

    public static int idExiste(int idT){
        while (buscarPosicon(idT)>=0){
            mostrarSinLn("**Número de ID existe**");
            idT=leerID();
        }
        return idT;
    }

    public static int buscarPosicon(int id){
        int posicion=-1;
        for (Socio e:Lista){
            if (e.getId() == id){
                posicion=Lista.indexOf(e); //Index.of nos duelve la psocion del elemento buscado.
                break;
            }
        }
        return posicion;
    }

    public static Socio altaSocio(int idT){
        boolean fechaCorrecta=false;

        String fnT=null;
        mostrarSinLn("Nombre-> ");
        String nomT= new Scanner(System.in).nextLine();
        while (!contieneSoloLetras(nomT)){
            mostrarSinLn("El nombre debe vontener solo letras-> ");
            nomT= new Scanner(System.in).nextLine();
        }
        do {
            try {
                mostrarSinLn("Feca de Nacimiento (DD/MM/AAAA)");
                fnT= new Scanner(System.in).nextLine();
                DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                LocalDate fechaNacimiento=LocalDate.parse(fnT,f);
                fechaCorrecta=true;
            }catch (DateTimeParseException e){
                mostrar("**El formato n es correcto. Indique una fecha Valida**");
            }
        }while (!fechaCorrecta);
        return new Socio(idT,nomT,fnT);
    }

    public static void altualizarEliminar(int idAE,int opcion){
        int posicion = buscarPosicon(idAE);
        String accion=opcion==3?"Actualización":"Eliminación";
        if (posicion>=0 && opcion==3){
            Socio socioActualizar=altaSocio(idAE);
            mostrar("Datos Actuales-> " + Lista.get(posicion));
            mostrar("Datos a actuaizar-> " + socioActualizar);
            if (confirmacion()){
                Lista.set(posicion,socioActualizar);
                mensajeExito(accion);
            }else {
                mensajeNoRealizado(accion);
            }
        }
        if (posicion>=0 && opcion==4){
            if (confirmacion()){
                Lista.remove(posicion);
                mensajeExito(accion);
            }else {
                mensajeNoRealizado(accion);
            }
        }
        if (posicion<0 && opcion==3 || posicion<0 && opcion==4){
            mostrar("**El ID indicado no corresponde a ningún Socio**");
        }
    }

    public static void mostrarListaSocio(){
        for (Socio e:Lista){
            System.out.println(e.toString()+"\n");
        }
    }

    public static boolean confirmacion(){
        boolean confirmado=false;
        mostrarSinLn("Esta seguro de hacer los cambios [S para Si] o [Cualquier letra para NO]");
        String confirmar=new Scanner(System.in).nextLine();
        if (confirmar.equalsIgnoreCase("S")){
            confirmado=true;
        }
        return confirmado;
    }

    public static void mensajeExito(String accion){
        mostrar("***********************************************");
        mostrar("**"+accion+" realizada correctamente.........**");
        mostrar("***********************************************");
    }

    public static void mensajeNoRealizado(String accion){
        mostrar("***********************************************");
        mostrar("**No se ha realizado ninguna "+accion+" ** ");
        mostrar("***********************************************");
    }

    public static boolean contieneSoloLetras(String texto){
        //Expresion regulada que verifica si el texto contiene solo letras (mayúsculas  minusculas)
        return texto.matches("[a-zA-Z\\s]+");
    }

}