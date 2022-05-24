<%@page import="modelo.*"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Reservar_Habitacion"%>
<%@page import="dao.listadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    <script src="js/jquery-1.10.2.min.js" type="text/javascript"></script>
    <title>Document</title>
</head>
    <body>
        <header>
        <nav>
            <div class="infoUsuario">
                <img src="img/admi/${usuarioA.usuario}.svg" alt="">
                <p> Hola, ${usuarioA.usuario}!</p>
            </div>
                <li><a href="#"><span><i class="fa-regular fa-address-card"></i></span> Registro</a></li>
                <li><a href="pagListaClientes.jsp"><span><i class="fa-solid fa-user"></i></span> Clientes</a></li>
                <li><a href="#"><span><i class="fa-solid fa-bed"></i></span> Lista Habitaciones</a></li>
                <li><a href="#"><span><i class="fa-regular fa-pen-to-square"></i></span> Mantenimiento</a></li>
                <li><a href="uacontrol?accion=cerrar"><span><i class="fa-solid fa-right-from-bracket"></i></span> Cerrar sesion</a></li>
        </nav>
    </header>
        <main>
        <h2 class="text-center mt-5 text-black">Registrar Reserva</h2>
        <form class="mt-5" id="form" action="svReserva"> 
            <div class="row g-3 p-5">
                <input type="hidden" name="opc" value="5">  
                            <%
                                 listadoDAO obj=new listadoDAO();
                            %>
                <div class="col-md-12">
                    <label for="" class="form-label">Datos del cliente :</label>
                    <select class="form-select"  name="idcliente" required>
                            <option disabled selected>Seleccione Huesped</option>
                            <% 
                                for (Cliente x: obj.lisCliente()){
                                String nombre = x.getId_cliente()+ " - " + x.getNombre()+" "+x.getApellido();
                                out.print("<option value="+x.getId_cliente()+">"+nombre);
                             }  
                           %>
                    </select>
                </div>

                <div class="col-md-6">
                    <label for="" class="form-label">Categoria de la habitacion :</label>
                    <select type="button" class="form-select"  name="categoriah" data-bs-toggle="dropdown"  id="categoria">
                        <option class="dropdown-item" disabled selected>Elegir</option>
                            <%      
                            for(Categoria x:obj.lisCategoria()){
                                    out.print("<option value="+x.getCodCategoria()+" data-precioh="+x.getPrecio()+" data-code="+x.getCodCategoria()+"  selected>"+x.getNombreCat());
                              }
                              %>
                    </select>
                </div>                    
                 
                <div class="col-md-6">
                    <label for="" class="form-label">Habitacion :</label>
                    <select class="form-select" data-bs-toggle="dropdown" value="" name="habitacion" id="habitacion">
                        <option disabled selected>Elegir habitacion</option>
                           <%
                               for(Consulta c:obj.lisConsulta()){
                                   String dato=c.getCodHabitacion()+" - "+c.getNombreCategoria();
                                   out.print("<option value="+c.getCodHabitacion()+">"+dato);
                               }                           
                           %>
                    </select>
                </div>
             
               <div class="col-md-6">
                    <label for="" class="form-label">Servicio adicional :</label>
                    <select class="form-select" name="servicioad" value="" id="servicio" >
                        <option disabled selected>Elegir</option>
                        <%                        
                             for(Servicio_Adicional x:obj.lisServicioAdicional()){
                                    out.print("<option value="+x.getCod_servA()+" data-precioServicio="+x.getPrecio()+" selected>"+x.getDescripcion());      
                              }
                         %>
                    </select>
                </div>
                    
                <div class="col-md-6">
                    <label for="npersonas" class="form-label">Numero de personas :</label>
                    <input type="text" class="form-control" value="" id="npersonas" name="npersonas">
                </div>

                <div class="col-md-4">
                    <label class="form-label">Checkin :</label>
                    <input type="date" class="form-control" value="" id="fcheckin" name="fcheckin">
                </div>
                
                <div class="col-md-4">
                    <label class="form-label">Checkout :</label>
                    <input type="date" class="form-control"  id="fcheckout" name="fcheckout">
                </div>
                    
                <div class="col-md-4">
                    <label class="form-label">Numero de dias :</label>
                    <input type="text" class="form-control" id="ndias" name="ndias" readonly required>
                </div>    
                
                <div class="col-md-6">
                    <label for="" class="form-label">Subtotal</label>
                    <input type="text" class="form-control" name="subtotal" id="subtotal" readonly>
                </div>
                    
                <div class="col-md-6">
                    <label for="" class="form-label">Precio Servicio Adicional :</label>
                    <input type="text" class="form-control"  name="precio" id="precioServicio" readonly>   
                </div>
                    
                <div class="col-md-6">
                    <label for="" class="form-label">Estado habitacion :</label>
                    <select class="form-select" name="estadoh" id="estadoh">
                        <option disabled selected>Elegir</option>
                        <option value="PAGADO">PAGADO</option>
                        <option value="PENDIENTE">PENDIENTE</option>
                    </select>
                </div>
                    
                <div class="col-md-6">
                    <label for="" class="form-label">PAGO TOTAL :</label>
                    <input type="text" class="form-control" value="" name="monto" id="monto" readonly>   
                </div>    

                <div class="col-md-12 d-flex justify-content-center">
                    <button type="submit" class="btn btn-primary col-md-2">Registrar</button>
                </div>
            </div>
        </form>               
    </main>   
       <script type="text/javascript">
          $(function(){
             
             $('#categoria').on('change',function() { 
                    let precio = $(this).find(':selected').attr('data-precioh');
                    $('#subtotal').val(precio);
             });
             
             
             $('#servicio').on('change',function() {       
                 let precioServicio= $(this).find(':selected').attr('data-precioServicio');
                 $('#precioServicio').val(precioServicio);
             });
             
             $('#fcheckin').on('change',function() {
                $('#fcheckout').val('');
                $('#ndias').val('');
                $('#monto').val('');
             });
             
             $('#fcheckin').blur(function() {
                $('#fcheckout').attr('min',$(this).val());
             });
             
             $('#fcheckout').on('change',function() {
                 if($('#habitacion').val() === null) {
                     alert('Seleccione una Habitacion');
                     $('#fcheckout').val('');
                     return false;
                 }
                 
                 let firstDate = $('#fcheckin').val();
                 let secondDate = $('#fcheckout').val();
                 let dias = diasEntreFechas(firstDate,secondDate);
                $('#ndias').val(dias);
                //Cantidad total
                if(dias > 0){
                    $('#ndias').val(dias);
                    let precio = $('#subtotal').val();
                    let precioServicio= $('#precioServicio').val();
                    let total = (parseInt(dias)*parseFloat(precio))+parseFloat(precioServicio);
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
    </body>
</html>

