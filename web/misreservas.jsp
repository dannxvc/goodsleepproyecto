<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Cliente"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(session.getAttribute("usuarioC")!=null){  
%>
<!DOCTYPE html>
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
    <title>Good Sleep | Mis Reservaciones</title>
</head>
<body id="yellow">
    <header id="header">
        <a href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon" src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        <h1>mis reservaciones</h1>
    </header>
    <nav id="navbar">
        <a href="perfil.jsp">
            <img class="icon nav-icon"  src="img/yo.svg" alt="my rese  rvations">
        </a>
        <a href="misreservas.jsp">
            <img class="icon nav-icon icon-active" src="img/mis-reser.svg" alt="book a room">
        </a>
        <a href="reservar.jsp">
            <img class="icon nav-icon" src="img/reservar.svg" alt="book a room">
        </a>  
        <a href="index.html">
            <img class="icon nav-icon" src="img/home.svg" alt="inicio">
        </a>
    </nav>
    <main id="main-mis-reservas">
        <section>

        </section>
        
    </main>
</body>
</html>
<%
   }else{
    response.sendRedirect("login_cliente.jsp");
} 
%>