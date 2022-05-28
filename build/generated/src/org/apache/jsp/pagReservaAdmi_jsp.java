package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import java.util.List;
import modelo.Reservar_Habitacion;
import dao.listadoDAO;

public final class pagReservaAdmi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    if(session.getAttribute("usuarioA")!=null){  

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\r\n");
      out.write("        <script defer src=\"js/menu.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <title>Document</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav id=\"navbaradmi\">\r\n");
      out.write("                <div class=\"infoUsuario\">\r\n");
      out.write("                    <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\r\n");
      out.write("                    <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.id_admi.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"pagReservaAdmi.jsp\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\r\n");
      out.write("                    <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\r\n");
      out.write("                    <li><a href=\"pagListaReservas.jsp\"><span><i class=\"fa-solid fa-bed\"></i></span> Reservas</a></li>\r\n");
      out.write("                    <div id=\"mantenimiento\">\r\n");
      out.write("                        <li id=\"flecha_abajo\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span>Mantenimiento</li>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"pagListaCategoria.jsp\">Categorias</a></li>               \r\n");
      out.write("                            <li><a href=\"pagListaServicioAd.jsp\">Servicios Adicionales</a></li>\r\n");
      out.write("                            <li><a href=\"pagHabitaciones.jsp\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Habitaciones</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <li><a href=\"uacontrol?accion=cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main>\r\n");
      out.write("            <h2 class=\"text-center mt-5 text-black\">Registrar Reserva</h2>\r\n");
      out.write("            <form class=\"mt-5\" id=\"form\" action=\"svReserva\"> \r\n");
      out.write("                <div class=\"row g-3 p-5\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"opc\" value=\"5\">  \r\n");
      out.write("                    ");

                        listadoDAO obj = new listadoDAO();
                    
      out.write("\r\n");
      out.write("                    <div class=\"col-md-8\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Nombres y Apellidos :</label>\r\n");
      out.write("                        <select class=\"form-select\"  name=\"idcliente\" id=\"idcliente\" required>\r\n");
      out.write("                            <option disabled selected>Seleccione Huesped</option>\r\n");
      out.write("                            ");

                                for (Cliente x : obj.lisCliente()) {
                                    String nombre = x.getNombre() + " " + x.getApellido();
                                    out.print("<option value="+x.getId_cliente()+" data-codigocli=" + x.getId_cliente() + ">" + nombre);
                                }
                            
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">N° documento :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"\" name=\"\" id=\"documentoid\" readonly required>   \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-12\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Habitacion :</label>\r\n");
      out.write("                        <select class=\"form-select\" data-bs-toggle=\"dropdown\" value=\"\" name=\"habitacion\" id=\"categoria\" required>\r\n");
      out.write("                            <option disabled selected>Elegir habitacion</option>\r\n");
      out.write("                            ");

