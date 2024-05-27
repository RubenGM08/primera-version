function validarFormulario() {
    let form=document.getElementById("resgistroForm")
    let nombre=form.nombre;
    let apellido=form.apellido;
    let edad=form.edad;
    let tlf=form.tlf;
    let email=form.email;
    let contrasena=form.contrasena;
    let reptiContrasena=form.reptiContrasena;
    let errorMsn=document.querySelector(".error");
    errorMsn.textContent="";

    //Limpiar los estilos de los input
    let input=document.querySelectorAll("input");
    //recorre el array y elimina esa clase errorInput si esta
    input.forEach(input=>input.classList.remove("errorInput"));

    //Validar campos
    //trim quita los espacios vacios de los extremos
    if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(nombre.value.trim())){
        errorMsn.textContent="El nombre es obligatorio";
        nombre.classList.add("errorInput");
        return false;
    }
    if (!/^[a-zA-ZáéíóúÁÉÍÓÚñÑ\s]+$/.test(apellido.value.trim())){
        errorMsn.textContent="El apellido es obligatorio";
        apellido.classList.add("errorInput");
        return false;
    }
    if (!edad.value.trim() || isNaN(edad.value) || edad.value<0){
        errorMsn.textContent="La edad es obligatorio, sólo números y positivos";
        edad.classList.add("errorInput");
        return false;
    }
    if (!tlf.value.match(/^\d{9}$/)) {
        errorMsn.textContent="El telefono debe tener 9 digitos";
        tlf.classList.add("errorInput");
        return false;
    }
    if (!email.value.match(/^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/)){
        errorMsn.textContent="El correo es obligatorio";
        email.classList.add("errorInput");
        return false;
    }
    if (contrasena.value.trim()!==reptiContrasena.value.trim()){
        errorMsn.textContent="La contraseña y repetir contraseña deben ser iguales";
        contrasena.classList.add("errorInput");
        reptiContrasena.classList.add("errorInput");
        return false;
    }else if (!contrasena.value.match(/^(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}$/)){
        errorMsn.textContent="La contraseña no cumple con una longitud mínima de 8 caracteres: al menos 1 mayúscula. 1 minúsculas, 1número "
        contrasena.classList.add("errorInput"); //que se ponga el borde en rojo
        reptiContrasena.classList.add("errorInput"); //que se ponga el borde en rojo
        return false;
    }

    return true;
}