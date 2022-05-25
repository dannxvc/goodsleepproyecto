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
    <title>Good Sleep | Reservar</title>
</head>
<body id="yellow">
    <header id="header">
        <a href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon"src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        
        <h1>reservar habitacion</h1>
    </header>
    <nav id="navbar">
        <a href="perfil.jsp">
            <img class="icon nav-icon"  src="img/yo.svg" alt="my rese  rvations">
        </a>
        <a href="misreservas.jsp">
            <img class="icon nav-icon" src="img/mis-reser.svg" alt="book a room">
        </a>
        <a href="reservar.jsp">
            <img class="icon nav-icon icon-active" src="img/reservar.svg" alt="book a room">
        </a>
        <a href="index.html">
            <img class="icon nav-icon" src="img/home.svg" alt="inicio">
        </a>
    </nav>
    <main id="crear-cuenta">
        <section class="section-form">
            <form class="form form-reservar">
                <div class="label-grid label-grid-two">
                    <label class="label-col" for="fechaI">Fecha Inicial
                        <input id="fechaI" class="input input-gray" type="date" name="fechaI" required>   
                    </label> 
                    <label class="label-col" for="fechaI">Fecha Final
                        <input class="input input-gray" type="date" name="fechaF" required>
                    </label>                
                </div>  
                    <input class="input input-gray" type="text" placeholder="Buscar Categoria" name="id_cliente" required>
                <div></div>
                <div class="form-col">
                    <label class="label-col label-grid" for="servAdicional">Servicio Adicional
                        <label for="S0001" class="input label-radio">
                            transporte aeropuerto
                            <input class="btn-radio"id="S0001" type="radio" name="servAdicional" value="S0001" required checked>  
                        </label>
                        <label for="S0002" class="input label-radio">
                            tour hotel
                            <input class="btn-radio" id="S0002" type="radio" name="servAdicional" value="S0002" required>  
                        </label>
                        <label for="S0003" class="input label-radio">
                            ninguno
                            <input class="btn-radio" id="S0003" type="radio" name="servAdicional" value="S0003" required>  
                        </label>
                   </label>           
                </div>               
                <div class="form-col">
                    <label class="label-col label-grid" for="cantPersonas">Cantidad Personas
                        <label for="CP-1" class="input label-radio">
                             1
                            <input class="btn-radio"id="CP-1" type="radio" name="cantPersonas" value="CP-1" required checked>  
                        </label>
                        <label for="CP-2" class="input label-radio">
                            2
                            <input class="btn-radio" id="CP-2" type="radio" name="cantPersonas" value="CP-2" required>  
                        </label>
                        <label for="CP-3" class="input label-radio">
                            3
                            <input class="btn-radio" id="CP-3" type="radio" name="cantPersonas" value="CP-3" required>  
                        </label>
                   </label>           
                </div>
                <div class="label-grid label-grid-two">
                    <label class="label-col" for="fechaI">Sub Total
                        <input id="fechaI" class="input input-gray" type="text" name="fechaI" readonly>   
                    </label> 
                    <label class="label-col" for="fechaI">Precio Total
                        <input class="input input-pink" type="text" name="fechaF" readonly>
                    </label>                
                </div>  
                <input type="submit" class="btn btn-white" value="RESERVAR HABITACION">
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