package Unidad3;

import java.util.Scanner;

public class ActividadResuelta3_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int operando1, operando2, resultado=0;
        int numeroAcertadas=0, resultadoUser=0;

        //
        do {
            operando1= (int) (Math.random()*100+1);
            operando2= (int) (Math.random()*100+1);
            resultado=operando1+operando2;
            System.out.print(operando1 + " + " + operando2 + "-> ");
            resultadoUser= sc.nextInt();
            numeroAcertadas++;

        } while (resultado==resultadoUser);
        --numeroAcertadas;
        System.out.println("Nº de sumas resueltas es=" + numeroAcertadas);



    }
}
