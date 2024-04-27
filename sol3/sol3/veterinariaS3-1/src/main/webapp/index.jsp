<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenido a Veterinaria S.A</title>
    <style>
        body {
            font-family: 'Arial', sans-serif;
            margin: 0;
            padding: 0;
            background-color: #f2f2f2;
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 20px;
        }

        #welcomeMessage {
            margin: 0;
        }

        button {
            background-color: #4CAF50;
            color: white;
            padding: 10px;
            border: none;
            cursor: pointer;
            margin: 10px;
        }

        section {
            text-align: center;
            padding: 20px;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        footer p {
            margin: 0;
        }
    </style>
</head>
<body>

<header>
    <h1 id="welcomeMessage">Veterinaria S.A</h1>
</header>

<!-- Agrega un botón con un identificador único -->
<button id="btnInicio">Registrarse</button>
<button id="btnHome">Home</button>
<section>
    <!-- Contenido de la sección -->
</section>

<footer>
    <p>&copy; 2023 Mi Página Web</p>
</footer>

<script src="com.edc.jdbc.veterinariaS3-1.controller.js"></script>
<script>
    document.getElementById('btnInicio').addEventListener('click', function() {
        // Redirige a la página "Register.html" cuando se hace clic en el botón
        window.location.href = 'Register.html';
    });
    document.getElementById('btnHome').addEventListener('click', function() {
        // Redirige a la página "home.html" cuando se hace clic en el botón
        window.location.href = 'home.html';
    });
</script>
</body>
</html>
