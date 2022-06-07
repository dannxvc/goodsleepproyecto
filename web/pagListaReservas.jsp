<%@page import="modelo.Reservar_Habitacion"%>
<%@page import="dao.listadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    if(session.getAttribute("usuarioA")!=null){  
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="icon" href="img/logo_purple.png" type="image/png">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/navAdmi.css">
        <link rel="stylesheet" href="css/clienteAdmi.css">
         <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
        <script defer src="js/sweetalert.js" type="text/javascript"></script>
        <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
        <script defer src="js/alerts.js"></script>
        <script defer src="js/menu.js"></script>
        <title>Reservas</title>
    </head>
    <body>
        <header>
        <nav id="navbaradmi">
            <div class="infoUsuario">
                <img src="img/admi/${usuarioA.usuario}.svg" alt="">
                <p> Hola, ${usuarioA.id_admi.nombre}!</p>
            </div>
            <ul>
                <li><a href="pagReservaAdmi.jsp"><span><i class="fa-regular fa-address-card"></i></span> Registro</a></li>
                <li><a href="pagListaClientes.jsp"><span><i class="fa-solid fa-user"></i></span> Clientes</a></li>
                <li class="li-active"> <a href="pagListaReservas.jsp"><span><i class="fa-solid fa-bed"></i></span> Reservas</a></li>
                <div id="mantenimiento">
                    <li id="flecha_abajo"><span><i class="fa-regular fa-pen-to-square"></i></span>Mantenimiento</li>
                    <ul>
                        <li><a href="pagListaCategoria.jsp">Categorias</a></li>               
                        <li><a href="pagListaServicioAd.jsp">Servicios Adicionales</a></li>
                        <li><a href="pagHabitaciones.jsp"><span><i class="fa-regular fa-pen-to-square"></i></span> Habitaciones</a></li>
                    </ul>
                </div>
                <li class="li-cerrar-sesion"><a href="" id="btn-cerrar"><span><i class="fa-solid fa-right-from-bracket"></i></span> Cerrar sesion</a></li>
            </ul>
        </nav>
    </header>
            
            <%
                  listadoDAO obj=new listadoDAO(); 
             %>
            
            <main>
                <h2 class="text-center mt-5">Lista de Reservas</h2>     
                <table class="table table-hover text-center mt-3">
                    <thead class="bg-dark text-white text-center">
                        <th>ID Reserva<th>ID Cliente<th>Fecha Inicio<th>Fecha Final<th># dias<th>ID Habitacion<th>Subtotal<th>ID Servicio<th>N° Personas<th>TOTAL<th>Estado<th></th>
                    </thead>     
                    <%
                        for(Reservar_Habitacion x:obj.lisReservas()){
                          out.print(" <tr><td>"+x.getId_reserva()+"<td>"+x.getId_cliente()+"<td>"+x.getFechaInicio()+"<td>"+x.getFechaFinal()+"<td>"+x.numeroDias()+"<td>"+x.getCodHabita()+"<td>"+x.getSubtotal()+"<td>"+x.getCod_servA()+"<td>"+x.getCant_personas()+"<td>"+x.getPrecioTotal()+"<td>"+x.getEstado());  
                          
                    %> 
                    <td><a id="btn-eliminar-reserva" href="svReserva?opc=6&cod=<%=x.getId_reserva()%>&cod2=<%=x.getCodHabita()%>"  class="enlaceDelete">eliminar</a></td>
                    <%
                        }
                    %>   
                </table>
         </main>
    </body>
</html>

<%
   }else{
    response.sendRedirect("login_admi.jsp");
} 
%>    