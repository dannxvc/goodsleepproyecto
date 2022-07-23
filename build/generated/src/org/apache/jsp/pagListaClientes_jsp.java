package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Reservar_Habitacion;
import dao.reservaDAO;
import modelo.Cliente;
import dao.listadoDAO;

public final class pagListaClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    if (session.getAttribute("usuarioA") != null) {

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/logo_purple.png\" type=\"image/png\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\r\n");
      out.write("        <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script defer src=\"js/sweetalert.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script defer src=\"js/alerts.js\"></script>\r\n");
      out.write("        <script defer src=\"js/menu.js\"></script>\r\n");
      out.write("        <title>Clientes</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("\r\n");
      out.write("            <nav id=\"navbaradmi\" class=\"shadow  mb-5 bg-dark \">\r\n");
      out.write("                <div class=\"infoUsuario\">\r\n");
      out.write("                    <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\r\n");
      out.write("                    <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.id_admi.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li><a href=\"dashboard.jsp\"><span><i class=\"fa fa-area-chart\"></i></span> Dashboard</a></li>\r\n");
      out.write("                    <li><a href=\"pagReservaAdmi.jsp\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\r\n");
      out.write("                    <li class=\"li-active\"><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\r\n");
      out.write("                    <li><a href=\"pagListaReservas.jsp\"><span><i class=\"fa-solid fa-bed\"></i></span> Reservas</a></li>\r\n");
      out.write("                    <div id=\"mantenimiento\">\r\n");
      out.write("                        <li id=\"flecha_abajo\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span>Mantenimiento</li>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"pagListaCategoria.jsp\">Categorias</a></li>               \r\n");
      out.write("                            <li><a href=\"pagListaServicioAd.jsp\">Servicios Adicionales</a></li>\r\n");
      out.write("                            <li><a href=\"pagHabitaciones.jsp\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Habitaciones</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <li class=\"li-cerrar-sesion\"><a href=\"uacontrol?accion=cerrar\" id=\"btn-cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModalRegistro\" tabindex=\"-1\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("            <div class=\"modal-dialog\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header bg-light\">\r\n");
      out.write("                        <h5 class=\"modal-title\" id=\"exampleModalLabel\">Registrar</h5>\r\n");
      out.write("                        <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"modal\" aria-label=\"Close\"></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\">\r\n");
      out.write("                        <form class=\"formListadoCliente\" id=\"form\" action=\"svReserva\">\r\n");
      out.write("                            <input type=\"hidden\" name=\"opc\" value=\"1\">\r\n");
      out.write("                            <div class=\"col-md-12 mt-1\">\r\n");
      out.write("                                <label for=\"\" class=\"form-label\">Tipo de documento :</label>\r\n");
      out.write("                                <select class=\"form-select\" id=\"txt_id\" name=\"documento\" required>\r\n");
      out.write("                                    <option disabled selected>Elegir</option>\r\n");
      out.write("                                    <option value=\"DNI\">DNI</option>\r\n");
      out.write("                                    <option value=\"Pasaporte\">Pasaporte</option>\r\n");
      out.write("                                </select>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                                <label for=\"\" class=\"form-label\">N° de documento :</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"\" name=\"idcliente\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                                <label for=\"\" class=\"form-label\">Nombres:</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"\" name=\"nombre\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                                <label for=\"\" class=\"form-label\">Apellidos :</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"\" name=\"apellido\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                                <label for=\"\" class=\"form-label\">Telefono :</label>\r\n");
      out.write("                                <input type=\"text\" class=\"form-control\" id=\"\" name=\"telefono\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                                <label for=\"inputEmail4\" class=\"form-label\">Email</label>\r\n");
      out.write("                                <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" name=\"email\">\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-md-12 d-flex justify-content-center mt-3\">\r\n");
      out.write("                                <button type=\"submit\" class=\"btn btn-primary  col-md-4\">Registrar</button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <main>\r\n");
      out.write("            <h2 class=\"text-center mt-5\">Lista de Clientes</h2>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"barraCliente mt-4\">\r\n");
      out.write("                <button type=\"button\" class=\"btn btn-success \" data-bs-toggle=\"modal\" data-bs-target=\"#exampleModalRegistro\" id=\"boton-agregar\">Agregar +</button>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            ");

                listadoDAO obj = new listadoDAO();
            
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <table class=\"table table-hover text-center mt-3\">\r\n");
      out.write("                <thead class=\"bg-dark text-white text-center\">\r\n");
      out.write("                <th>ID Cliente<th>Tipo de Documento<th>Nombres<th>Apellidos<th>Celular<th>Correo<th></th><th></th>\r\n");
      out.write("                </thead>     \r\n");
      out.write("                ");

                    for (Cliente x : obj.lisCliente()) {
                        out.print(" <tr><td>" + x.getId_cliente() + "<td>" + x.getTipoDoc() + "<td>" + x.getNombre() + "<td>" + x.getApellido() + "<td>" + x.getCelular() + "<td>" + x.getCorreo());
                
      out.write("        \r\n");
      out.write("                <td><a href=\"svReserva?opc=3&cod=");
      out.print(x.getId_cliente());
      out.write("\"  class=\"enlaceEdit\">editar</a></td>\r\n");
      out.write("                <td><a href=\"svReserva?opc=2&cod=");
      out.print(x.getId_cliente());
      out.write("\"  class=\"enlaceDelete\">eliminar</a></td>\r\n");
      out.write("                ");

                    }
                
      out.write("\r\n");
      out.write("            </table>\r\n");
      out.write("        </main>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

    } else {
        response.sendRedirect("login_admi.jsp");
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
