package Unidad4;

import java.util.Scanner;

public class Actividad4_11_ {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a calcular la superficie y el volumen de una esfera");

        System.out.print("Dame el radio de la esfera -> ");
        double radio = sc.nextDouble();

        System.out.println("La Superficie de la Esfera es -> " + SuperficieEsfera(radio));
        System.out.println("El Volumen de la Esfera es -> " + VolumnEsfera(radio));

    }

    public static double SuperficieEsfera(double radio) {

        double superficie;

        superficie= ((4*Math.PI)*(Math.pow(radio, 2)));

        return superficie;
    }

    public static double VolumnEsfera(double radio) {

        double volumen;

        volumen=((4*Math.PI)/3)*(Math.pow(radio, 3)) ;

        return volumen;
    }


}
