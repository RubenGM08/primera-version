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
    //toma todos los elementos que tiene la clase boton-letra y crea un array de botones
    let botones=document.querySelectorAll(".boton-letra");
    //En JS forEach es una fucion que se le aplica a un array para recorrerlo
    botones.forEach(letraSelecionada =>{
        letraSelecionada.addEventListener("click", function () {
            if (letraSelecionada.value=="S"){
                document.querySelector(".resultado").innerHTML="Seleccion correcta, Adivinaste!"
            }else {
                document.querySelector(".resultado").innerHTML="Sigue intentandolo!"
            }
        })
    })


}