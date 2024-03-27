package Unidad7.Explicacion;

public class Main {

    public static void main(String[] args) {
        Persona persona1= new Persona(); // Estoy declarando que persona1 es un objeto de tipo Pesona
        persona1.nombre="Fran";
        persona1.edad=32;
        persona1.peso=68;
        persona1.estatura=1.78;
        persona1.dni="12345678L";

        System.out.println("Nombre-> " + persona1.nombre
                            + "\nEdad-> " + persona1.edad
                            + "\nPeso-> " + persona1.peso
                            + "\nEstatura-> " + persona1.estatura
                            + "\nDNI-> " + persona1.dni);
        Persona persona2=new Persona();
        persona2.nombre="Isabel";
        persona2.edad=35;
        persona2.peso=65;
        persona2.estatura=1.65;
        persona2.dni="87654321H";
        //deberia ser una funcion
        System.out.println("\nNombre-> " + persona2.nombre
                + "\nEdad-> " + persona2.edad
                + "\nPeso-> " + persona2.peso
                + "\nEstatura-> " + persona2.estatura
                + "\nDNI-> " + persona2.dni);
        persona2.cumpilAñio();
        persona1.crecer(0.05);
    }

}
