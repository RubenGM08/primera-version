window.onload=function (e){
    document.querySelector(".parrafo").innerHTML="Es una prube con selector";
    //document.write("Es una prueba desde el archivo js externo");

    /**
     * Para selecionar elementos...podemos hacerlo por
     * id
     * clase
     * etiqueta
     * name
     * comodin-> querySelector...que incluye todas las anteriores
     *           querySelectorAll...cuando son varios elementos que necesitamos selecionar -> array de elementos
     */

    let cuadro1=document.getElementById("cuadro");
    let cuador2=document.querySelector("#cuadro");
    //indicar que tipo de selector es # para id y . para class
    let cadena1="mi primer cadena"
    let cadena2=" para mostrar como funciona JS"

    document.querySelector(".parrafo").innerHTML='La cadena1 dice -> '
}

