<%@page import="java.util.*"%>
<%@page import="modelo.Reservar_Habitacion"%>
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
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
 <link rel="stylesheet" href="css/index.css">
    <title>Good Sleep | Mis Reservaciones</title>
</head>
<body id="yellow">
    <%
            List<Reservar_Habitacion> lista=(ArrayList)request.getAttribute("dato");
        %>
    <header id="header">
        <a href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon" src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        <h1>mis reservaciones</h1>
    </header>
   <nav id="navbar">
        <a href="perfil.jsp">
            <img class="icon nav-icon "  src="img/yo.svg" alt="my profile">
        </a>
        <a href="clientecontrol?opc=3&cod=${usuarioC.id_cliente.id_cliente}">
            <img class="icon nav-icon icon-active" src="img/mis-reser.svg" alt="my reservations">
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
            <table class="table table-dark mx-auto" style="width: 1200px;">
        <thead>
            <th>ID Reserva</th>
            <th>Fecha Inicio</th>  
            <th>Fecha Final</th>            
            <th># dias</th>
            <th>ID Habitacion</th>
            <th>Subtotal</th>
            <th>ID Servicio</th>
            <th>N° Personas</th>
            <th>TOTAL</th>
            <th>Estado</th>
            </tr>
        </thead>
        <%
           
            for(Reservar_Habitacion x:lista){
                String fondo;
                String id=x.getId_reserva();
                Date fi=x.getFechaInicio() ;                
                Date ff=x.getFechaFinal() ;
                int dias= x.numeroDias();
                String codh=x.getCodHabita();
                Double sub=x.getSubtotal();                
                String serv=x.getCod_servA();
                int cant=x.getCant_personas();
                Double total=x.getPrecioTotal();
                String estado=x.getEstado();
                
                if(estado.equals("PAGADO")){
                    fondo="bg-success";
                }else{
                    fondo="bg-danger";
                }
                %> <tr>
                    <td><%=id%></td>
                    <td><%=fi%></td>
                    <td><%=ff%></td>
                    <td><%=dias%></td>
                    <td><%=codh%></td>
                    <td><%=sub%></td>
                    <td><%=serv%></td>
                    <td><%=cant%></td>                    
                    <td><%=total%></td>

                    <td class="<%=fondo%>"><%=estado%></td>
                </tr><%
     
            }
        %>
    </table>
        </section>
        
    </main>
</body>
</html>
<%
   }else{
    response.sendRedirect("login_cliente.jsp");
} 
%>