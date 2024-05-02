<%--
  Created by IntelliJ IDEA.
  User: programador
  Date: 25/04/2024
  Time: 10:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="header.jsp"></jsp:include>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Formularios</title>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@24,400,0,0"/>
    <link rel="stylesheet" href="Views/css/style.css">
</head>
<body>
<div class="contenedorHijos col-10">
<form action="index.jsp" method="get">

   <fieldset>
    <legend>Datos Personales</legend>
    <%--    Etiqueta  llama Label que es para escribir lo que solicita al usuario y
            poner el foco en la caja de la entrada--%>
    <p>
        <label for="nombre">Nombre:</label> <!--Etiqueta, y no es obligatoria -->
        <input type="text" id="nombre" maxlength="16" autocomplete name="nombre"> <!--caja para escribir-->
    </p>
    <p>
        <label for="apellidos">Apellidos</label>
        <input type="text" id="apellidos" name="apellidos" readonly value="Medina">
    </p>
    <p>
        <label for="edad">Edad</label>
        <input type="number" id="edad" min="0" max="100" size="3" name="edad">
    </p>
   </fieldset>
    <p>
        <label for="passw">Contraseña</label>
        <input type="password" id="passw" name="passw" pattern="^(?=.*[A-Z])(?=.*[a-z])(?=.*\d)(?=.*[@$!%*?&.])[A-Za-z\d@$!%*?&]{8,12}$" required>
    </p>
    <p>
        <label for="email">Email</label>
        <input type="email" id="email" required name="email" >
    </p>
    <p>
        <label for="sexo">Sexo</label>
        <input type="radio" id="sexo" name="sexo" value="femenino">Femenino
        <input type="radio" id="sexom" name="sexo" value="masculino">Masculino
    </p>
    <p>
        <label for="cursos">Cursos de Interés</label>
        <input type="checkbox" id="cursos" name="cursosHTML" value="html">HTML
        <input type="checkbox" id="cursos1" name="cursosCSS" value="css">CSS
        <input type="checkbox" id="cursos2" name="cursosJavaS" value="javascript">JavaScript
        <input type="checkbox" id="cursos3" name="cursosPHP" value="php">PHP
        <input type="checkbox" id="cursos4" name="cursosPython" value="python">Python
    </p>

        <p>
            <label for="provincia">Provincia</label>
            <select name="provincia" id="provincia">
                <option value="1">Ciudad Real</option>
                <option value="2">Toledo</option>
                <option value="3">Albacete</option>
                <option >Cuenta</option>
                <option >Guadalajara</option>
            </select>
        </p>

        <p>
            <label for="color">Color de Camiseta:</label>
            <input type="color" id="color" name="color">
        </p>
        <p>
            <label for="fechaNacimiento">Fecha Nacimiento</label>
            <input type="date" id="fechaNacimiento" name="fechaNacimiento"  >
        </p>
        <p>
            <label for="hora">Hora del Curso</label>
            <input type="time" name="hora" id="hora" min="08:00" max="20:00" >
        </p>

        <p >La hora actual es:  <span id="horaActual"></span></p>

        <p>
            <label for="dni">Subir Documento de Identidad:</label>
            <input type="file" name="dni" id="dni" accept="application/pdf,image/png,image/jpeg">

        </p>
<p>
    <label for="tiempoEstudio">Tiempo de Estudio</label>
    <input type="range" id="tiempoEstudio" name="tiempoEstudio" min="2" max="12" step="0.30">
    <span id="valorRange"></span>
</p>

        <p>
            <label for="mensaje">Mensaje</label>
            <textarea name="mensaje" id="mensaje" cols="30" rows="10" placeholder="Escribe aqui tu mensaje"></textarea>
        </p>

        <p>
            <label for="navegador">Navegador Preferifo:</label>
            <input list="navegadorS" id="navegador" name="navegador" >
            <datalist id="navegadorS">
                <option value="Chrome">Chrome</option>
                <option value="Firefox">FireFox</option>
                <option value="Edge">Edge</option>
                <option value="Safari">Safari</option>
                <option value="Opera">Opera</option>
            </datalist>

        </p>

    <input type="submit" value="Enviar Formulario" name="submit1" >
    <input type="reset" value="Borrar Formulario">
</form>
</div>
<script>
    const fecha=new Date();
    console.log(fecha.toLocaleDateString("es-US"));
    let anio=fecha.getFullYear()-3;
    console.log(anio);
    let fechaNueva=anio+"-01-01";
    console.log(fechaNueva);
    let fechaTope=fecha.getFullYear()+"-0"+(fecha.getMonth()+1)+"-"+fecha.getDate();
    console.log(fechaTope);
    let  hora=fecha.getHours();
    let min=fecha.getMinutes()
    document.querySelector("#horaActual").innerHTML=hora+":"+min;
    document.querySelector("#fechaNacimiento").setAttribute("min",fechaNueva);
    document.querySelector("#fechaNacimiento").setAttribute("max",fechaTope);
    let rango=document.querySelector("#tiempoEstudio");
</script>

</body>
</html>
