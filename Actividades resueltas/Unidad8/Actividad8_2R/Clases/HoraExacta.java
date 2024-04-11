package Unidad8.Actividad8_2R.Clases;

public class HoraExacta {
    protected int hora, minutos, segundos;

    /**
     *
     * @param hora
     * @param minutos
     * @param segundos
     */
    public HoraExacta(int hora, int minutos, int segundos) {
        if (!setHora(hora)){
            System.out.println("La hora no es corecta");
        } else if (!setHora(hora) && !setMinutos(minutos)) {
            System.out.println("Las horas y minutos no son correctas");
        } else if (!setHora(hora) && !setMinutos(minutos) && !setSegundos(segundos)) {
            System.out.println("Las horas, los minutos y los segundos no son correctas");
        }
        if (!setMinutos(minutos)){
            System.out.println("Los minutos no son corecta");
        } else if (!setMinutos(minutos) && !setSegundos(segundos)) {
            System.out.println("Los minutos y los mminutos no son correctos");
        }
        if (!setSegundos(segundos)){
            System.out.println("Los segundos no son corecta");
        }

    }

    //metodo validar hora

    /**
     *
     * @param hora
     * @return
     */
    public boolean setHora(int hora) {
        boolean correcto = false;
        if (hora >= 0 && hora <= 23) {
            this.hora = hora;
            correcto = true;
        }
        return correcto;
    }

    /**
     *
     * @param minutos
     * @return
     */
    public boolean setMinutos(int minutos) {
        boolean correcto = false;
        if (minutos >= 0 && minutos <= 59) {
            this.minutos = minutos;
            correcto = true;
        }
        return correcto;
    }

    /**
     *
     * @param segundos
     * @return
     */
    public boolean setSegundos(int segundos) {
        boolean correcto = false;
        if (segundos >= 0 && segundos <= 59) {
            this.segundos = segundos;
            correcto = true;
        }
        return correcto;
    }



    public void incrementar() {
        this.segundos++;
        if (this.segundos > 59){
            this.segundos=0;
            this.minutos++;
            if (this.minutos > 59) {
                this.minutos = 0;
                this.hora++;
                if (this.hora == 23) {
                    this.hora = 0;
                }
            }
        }
    }

    @Override
    public String toString() {
        String horaMuestra;
        String minutosMuestra;
        String segundosMuestra;
        if (this.hora <= 9) {
            horaMuestra="0"+String.valueOf(this.hora);
        }else {
            horaMuestra=String.valueOf(this.hora);

        }
        if (this.minutos <= 9) {
            minutosMuestra="0"+String.valueOf(this.minutos);
        } else {
            minutosMuestra=String.valueOf(this.minutos);
        }
        if (this.segundos <= 9) {
            segundosMuestra="0"+String.valueOf(this.segundos);
        } else {
            segundosMuestra=String.valueOf(this.segundos);
        }
        return "Hora[" + horaMuestra + ":" +minutosMuestra + ":" +segundosMuestra+"]";
    }
}
