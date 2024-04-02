package Unidad7.Actividad7_10R.Clases.Maquinaria;

import Unidad7.Actividad7_10R.Clases.Personal.Maquinista;

import java.util.Arrays;

public class Tren {
    Locomotora locomotora;
    Vagon vagones[]; //Array de vagones, que no puede ser mas de 5 vagones
    Maquinista maquinistaResponsable;
    private int numVagones;

    public Tren(Locomotora locomotora, Maquinista maquinistaResponsable) {
        this.locomotora = locomotora;
        this.maquinistaResponsable = maquinistaResponsable;
        //crear el array con un máximo de 5 vagones
        vagones=new Vagon[5];
        numVagones=0; //se inicializa en numero de vagones...
    }

    public void engancharVagon(int cargaMax,double cargaActual,String mercancia){
        if (numVagones>5){
            System.out.println("No es posible enganchar mas vagones");
        }else {
            Vagon v=new Vagon(numVagones,cargaMax,cargaActual,mercancia);
            vagones[numVagones]=v;
            numVagones++;
        }
    }

    public void engancharVagon(Vagon vagonListo){
        if (numVagones > 5) {
            System.out.println("No es posible enganchar más vagones");
        } else {
            vagones[numVagones]=vagonListo;
            numVagones++;
        }
    }

    @Override
    public String toString() {
        return "Tren{" +
                "locomotora=" + locomotora +
                ", vagones=" + Arrays.toString(vagones) +
                ", maquinistaResponsable=" + maquinistaResponsable +
                ", numVagones=" + numVagones +
                '}';
    }
}
