<%--
  Created by IntelliJ IDEA.
  User: PROGRAMACION
  Date: 17/06/2024
  Time: 15:43
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
<%--<div>--%>
<%--<img src="views/img/23181124_6757291(2).jpg" alt="fondo pantalla" class="fondo-imagen">--%>
<%--</div>--%>

<div class="container col-12">
    <p></p>
    <form action="" id="validarForm" onsubmit="return validarFomulario()">
            <img src="views/img/titulo.jpg" alt="MIKINDER" width="686">
            <p>A continuación, indique los datos suministrados para darse de alta en nuestro Sistema.</p>
            <p>Los marcados con <span class="rojo">*</span> son obligatorios. </p>
            <h1>FORMALIZACIÓN MATRÍCULA</h1>
            <p></p>
            <h3 class="gris">DATOS NIÑO/NIÑA</h3>
            <div class="tamano-letra">
                <div>
                    <label for="nombreAlumno" >Nombre<span class="rojo">*</span>:</label>
                    <input type="text" id="nombreAlumno" name="nombreAlumno" class="col-10 caja">
                </div>
                <div class="nombreAlumnoError rojo msm"></div>

                <div>
                    <label for="apellidosAlumno" >Apellidos<span class="rojo">*</span>:</label>
                    <input type="text" id="apellidosAlumno" name="apellidosAlumno" class="col-10 caja">
                </div>
                <div class="apellidosAlumnoError rojo msm"></div>

                <div>
                    Fecha de nacimiento<span class="rojo">*</span>:
                    <input type="text" id="FechaNacimientoAlumno" name="FechaNacimientoAlumno" class="col-10 caja">
                </div>
                <div>
                    <div>
                        Poblacion<span class="rojo">*</span>:
                        <input type="text" id="poblacion" name="poblacion" class="col-4 caja">
                    </div>
                    <div>
                        C.P.<span class="rojo">*</span>:
                        <input type="text" id="C-P" name="C-P" class="col-4 caja">
                    </div>
                </div>
            </div>
            <h3 class="gris">DATOS FAMILIARES:</h3>
            <p></p>
            <div class="tamano-letra">
                <h3>TUTOR</h3>
                <div>
                    Nombre y apellidos<span class="rojo">*</span>:
                    <input type="text" id="nyaTutor" name="nyaTutor" class="col-9 caja">
                </div>
                <div>
                    DNI<span class="rojo">*</span>:
                    <input type="text" id="DNITutor" name="DNITutor" class="col-4 caja">
                </div>
                <div>
                    Profesión:
                    <input type="text" id="profesionTutor" name="profesionTutor" class="col-4 caja">
                </div>
                <div>
                    Teléfonos de contacto<span class="rojo">*</span>:
                    <input type="number" id="telefonoTutor" name="telefonoTutor" class="col-4 caja">
                </div>
                <div>
                    E-mail<span class="rojo">*</span>:
                    <input type="text" id="correoTutor" name="correoTutor" class="col-4 caja">
                </div>
            </div>


            <h3 class="gris">OTROS DATOS DE INTERÉS:</h3>
            <div class="tamano-letra">
                <div>
                    ALERGIAS:
                    <input type="text" id="alergias" name="alergias" class="col-9 caja">
                </div>
                <div>
                    ALERGIAS ALIMENTARIAS:
                    <input type="text" id="alergiasAlimentarias" name="alergiasAlimentarias" class="col-8 caja">
                </div>
                <div>
                    INTOLERANCIAS:
                    <input type="text" id="intolerancias" name="intolerancias" class="col-8 caja">
                </div>
                <div>
                    MEDICACIÓN:
                    <input type="number" id="medicacion" name="medicacion" class="col-8 caja">
                </div>
                <div>
                    OBSERVACIONES:
                    <input type="text" id="observaciones" name="observaciones" class="col-8 caja">
                </div>
            </div>

            <h3 class="gris">AUTORIZACIONES:</h3>
            <h3>RECOGIDA DEL NIÑO/A:</h3>
            <table id="tabla" class="col-12">
                <tr>
                    <th>NOMBRE Y APELLIDOS</th>
                    <th>DNI</th>
                    <th>TELÉFONO</th>
                    <th>RELACIÓN</th>
                </tr>
                <tr>
                    <td><input type="text" id="nyaTutor1" name="nyaTutor1" class="col-12"></td>
                    <td><input type="text" id="DN1Tutor1" name="DNITutor1" class="col-12"></td>
                    <td><input type="text" id="telefonoTutor1" name="telefonoTutor1" class="col-12"></td>
                    <td><input type="text" id="relacionTutor1" name="relacionTutor1" class="col-12"></td>
                </tr>
                <tr>
                    <td><input type="text" id="nyaTutor2" name="nyaTutor2" class="col-12"></td>
                    <td><input type="text" id="DN1Tutor2" name="DNITutor2" class="col-12"></td>
                    <td><input type="text" id="telefonoTutor2" name="telefonoTutor2" class="col-12"></td>
                    <td><input type="text" id="relacionTutor2" name="relacionTutor2" class="col-12"></td>
                </tr>
                <tr>
                    <td><input type="text" id="nyaTutor3" name="nyaTutor3" class="col-12"></td>
                    <td><input type="text" id="DN1Tutor3" name="DNITutor3" class="col-12"></td>
                    <td><input type="text" id="telefonoTutor3" name="telefonoTutor3" class="col-12"></td>
                    <td><input type="text" id="relacionTutor3" name="relacionTutor3" class="col-12"></td>
                </tr>
                <tr>
                    <td><input type="text" id="nyaTutor4" name="nyaTutor4" class="col-12"></td>
                    <td><input type="text" id="DN1Tutor4" name="DNITutor4" class="col-12"></td>
                    <td><input type="text" id="telefonoTutor4" name="telefonoTutor4" class="col-12"></td>
                    <td><input type="text" id="relacionTutor4" name="relacionTutor4" class="col-12"></td>
                </tr>
            </table>
            <p>
                <input type="submit" value="Registrar" class="boton izquierda">
                <input type="reset" value="Borrar" class="boton derecha">
            </p>
            <p class="error"></p>
    </form>
            <br><br><br><br><br>
</div>
</body>
</html>
