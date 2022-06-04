<%@page import="modelo.Categoria"%>
<%@page import="modelo.Servicio_Adicional"%>
<%@page import="dao.listadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    if(session.getAttribute("usuarioA")!=null){  
%>
<!DOCTYPE html>
<html lang="es">
<head>
   <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="icon" href="img/logo_purple.png" type="image/png">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script defer src="js/menu.js"></script>
    <link rel="stylesheet" href="css/navAdmi.css">
    <link rel="stylesheet" href="css/clienteAdmi.css">
    <title>Mantenimiento | Categorias</title>
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
                <li><a href="pagListaReservas.jsp"><span><i class="fa-solid fa-bed"></i></span> Reservas</a></li>
                <div id="mantenimiento">
                    <li id="flecha_abajo"><span><i class="fa-regular fa-pen-to-square"></i></span>Mantenimiento</li>
                    <ul>
                        <li><a href="pagListaCategoria.jsp">Categorias</a></li>               
                        <li><a href="pagListaServicioAd.jsp">Servicios Adicionales</a></li>
                        <li><a href="pagHabitaciones.jsp"><span><i class="fa-regular fa-pen-to-square"></i></span> Habitaciones</a></li>
                    </ul>
                </div>
                <li><a href="uacontrol?accion=cerrar"><span><i class="fa-solid fa-right-from-bracket"></i></span> Cerrar sesion</a></li>
            </ul>
        </nav>
    </header>
          
            
          <main>
        <h2 class="text-center mt-5">Lista de Categoria</h2>

        
        <%
          listadoDAO obj=new listadoDAO(); 
        %>  
          
         <table class="table table-hover text-center mt-3">
            <thead class="bg-dark text-white text-center">
                <th>Cod categoria<th>Nombre de categoria<th>Descripcion<th>Precio</th>
            </thead>     
            <%
                for(Categoria x:obj.lisCategoria()){
                    out.print("<tr><td>"+x.getCodCategoria()+"<td>"+x.getNombreCat()+"<td>"+x.getDescripcion()+"<td>"+x.getPrecio());  
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
