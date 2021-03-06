<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.Cliente,dao.*"%>
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
    <title>Good Sleep | Perfil</title>
</head>
<body id="yellow">
    <%
   Cliente c=(Cliente)request.getAttribute("dato");
    
 %>
    <header id="header">
        <a href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon" src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        <h1>editar</h1>
    </header>
    <nav id="navbar">
        <a href="perfil.jsp">
            <img class="icon nav-icon icon-active"  src="img/yo.svg" alt="my profile">
        </a>
        <a href="misreservas.jsp">
            <img class="icon nav-icon" src="img/mis-reser.svg" alt="my reservations">
        </a>
        <a href="reservar.jsp">
            <img class="icon nav-icon" src="img/reservar.svg" alt="book a room">
        </a>
        <a href="index.html">
            <img class="icon nav-icon" src="img/home.svg" alt="inicio">
        </a>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form">
            <form class="form form-crear-cuenta" action="clientecontrol">
                <input type="hidden" name="opc" value="2">
                <p>Mis datos</p>
                
                 <input class="input input-gray" type="text" name="id_cliente" value="<%=c.getId_cliente()%>" readonly>
                <!--<input class="input input-gray" type="text" name="tipoDoc" value="<%//=c.getTipoDoc()%>">-->
                <select class="input input-gray" name="tipoDoc" id="tipoDoc" required>
                    <option disabled selected value>Tipo de Documento</option>
                    <option value="DNI">DNI</option>
                    <option value="Pasaporte">Pasaporte</option>
                </select>
                <input class="input input-gray" type="text" name="nombre" value="<%=c.getNombre()%>" >                
                <input class="input input-gray" type="text" name="apellido" value="<%=c.getApellido()%>">
                <input class="input input-gray" type="tel" name="celular" value="<%=c.getCelular()%>">
                <input class="input input-gray" type="email" name="correo" value="<%=c.getCorreo()%>">
              
              
                <button type="submit" class="btn btn-white" >Guardar Cambios</button>
            </form>
        </section>
        
    </main>
</body>
</html>
<%
   }else{
    response.sendRedirect("login_cliente.jsp");
} 
%>