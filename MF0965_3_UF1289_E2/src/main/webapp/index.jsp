<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>MF0965_3_UF1289_E2</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link rel="stylesheet" href="Views/css/style.css">
</head>
<body>
<div class="col-8 contenedor-centro">
    <div class="col-8">
        <img src="Views/img/3277738b-f542-4b8b-b4b2-944f245eec16.jpg" alt="federacion">
    </div>
    <header class="col-9">
    <h1>XXXV TRIATLON HOCES DE CUENCA 24</h1>
    </header>
        <form action="" class="col-9 centrar-div" >
            <div>
                <div class="pasos-navegador texto-centro">
                    <h4> Seleccion de tarifa  >  Formulario  >  Cesta de inscripcion  >  Pago  >  justificante</h4>
                </div>
                <div class="col-8 texto-centro">
                    <h3>Formulario</h3>
                    <h4>No Federados: 61,00
                        <span class="material-symbols-outlined euro-tamano">
                        euro
                        </span></h4>
                    <h3>Datos personales</h3>
                </div>
                <div class="col-8">
                    <p>
                        <label for="nombre">Nombre*</label>
                        <input type="text" id="nombre" name="nombre" class="col-7 tamano-caja-nombre">
                    </p>
                    <p>
                        <label for="apellidos">Apellidos*</label>
                        <input type="text" id="apellidos" name="apellidos" class="col-7 tamano-caja-apellidos">
                    </p>
                    <p>
                        <label for="documento">Documento</label>*
                        <select name="documento" id="documento" class="tamano-caja-documento col-3">
                            <option value="1">DNI</option>
                            <option value="2">Pasaporte</option>
                            <option value="3">Tarjeta de residencia/NIE</option>
                            <option value="4">Menor</option>
                            <option value="5">Otro</option>
                        </select>
                        <input type="text" id="documento1" name="documento1" value="Introduce el número" class="tamano-caja-documento2 col-3">
                    </p>
                    <p>
                        <label for="nacimiento">Fecha de Nacimiento*</label>
                        <select name="dia" id="nacimiento" class="col-1 tamano-caja-dia">
                            <option value="-1">Dia</option>
                            <option value="1">1</option>
                            <option value="2">2</option>
                            <option value="3">3</option>
                        </select>
                        <select name="mes" id="nacimiento1" class="col-2 tamano-caja-mes">
                            <option value="-1">Mes</option>
                            <option value="1">Enero</option>
                            <option value="2">Febrero</option>
                            <option value="3">Marzo</option>
                        </select>
                        <select name="ano" id="nacimiento2" class="col-1 tamano-caja-ano">
                            <option value="-1">Año</option>
                            <option value="1">1924</option>
                            <option value="2">1925</option>
                            <option value="3">1926</option>
                        </select>
                    </p>
                    <p>
                        <label for="genero">Género*</label>
                        <select name="genero" id="genero">
                            <option value="1">[Selecciona]</option>
                            <option value="2">Hombre</option>
                            <option value="3">Mujer</option>
                        </select>
                    </p>
                    <p>
                        <label for="email">Email*</label>
                        <input type="email" id="email" name="email">
                    </p>
                    <p>
                        <label for="repemail">Repite Email*</label>
                        <input type="repemail" id="repemail" name="repemail">
                    </p>
                    <p>
                        <label for="tlf">Teléfono móvil</label>
                        <select name="tlf" id="tlf">
                            <option value="1">Prefijo intermacional</option>
                            <option value="2">España(+34)</option>
                            <option value="3">Argentina(+54)</option>
                            <option value="4">Guinea(+224)</option>
                        </select>
                        <input type="number" id="tlf1" name="tlf">
                    </p>
                    <p>
                        <label for="pais">País / Provincia</label>
                        <select name="pais" id="pais">
                            <option value="1">[País]</option>
                            <option value="2">Abkhazia</option>
                            <option value="3">Afganistán</option>
                            <option value="4">Albana</option>
                        </select>
                    </p>
                    <p>
                        <label for="poblacion">Población*</label>
                        <input type="text" id="poblacion" name="poblacion">
                    </p>
                    <p>
                        <label for="nacionalidad">Nacionalidad*</label>
                        <select name="nacionalidad" id="nacionalidad">
                            <option value="1">[País]</option>
                            <option value="2">Abkhazia</option>
                            <option value="3">Afganistán</option>
                            <option value="4">Albana</option>
                        </select>
                    </p>
                    <p>
                        <div>
                        <label for="pregunta">¿Eres un corredor Local?</label>
                            <input type="radio" id="pregunta" name="pregunta" value="femenino">Femenino
                        </div>
                        <div>
                            <input type="radio" id="pregunta1" name="pregunta" value="masculino">Masculino
                        </div>
                    </p>
                </div>
            </div>
        </form>
</div>
</body>
</html>