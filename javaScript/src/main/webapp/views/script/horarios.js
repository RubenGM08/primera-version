window.onload=function (){
    console.log("estamos")
    let horario="";
    let botones=document.querySelectorAll(".boton"); //toma todos los elementos que tienen la clase boton y crea un array!
    botones.forEach(pinchado =>{
        pinchado.addEventListener("click", function (e) {
            console.log(pinchado.value);
            switch (pinchado.value){
                case "l":{
                    horario="Lunes: De 9:00 a 14:00  |  16:00 a 19:00";
                    break;
                }
                case "m":{
                    horario="Martes: De 9:00 a 14:00  |  16:00 a 19:00";
                    break;
                }
                case "x":{
                    horario="Miercoles: De 9:00 a 14:00  |  16:00 a 19:00";
                    break;
                }
                case "j":{
                    horario="Jueves: De 9:00 a 14:00  |  16:00 a 19:00";
                    break;
                }
                case "v":{
                    horario="Viernes: De 8:00 a 16:00";
                    break;
                }
                case "s":{
                    horario="Cerrado no se llama los sabados";
                    break;
                }
                case "d":{
                    horario="Cerrado no se llama los domingos";
                    break;
                }
            }
            document.querySelector(".horario").innerHTML="<h2>Horario</h2>"+horario;
        })
    })
}