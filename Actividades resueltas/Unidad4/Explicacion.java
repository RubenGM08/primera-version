package Unidad4;

public class Explicacion {

    public static void tresSaludos(int veces){
        System.out.println("Te vamos a saludar " + veces + " veces");
        for (int i = 0; i < veces; i++){
            System.out.println("Hola");
        }

    }
    public static void main(String[] args) { //funcion o metodo
        //se llama las funciones o metodos que van a ejecutar
        tresSaludos(1); //se llama la funcion para que se ejecute
        tresSaludos(2); //se llama la funcion para que se ejecute
        tresSaludos(3); //se llama la funcion para que se ejecute


    }

}
