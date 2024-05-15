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

    document.querySelector(".parrafo").innerHTML=`la cadena1 dice -> ${cadena1} y la cadena2 dice-> ${cadena2}`;
    //document.querySelector(".parrafo").innerHTML="la cadena1 dice -> "+{cadena1}+" y la cadena2 dice-> "+{cadena2};
    //hacer referencia a una expresion o variable, es tambien hacer referencia a su valor
    let base=3;
    let altura=22;
    document.querySelector(".areaTriangulo").innerHTML=`El area del triangulo es: ${base*altura/2}`;

    //Secuencia de escape \t \n \\ "es una frase y dentro hay comillas \"doubles\" tienes que escapar...
    console.log("Asi \"escapamos\" comillas dobles"); //dentro hay comillas
    console.log('Asi "escapamos" comillas dobles'); //dentro hay comillas
    console.log("Asi 'escapamos' comillas dobles"); //dentro hay comillas
    console.log("Asi \tTabulamos \t en JavaScript"); //dentro hay comillas
    console.log("Asi puedo poner una barra \\ invertida");
    console.log("Asi puedo poner cualquier codigo unicode \u20BF");
    console.log("C:\\\\usuario\\ tarda 1\'23\", algo considerado \"lento\"en la actualidad.");

    //Numeros -> Number

    let divisionCero=356/0;
    console.log(`La division entre Cero es ${divisionCero}`)
    console.log(cadena1*100); //NaN OR Not a Number

    //Boolean   true=1      false=0

    console.log(5+true);

    //Conversion de tipo de datos=> Automaticamente hace la conversion de tipo en una poperacion, siempre que sea permitida
    console.log(5+"5"); //Resultado -> 55
    console.log(5*"5"); //Resultado -> 25
    console.log(5+Number("5")); //Resultado -> 10

    numero=5+parseFloat("5"); //10 parseFloat convierte un String a numero
    numero=(numero.toFixed(2)); //toFixed formatea laos decimales para redondearlos
    console.log(numero);

    //Declaración de Varibles en JavaScript
    //let y el var
    //var tiene global, cuidado porque se pueden declarar varias veces...
    //let tiene ambito de bloque, si se declara, ya no es posible volver a declarar en el mismo bloque

    var diametro=5;
    if (diametro<10){
        var diametro=15
        console.log(diametro)
    }
    console.log(diametro)

    let diametro1=5;
    if (diametro1<10){
        let diametro1=15
        console.log(diametro1)
    }
    console.log(diametro)

    //Operadores de Asignacion
    // a=a+b         - > a+=b
    //aplicacion        simplicacion

    //Para calcular el exponenciacion
    var a=2**5; //2 exp 5
    console.log("2^5= " + a);
    //Operadores logicos  ||  or && and
    //Operador ternario
    let resultado=a<30?"Es menor que 30":"Es mayor que 30";



}

