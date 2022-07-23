<%@page import="dao.graficoDAO"%>
<%@page import="dao.listadoDAO"%>
<%@page import="modelo.*"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Cliente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
        <title>Dashboard</title>
    </head>
    <body>
        <header>
            <nav id="navbaradmi" class="shadow mb-5 bg-dark">
                <div class="infoUsuario">
                    <img class="" src="img/admi/${usuarioA.usuario}.svg" alt="">
                    <p> Hola, ${usuarioA.id_admi.nombre}!</p>
                </div>
                <ul>
                    <li class="li-active"><a href="#"><span ><i class="fa fa-area-chart me-2"></i></span> Dashboard</a></li>
                    <li><a href="pagReservaAdmi.jsp"><span ><i class="fa-regular fa-address-card me-2"></i></span> Registro</a></li>
                    <li><a href="pagListaClientes.jsp"><span><i class="fa-solid fa-user me-2"></i></span> Clientes</a></li>
                    <li ><a href="pagListaReservas.jsp"><span><i class="fa-solid fa-bed me-2"></i></span> Reservas</a></li>
                    <div id="mantenimiento">
                        <li id="flecha_abajo"><span><i class="fa-regular fa-pen-to-square me-2"></i></span>Mantenimiento</li>
                        <ul>
                            <li><a href="pagListaCategoria.jsp"><span><i class="fa-regular fa-pen-to-square  me-2"></i></span>Categorias</a></li>               
                            <li><a href="pagListaServicioAd.jsp"><span><i class="fa-regular fa-pen-to-square  me-2"></i></span>Servicios Adicionales</a></li>
                            <li><a href="pagHabitaciones.jsp"><span><i class="fa-regular fa-pen-to-square  me-2"></i></span>Habitaciones</a></li>
                        </ul>
                    </div>
                    <li class="li-cerrar-sesion"><a href="uacontrol?accion=cerrar"  id="btn-cerrar"><span><i class="fa-solid fa-right-from-bracket me-2"></i></span> Cerrar sesion</a></li>
                </ul>
            </nav>
        </header>
        <main>
            <%
                listadoDAO obj = new listadoDAO();
            %>
            <h1 class="mt-5 text-black fs-1 ">Dashboard</h1>
            <div class="container">
                <div class="row gap-5 mb-5 mx-auto text-center ">
                        <div class="col card shadow p-3 bg-body rounded border-0 " style="width: 18rem;">
                            <i class="fa fa-users fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                                
                              <h2 class="card-title fw-bold text-danger fs-1">
                                <%int cantC=0;
                                    
                                      for (Cliente x : obj.lisCliente()) {
                                         x.setCantClientes(cantC);
                                         cantC = x.getCantClientes();
                                         cantC++;
                                    }   
                                        out.print(cantC);
                                %>
                              </h2>
                              <p class="card-text text-black-50">Clientes</p>
                              <a href="pagListaClientes.jsp" class="btn btn btn-outline-info">Ir a Clientes</a>
                            </div>
                        </div>
                        <div class="col card shadow p-3  bg-body rounded border-0" style="width: 18rem;">
                            <i class="fa fa-address-book fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                              <h2 class="card-title fw-bold text-danger fs-1">
                                <%
                                    int cantR=0;
                                    
                                      for (Reservar_Habitacion x : obj.lisReservas()) {
                                         x.setCantReservas(cantR);
                                         cantR = x.getCantReservas();
                                         cantR++;
                                    }   
                                        out.print(cantR);
                                %>
                              </h2>
                              <p class="card-text text-black-50">Reservas</p>
                              <a href="pagListaReservas.jsp" class="btn btn btn-outline-info" >Ir a Reservas</a>
                            </div>
                        </div>
                        <div class="col card shadow p-3 bg-body rounded border-0 " style="width: 18rem;">
                            <i class="fa fa-building fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                             <h2 class="card-title fw-bold text-danger fs-1">
                                <%
                                    int cantH=0;
                                    
                                      for (Habitacion x : obj.lisHabitacion()) {
                                         x.setCantHabitaciones(cantH);
                                         cantH = x.getCantHabitaciones();
                                         cantH++;
                                    }   
                                        out.print(cantH);
                                %>
                              </h2>
                              <p class="card-text text-black-50">Habitaciones</p>
                              <a href="pagHabitaciones.jsp" class="btn btn btn-outline-info">Ir a Habitaciones</a>
                            </div>
                        </div>
                        <div class="col card shadow p-3 bg-body rounded border-0" style="width: 18rem;">
                            <i class="fa fa-car fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                              <h2 class="card-title fw-bold text-danger fs-1">
                                <%
                                    int cantS=0;
                                    
                                      for (Servicio_Adicional x : obj.lisServicioAdicional()) {
                                         x.setCantServicios(cantS);
                                         cantS = x.getCantServicios();
                                         cantS++;
                                    }   
                                        out.print(cantS);
                                %>
                              </h2>
                              <p class="card-text text-black-50">Servicios Adicionales</p>
                              <a href="pagListaServicioAd.jsp" class="btn btn btn-outline-info">Ir a Servicios</a>
                            </div>
                        </div>
                 </div>
<!--                <div class="row gap-5 mx-auto text-center "> 
                    
                        
                        <div class="col card shadow p-3 bg-body rounded border-0" style="width: 18rem;">
                            <i class="fa fa-car fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                              <h2 class="card-title fw-bold text-black">
                                  Estado de Habitaciones
                              </h2>
                              <p class="card-text text-danger">Estado de Habitaciones</p>
                              <a href="pagListaServicioAd.jsp" class="btn btn btn-outline-info">Ir a Servicios</a>
                            </div>
                        </div> 
                        <div class="col card shadow p-3 rounded border-0 dash2" style="width: 18rem;">
                            <i class="fa fa-car fa-5x mx-auto p-5"></i>
                            <div class="card-body">
                              <h2 class="card-title fw-bold text-white">
                                  Estado de Habitaciones
                              </h2>
                        
                              <p class="card-text text-black">Estado de Habitaciones</p>
                              <a href="pagListaServicioAd.jsp" class="btn btn btn-outline-info">Ir a Servicios</a>
                            </div>
                        </div>
                </div>                -->
<%
             graficoDAO obj2=new graficoDAO();
        %>
        <h2>Grafico por facturas mes</h2> 
     
        
        <br>
        <br>
        <table class="table table-dark mx-auto" style="width: 220px;">
            <thead>
            <tr class="bg-light">
                <th>
                    Mes
                </th>
                <th>
                    Cantidad
                </th>
            </tr>
            </thead>
             <%
                for(FacturaPorMes x:obj2.lisFacPorMes()){
                    out.print("<tr><td>"+x.getMes()+"<td>"+x.getCantidad());
             }%>
        </table>
        <form action="graficoFA.jsp" target="win" class="form-control  mx-auto"  style="width: 220px;">
            <label for="torta">
                <input id="torta" type="radio" value="1" name="opc" onclick="submit()"/> Torta 
            </label>
             <label for="barras">
            <input id="barras" type="radio" value="2" name="opc" onclick="submit()"/> Barras 
            </label>
            <label for="lineal">
            <input id="lineal" type="radio" value="3" name="opc" onclick="submit()"/> Lineal          
            </label>
        </form>
        <iframe class="" name="win" height="500" style="width: 100%;">        
            
        </iframe>
            </div>
        </main>
          
        
    </body>
</html>
<%
   }else{
    response.sendRedirect("login_admi.jsp");
} 
%>            