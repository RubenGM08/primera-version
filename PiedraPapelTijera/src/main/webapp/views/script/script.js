window.onload=function () {
    let div=document.querySelector(".maquina");
    let img=document.querySelector("#respuestaMaquina");
    let contadorU=0;
    let contadorM=0;
    let user=document.querySelectorAll('input[type=radio][name="opcion"]')//All cuando son varios
    user.forEach(function (userOpcion) { //ForEach = por cada uno ... distinto
        userOpcion.addEventListener("change",function () {
            document.querySelector("#mensaje").innerHTML="";
            //verificar si ese radio esta marcado,
            if (this.checked){ //si ese radio esta marcado, hacer lo siguiente
                //mostrar que opcion marco el cliente
                let userResp = this.value;
                let maq=parseInt(Math.random()* 3 + 1);
                console.log("Usuario-> " + userResp);
                console.log("Maquina-> " + maq);
                div.style.visibility="visible"
                div.classList.add("maquina-respuesta")
                switch (maq){
                    case 1:{
                        img.src="views/img/Piedra.png";
                        break;
                    }
                    case 2:{
                        img.src="views/img/Papel.png";
                        break;
                    }
                    case 3:{
                        img.src="views/img/Tijeras.png";
                        break;
                    }
                }

                let msn="";
                if (userResp==maq){
                    msn="Empate";
                }else if (userResp==1 && maq==2){
                    contadorM++;
                    msn="Gana la Maquina";
                }else if (userResp==1 && maq==3){
                    contadorU++;
                    msn="Gana el Usuario";
                }else if (userResp==2 && maq==1){
                    contadorU++;
                    msn="Gana el Usuario"
                }else if (userResp==2 && maq==3){
                    contadorM++;
                    msn="Gana la Maquina";
                } else if (userResp==3 && maq==1){
                    contadorM++;
                    msn="Gana la Maquina";
                } else if (userResp==3 && maq==2){
                    contadorU++;
                    msn="Gana el Usuario";
                }
                document.querySelector("#mensaje").innerHTML=msn;
                document.querySelector("#contador").innerHTML=`Usuario: ${contadorU} | Máquina: ${contadorM}`;
            }


        })

    })
}