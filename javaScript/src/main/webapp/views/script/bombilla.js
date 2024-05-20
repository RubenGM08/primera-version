window.onload=function () {
    let bombilla=document.querySelector("#bombilla")
    let interruptor=false;
    bombilla.addEventListener("click",function () {
        if (interruptor){
            bombilla.src="views/img/bombilla-off.gif";
            interruptor=false;
        }else {
            bombilla.src="views/img/bombilla-on.gif";
            interruptor=true;
        }
    })

    /*
    bombilla.addEventListener("maouseover",function () {
        bombilla.src="views/img/bombilla-off.gif";
     })

    bombilla.addEventListener("maouseout",function () {
        bombilla.src="views/img/bombilla-on.gif";
    })
     */

}