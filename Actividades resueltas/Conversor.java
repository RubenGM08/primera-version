import java.util.Scanner;

public class Conversor {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Indique en Euros el monto a convertir -> ");
        double euros= sc.nextDouble();
        menu(euros);

    }

    public static void menu(double euros) {

        char opcion;
        do {
        System.out.println("--------CONVERSOR DE MONEDA--------");
        System.out.println("\ta-> Libras");
        System.out.println("\tb-> Yen Japones");
        System.out.println("\tc-> Dolar EEUU");
        System.out.println("\td-> Dolar Canada");
        System.out.println("\tx-> Salir");
        System.out.println("Indica la moneda a convertir");
        opcion=sc.next().charAt(0);//0 significado que toma el 1 caracter
        // cadena 012345 posiciones de un texto

        switch (opcion){
            case 'a' -> {
                System.out.println(euros+ "€ = " + euros*0.8562+" GBP");
                break;
            }
            case 'b' -> {
                System.out.println(euros+ "€ = " + euros* 163.24+" Yen Japones");
                break;
            }
            case 'c' -> {
                System.out.println(euros+ "€ = " + euros* 1.0838 +" $ USA");
                break;
            }
            case 'd' -> {
                System.out.println(euros+ "€ = " + euros* 1.4711+" $ Canada");
                break;
            }
            case 'x' -> {
                System.out.println("¿Estas seguro de salir?");
                opcion= sc.next().charAt(0);
                if (opcion!='x'){
                    menu(euros);
                }
            }
            default -> System.out.println("Opcion no V A L I D A");
        }

        } while (opcion!='x');











    }
}