                                for (Consulta c : obj.lisConsulta()) {
                                    String dato = c.getCodHabitacion() + " - " + c.getNombreCategoria();
                                    out.print("<option value=" + c.getCodHabitacion() + " data-precioh=" + c.getPrecioCategoria() + " data-codigohab=" + c.getCodHabitacion() + " required>" + dato);
                                }
                            
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <input type=\"hidden\" name=\"codupdateh\" id=\"codupdateh\" value=\"OCUPADO\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"updateh\" id=\"updateh\" value=\"\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Servicio adicional :</label>\r\n");
      out.write("                        <select class=\"form-select\" name=\"servicioad\" value=\"\" id=\"servicio\" required>\r\n");
      out.write("                            <option disabled selected>Elegir</option>\r\n");
      out.write("                            ");

                                for (Servicio_Adicional x : obj.lisServicioAdicional()) {
                                    out.print("<option value=" + x.getCod_servA() + " data-precioServicio=" + x.getPrecio() + " selected>" + x.getDescripcion());
                                }
                            
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"npersonas\" class=\"form-label\">Numero de personas :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"\" id=\"npersonas\" name=\"npersonas\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <label class=\"form-label\">Checkin :</label>\r\n");
      out.write("                        <input type=\"date\" class=\"form-control\" value=\"\" id=\"fcheckin\" name=\"fcheckin\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <label class=\"form-label\">Checkout :</label>\r\n");
      out.write("                        <input type=\"date\" class=\"form-control\"  id=\"fcheckout\" name=\"fcheckout\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-4\">\r\n");
      out.write("                        <label class=\"form-label\">Numero de dias :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"ndias\" name=\"ndias\" readonly required>\r\n");
      out.write("                    </div>    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Subtotal</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"subtotal\" id=\"subtotal\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Precio Servicio Adicional :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"precio\" id=\"precioServicio\" readonly>   \r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Estado habitacion :</label>\r\n");
      out.write("                        <select class=\"form-select\" name=\"estadoh\" id=\"estadoh\">\r\n");
      out.write("                            <option disabled selected>Elegir</option>\r\n");
      out.write("                            <option value=\"PAGADO\">PAGADO</option>\r\n");
      out.write("                            <option value=\"PENDIENTE\">PENDIENTE</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">PAGO TOTAL :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" value=\"\" name=\"monto\" id=\"monto\" readonly>   \r\n");
      out.write("                    </div>    \r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-12 d-flex justify-content-center\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary col-md-2\">Registrar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </form>               \r\n");
      out.write("        </main>   \r\n");
      out.write("        <script type=\"text/javascript\">\r\n");
      out.write("            $(function () {\r\n");
      out.write("\r\n");
      out.write("                $('#idcliente').on('change', function () {\r\n");
      out.write("                    let idcliente = $(this).find(':selected').attr('data-codigocli');\r\n");
      out.write("                    $('#documentoid').val(idcliente);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#categoria').on('change', function () {\r\n");
      out.write("                    let precio = $(this).find(':selected').attr('data-precioh');\r\n");
      out.write("                    $('#subtotal').val(precio);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#categoria').on('change', function () {\r\n");
      out.write("                    let estado = $(this).find(':selected').attr('data-codigohab');\r\n");
      out.write("                    $('#updateh').val(estado);\r\n");
      out.write("                })\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                $('#servicio').on('change', function () {\r\n");
      out.write("                    let precioServicio = $(this).find(':selected').attr('data-precioServicio');\r\n");
      out.write("                    $('#precioServicio').val(precioServicio);\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#fcheckin').on('change', function () {\r\n");
      out.write("                    $('#fcheckout').val('');\r\n");
      out.write("                    $('#ndias').val('');\r\n");
      out.write("                    $('#monto').val('');\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#fcheckin').blur(function () {\r\n");
      out.write("                    $('#fcheckout').attr('min', $(this).val());\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                $('#fcheckout').on('change', function () {\r\n");
      out.write("                    if ($('#habitacion').val() === null) {\r\n");
      out.write("                        alert('Seleccione una Habitacion');\r\n");
      out.write("                        $('#fcheckout').val('');\r\n");
      out.write("                        return false;\r\n");
      out.write("                    }\r\n");
      out.write("\r\n");
      out.write("                    let firstDate = $('#fcheckin').val();\r\n");
      out.write("                    let secondDate = $('#fcheckout').val();\r\n");
      out.write("                    let dias = diasEntreFechas(firstDate, secondDate);\r\n");
      out.write("                    $('#ndias').val(dias);\r\n");
      out.write("                    //Cantidad total\r\n");
      out.write("                    if (dias > 0) {\r\n");
      out.write("                        $('#ndias').val(dias);\r\n");
      out.write("                        let precio = $('#subtotal').val();\r\n");
      out.write("                        let precioServicio = $('#precioServicio').val();\r\n");
      out.write("                        let total = (parseInt(dias) * parseFloat(precio)) + parseFloat(precioServicio);\r\n");
      out.write("                        $('#monto').val(total);\r\n");
      out.write("                    }\r\n");
      out.write("                });\r\n");
      out.write("\r\n");
      out.write("                function diasEntreFechas(firstDate, secondDate) {\r\n");
      out.write("                    firstDate = new Date(firstDate);\r\n");
      out.write("                    secondDate = new Date(secondDate);\r\n");
      out.write("                    let timeDifference = Math.abs(secondDate.getTime() - firstDate.getTime());\r\n");
      out.write("                    let millisecondsInADay = (1000 * 3600 * 24);\r\n");
      out.write("                    let differenceOfDays = Math.ceil(timeDifference / millisecondsInADay);\r\n");
      out.write("                    return differenceOfDays;\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        </script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

   }else{
    response.sendRedirect("login_admi.jsp");
} 

      out.write("            ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
