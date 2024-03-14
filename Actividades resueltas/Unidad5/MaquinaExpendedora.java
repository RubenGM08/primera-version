package Unidad5;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @description Aplicacion para una máqina expendedorar de golosinas. Tema: Array
 * @autor Irina Meina
 * @version 1.0 14/03/2024 *
 */

public class MaquinaExpendedora {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    /**
     * Muestra el menu de la aplicación
     */

    public static void menu() {
        //Array de las Golosinas
        String[][] golosinas={
                {"Kitkat","Chicles de Fresa","Lacasitos","Palotes"},
                {"Kinder Bueno","Bolsa Haribo","Chettos","Twix"},
                {"Galletas OREO", "M&M`s","Patatas Fritas","Chicles de Menta"},
                {"Milkybar","KitKat Blanco", "Galleta Oreo Fresa", "Huesitos"}
        };
        //Arrays de precios
        double[][]precios={
                {1.5, 1.0, 1.65, 1.10},
                {2.2, 2.20, 1.0, 1.05},
                {1.25, 2.0, 2.50, 1.0},
                {3.0, 1.5, 1.25, 1.50}
        };
        //Array de Stock
        int[][] stock = new int[4][4];
        stock=rellenarMaquina(stock,5);
//         mostrar(Arrays.deepToString(stock));
        boolean salir=false; //Para validar un bucle del menu
        double totalVentaEuros=0, pagoGolosina, pagoGolosinaRestante;
        int opcion, fila, columna, cantidadStrock;
        int pos;

        // desarrollamos el menu
        while (!salir){//!variable booleana indica que es falso-> mientras sea salir falso se repite while
            //opciones
            System.out.println(" ");
            mostrar("________________________________________________");
            mostrar("|   M A Q U I N A   D E    G O L O S I N A S   |");
            mostrar("|                                              |");
            mostrar("|   1. Pedir Golosinas                         |");
            mostrar("|   2. Mostrar Golosinas                       |");
            mostrar("|   3. Rellenar Stock (Admin)                  |");
            mostrar("|   4.Apagar Máquina                           |");
            mostrar("|                                              |");
            mostrar("|______________________________________________|");
            mostrarSinLn("Indique su opcion->");
            opcion= sc.nextInt();
            switch (opcion){
                case 1->{
                    //Pedir las golosinas
                    mostrarSinLn("Indique la posicion de la Golosina a comprar-> ");
                    pos=sc.nextInt();
                    //tenemos que validar que la posicion sea >=0 y <=33
                    if (pos>=0 && pos<=3 || pos>10 && pos<=13 || pos>=20 && pos <=23 || pos>=30 && pos<=33 ){
                        //calculamos el valor de la fila
                        fila=(pos%100)/10;
                        columna=pos%10;
                        //llamar un metodo que controle el stock y me diga tru o false si hay cantidad suficiente a vender
                        if (controlDeStock(stock,fila,columna)){
                            mostrar("Precio producto " + precios[fila][columna]);
                            mostrarSinLn("Ingresa el dinero-> " );
                            pagoGolosina= sc.nextDouble();
                            mostrar("Ha ingresado en la maquina " + pagoGolosina);
                            if (pagoGolosina<precios[fila][columna]){
                                System.err.println("\tLe falta por ingresar-> " + (precios[fila][columna]-pagoGolosina));
                                System.err.print("\tIngrese la cantidad->");
                                pagoGolosinaRestante= sc.nextDouble();
                                double cambio = precios[fila][columna]- pagoGolosinaRestante;
                                mostrar("Su cambio es-> " + cambio);
                            } else {
                                double cambio = pagoGolosina-precios[fila][columna];
                                mostrar("Su cambio es-> " + cambio);
                            }

                            mostrar("Disfruta de tu " + golosinas[fila][columna]);
                            stock[fila][columna]--;
                            totalVentaEuros+=precios[fila][columna];
                        }else {
                            mostrar("No hay " + golosinas[fila][columna]+ " en la maquina");
                        }
                    } else {
                        mostrar("Opcion no admitida");
                    }
                }
                case 2->{
                    //mostrar todos los codigos, las golosinas de el y su precio
                    mostrarGolosinas(golosinas,precios);
                }
                case 3->{
                    //solicitara la contraseña del técnico y luego llamar la funcion de rellenara
                    mostrar("Ingrese la contraseña autorizada->");
                    String pass= sc.next();sc.nextLine();
                    //validamos que el tecnico introduce la contraseña correcta
                    if (pass.equals("macarrones")){
                        mostrar("..........Respondiendo la Maquina");
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 4; j++) {
                                mostrarSinLn("A");

                            }
                            mostrarSinLn(".");
                        }
                    rellenarMaquina(stock,5);
                    } else {
                        mostrar("Usuario no autoriado");
                    }
                }
                case 4->{
                    //mostrar lo recolectado en las ventas de la máquina (cierre de caja)
                    mostrar("La maquina ha vendido-> " + totalVentaEuros + " €");
                    salir=true;
                }
                default -> {
                    System.err.println("Opcion no valida");
                }

            }

        }
    }

    /**
     * Métodos para mostrar las posiciones, los nombres de las golosinas y su precio
     * @param golosinas
     * @param precios
     */

    public static void mostrarGolosinas(String golosinas[][], double precios[][]){
        //necesitamos recorrer el array de nombres y con posicion obtenemos el precio
        for (int i = 0; i < golosinas.length; i++) {
            for (int j = 0; j < golosinas[i].length; j++) {
                mostrar(i+" "+ j + " " + golosinas[i][j] + " " + precios[i][j]);
            }
        }
    }



    /**
     * Metodo que se utiliza para rellenar el stock de la máquina al inicio y cuando va el técnico
      * a reponer stock
     * @param stock
     * @param valor
     * @return
     */


    public static int[][] rellenarMaquina(int stock[][], int valor){
        //inicializamos el array de stock de cada golosina en 5
        for (int i = 0; i < stock.length; i++) {
            for (int j = 0; j < stock[i].length; j++) {
                stock[i][j]=valor; //valor que se envia como parámetro
            }

        }
        return stock;
    }

    /**
     * Método para controlar el stock mediante booleanos
     * @param stock
     * @param fila
     * @param columna
     * @return
     */

    public static boolean controlDeStock(int stock[][], int fila, int columna) {
        if (stock[fila][columna]==0) {
            return false;
        } else {
            return true;
        }
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
