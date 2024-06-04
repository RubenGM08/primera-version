<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="views/css/responsive.css">
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="icon" href="views/img/js.png">
    <script src="views/script/script2.js"></script>
    <title>Conjuntos</title>
</head>
<body>
    <div class="contenedor2 col-10">
        <h1>Agenta Telefonica</h1>
        <label for="nombre">Nombre:</label>
        <input type="text" name="nombre" id="nombre">
        <label for="telefono">Telefono:</label>
        <input type="text" name="telefono" id="telefono" maxlength="9">

        <p>
            <button id="agregar" class="boton">➕</button>
        </p>
        <p class="error igual"></p>
        <table id="tabla">
            <tr>
                <th>Nombre:</th>
                <th>Telefono:</th>
            </tr>
        </table>
    </div>

</body>
</html>