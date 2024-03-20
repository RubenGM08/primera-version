package Unidad6;

import java.util.Arrays;

public class CadaneDeCaracter {
    public static void main(String[] args) {
        String frase="En un lugar de la mancha";
        String frase2="En un lugar de madrid";

    /* CharAT   -> Devuelve el caracter del indice especificado */

        char letra=frase2.charAt(0);
        mostrar(" " + letra);

    /*compareTo -> Compara dos cadenas entre si, como resultado da un entero, donde:
    *       0 -> son iguales
    *       <0 la cadena es mayor
    *       >0 la cadena es menor
    */
        int resultado=frase2.compareTo(frase);
        mostrar("El resultado de la comparación->" + resultado);
        mostrar(" ");
        String nombre1="José";
        String nombre2="josé";
        mostrar("El nombre 1 y el nombre 2 dan como resultado al comparar-> " + nombre1.compareTo(nombre2));
/* Concat- Une la cadena especificada al final de nuestra cadena*/
        String nombreCompleto=nombre1.concat(" Ruiz");
        mostrar("Nombre Completo-> " + nombreCompleto);
        /*contentEquals()   -> Devuelve verdadero (true) si y solo si lasecuencia de caracteres es igual a la cadena
        * informada*/
        boolean resultado8=frase.contentEquals(frase2);
        mostrar("Booleano de resultado-> " + resultado8);
        /* copyValueOf(char[])  -> Devuelve una cadena que representa la secuencia de caracteres en el Array informado*/
        char arrayChar[]={'H','o','l','a',' ','M','u','n','d','o'};
        String letraV=" ";
        mostrar(" " + letraV.copyValueOf(arrayChar));
        String cadena=letraV.copyValueOf(arrayChar);
        mostrar(cadena);
        mostrar(" " + letraV.copyValueOf(arrayChar,5,5));
        /*endsWith(String sufijo)   ->Chequea si la cadena termina con el sufijo especidicado*/
        resultado8=frase.endsWith("mancha");
        mostrar("La frase 1 termina con mancha-> " +  resultado8);
        /*startwith -> Chequea si la cadena comienza con el sufijo especificado*/
        resultado8=frase2.startsWith("Hola");
        mostrar("La frase 1 comenza con Hola-> " + resultado8);
        /* se puede especificar el indice inicial para utilizar el startsWuth */
        resultado8=frase2.startsWith("un",3);
        mostrar("La frase 2 comienza con un en el indice 3-> " + resultado8);
        /*compara dos dacenas*/
        if (frase2.equals(frase))
            mostrar("Las cadenas son Iguales");
        else
            mostrar("Las cadenas son diferentes");

        /*comparar dos cadenas ignorando las mayúsculas y minusculas */
        String nombre3="josé";
        mostrar("El nombre " + nombre1 + " es igual al nombre 3 " + nombre3 + " -> " +nombre1.equalsIgnoreCase(nombre3)) ;
        /* hash Code -> codificación para hacer contraseñas y encriptar*/
        mostrar("HasCode de la frase \"En un lugar de la mancha\" -> "+ frase.hashCode());
        /*indexOf(int ch) Devuelve el indice dentro de la cadena de la primera coincidencia del caracter especificado */
        mostrar("" + frase2.indexOf('n'));//la primera que encuentra
        mostrar("" + frase2.indexOf('n',5));/*Devuelve el indice dentro de la cadnea de la
        primera coincidencia del caracter especificado a partir del indice especificado*/
        /* indexOf puede devolver el indice dentro de la cadena de la primea coincidencia de la subcadena especificada*/
        mostrar("" + frase2.indexOf("lugar"));//En un lugar de madrid -> resultado->6
        /* le puedes indicar el indice a partir del cual buscas la* cadena*/
        mostrar("indexOf indicando indice-> " + frase2.indexOf("lugar",11));
        //En un lugar de madrid -> resultado->-1 porque no lo ebncuentra.
        /* lastIndexOf  -> devuelve el indice de la ultima coincidencia del caracter especificado.*/
        mostrar(""+ frase2+" 'a' -> "+ frase2.lastIndexOf('a'));
        /* lasIndexOf -> funciona iagual qie el indexOf, pero siempre devolviendo la última coincidencia.*/

        /*lenght    -> nos devuelve la longitud de una cadena, lo que es lo mismo que el número de caracteres incluyendo espacios*/
        int longitudF1=frase.length();
        mostrar("La frase 1 tiene " + longitudF1 + " caracteres.");
        /*replace   -> permite reemplazar un caracter por otro en una cadena*/
        mostrar("" + frase2.replace(" ", "_"));
        // tambien podemos reemplazar cadena
        mostrar("" + frase2.replaceAll("madrid", "Tomelloso")); //Para Expresiones regulares. no visto.

        //reemplazar la primera coincidencia
        String frase3="Esta es una frase de otra frase que tenemos en la clase";
        mostrar(frase3);
        mostrar("" + frase3.replaceFirst("ase", "oto"));
        mostrar("" + frase3.replaceAll("ase", "oto"));
        /*split -> devolver un array de una cadena dividida por un caracte indicado*/
        String arrayCadena[]=frase2.split(" ");
        mostrar(Arrays.toString(arrayCadena));
        String listaNombres="Jose,Pedro,Juan,Manuel,Lucia,Susana,Ana,Belen";
        String arrayNombres[]=listaNombres.split(",");
        for (String ele:arrayNombres){
            mostrar("- "+ele);
        }
        nombreCompleto="rubén garcía mateos";
        /*subString (indice)-> devuelve una nueva cadena a partir de otra */
        //toUpperCase convierte el caracter o cadena en mayuscula
        String nombreMayuscula=nombreCompleto.substring(0,1).toUpperCase()+nombreCompleto.substring(1);
        mostrar(nombreMayuscula);
        /*¿Como convertiras todo el nombre y apellidos la inicial en mayuscula con lo que hemos visto hasta ahora? */
        String arrayMay[]=nombreCompleto.split(" ");
        String nombreConv="";
        for (String nombre:arrayMay){
            nombreConv+=nombre.substring(0,1).toUpperCase()+nombre.substring(1)+ " ";
        }
        mostrar(nombreConv);
        //Hacer este ejemplo-> esbribe 3 numero de telefono e indica si son validos en España ->926415052,456987741,325985233

        /* M I  F O R M A  D E  H A C E R L O */
        System.out.println("");
        System.out.println("");
        String numero1="926415052";
        String numero2="856987741";
        String numero3="725985452";
        mostrar("El numero 1 " + numero1 + " tiene una longitud de " + numero1.length() + " caracteres, ¿Es Español? -> "+ (numero1.length()==9) + " y su primer numero tiene(9, 8, 7 o 6)-> " + (numero1.startsWith("9") ||numero1.startsWith("8") ||numero1.startsWith("7") || numero1.startsWith("6")));
        mostrar("El numero 2 " + numero2 + " tiene una longitud de " + numero2.length() + " caracteres, ¿Es Español? -> "+ (numero2.length()==9) + " y su primer numero tiene(9, 8, 7 o 6)-> " + (numero2.startsWith("9") ||numero2.startsWith("8") ||numero2.startsWith("7") || numero2.startsWith("6")));
        mostrar("El numero 3 " + numero3 + " tiene una longitud de " + numero3.length() + " caracteres, ¿Es Español? -> "+ (numero3.length()==9) + " y su primer numero tiene(9, 8, 7 o 6)-> " + (numero3.startsWith("9") ||numero3.startsWith("8") ||numero3.startsWith("7") || numero3.startsWith("6")));

        System.out.println("");
        System.out.println("");
        /* F O R M A  D E  H A C E R L O  I R I N A */
        String phone[]={"926415052","456987741","325985452"};
        for (String ph:phone){
            if (ph.length()==9 && ph.substring(0,1).equals("9") || ph.substring(0,1).equals("8") || ph.substring(0,1).equals("7") || ph.substring(0,1).equals("6")) {
                mostrar("El telefono " + ph + " es correcto");
            } else {
                mostrar("El telefono " + ph + " no es correcto, porque no tiene la logitud correcta (9 digitos) o no comienza por (9, 8, 7 o 6)");
            }
        }

        /*toCharArray   -> convierte una cadena en array de char*/
        char cadebaTochar[]= frase2.toCharArray();
        mostrar("" + Arrays.toString(cadebaTochar));
        //toLowerCase convierte una cadena en minúscula
        String nombre4="RUBEN GARCIA MATEOS";
        mostrar("" + nombre4.toLowerCase());
        String nombreAcento="JOSÉ MARÍA NUÑEZ";
        mostrar("" + nombreAcento.toLowerCase());
        /*trim-> elimina los espacios en blanco*/
        nombreAcento=" "+ nombreAcento + " ";
        mostrar("" + nombreAcento);
        mostrar("" + nombreAcento.trim());

        /*Valores primitivos*/
        /*String.valueOf convierte un dato primitivo en una cadena de caracteres*/
        String cad;
        cad=String.valueOf(560);   //"560"
        cad=String.valueOf(57.85);//"57.85"
        cad=String.valueOf(true); //"true"

        //Clase Character   -> char
        //a traves de metodos, identificar si es digito, si es letra, si es un espacio en blanco, otro caracter..
        letra=frase.charAt(2);
        mostrar("El indice dos de la frase \n " + frase + "\n ¿Es un digito? -> " + Character.isDigit(letra));
        mostrar("El indice dos de la frase \n" + frase + "\n ¿Es un espacio en blanco? -> " + Character.isWhitespace(letra));
        mostrar("El indice dos de la frase \n" + frase + "\n ¿Es una letra? -> " + Character.isLetter(letra));
        mostrar("El indice dos de la frase \n" + frase + "\n ¿Es una letra o digito? -> " + Character.isLetterOrDigit(letra));
        letra=frase.charAt(0);
        mostrar("El indice dos de la frase \n" + frase + "\n ¿Esta en Mayúscula? -> " + Character.isUpperCase(letra));
        mostrar("El indice dos de la frase \n" + frase + "\n ¿Esta en Minuscula? -> " + Character.isLowerCase(letra));
    }



    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrar(String texto) { System.out.println("\t" + texto); }


    /**
     * Metodo para mostrar en consola los texto con salto de línea
     * @param texto
     */

    public static void mostrarSinLn(String texto) { System.out.print("\t" + texto); }



}