package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;
import dao.listadoDAO;
import java.util.List;

public final class reservar_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if(session.getAttribute("usuarioC")!=null){  

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"icon\" href=\"/img/logo.png\" type=\"image/png\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script  src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <script src=\"js/filtrarHab.js\" type=\"text/javascript\"></script>\r\n");
      out.write("    <title>Good Sleep | Reservar</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"yellow\">\r\n");
      out.write("   \r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"uccontrol?accion=cerrar\" class=\"btn btn-login btn-logout\">\r\n");
      out.write("           <img class=\"login-icon\"src=\"img/profile.svg\" alt=\"log in\">\r\n");
      out.write("           LOG OUT\r\n");
      out.write("        </a>\r\n");
      out.write("        \r\n");
      out.write("        <h1>reservar habitacion</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <a href=\"perfil.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\"  src=\"img/yo.svg\" alt=\"my profile\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"clientecontrol?opc=3&cod=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/mis-reser.svg\" alt=\"my reservations\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"reservar.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon icon-active\" src=\"img/reservar.svg\" alt=\"book a room\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"index.html\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/home.svg\" alt=\"inicio\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"crear-cuenta\">\r\n");
      out.write("        <section class=\"section-form\">\r\n");
      out.write("            <form class=\"form form-reservar\" action=\"clientecontrol\">\r\n");
      out.write("                ");

                        listadoDAO obj = new listadoDAO();
                    
      out.write("\r\n");
      out.write("                 <input type=\"hidden\" name=\"opc\" value=\"4\">  \r\n");
      out.write("                 <input type=\"hidden\" name=\"idcliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">  \r\n");
      out.write("               \r\n");
      out.write("               \r\n");
      out.write("                <select class=\"input input-gray\" data-bs-toggle=\"dropdown\" value=\"\" name=\"habitacion\" id=\"categoria\" required>\r\n");
      out.write("                           <option disabled value selected>Elegir habitacion</option>\r\n");
      out.write("                            ");

                                for (Consulta c : obj.lisConsulta()) {
                                    String dato = c.getCodHabitacion() + " - " + c.getNombreCategoria();
                                    out.print("<option value=" + c.getCodHabitacion() + " data-precioh=" + c.getPrecioCategoria() + " data-codigohab=" + c.getCodHabitacion() + " >" + dato);
                                }
                            
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                <div class=\"form-col form-col-filtrar\" id=\"filtrar_hab\">\r\n");
      out.write("                    \r\n");
      out.write("                    \r\n");
      out.write("                </div>\r\n");
      out.write("                <input type=\"hidden\" name=\"codupdateh\" id=\"codupdateh\" value=\"OCUPADO\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"updateh\" id=\"updateh\" value=\"\">\r\n");
      out.write("                \r\n");
      out.write("                       \r\n");
      out.write("                <select class=\"input input-gray\"  name=\"servicioad\" id=\"servicio\" required>\r\n");
      out.write("                            <option disabled value selected>Elegir Servicio Adicional</option>\r\n");
      out.write("                            ");

                                for (Servicio_Adicional x : obj.lisServicioAdicional()) {
                                    out.print("<option value=" + x.getCod_servA() + " data-precioServicio=" + x.getPrecio() + ">" + x.getDescripcion());
                                }
                            
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("                 <div class=\"label-grid label-grid-two\">\r\n");
      out.write("                    <label class=\"label-col\" for=\"fcheckin\">Fecha Inicial\r\n");
      out.write("                        <input class=\"input input-gray\" type=\"date\" id=\"fcheckin\" name=\"fcheckin\" value=\"\" required>   \r\n");
      out.write("                    </label> \r\n");
      out.write("                    <label class=\"label-col\" for=\"fcheckout\">Fecha Final\r\n");
      out.write("                        <input class=\"input input-gray\" type=\"date\" id=\"fcheckout\" name=\"fcheckout\" required>\r\n");
      out.write("                    </label>   \r\n");
      out.write("                    <label class=\"label-col\" for=\"ndias\">Numero de Dias\r\n");
      out.write("                        <input class=\"input input-gray\" type=\"text\" id=\"ndias\" name=\"ndias\" readonly>\r\n");
      out.write("                    </label> \r\n");
      out.write("                    <label class=\"label-col\">\r\n");
      out.write("                        Cantidad Personas\r\n");
      out.write("                        <div class=\"label-col label-grid\">\r\n");
      out.write("                        <label for=\"CP-1\" class=\"input label-radio\">\r\n");
      out.write("                             Una persona\r\n");
      out.write("                            <input class=\"btn-radio\"id=\"CP-1\" type=\"radio\" name=\"npersonas\" value=\"1\"  id=\"npersonas\"  required>  \r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label for=\"CP-2\" class=\"input label-radio\">\r\n");
      out.write("                             Dos personas\r\n");
      out.write("                            <input class=\"btn-radio\" id=\"CP-2\" type=\"radio\" name=\"npersonas\" value=\"2\"  id=\"npersonas\"  required>  \r\n");
      out.write("                        </label>\r\n");
      out.write("                        <label for=\"CP-3\" class=\"input label-radio\">\r\n");
      out.write("                             Tres personas\r\n");
      out.write("                            <input class=\"btn-radio\" id=\"CP-3\" type=\"radio\" name=\"npersonas\" value=\"3\"  id=\"npersonas\" required>  \r\n");
      out.write("                        </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                   </label>        \r\n");
      out.write("                </div>  \r\n");
      out.write("                <div class=\"label-grid label-grid-two\">\r\n");
      out.write("                    <label for=\"\" class=\"label-col\" >Precio Servicio Adicional :\r\n");
      out.write("                        <input type=\"text\" class=\"input input-gray\"  name=\"precio\" id=\"precioServicio\" readonly>   \r\n");
      out.write("                    </label>\r\n");
      out.write("                    <label class=\"label-col\" for=\"subtotal\">Sub Total\r\n");
      out.write("                        <input id=\"subtotal\" class=\"input input-gray\" type=\"text\" id=\"subtotal\" name=\"subtotal\" readonly >   \r\n");
      out.write("                    </label> \r\n");
      out.write("                    <label class=\"label-col\" for=\"monto\">Precio Total\r\n");
      out.write("                        <input class=\"input input-pink\" type=\"text\" id=\"monto\" name=\"monto\" readonly>\r\n");
      out.write("                    </label>   \r\n");
      out.write("                    <label class=\"label-col\" for=\"subtotal\">Estado de la reserva\r\n");
      out.write("                         <select class=\"input input-gray\" name=\"estadoh\" id=\"estadoh\" required>\r\n");
      out.write("                            <option disabled value selected>Elegir</option>\r\n");
      out.write("                            <option value=\"PAGADO\">PAGADO</option>\r\n");
      out.write("                            <option value=\"PENDIENTE\">PENDIENTE</option>\r\n");
      out.write("                        </select>\r\n");
      out.write("                    </label>   \r\n");
      out.write("                </div>  \r\n");
      out.write("                <input type=\"submit\" class=\"btn btn-white\" value=\"RESERVAR HABITACION\">\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("             $(function () {\r\n");
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
      out.write("</html>\r\n");

   }else{
    response.sendRedirect("login_cliente.jsp");
} 

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
