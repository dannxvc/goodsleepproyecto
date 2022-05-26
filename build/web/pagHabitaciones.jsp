<%@page import="modelo.Categoria"%>
<%@page import="modelo.Habitacion"%>
<%@page import="modelo.Reservar_Habitacion"%>
<%@page import="dao.listadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https://fonts.googleapis.com">
        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap" rel="stylesheet">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="css/navAdmi.css">
        <link rel="stylesheet" href="css/clienteAdmi.css">
        <script defer src="js/menu.js"></script>
        <title>Listado Reservas</title>
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
            listadoDAO obj = new listadoDAO();
        %>

        <div class="modal fade" id="modalHabitacion" tabindex="-1" aria-labelledby="modalHabitacion" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header bg-light">
                        <h5 class="modal-title" id="exampleModalLabel">Registrar Habitacion</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <form class="formListadoCliente" id="form" action="svMantenimiento">
                            <input type="hidden" name="opc" value="1">
                            <div class="col-md-12 mt-1">
                                <label for="" class="form-label">Categoria Habitacion :</label>
                                <select class="form-select" name="idcategoria" >
                                    <option disabled selected>Seleccione Categoria</option>
                                    <%
                                        for (Categoria x : obj.lisCategoria()) {
                                            out.print("<option value=" + x.getCodCategoria() + ">" + x.getNombreCat());
                                        }
                                    %>
                                </select>
                            </div>

                            <div class="col-md-12 mt-3">
                                <label for="" class="form-label">ID Habitacion :</label>
                                <input type="text" class="form-control" id="idhabitacion" name="idhabitacion">
                            </div>

                            <div class="col-md-12 mt-3">
                                <label for="" class="form-label">Piso :</label>
                                <input type="text" class="form-control" id="piso" name="piso">
                            </div>

                            <div class="col-md-12 mt-3">
                                <label for="" class="form-label">Estado :</label>
                                <select class="form-select" name="estadoh">
                                    <option disabled selected>Seleccione estado</option>
                                    <option value="DISPONIBLE">Disponible</option>
                                    <option value="OCUPADO">Ocupado</option>
                                </select>
                            </div> 
                            <input type="hidden" class="form-control" value="1" id="idempresa" name="idempresa">
                            <div class="col-md-12 d-flex justify-content-center mt-3">
                                <button type="submit" class="btn btn-primary  col-md-4">Registrar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>


        <main>
            <h2 class="text-center mt-5">Lista de Habitaciones</h2>     
            <div class="barraCliente mt-4">
                <button type="button" class="btn btn-success " data-bs-toggle="modal" data-bs-target="#modalHabitacion" id="boton-agregar">Agregar +</button>
            </div>
            <table class="table table-hover text-center mt-3">
                <thead class="bg-dark text-white text-center">
                <th>ID Habitacion<th>ID Categoria<th>Piso<th>Estado<th></td><th></td>
                    </thead>     
                    <%
                        for (Habitacion x : obj.lisHabitacion()) {
                            out.print(" <tr><td>" + x.getCodHabitacion() + "<td>" + x.getCatcategoria() + "<td>" + x.getPiso() + "<td>" + x.getEstado());
                    %>
                <td><a href="svReserva?opc=3&cod=<%=x.getCodHabitacion()%>"  class="enlaceEdit">editar</a></td>
                <td><a href="svReserva?opc=2&cod=<%=x.getCodHabitacion()%>"  class="enlaceDelete">eliminar</a></td>
                <%
                    }
                %> 
            </table>
        </main>
    </body>
</html>

