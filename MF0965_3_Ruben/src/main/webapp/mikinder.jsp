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
<body class="cuerpo1">

    <div class="container2">
        <form action="" id="formGuarderia" onsubmit="return validarFomulario()">
            <img src="views/img/titulo.jpg" alt="titulo">
            <p>A continuación, indique los datos suministrados para darse de alta en nuestro Sistema.</p>
            <p>Los marcados con <span class="rojo">*</span> son obligatorios. </p>
            <h2>FORMALIZACIÓN MATRÍCULA</h2>
            <p></p>
            <h3 class="gris col-12">DATOS NIÑO/NIÑA</h3>

            <%--En este div se recogen todos los datos del NIÑO/NIÑA--%>
            <div>
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
                    <input type="date" id="nacimientoAlum" name="nacimientoAlum" class="col-11">
                </p>
                <div class="nacimientoAlumError rojo msm"></div>

                <p class="form-group col-12">
                    <label for="direccionAlum" class="col-2" >Dirección<span class="rojo">*</span>:</label>
                    <input type="text" id="direccionAlum" name="direccionAlum" class="col-11">
                </p>
                <div class="direccionAlumError rojo msm"></div>

                <p class="form-group col-12" style="padding-bottom: 10px">
                    <label for="poblacionAlum" class="col-2" >Población<span class="rojo">*</span>:</label>
                    <input type="text" id="poblacionAlum" name="poblacionAlum" class="col-3"  style="margin-right: 10px">
                    <label for="codigoPostalAlum">C.P.<span class="rojo">*</span>:</label>
                    <input type="number" id="codigoPostalAlum" name="codigoPostalAlum" class="col-7">
                </p>
                <div class="poblacionAlumError rojo msm"></div>
                <div class="codigoPostalAlumError rojo msm"></div>
            </div>


            <h3 class="gris col-12">DATOS FAMILIARES</h3>
            <%--En este div tenemos los datos familiares del PADRE O TUTOR2 --%>
            <div>
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
                    <input type="text" id="profesionPadre" name="profesionPadre" class="col-6">
                </p>
                <div class="DNIPadreError rojo msm"></div>

                <p class="form-group col-12" style="padding-bottom: 20px">
                    <label for="telefonoPadre" class="col-4" >Teléfonos de contacto<span class="rojo">*</span>:</label>
                    <input type="number" id="telefonoPadre" name="telefonoPadre" class="col-5"  style="margin-right: 10px">
                    <label for="emailPadre" class="col-2">E-mail<span class="rojo">*</span>:</label>
                    <input type="text" id="emailPadre" name="emailPadre" class="col-6">
                </p>
                <div class="telefonoPadreError rojo msm"></div>
                <div class="emailPadreError rojo msm"></div>
            </div>

            <%--En este div tenemos los datos familiares de la MADRE O TUTOR2 --%>
            <div>
                <p></p>
                <h3>MADRE / TUTOR:</h3>
                <p class="form-group col-12">
                    <%-- nya significa nombre y apellido--%>
                    <label for="nyaMadre" class="col-3" >Nombre y apellidos<span class="rojo">*</span>:</label>
                    <input type="text" id="nyaMadre" name="nyaMadre" class="col-11">
                </p>
                <div class="nyaMadreError rojo msm"></div>

                <p class="form-group col-12">
                    <label for="DNIMadre" class="col-1" >DNI<span class="rojo">*</span>:</label>
                    <input type="text" id="DNIMadre" name="DNIMadre" class="col-4"  style="margin-right: 10px">
                    <label for="profesionMadre">Profesión:</label>
                    <input type="text" id="profesionMadre" name="profesionMadre" class="col-6">
                </p>
                <div class="DNIMadreError rojo msm"></div>


                <p class="form-group col-12" style="padding-bottom: 20px">
                    <label for="telefonoMadre" class="col-4" >Teléfonos de contacto<span class="rojo">*</span>:</label>
                    <input type="text" id="telefonoMadre" name="telefonoMadre" class="col-5"  style="margin-right: 10px">
                    <label for="emailMadre" class="col-2">E-mail<span class="rojo">*</span>:</label>
                    <input type="text" id="emailMadre" name="emailMadre" class="col-6">
                </p>
                <div class="telefonoMadreError rojo msm"></div>
                <div class="emailMadreError rojo msm"></div>
            </div>

            <%--En este div tenemos los OTROS DATOS DE INTERÉS del alumno por si tiene alguna alergia --%>
            <h3 class="gris col-12">OTROS DATOS DE INTERÉS</h3>
            <div>
                <p>
                    <label for="alergias" class="col-1">ALERGIAS:</label>
                    <input type="text" id="alergias" name="alergias" class="col-10">
                </p>
                <p>
                    <label for="alergiasAlimentarias">ALERGIAS ALIMENTARIAS:</label>
                    <input type="text" id="alergiasAlimentarias" name="alergiasAlimentarias" class="col-8">
                </p>
                <p>
                    <label for="intolerancia">INTOLERANCIA:</label>
                    <input type="text" id="intolerancia" name="intolerancia" class="col-9">
                </p>
                <p>
                    <label for="medicacion">MEDICACION:</label>
                    <input type="text" id="medicacion" name="medicacion" class="col-9">
                </p>
                <p>
                    <label for="obervaciones">OBSERVACIONES:</label>
                    <input type="text" id="obervaciones" name="obervaciones" class="col-9">
                </p>
            </div>

            <%--En este div tenemos los OTROS DATOS DE INTERÉS del alumno por si tiene alguna alergia --%>
            <h3 class="gris col-12">OTROS DATOS DE INTERÉS</h3>
            <h3>PADRE / TUTOR:</h3>
            <table class="col-12">
                <tr>
                    <th>NOMBRE Y APELLIDO</th>
                    <th class="col-2">D.N.I</th>
                    <th class="col-2">TELÉFONO</th>
                    <th class="col-3">RELACIÓN O PARENTESCO</th>
                </tr>
                <tr>
                    <td><input type="text" class="sin-borde" id="nyaRecogida1" name="nyaRecogida1"></td>
                    <td><input type="text" class="sin-borde" id="DNIRecogida1" name="DNIRecogida1"></td>
                    <td><input type="text" class="sin-borde" id="telefonoRecogida1" name="telefonoRecogida1"></td>
                    <td><input type="text" class="sin-borde" id="relacionRecogida1" name="relacionRecogida1"></td>
                </tr>
                <tr>
                    <td><input type="text" class="sin-borde" id="nyaRecogida2" name="nyaRecogida2"></td>
                    <td><input type="text" class="sin-borde" id="DNIRecogida2" name="DNIRecogida2"></td>
                    <td><input type="text" class="sin-borde" id="telefonoRecogida2" name="telefonoRecogida2"></td>
                    <td><input type="text" class="sin-borde" id="relacionRecogida2" name="relacionRecogida2"></td>
                </tr>
                <tr>
                    <td><input type="text" class="sin-borde" id="nyaRecogida3" name="nyaRecogida3"></td>
                    <td><input type="text" class="sin-borde" id="DNIRecogida3" name="DNIRecogida3"></td>
                    <td><input type="text" class="sin-borde" id="telefonoRecogida3" name="telefonoRecogida3"></td>
                    <td><input type="text" class="sin-borde" id="relacionRecogida3" name="relacionRecogida3"></td>
                </tr>
                <tr>
                    <td><input type="text" class="sin-borde" id="nyaRecogida4" name="nyaRecogida4"></td>
                    <td><input type="text" class="sin-borde" id="DNIRecogida4" name="DNIRecogida4"></td>
                    <td><input type="text" class="sin-borde" id="telefonoRecogida4" name="telefonoRecogida4"></td>
                    <td><input type="text" class="sin-borde" id="relacionRecogida4" name="relacionRecogida4"></td>
                </tr>
                <tr>
                    <td><input type="text" class="sin-borde" id="nyaRecogida5" name="nyaRecogida5"></td>
                    <td><input type="text" class="sin-borde" id="DNIRecogida5" name="DNIRecogida5"></td>
                    <td><input type="text" class="sin-borde" id="telefonoRecogida5" name="telefonoRecogida5"></td>
                    <td><input type="text" class="sin-borde" id="relacionRecogida5" name="relacionRecogida5"></td>
                </tr>
            </table>


            <p>
                <button type="submit" id="submit">Enviar</button>
                <input type="reset" value="Borrar" id="reset">
            </p>
            <p class="error"></p>
        </form>
    </div>
</body>
</html>
