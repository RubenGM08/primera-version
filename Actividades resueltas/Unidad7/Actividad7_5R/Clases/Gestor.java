package Unidad7.Actividad7_5R.Clases;

public class Gestor {

    public String nombreUsuario;
    private String tlf;
    double importeMaximo;

    public Gestor(String nombreUsuario, String tlf, double importeMaximo) {
        this.nombreUsuario = nombreUsuario;
        this.tlf = tlf;
        this.importeMaximo = importeMaximo;
    }

    public Gestor(String nombreUsuario, String tlf) {
        this.nombreUsuario = nombreUsuario;
        this.tlf = tlf;
        this.importeMaximo=10000;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getTlf() {
        return tlf;
    }

    public double getImporteMaximo() {
        return importeMaximo;
    }

    public void setImporteMaximo(double importeMaximo) {
        this.importeMaximo = importeMaximo;
    }

    @Override
    public String toString() {
        return "Gestor{" +
                "nombreUsuario='" + nombreUsuario + '\'' +
                ", tlf='" + tlf + '\'' +
                ", importeMaximo=" + importeMaximo +
                '}';
    }
}
