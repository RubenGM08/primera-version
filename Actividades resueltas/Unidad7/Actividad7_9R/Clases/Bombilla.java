package Unidad7.Actividad7_9R.Clases;

/**
 * Tema 7
 * Actividad Resuelta 7.9
 * Modelar una casa con muchas bombillas, de forma que cada bombilla se pueda enceder
 * o apagar individualmente. Para ello, hacer una clase Bombilla con una variable privada
 * que indique si está encendida o apagada, así como un método que nos difa el estado de
 * una bombilla concreta. Además, queremos poner un interruptor general, de forma que si
 * este se apaga,todas ñas bombillas quedan apagadas. Cuando el interruptor general se
 * activa, las bombullas quedan apagadas,segýn estuvieran antes. Cada
 * bombilla se encienda y se apaga individualmente, peros solo responde que está encendida
 * si su interruptor está activadp y además hoy luz general
 */

public class Bombilla {
    private boolean interruptor;

    public static boolean interruptorGenral=true;

    //Metodo Constructor

    public Bombilla(){
        this.interruptor=false;
    }
    //apagar
    public void apagar(){
        this.interruptor=false;
    }
    public void encender(){
        this.interruptor=true;
    }

//    public void apagarEncender(){
//        this.interruptor= !this.interruptor;
//    }


    //Valimos si el interruptor General esta encendido y el interruptor de la bombilla

    public boolean estado(){
        if (interruptorGenral && interruptor){ //si el interruptorGenral=true y interruptor=true
            return true;
        } else {
            return false;
        }
        //equivalente a-> return interruptorGeneral && interruptor
    }
    //Mostamos el estado
    public String mostraEstador(){
        if (estado()){
            return "ON";
        } else {
            return "OFF";
        }

    }

}
