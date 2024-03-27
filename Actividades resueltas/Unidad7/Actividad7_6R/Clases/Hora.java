package Unidad7.Actividad7_6R.Clases;

public class Hora {

    private byte hora; //atributos de tipo byte: más que suficiente para los valores
    private byte minuto; //que tenmos que guardar
    private byte segundos;

    public byte getHora() {
        return hora; //devuelve las horas
    }

    public void setHora(byte hora) {
        if (0 <=hora && hora<= 23){
            this.hora= hora;
        } else {
            this.hora = 0; //si el valor está fuera de rango, lo ponemos a 0
        }
    }

    public byte getMinuto() {
        return minuto; //devuelve los minutos
    }

    public void setMinuto(byte minuto) {
        if (0 <=minuto && minuto<= 59){
            this.minuto= minuto;
        } else {
            this.minuto = 0; //si el valor está fuera de rango lo ponemos a 0
        }
    }

    public byte getSegundos() {
        return segundos;
    }

    public void setSegundos(byte segundos) {
        if (0 <=segundos && segundos<= 59){
            this.segundos= segundos;
        } else {
            this.segundos = 0; //si el valor está fuera de rango lo ponemos a 0
        }
    }

    public void incrementaSegundo(){
        segundos++;
        if (segundos==60){
            segundos=0;
            minuto++;
            if (minuto==60){
                minuto=0;
                hora++;
                if (hora==24){
                    hora=0;
                }
            }
        }
    }
}