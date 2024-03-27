package Unidad7.Explicacion2.Clases;

public class Curso {
    String nommbreCurso;
    String aula;
    String tutor;


    public Curso(String nommbreCurso, String aula, String tutor) {
        this.nommbreCurso = nommbreCurso;
        this.aula = aula;
        this.tutor = tutor;
    }

    public String getNommbreCurso() {
        return nommbreCurso;
    }

    public void setNommbreCurso(String nommbreCurso) {
        this.nommbreCurso = nommbreCurso;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public String getTutor() {
        return tutor;
    }

    public void setTutor(String tutor) {
        this.tutor = tutor;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "nommbreCurso='" + nommbreCurso + '\'' +
                ", aula='" + aula + '\'' +
                ", tutor='" + tutor + '\'' +
                '}';
    }
}
