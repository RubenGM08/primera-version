<%--
  Created by IntelliJ IDEA.
  User: PROGRAMACION
  Date: 17/06/2024
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="stylesheet" href="views/css/responsive.css">
    <script src="views/script/js.js"></script>
    <title>Guardería 👶🍼</title>
</head>
<body>
    <div class="container2">
        <form action="" id="formGuarderia" onsubmit="return validarFomulario()">
            <img src="views/img/titulo.jpg" alt="titulo">
            <p>A continuación, indique los datos suministrados para darse de alta en nuestro Sistema.</p>
            <p>Los marcados con <span class="rojo">*</span> son obligatorios. </p>
            <h2>FORMALIZACIÓN MATRÍCULA</h2>
            <p></p>
            <h3 class="gris col-12">DATOS NIÑO/NIÑA</h3>
            <p class="form-group col-12">
                <label for="nombreAlum" class="col-2">Nombre<span class="rojo">*</span>:</label>
                <input type="text" id="nombreAlum" name="nombreAlum" class="col-11">
            </p>
            <div class="nombreAlumError rojo msm"></div>

            <p class="form-group col-12">
                <label for="apellidosAlum" class="col-2" >Apellidos<span class="rojo">*</span>:</label>
                <input type="text" id="apellidosAlum" name="apellidosAlum" class="col-11">
            </p>
            <div class="apellidosAlumError rojo msm"></div>

            <p class="form-group col-12">
                <label for="nacimientoAlum" class="col-4" >Fecha de Nacimiento<span class="rojo">*</span>:</label>
                <input type="text" id="nacimientoAlum" name="nacimientoAlum" class="col-11">
            </p>
            <div class="nacimientoAlumError rojo msm"></div>

            <p class="form-group col-12">
                <label for="direccionAlum" class="col-2" >Dirección:</label>
                <input type="text" id="direccionAlum" name="direccionAlum" class="col-11">
            </p>
            <div class="direccionAlumError rojo msm"></div>

            <p class="form-group col-12" style="padding-bottom: 10px">
                <label for="poblacionAlum" class="col-2" >Población<span class="rojo">*</span>:</label>
                <input type="text" id="poblacionAlum" name="poblacionAlum" class="col-3"  style="margin-right: 10px">
                <label for="codigoPostal">C.P.<span class="rojo">*</span>:</label>
                <input type="number" id="codigoPostal" name="codigoPostal" class="col-7">
            </p>
            <div class="poblacionAlum rojo msm"></div>
            <div class="codigoPostal rojo msm"></div>


            <h3 class="gris col-12">DATOS FAMILIARES</h3>
            <h3>PADRE / TUTOR:</h3>
            <p class="form-group col-12">
                <%-- nya significa nombre y apellido--%>
                <label for="nyaPadre" class="col-3" >Nombre y apellidos<span class="rojo">*</span>:</label>
                <input type="text" id="nyaPadre" name="nyaPadre" class="col-11">
            </p>
            <div class="nyaPadreError rojo msm"></div>
            <p class="form-group col-12">
                <label for="DNIPadre" class="col-1" >DNI<span class="rojo">*</span>:</label>
                <input type="text" id="DNIPadre" name="DNIPadre" class="col-4"  style="margin-right: 10px">
                <label for="profesionPadre">Profesión:</label>
                <input type="number" id="profesionPadre" name="profesionPadre" class="col-6">
            </p>
            <div class="DNITutor rojo msm"></div>
            <p class="form-group col-12" style="padding-bottom: 20px">
                <label for="telefonoPadre" class="col-4" >Teléfonos de contacto<span class="rojo">*</span>:</label>
                <input type="text" id="telefonoPadre" name="telefonoPadre" class="col-5"  style="margin-right: 10px">
                <label for="profesionTutor" class="col-2">E-mail<span class="rojo">*</span>:</label>
                <input type="number" id="profesionTutor" name="profesionTutor" class="col-6">
            </p>
            <p></p>
            <h3>MADRE / TUTOR:</h3>
            <p class="form-group col-12">
                <%-- nya significa nombre y apellido--%>
                <label for="nyaMadre" class="col-3" >Nombre y apellidos<span class="rojo">*</span>:</label>
                <input type="text" id="nyaMadre" name="nyaMadre" class="col-11">
            </p>
            <div class="nyaPadreError rojo msm"></div>
            <p class="form-group col-12">
                <label for="DNIMadre" class="col-1" >DNI<span class="rojo">*</span>:</label>
                <input type="text" id="DNIMadre" name="DNIMadre" class="col-4"  style="margin-right: 10px">
                <label for="profesionMadre">Profesión:</label>
                <input type="number" id="profesionMadre" name="profesionMadre" class="col-6">
            </p>
            <div class="DNITutor rojo msm"></div>
            <p class="form-group col-12" style="padding-bottom: 20px">
                <label for="telefonoMadre" class="col-4" >Teléfonos de contacto<span class="rojo">*</span>:</label>
                <input type="text" id="telefonoMadre" name="telefonoMadre" class="col-5"  style="margin-right: 10px">
                <label for="emailMadre" class="col-2">E-mail<span class="rojo">*</span>:</label>
                <input type="number" id="emailMadre" name="emailMadre" class="col-6">
            </p>
            <div class="DNITutor rojo msm"></div>












            <p>
                <input type="submit" value="Registrar" class="boton izquierda">
                <input type="reset" value="Borrar" class="boton derecha" id="reset">
            </p>
            <p class="error"></p>
        </form>
    </div>
</body>
</html>
