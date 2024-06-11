<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" href="views/css/style.css">
    <link rel="stylesheet" href="views/css/responsive.css">
    <script src="views/script/script.js"></script>
</head>
<body>
    <div class="container">
        <h2>Objetos de tipo DATE</h2>
        <table>
            <tr>
                <td>
                    <button id="fechaHoy" class="boton">Ver Fecha de Hoy</button>
                </td>
                <td>
                    <button id="diaHoy" class="boton">Hoy es?</button>
                </td>
                <td>
                    <button id="mesActual" class="boton">Y el mes?</button>
                </td>
                <td>
                    <button id="anioActual" class="boton">Y el año?</button>
                </td>
                <td>
                    <button id="fechaCompleta" class="boton">Fecha Completa</button>
                </td>
                <td>
                    <button id="hora" class="boton">¿Qué hora es?</button>
                </td>

            </tr>
        </table>
        <p id="salida"></p>
    </div>
</body>
</html>
