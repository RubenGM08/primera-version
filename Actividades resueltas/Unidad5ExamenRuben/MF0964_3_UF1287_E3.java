package Unidad5ExamenRuben;

import java.util.Scanner;

/**
 * Examen Tema 5
 * @author Rubén García Mateos
 * Desarrolla un programa java para ser usado por los camareros de un restaurante, que
 * sirva para tomar nota de los menús que los clientes van a tomar.
 * Primero, realiza un menú, por ejemplo-> [1. Crear Orden | 2. Modificar Orden | 3. Salir]
 * Primer dato a introducir por el camarero es el número de comensales que tendrá que
 * estar en el rango de 1-6, ya que no hay mesas de más de cinco comensales. El valor
 * introducido debe asegurarse de que se encuentra en el rango definido.
 * Entonces el camarero tiene que introducir el menú seleccionado por cada cliente.
 * Tenemos tres menús: #1,#2 y #3. Puedes identificar cada menú por el número: menú 1,
 * menú 2 o menú 3.
 * Una vez introducidos todos los datos, el programa imprimirá por pantalla los menús
 * solicitados por cada comensal.
 * Tienes que emplear un array para registrar los menús que tomará cada comensal. Ten en
 * cuenta que la dimensión de dicho array tendrá que definirse en ejecución, ya que no
 * sabemos a priori cuántos comensales vamos a tener.
 * Adicional, confirma la orden con los comensales y si existe alguna modificación, tener la
 * posibilidad de cambiar la orden.
 * EJEMPLO DE SALIDA:
 * <p>
 *    Introduce el número de comensales (máximo 6):3
 * <p>
 *               - MENÚ -
 *    [1] Patatas fritas con albóndigas
 * <p>
 *    [2] Salmón ahumado con patatas horneadas
 * <p>
 *    [3] Lentejas con chorizo
 * <p>
 *    Introduce el menú pedido por el comensal 1 :1
 * <p>
 *    Introduce el menú pedido por el comensal 2 :2
 * <p>
 *    Introduce el menú pedido por el comensal 3 :3
 * <p>
 *             - ORDEN -
 * <p>
 *    Comensal 1 va a tomar el menú ->1
 * <p>
 *    Comensal 2 va a tomar el menú ->2
 * <p>
 *    Comensal 3 va a tomar el menú ->3
 * <p>
 *    ¿La orden es correcta? [1-Si] [2-No]->2
 * <p>
 *    Indique que comensal modificar->1
 * <p>
 *    Introduce el menú pedido por el comensal 1 :2
 * <p>
 *             - ORDEN -
 * <p>
 *    Comensal 1 va a tomar el menú ->2
 * <p>
 *    Comensal 2 va a tomar el menú ->2
 * <p>
 *    Comensal 3 va a tomar el menú ->3
 * <p>
 *    ¿La orden es correcta? [1-Si] [2-No]->2
 * <p>
 *    Indique que comensal modificar->2
 * <p>
 *    Introduce el menú pedido por el comensal 2 :1
 * <p>
 *             - ORDEN -
 * <p>
 *    Comensal 1 va a tomar el menú ->2
 * <p>
 *    Comensal 2 va a tomar el menú ->1
 * <p>
 *    Comensal 3 va a tomar el menú ->3
 * <p>
 *    ¿La orden es correcta? [1-Si] [2-No]->1
 *
 *    Gracias, en breve le traemos la comida.
 *
 *
 */

public class MF0964_3_UF1287_E3 {

    //Opcion es que el usuario tiene que indicar la opcion del menú
    static int opcion;

    //numUsuariosMesa -> es una varable int que te indentifica cuantos usuarios hay en una mesa, que lo introduciria
    //el usuario si pulsa el 1 en el menu
    static int numUsuariosMesa;

    //Un contador para saber la gente que ha comido esa opcion del menu
    static int contadorPFA=0, contadorSAPH=0, contadorLCC=0;

    //Declaramos el Escaner static para utilizarlo en todo el codigo en vez de declarar un Escaner a cada funcion
    static  Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        tomarNota();
    }

    static void tomarNota(){

        //Utilizamos un bucle en el que se va ha ir repitiendo hasta que el Usuario no indique la opcion 2
        while (opcion!=2){

            //El menu de un restaurante
            System.out.println("  ");
            mostrar("_____________________________");
            mostrar("|        - M E N Ú -        |");
            mostrar("|                           |");
            mostrar("|   1. Crear orden          |");
            mostrar("|   2. Salir                |");
            mostrar("|                           |");
            mostrar("|___________________________|");


            mostrarSinLn("Indique su opcion->");
            opcion= sc.nextInt();

            switch (opcion){
                case 1 -> {
                    int[] usuMesa;
                    do {
                        mostrar("\nHola buenas, bienvenido al restaurante");
                        mostrarSinLn("¿Mesa para cuantas personas?-> ");
                        usuMesa = new int[sc.nextInt()];
                    } while (usuMesa.length < 1 || usuMesa.length > 6);
                    mostrar("Vale, mesa para " + usuMesa.length + " personas");
                    pedidoUsuario(usuMesa);
                    mostrarOrden();
                }

                //Muestra lo que se ha pedido en forma de carta
                case 2 -> mostrar("Gracias, en breve le traemos la comida.\n");
                //Creamos un default para que muestre un mensaje que solo puede elegir una opcion del 1 al
                default -> System.err.println("Solo puedes elegir la opcion desde el 1 hasta el 2");
            }
        }
    }

    public static int[] pedidoUsuario(int usuMesa[]) {
        for (int i = 0; i < usuMesa.length; i++) {
            System.out.println("   ");
            mostrar("________________________________________________");
            mostrar("|                 - M E N Ú -                  |");
            mostrar("|                                              |");
            mostrar("|  [1] Patatas fritas con albóndigas           |");
            mostrar("|  [2] Salmón ahumado con patatas horneadas    |");
            mostrar("|  [3] Lentejas con chorizo                    |");
            mostrar("|                                              |");
            mostrar("|______________________________________________|");

            mostrar("El Usuario " + (i + 1) + " desea pedir del menú-> ");
            int opcionMenu = sc.nextInt();

            mostrar("¿Desea cambiar la opción seleccionada? (1->Si, 2->No): ");
            int cambiarOpcion = sc.nextInt();

            if (cambiarOpcion == 1) {
                i--; // Volver a la iteración anterior para seleccionar una nueva opción
                continue;
            }

            switch (opcionMenu) {
                case 1 -> contadorPFA++;
                case 2 -> contadorSAPH++;
                case 3 -> contadorLCC++;
                default -> System.err.println("Opción no válida");
            }
        }
        return usuMesa;
    }

    public static void mostrarOrden() {
        mostrar("_____________________________________________________");
        mostrar("|             - M E N Ú    P E D I D O-             |");
        mostrar("|                                                   |");
        mostrar("|   Usted ha pedido:                                |");
        mostrar("|   " + contadorPFA + " Patatas fritas con albóndigas                 |");
        mostrar("|   " + contadorSAPH + " Salmón ahumado con patatas horneadas          |");
        mostrar("|   " + contadorLCC + " Lentejas con chorizo                          |");
        mostrar("|                                                   |");
        mostrar("|___________________________________________________|");
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