<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>📌Registro de Usuario</title>
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="icon" href="views/img/js.png">
    <script src="views/script/script2.js"></script>
</head>
<body>
    <div class="container">
        <h1>Alta de Usuario</h1>
        <p>A continuación, indique los datos suministrados para darse de alta en nuestro Sistema.</p>
        <p>Los márcados con <span class="rojo">*</span>son obligatorios.</p>
        <form action="" id="resgistroForm" onsubmit="return validarFormulario()">
            <p class="form-group">
                <label for="nombre">Nombre:<span class="rojo">*</span></label>
                <input type="text" id="nombre" name="nombre">
            </p>
            <p class="form-group">
                <label for="apellido">Apellidos:<span class="rojo">*</span></label>
                <input type="text" id="apellido" name="apellido">
            </p>
            <p class="form-group">
                <label for="edad">Edad:<span class="rojo">*</span></label>
                <input type="number" id="edad" name="edad">
            </p>
            <p class="form-group">
                <label for="tlf">Numero de Telefono:<span class="rojo">*</span></label>
                <input type="text" id="tlf" name="tlf">
            </p>
            <p class="form-group">
                <label for="direccion">Dirección:</label>
                <input type="text" id="direccion" name="direccion">
            </p>
            <p class="form-group">
                <label for="email">Correo Electronico:<span class="rojo">*</span></label>
                <input type="text" id="email" name="email">
            </p>
            <p class="form-group">
                <label for="contrasena">Password:<span class="rojo">*</span></label>
                <input type="text" id="contrasena" name="contrasena">
            </p>
            <p class="form-group">
                <label for="reptiContrasena">Repite el Password:<span class="rojo">*</span></label>
                <input type="text" id="reptiContrasena" name="reptiContrasena">
            </p>
            <p class="alinear">
                <input type="reset" value="Borrar" class="boton derecha">
                <input type="submit" value="Registrar" class="boton izquierda">
            </p>
            <p class="error"></p>
        </form>

    </div>
</body>
</html>