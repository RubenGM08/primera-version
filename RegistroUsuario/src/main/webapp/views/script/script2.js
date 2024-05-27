function validarFormulario() {
    let form=document.getElementById("resgistroForm")
    let nombre=form.nombre;
    let apellido=form.apellido;
    let edad=form.edad;
    let tlf=form.tlf;
    let email=form.email;
    let contrasena=form.contrasena;
    let reptiContrasena=form.reptiContrasena;
    let salida=document.querySelector(".error");
    let errorMsn="";
    let fallo=false;


    //Limpiar los estilos de los input
    let input=document.querySelectorAll("input");
    //recorre el array y elimina esa clase errorInput si esta
    input.forEach(input=>input.classList.remove("errorInput"));

    //Validar campos
    //trim quita los espacios vacios de los extremos
    if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombre.value.trim())){
        errorMsn+="El nombre es obligatorio<br>";
        nombre.classList.add("errorInput");
        fallo=true;
    }
    if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(apellido.value.trim())){
        errorMsn+="El apellido es obligatorio<br>";
        apellido.classList.add("errorInput");
        fallo=true;
    }
    if (!edad.value.trim() || isNaN(edad.value) || edad.value<0){
        errorMsn+="La edad es obligatorio, sólo números y positivos<br>";
        edad.classList.add("errorInput");
        fallo=true;
    }
    if (!tlf.value.match(/^\d{9}$/)) {
        errorMsn+="El telefono debe tener 9 digitos<br>";
        tlf.classList.add("errorInput");
        fallo=true;
    }
    if (!email.value.match(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/)){
        errorMsn+="El correo es obligatorio<br>";
        email.classList.add("errorInput");
        fallo=true;
    }
    if (contrasena.value.trim()!==reptiContrasena.value.trim()){
        errorMsn+="La contraseña y repetir contraseña deben ser iguales<br>";
        contrasena.classList.add("errorInput");
        reptiContrasena.classList.add("errorInput");
        fallo=true;
    }else if (!contrasena.value.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/)){
        errorMsn+="La contraseña no cumple con una longitud mínima de 8 caracteres: al menos 1 mayúscula. 1 minúsculas, 1número<br>"
        contrasena.classList.add("errorInput"); //que se ponga el borde en rojo
        reptiContrasena.classList.add("errorInput"); //que se ponga el borde en rojo
        fallo=true;
    }
    if (fallo){
        salida.innerHTML=errorMsn;
        return false;
    }else {
        return true;
    }
}