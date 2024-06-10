window.onload=function () {
    const Usuario= {
        nombre:"Antonio Garcia",
        nombreUsuario:"agar007",
        password:"agar007__pass",
        login:function (nombreUsuario,password){
            if (nombreUsuario==this.nombreUsuario && password==this.password){
                alert("Usuario Correcto");
            }else {
                alert("Usuario Incorrecto");
            }
        },
        bienvanida:function () {
            alert("Bienvenido al Sistema " + this.nombre)
        }
    }

    let nombreUsuario=prompt("Indique el nombre del Usuario");
    let password=prompt("Indique el password del Usuario");
    Usuario.login(nombreUsuario,password);
    Usuario.bienvanida();
    Usuario.nombreUsuario="irime";
    Usuario.password="lechuza";
    Usuario.nombre="IRINA MEDINA";
    Usuario.login(nombreUsuario,password);
    Usuario.bienvanida();
}