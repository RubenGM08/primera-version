package Unidad7ExamenRuben.Clases;


/**
 * MF0964_3-UF1287-A14
 * @author Rubén García Mateos
 * Diseña la clase Calendario que representa una fecha concreta (año, mes y día). La cla-se
 * debe disponer de los métodos:Calendario(int año, int mes, int dia): que crea un objeto
 * con los datos pasados como parámetros, siempre y cuando, la fecha que representen
 * sea correcta.void incrementarDia(): que incrementa en un día la fecha del
 * calendario.void incrementarMes(): que incrementa en un mes la fecha del
 * calendario.void incrementarAño(int cantidad): que incrementa la fecha del calendario en
 * el número de años especificados. Ten en cuenta que el año 0 no existió.void mostrar():
 * muestra la fecha por consola.boolean iguales(Calendario otraFecha): que determina si la
 * fecha invocante y la que se pasa como parámetro son iguales o distintas.Por
 * simplicidad, solo tendremos en consideración que existen meses con distinto núme-ro
 * de días, pero no tendremos en cuenta los años bisiestos.
 */

public class Calendario {

    public int ano;
    public int mes;
    public int dia;

    public Calendario(int dia, int mes, int ano) {
        this.ano = ano;
        this.mes = mes;
        this.dia = dia;


    }

    /**
     * Metodo para incrementar un dia
     */

    public void incrementarDia(){
        dia++;

    }


    /**
     * Metodo para incrementar un mes
     */
    public void incrementarMes(){
        mes++;
    }

    /**
     * Metodo para incrementar un año
     */

    public void incrementarAno(){
        ano++;
    }

    /**
     * Metodo para mostrar los dias:meses:años
     */
    public void mostrarCalendario(){
        System.out.println(dia+ ":" + mes + ":" + ano);
    }

    /**
     * Metodo para comprobar que el Calendario cuando ponga los dias, meses y años no se pase y ponga
     * menos numeros de los que son...
     * @return
     */

    public boolean comprobarCalendario(){
        boolean respuesta=true;

        //metodo para que no ponga que hay menos de 1 mes o mas de 12 meses
        if (this.mes<1 || this.mes>12 ){
            System.out.println("Mes no valido");
            respuesta=false;
        }
        //metodo para que no ponga que hay menos de 1 dia o mas de 31 dias
        if (this.dia<1 || this.dia>31){
            System.out.println("Dia no valido");
            respuesta=false;

        }
        //metodo para que no ponga que hay menos de 1 año o mas de 15000 años.
        //Se a puesto como maximo 15000 para no poner tantos años
        if (this.ano<1 || this.ano>15000){
            System.out.println("Año no valido");
            respuesta=false;
        }

        return respuesta;
    }

    /**
     * Metodo para que no se pase de dias o de meses
     */
    public void fechaNopasar(){
        //si dia es igual a 32
        if (this.dia>=32){
            //dia se convierte en 0
            this.dia=0;
            //Se incrementa un mes
            this.mes++;
            //si mes es igual a 13
            }if (this.mes>=13){
                //mes se convertierte en 0
                this.mes=0;
                //se incrementa un año
                this.ano++;
            }

    }

}
