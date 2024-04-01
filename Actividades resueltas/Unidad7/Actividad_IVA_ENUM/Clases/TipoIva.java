package Unidad7.Actividad_IVA_ENUM.Clases;

public enum TipoIva {
    GENERAL(21), REDUCIDO(18),SUPERREDUCIDO(4),EXCENTO(0);

    //constructor
    private TipoIva(int porcentaje){
        this.porcentaje=porcentaje;
    }
    int porcentaje;

    //medotodo Getter

    public double getPorcentaje() {
        return this.porcentaje; //devidido entre 100 para realizar el calculo del iva
    }
}
