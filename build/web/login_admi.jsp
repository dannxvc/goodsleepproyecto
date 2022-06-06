<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/logo_purple.png" type="image/png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/index.css">
    <title>Good Sleep | Log In Admi</title>
</head>
<body id="purple">
    <header id="header">
        <a href="index.html" class="btn btn-login btn-logout">
            <img class="login-icon"src="img/home.svg" alt="log in">
            INICIO
         </a>
        <h1>log in admi</h1>
    </header>
    <nav id="navbar">
        <div>
        <a href="login_cliente.jsp">
            <img class="icon nav-icon" src="img/profile.svg" alt="go to login for admi">
        </a>
        <span class="tooltip">log in cliente</span>
        </div>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form section-form-login">
            <h2>Hola, admi!</h2>
            <form class="form form-login form-login-admi"action="uacontrol?accion=verificar"  method="post">
                <input class="input input-gray" type="text" placeholder="Usuario" name="usuario" required>
                <input class="input input-gray" type="password" placeholder="Password" name="password" required>
                <p class="p-pink"><img class="login-icon" src="img/danger.svg" alt=""> Log In solo para administrador@s.  </p>
                <input type="submit" name="verificar" class="btn btn-pink" value="INICIAR SESION">
            </form>
            <%
                    if(request.getAttribute("msje")!=null){
                        String msg=request.getAttribute("msje").toString();
           %>
                 <div class="msg-error" role="alert"><%=msg%></div>
            <%
                }
             %>
        </section>
    </main>
</body>
</html>