<%@page import="modelo.*"%>
<%@page import="dao.crearCuentaDAO"%>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="/img/logo.png" type="image/png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/index.css">
    <title>Good Sleep | Crear Cuenta</title>
</head>
<body id="pink">
    <header id="header">
        <a href="login_cliente.jsp" class="btn btn-login">
           <img class="login-icon"src="img/profile.svg" alt="log in">
           LOG IN
        </a>
        <h1>crear cuenta</h1>
    </header>
    <nav id="navbar">
        <a href="login_cliente.jsp">
            <img class="icon nav-icon icon-active" src="img/flecha.svg" alt="go back">
        </a>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form">
            <form class="form form-crear-cuenta" action="cccontrol">
                <p>Registra tus datos</p>
                <input class="input input-gray" type="text" placeholder="Nombre" name="nombre" required>
                <input class="input input-gray" type="text" placeholder="Apellido" name="apellido" required>
                <select class="input input-gray" name="tipoDoc" id="tipoDoc" required>
                    <option value="dni">DNI</option>
                    <option value="pasaporte">Pasaporte</option>
                </select>
                <input class="input input-gray" type="text" placeholder="Nro Documento" name="id_cliente" required>
                <input class="input input-gray" type="tel" placeholder="Celular" name="celular" required>
                <input class="input input-gray" type="email" placeholder="Correo" name="correo" required>
                <p>Usuario & Contraseña</p>
                <input class="input input-pink-dark" type="text" placeholder="Usuario" name="usuario" required>
                <input class="input input-pink-dark" type="password" placeholder="Password" name="password" required>
                <input type="submit" class="btn btn-white" value="CREAR CUENTA">
            </form>
        </section>
        
    </main>
</body>
</html>
