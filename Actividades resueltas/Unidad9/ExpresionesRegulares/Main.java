package Unidad9.ExpresionesRegulares;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import java.util.EnumSet;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static String[] validacion={"DNI / NIE ","Pasword","Username","EMAIL","MATRICULA","Telefono",
            "URL","Solo Letras","Codigo postal","Fecha (dia, mes, año)","IP","Tarjeta de Credito",
            "Cuenta Bancaria","ISBN","Solo numeros"};

    public static void main(String[] args) {
        /**
         *
         * Validaciones
         * DNI / NIE
         * Pasword
         * Username
         * EMAIL
         * MATRICULA
         * TELEFONO
         * URL
         * SOLO LETRAS
         * COGIDO POSTAL
         * FECHA (dia, mes, año)
         * IP
         *
         */

        int opcion = 0;
        do {
            mostrar("____________________________________________");
            mostrar("|       M E N U    DE    VALIDACIONES       |");
            mostrar("|   1. DNI / NIE                            |");
            mostrar("|   2. Pasword                              |");
            mostrar("|   3. Username                             |");
            mostrar("|   4. EMAIL                                |");
            mostrar("|   5. MATRICULA                            |");
            mostrar("|   6. Telefono                             |");
            mostrar("|   7. URL                                  |");
            mostrar("|   8. Solo Letras                          |");
            mostrar("|   9. Codigo postal                        |");
            mostrar("|   10. Fecha (dia, mes, año)               |");
            mostrar("|   11. IP                                  |");
            mostrar("|   12. Tarjeta de Credito                  |");
            mostrar("|   13. Cuenta Bancaria                     |");
            mostrar("|   14. ISBN                                |");
            mostrar("|   15. Solo numeros                        |");
            mostrar("|    0. Salir                               |");
            mostrar("|___________________________________________|");
            boolean comprobarOpcion=false;
            do {
                try {
                    mostrarSinSln("Indica tu opcion-> ");
                    opcion=sc.nextInt();
                    comprobarOpcion=true;
                }catch (Exception e){
                    mostrar("Solo puedes poner numeros enteros");
                    sc.next();
                }
            }while(!comprobarOpcion);

            switch (opcion){
                case 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15->{
                    boolean resultado= ejecutarValidaccion(textoValidar(opcion),opcion);
                    mostrarMensaje(resultado,opcion);
                }
                case 0->mostrar("Adios.........");
                default -> mostrar("Solo numericos");
            }


        }while (opcion!=0);




    }


    //Metodo común para la lectura del texto a validar
    public static String textoValidar(int opcion){
        mostrarSinSln("Indique " + validacion[opcion-1] + "-> ");
        String texto=new Scanner(System.in).nextLine();
        return texto;
    }

    public static boolean ejecutarValidaccion(String texto, int opcion){
        boolean exito=false;
        switch (opcion){
            case 1->{
                if (texto.matches("\\b\\d{8}[A-HJ-NP-TV-Z]\\b")){
                    String[] letraDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
                    int numeros= Integer.parseInt(texto.substring(0,8));
                    int posicion=numeros%23;
                    if (texto.substring(8, 9).equalsIgnoreCase(letraDNI[posicion])) {
                        exito=true;
                    }
                }
            }
            //exito= texto.matches("\\b\\d{8}[A-HJ-NP-TV-Z]\\b"); //Expresion Regulada para el DNI
            case 2->exito= texto.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!¡¿?])(?=\\S+$).{8,}$"); //Expresion Regulada para el Password
            case 3->exito= texto.matches("^[a-zA-Z0-9_]{3,16}$"); //Expresion Regulada para el Username lo declaramos con longitud 8 y aceptamos solos letras y numeros
            case 4->exito= texto.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$"); //Expresion Regulada para el correo Electonico
            case 5->{
                char primerDigito=texto.substring(0,1).charAt(0);
                if (Character.isDigit(primerDigito)){
                    exito=texto.matches("^[0-9]{4}[A-Z]{3}$"); //Expresion Regulada para la Matricula Española
                } else if (Character.isAlphabetic(primerDigito)) {
                    exito=texto.matches("^[A-Z0-9]{1,7}$"); //Expresion Regulada para la Matricula Europea
                }
            }
            case 6->exito= texto.matches("^\\+?[0-9]{6,}$"); //Expresion Regulada para el numero de Telefono
            case 7->exito= texto.matches("^(http|https)://[a-zA-Z0-9\\-\\.]+\\.[a-zA-Z]{2,3}(/\\S*)?$");
            case 8->exito= texto.matches("^[a-zA-ZáéíóúÁÉÍÓÚüÜñÑ]+$");
            case 9->exito= texto.matches("^\\d{5}$");
            case 10->{
                DateTimeFormatter f= DateTimeFormatter.ofPattern("dd/MM/yyyy");
                try{
                    LocalDate fecha= LocalDate.parse(texto,f);
                    if (texto.equals(fecha.format(f))){
                        exito=true;
                    }
                }catch (DateTimeParseException e){
                    exito=false;
                }
                exito= texto.matches("^(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[0-2])/(19|20)\\d{2}$");
            }
            case 11->exito= texto.matches("^((25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$");
            case 12->exito= texto.matches("^\\d{16}$");
            case 13->exito= texto.matches("^\\d{20}$");
            case 14->exito= texto.matches("^\\d{9}[0-9X]$");
            case 15->exito= texto.matches("^\\d+(\\.\\d+)?$");
        }
        return exito;
    }

    public static void mostrarMensaje(boolean resultado, int opcion){
        if (resultado) {
            mostrar(validacion[opcion-1] + "-> es Correcta");
        } else{
            mostrar(validacion[opcion-1] + "-> no es Correcta");

        }
    }

    public static void mostrar(String texto){
        System.out.println("\t"+texto);
    }

    public static void mostrarSinSln(String texto){
        System.out.print("\n"+texto);
    }
}
