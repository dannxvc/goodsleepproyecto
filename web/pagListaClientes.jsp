<%@page import="modelo.Reservar_Habitacion"%>
<%@page import="dao.reservaDAO"%>
<%@page import="modelo.Cliente"%>
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
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/navAdmi.css">
    <link rel="stylesheet" href="css/clienteAdmi.css">
    
    <script defer src="js/menu.js"></script>
    <title>Listado Clientes</title>
</head>
<body>
    <header>
       <!-- <nav>
            <div class="infoUsuario">
                <img src="img/admi/$//{usuarioA.usuario}.svg" alt="">
                <p> Hola, $//{usuarioA.usuario}!</p>
            </div>
                <li><a href="pagReservaAdmi.jsp"><span><i class="fa-regular fa-address-card"></i></span> Registro</a></li>
                <li><a href="pagListaClientes.jsp"><span><i class="fa-solid fa-user"></i></span> Clientes</a></li>
                <li><a href="pagListaReservas.jsp"><span><i class="fa-solid fa-bed"></i></span> Reservas</a></li>
                <li><a href="pagHabitaciones.jsp"><span><i class="fa-regular fa-pen-to-square"></i></span> Habitaciones</a></li>
                <li><a href="uacontrol?accion=cerrar"><span><i class="fa-solid fa-right-from-bracket"></i></span> Cerrar sesion</a></li>
        </nav>-->
            
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
        
            
        <div class="modal fade" id="exampleModalRegistro" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog">
          <div class="modal-content">
            <div class="modal-header bg-light">
              <h5 class="modal-title" id="exampleModalLabel">Registrar</h5>
              <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <div class="modal-body">
                <form class="formListadoCliente" id="form" action="svReserva">
                    <input type="hidden" name="opc" value="1">
                    <div class="col-md-12 mt-1">
                        <label for="" class="form-label">Tipo de documento :</label>
                        <input type="text" class="form-control" id="txt_id" name="documento">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="" class="form-label">N° de documento :</label>
                        <input type="text" class="form-control" id="" name="idcliente">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="" class="form-label">Nombres:</label>
                        <input type="text" class="form-control" id="" name="nombre">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="" class="form-label">Apellidos :</label>
                        <input type="text" class="form-control" id="" name="apellido">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="" class="form-label">Telefono :</label>
                        <input type="text" class="form-control" id="" name="telefono">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="inputEmail4" class="form-label">Email</label>
                        <input type="email" class="form-control" id="inputEmail4" name="email">
                    </div>
                    <div class="col-md-12 d-flex justify-content-center mt-3">
                        <button type="submit" class="btn btn-primary  col-md-4">Registrar</button>
                    </div>
                </form>
            </div>
          </div>
        </div>
      </div>
    <main>
        <h2 class="text-center mt-5">Lista de Clientes</h2>

        <div class="barraCliente mt-4">
            <button type="button" class="btn btn-success " data-bs-toggle="modal" data-bs-target="#exampleModalRegistro" id="boton-agregar">Agregar +</button>
        </div>
        
        <%
          listadoDAO obj=new listadoDAO(); 
        %>
        
        <table class="table table-hover text-center mt-3">
            <thead class="bg-dark text-white text-center">
                <th>ID Cliente<th>Tipo de Documento<th>Nombres<th>Apellidos<th>Celular<th>Correo<th></th><th></th>
            </thead>     
            <%
                for(Cliente x:obj.lisCliente()){
                    out.print(" <tr><td>"+x.getId_cliente()+"<td>"+x.getTipoDoc()+"<td>"+x.getNombre()+"<td>"+x.getApellido()+"<td>"+x.getCelular()+"<td>"+x.getCorreo());  
            %>        
                <td><a href="svReserva?opc=3&cod=<%=x.getId_cliente()%>"  class="enlaceEdit">editar</a></td>
                <td><a href="svReserva?opc=2&cod=<%=x.getId_cliente()%>"  class="enlaceDelete">eliminar</a></td>
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