<%@page import="modelo.*"%>
<%@page import="dao.listadoDAO"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <script  src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2" crossorigin="anonymous"></script>
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <script defer src="js/sweetalert.js" type="text/javascript"></script>
    <link href="css/sweetalert.css" rel="stylesheet" type="text/css"/>
    <script defer src="js/alerts.js"></script>
    <script src="js/filtrarHab.js" type="text/javascript"></script>
    <title>Good Sleep | Reservar</title>
</head>
<body id="yellow">
   
    <header id="header">
        <a id="btn-cerrar-cliente" href="uccontrol?accion=cerrar" class="btn btn-login btn-logout">
           <img class="login-icon"src="img/profile.svg" alt="log in">
           LOG OUT
        </a>
        
        <h1>reservar habitacion</h1>
    </header>
    <nav id="navbar">
        <div>
        <a href="perfil.jsp">
            <img class="icon nav-icon"  src="img/yo.svg" alt="my profile">
        </a>
        <span class="tooltip">mi perfil</span>
        </div>
        <div>
        <a href="clientecontrol?opc=3&cod=${usuarioC.id_cliente.id_cliente}">
            <img class="icon nav-icon " src="img/mis-reser.svg" alt="my reservations">
        </a>
        <span class="tooltip">mis reservaciones</span>
        </div>
        <div>
        <a href="reservar.jsp">
            <img class="icon nav-icon icon-active" src="img/reservar.svg" alt="book a room">
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
            <form class="form form-reservar" action="clientecontrol">
                <%
                        listadoDAO obj = new listadoDAO();
                    %>
                 <input type="hidden" name="opc" value="4">  
                 <input type="hidden" name="idcliente" value="${usuarioC.id_cliente.id_cliente}">  
               
               
                <select class="input input-gray" data-bs-toggle="dropdown" value="" name="habitacion" id="categoria" required>
                           <option disabled value selected>Elegir habitacion</option>
                            <%
                                for (Consulta c : obj.lisConsulta()) {
                                    String dato = c.getCodHabitacion() + " - " + c.getNombreCategoria();
                                    out.print("<option value=" + c.getCodHabitacion() + " data-precioh=" + c.getPrecioCategoria() + " data-codigohab=" + c.getCodHabitacion() + " >" + dato);
                                }
                            %>
                </select>
                <div class="form-col form-col-filtrar" id="filtrar_hab">
                    
                    
                </div>
                <input type="hidden" name="codupdateh" id="codupdateh" value="OCUPADO">
                    <input type="hidden" name="updateh" id="updateh" value="">
                
                       
                <select class="input input-gray"  name="servicioad" id="servicio" required>
                            <option disabled value selected>Elegir Servicio Adicional</option>
                            <%
                                for (Servicio_Adicional x : obj.lisServicioAdicional()) {
                                    out.print("<option value=" + x.getCod_servA() + " data-precioServicio=" + x.getPrecio() + ">" + x.getDescripcion());
                                }
                            %>
                </select>
                 <div class="label-grid label-grid-two">
                    <label class="label-col" for="fcheckin">Fecha Inicial
                        <input class="input input-gray" type="date" id="fcheckin" name="fcheckin" value="" required>   
                    </label> 
                    <label class="label-col" for="fcheckout">Fecha Final
                        <input class="input input-gray" type="date" id="fcheckout" name="fcheckout" required>
                    </label>   
                    <label class="label-col" for="ndias">Numero de Dias
                        <input class="input input-gray" type="text" id="ndias" name="ndias" readonly>
                    </label> 
                    <label class="label-col">
                        Cantidad Personas
                        <div class="label-col label-grid">
                        <label for="CP-1" class="input label-radio">
                             Una persona
                            <input class="btn-radio"id="CP-1" type="radio" name="npersonas" value="1"  id="npersonas"  required>  
                        </label>
                        <label for="CP-2" class="input label-radio">
                             Dos personas
                            <input class="btn-radio" id="CP-2" type="radio" name="npersonas" value="2"  id="npersonas"  required>  
                        </label>
                        <label for="CP-3" class="input label-radio">
                             Tres personas
                            <input class="btn-radio" id="CP-3" type="radio" name="npersonas" value="3"  id="npersonas" required>  
                        </label>
                        </div>
                   </label>        
                </div>  
                <div class="label-grid label-grid-two">
                    <label for="" class="label-col" >Precio Servicio Adicional :
                        <input type="text" class="input input-gray"  name="precio" id="precioServicio" readonly>   
                    </label>
                    <label class="label-col" for="subtotal">Sub Total
                        <input id="subtotal" class="input input-gray" type="text" id="subtotal" name="subtotal" readonly >   
                    </label> 
                    <label class="label-col" for="monto">Precio Total
                        <input class="input input-pink" type="text" id="monto" name="monto" readonly>
                    </label>   
                    <label class="label-col" for="subtotal">Estado de la reserva
                         <select class="input input-gray" name="estadoh" id="estadoh" required>
                            <option disabled value selected>Elegir</option>
                            <option value="PAGADO">PAGADO</option>
                            <option value="PENDIENTE">PENDIENTE</option>
                        </select>
                    </label>   
                </div>  
                <input type="submit" class="btn btn-white btn-reservar" value="RESERVAR HABITACION">
            </form>
        </section>
        
    </main>
</body>
<script type="text/javascript">
             $(function () {

                $('#categoria').on('change', function () {
                    let precio = $(this).find(':selected').attr('data-precioh');
                    $('#subtotal').val(precio);
                });

                $('#categoria').on('change', function () {
                    let estado = $(this).find(':selected').attr('data-codigohab');
                    $('#updateh').val(estado);
                })


                $('#servicio').on('change', function () {
                    let precioServicio = $(this).find(':selected').attr('data-precioServicio');
                    $('#precioServicio').val(precioServicio);
                });

                $('#fcheckin').on('change', function () {
                    $('#fcheckout').val('');
                    $('#ndias').val('');
                    $('#monto').val('');
                });

                $('#fcheckin').blur(function () {
                    $('#fcheckout').attr('min', $(this).val());
                });

                $('#fcheckout').on('change', function () {
                    if ($('#habitacion').val() === null) {
                        alert('Seleccione una Habitacion');
                        $('#fcheckout').val('');
                        return false;
                    }

                    let firstDate = $('#fcheckin').val();
                    let secondDate = $('#fcheckout').val();
                    let dias = diasEntreFechas(firstDate, secondDate);
                    $('#ndias').val(dias);
                    //Cantidad total
                    if (dias > 0) {
                        $('#ndias').val(dias);
                        let precio = $('#subtotal').val();
                        let precioServicio = $('#precioServicio').val();
                        let total = (parseInt(dias) * parseFloat(precio)) + parseFloat(precioServicio);
                        $('#monto').val(total);
                    }
                });

                function diasEntreFechas(firstDate, secondDate) {
                    firstDate = new Date(firstDate);
                    secondDate = new Date(secondDate);
                    let timeDifference = Math.abs(secondDate.getTime() - firstDate.getTime());
                    let millisecondsInADay = (1000 * 3600 * 24);
                    let differenceOfDays = Math.ceil(timeDifference / millisecondsInADay);
                    return differenceOfDays;
                }
            });
        </script>
</html>
<%
   }else{
    response.sendRedirect("login_cliente.jsp");
} 
%>