
<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/navAdmi.css">
        <link rel="stylesheet" href="css/clienteAdmi.css">
         <script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
         <script defer src="js/menu.js"></script>
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
            
            <%
                Cliente c=(Cliente)request.getAttribute("dato");     
             %>  
            
            <main>
                <form class="formEditarCliente mt-5" id="form" action="svReserva">
                    <h2 class="text-center mt-2">Editar informacion</h2>
                    <input type="hidden" name="opc" value="4">
                    <div class="col-md-12 mt-3">
                        <label for="idcliente" class="form-label">N° de documento :</label>
                        <input type="text" class="form-control" id="" name="idcliente" value="<%=c.getId_cliente()%>" readonly>
                    </div>
                    <div class="col-md-12 mt-1">
                        <label for="documento" class="form-label">Tipo de documento :</label>
                        <input type="text" class="form-control"  name="documento" value="<%=c.getTipoDoc()%>">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="nombre" class="form-label">Nombres:</label>
                        <input type="text" class="form-control" name="nombre" value="<%=c.getNombre()%>">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="apellido" class="form-label">Apellidos :</label>
                        <input type="text" class="form-control" name="apellido" value="<%=c.getApellido()%>">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="telefono" class="form-label">Telefono :</label>
                        <input type="text" class="form-control"  name="telefono" value="<%=c.getCelular()%>">
                    </div>
                    <div class="col-md-12 mt-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control"  name="email" value="<%=c.getCorreo()%>">
                    </div>
                    <div class="col-md-12 d-flex justify-content-evenly mt-3">
                        <button type="submit" id="" class="btn btn-primary col-md-3">Actualizar</button>
                        <button type="button" class="btn btn-secondary col-md-3"><a class="text-white" href="pagListaClientes.jsp">Regresar</a></button>
                    </div>
                </form>
            </main>
    </body>
</html>
