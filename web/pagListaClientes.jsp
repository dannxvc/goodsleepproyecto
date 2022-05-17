<%@page import="modelo.Cliente"%>
<%@page import="dao.listadoDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css" integrity="sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <link rel="stylesheet" href="css/navAdmi.css">
    <link rel="stylesheet" href="css/clienteAdmi.css">
    <title>Document</title>
</head>
<body>
    <header>
        <nav>
            <div class="infoUsuario">
                <h2>Sistema</h2>
                <img src="img/user.png" alt="">
                <p class="mt-3">USUARIO</p>
            </div>
                <li><a href=""><span><i class="fa-regular fa-address-card"></i></span> Registro</a></li>
                <li><a href="pagListaClientes.jsp"><span><i class="fa-solid fa-user"></i></span> Clientes</a></li>
                <li><a href=""><span><i class="fa-solid fa-bed"></i></span> Lista Habitaciones</a></li>
                <li><a href=""><span><i class="fa-regular fa-pen-to-square"></i></span> Mantenimiento</a></li>
                <li><a href=""><span><i class="fa-solid fa-right-from-bracket"></i></span> Cerrar sesion</a></li>
        </nav>
    </header>
        <div class="modal-contenedor">
            <div class="modal-formulario">
                <button id="boton-cerrar"><i class="fas fa-times-circle"></i></button>
                <h3>Registrar Cliente :</h3>
                <form id="form" action="svReserva">
                    <input type="hidden" name="opc" value="1">
                    <div class="col-md-12 mt-1">
                        <label for="" class="form-label">Tipo de documento :</label>
                        <input type="text" class="form-control" id="" name="documento">
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
                    <div class="col-md-12 d-flex justify-content-center mt-1">
                        <button type="submit" class="btn btn-primary col-md-4">Registrar</button>
                    </div>
                </form>
            </div>
        </div>
    
    <main>
        <h2 class="text-center mt-5">Lista de Clientes</h2>

        <div class="barraCliente mt-4">
            <button type="button" class="btn btn-success " id="boton-agregar">Agregar +</button>
        </div>
        
        <%
          listadoDAO obj=new listadoDAO(); 
        %>
        
        <table class="table table-hover text-center mt-3">
            <thead class="bg-dark text-white text-center">
                <th>ID Cliente<th>Tipo de Documento<th>Nombres<th>Apellidos<th>Celular<th>Correo<th>Editar</th><th>Eliminar</th>
            </thead>     
            <%
                for(Cliente x:obj.lisCliente()){
                    out.print("<tr><td>"+x.getId_cliente()+"<td>"+x.getTipoDoc()+"<td>"+x.getNombre()+"<td>"+x.getApellido()+"<td>"+x.getCelular()+"<td>"+x.getCorreo());  
                }
            %>
            
        </table>
    </main>
    <script src="js/modal.js"></script>
</body>
</html>