package Unidad7.Actividad7_1R.Controlador;

import Unidad7.Actividad7_1R.Clases.CuentaCorriente;

import java.util.Scanner;

public class Main {
    static Scanner sc =new Scanner(System.in);
    public static void main(String[] args) {
        menu();

    }
    public static void menu(){
        int opcion=0;
        CuentaCorriente nuevoCliente=new CuentaCorriente();
        do {
            mostrar("***** B A N C O  P S I *****");
            mostrar("1. Crear Cliente");
            mostrar("2. Egresar");
            mostrar("3. Ingresar");
            mostrar("4. Mostrar");
            mostrar("5. Salir");
            mostrarSinLn("Indique su opcion->");
            opcion= sc.nextInt();
            switch (opcion){
                case 1->{
                    mostrar("Indique el nombre del Cliente");
                    String nombreT= sc.next();
                    sc.nextLine();
                    mostrar("Indique el DNI del Cliente");
                    String dniT= sc.next();
                    sc.nextLine();
                    if (!nombreT.equals("") || !dniT.equals("")) {
                        nuevoCliente.nombreCliente=nombreT;
                        nuevoCliente.dni=dniT;
                    }else{
                        mostrar("No se puede crear un cliente sin sus datos. Comience de nuevo");
                    }
                }
                case 2->{
                    if (nuevoCliente.nombreCliente!=null) {
                        mostrar("Indique el monto a Egresar");
                        double importe = sc.nextDouble();
                        if (nuevoCliente.egreso(importe)) {
                            mostrar("Egresando saldo...........");
                        }
                    }else{
                        mostrar("No existe Cliente para Egresar dinero");
                    }
                }
                case 3-> {
                    if (nuevoCliente.nombreCliente!=null) {
                        mostrar("Indique el importe a Ingresar");
                        double ingreso = sc.nextDouble();
                        nuevoCliente.ingresar(ingreso);
                        mostrar("Ingresando saldo..............");
                    }else{
                        mostrar("No existe Cliente para Ingresar saldo");
                    }
                }
                case 4-> {
                    if (nuevoCliente.nombreCliente!=null) {
                        nuevoCliente.mostrarInfo();
                    }else{
                        mostrar("No existe Cliente que mostrar");
                    }
                }
                case 5-> mostrar("Saliendo.........");
                default -> mostrar("Opción no válida");
            }
        }while(opcion!=5);

    }
    public static void mostrar(String texto) {
        System.out.println("\t" + texto);
    }

    public static void mostrarSinLn(String texto) {
        System.out.print("\t" + texto);
    }
}