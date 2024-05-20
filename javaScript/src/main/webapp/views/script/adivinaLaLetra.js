window.onload=function () {
    //Obtener el div donde se agregan los botones
    let divLetras=document.getElementById("divLetras");

    //Crear un array con todas las letras del alfabeto
    let letras="abcdefghijkmnñopqrstuvwxyz".split('');

    // Funcion para crear botones para cada letra y agragarlos al div
    function crearBotones(){
        letras.forEach(function (letra) {
            var boton=document.createElement("button");
            boton.textContent=letra.toUpperCase(); // Convertir la letra a Mayuscula
            boton.value=letra.toUpperCase(); //Agregar el valor de la letra
            boton.classList.add("boton"); //Agregar la clase "boton"
            boton.classList.add("boton-letra"); //Agregar la clase "boton"
            divLetras.appendChild(boton)
            console.log(boton.value)
        })
    }

    //Llamar a la fución para crear los botones
    crearBotones();
    let letraAdivinar=letras[parseInt(Math.random()*26)].toUpperCase();
    console.log(letraAdivinar)
    //toma todos los elementos que tiene la clase boton-letra y crea un array de botones
    let botones=document.querySelectorAll(".boton-letra");
    //En JS forEach es una fucion que se le aplica a un array para recorrerlo
    let contador=5;
    let interruptor=false;
    botones.forEach(letraSelecionada =>{
        letraSelecionada.addEventListener("click", function () {
            if (letraSelecionada.value==letraAdivinar){
                document.querySelector("#contadorFallos").innerHTML="";
                document.querySelector(".resultado").innerHTML="Seleccion correcta, Adivinaste!"
                interruptor=true;
            }else {
                document.querySelector(".resultado").innerHTML="Sigue intentandolo!"
                letraSelecionada.disabled=true;
                letraSelecionada.style.backgroundColor="#f2f2f2";
                --contador;
                document.querySelector("#contadorFallos").innerHTML="Quedan " + contador + " intentos";
                if (contador==0){
                    interruptor=true;
                }
            }
            if (interruptor){
                for (let i = 0; i < botones.length; i++) {
                    botones[i].disabled=true;
                    botones[i].style.backgroundColor="#f2f2f2";
                }
                let nuevaPartida= document.querySelector("#nueva");
                let salir= document.querySelector("#salir");
                nuevaPartida.style.display="block";
                salir.style.display="block";
                nuevaPartida.addEventListener("click",function () {
                    window.location.replace("adivinaLaLetra.jsp");
                })
                salir.addEventListener("click",function () {
                    window.location.replace("index.jsp");
                })
            }
        })
    })


}