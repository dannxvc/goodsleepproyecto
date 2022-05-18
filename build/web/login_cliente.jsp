<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*,java.util.*,miServlet.*"%>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/logo.png" type="image/png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/index.css">
    <title>Good Sleep | Log In</title>
</head>
<body id="black">
    <header id="header">
        <a href="index.html" class="btn btn-login btn-logout">
            <img class="login-icon"src="img/home.svg" alt="log in">
            INICIO
         </a>
        <h1>log in</h1>
    </header>
    <nav id="navbar">
        <a href="login_admi.jsp">
            <img class="icon nav-icon icon-active" src="img/laptop.svg" alt="go to login for admi">
        </a>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form section-form-login">
            <h2>Te damos la bienvenida!</h2>
            <p class="p-pink">Ingresa con tu usuario y password para poder reservar tu habitacion!</p>
            <form class="form form-login form-login-cliente" action="uccontrol" method="post">
                <input class="input input-gray" type="text" placeholder="Usuario" name="usuario" required>
                <input class="input input-gray" type="password" placeholder="Password" name="password" required>
                <input type="submit" class="btn btn-pink" name="btn" value="INICIAR SESION">
                <input type="hidden" class="btn btn-pink" name="op" value="login">
            </form>
            
            <a class="btn btn-white" href="crear_cuenta.html">NO TIENES CUENTA? CREATE UNA</a>
           <%
                    if(request.getAttribute("msq")!=null){
                        String msg=request.getAttribute("msq").toString();
           %>
                 <div class="msg-error" role="alert"><%=msg%></div>
            <%
                }
             %>
          
        </section>
        
    </main>
</body>
</html>