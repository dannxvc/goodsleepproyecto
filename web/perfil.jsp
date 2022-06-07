<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.*"%>
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
    <link rel="icon" href="img/logo_yellow.png" type="image/png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="css/index.css">
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script defer src="js/sweetalert.js" type="text/javascript"></script>
    <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
    <script defer src="js/alerts.js"></script>
   <title>Good Sleep | Perfil ${usuarioC.id_cliente.nombre} </title>
</head>
<body id="yellow">
    <header id="header">
        <a  id="btn-cerrar-cliente"href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon" src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        <h1>hola, ${usuarioC.id_cliente.nombre} !!</h1>
    </header>
    <nav id="navbar">
        <div>
        <a href="perfil.jsp">
            <img class="icon nav-icon icon-active"  src="img/yo.svg" alt="my profile">
        </a>
        <span class="tooltip">mi perfil</span>
        </div>
        <div>
        <a href="clientecontrol?opc=3&cod=${usuarioC.id_cliente.id_cliente}">
            <img class="icon nav-icon" src="img/mis-reser.svg" alt="my reservations">
        </a>
        <span class="tooltip">mis reservaciones</span>
        </div>
        <div>
        <a href="reservar.jsp">
            <img class="icon nav-icon" src="img/reservar.svg" alt="book a room">
        </a>
        <span class="tooltip">reservar</span>
        </div>
        <div>
        <a href="index.html">
            <img class="icon nav-icon" src="img/home.svg" alt="inicio">
        </a>
        <span class="tooltip">ir al inicio</span>
        </div>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form">
           <form class="form form-crear-cuenta" ><!--action="control"-->
                <p>Mis datos</p>
                <input class="input input-gray" type="text" name="id_cliente" value="${usuarioC.id_cliente.id_cliente}" readonly>
                <input class="input input-gray" type="text" name="nombre" value="${usuarioC.id_cliente.nombre}" readonly>                
                <input class="input input-gray" type="text" name="apellido" value="${usuarioC.id_cliente.apellido}" readonly>
                <input class="input input-gray" type="text" name="tipoDoc" value="${usuarioC.id_cliente.tipoDoc}" readonly>
                <input class="input input-gray" type="tel" name="celular" value="${usuarioC.id_cliente.celular}" readonly>
                <input class="input input-gray" type="email" name="correo" value="${usuarioC.id_cliente.correo}" readonly>
                
                
                
                <p>Usuario & Contraseña</p>
                <input class="input input-pink-dark" type="text" name="usuario" value="${usuarioC.usuario}" readonly>
                <input class="input input-pink-dark" type="password" name="password" value="${usuarioC.password}" readonly>
                <a href="javascript:editarPerfil('${usuarioC.id_cliente.id_cliente}','${usuarioC.id_cliente.tipoDoc}',
                   '${usuarioC.id_cliente.nombre}','${usuarioC.id_cliente.apellido}',
                    '${usuarioC.id_cliente.celular}', '${usuarioC.id_cliente.correo}');" class="btn btn-white"> Editar Perfil</a>
            </form>
        </section>
        
    </main>
</body>
 <script> 
       function editarPerfil(codc,tipodoc,nom,ape,cel,correo){ 
        //window.alert(prec); 
      //  alert(prod); 
       location="clientecontrol?opc=1&cod="+codc; 
      //  window.parent.recibeSeleccion(codp,prod,prec);        
    } 
    </script> 
</html>
<%
   }else{
    response.sendRedirect("login_cliente.jsp");
} 
%>