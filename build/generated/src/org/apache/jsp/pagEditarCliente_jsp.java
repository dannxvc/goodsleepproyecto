package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;

public final class pagEditarCliente_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if(session.getAttribute("usuarioA")!=null){  

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("         <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("         <link rel=\"icon\" href=\"img/logo_purple.png\" type=\"image/png\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\r\n");
      out.write("         <script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("         <script defer src=\"js/menu.js\"></script>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("       <nav id=\"navbaradmi\" class=\"shadow mb-5 bg-dark \">\r\n");
      out.write("            <div class=\"infoUsuario\">\r\n");
      out.write("                <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\r\n");
      out.write("                <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.id_admi.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\r\n");
      out.write("            </div>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"dashboard.jsp\"><span><i class=\"fa fa-area-chart\"></i></span> Dashboard</a></li>\r\n");
      out.write("                <li><a href=\"pagReservaAdmi.jsp\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\r\n");
      out.write("                <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\r\n");
      out.write("                <li><a href=\"pagListaReservas.jsp\"><span><i class=\"fa-solid fa-bed\"></i></span> Reservas</a></li>\r\n");
      out.write("                <div id=\"mantenimiento\">\r\n");
      out.write("                    <li id=\"flecha_abajo\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span>Mantenimiento</li>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"pagListaCategoria.jsp\">Categorias</a></li>               \r\n");
      out.write("                        <li><a href=\"pagListaServicioAd.jsp\">Servicios Adicionales</a></li>\r\n");
      out.write("                        <li><a href=\"pagHabitaciones.jsp\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Habitaciones</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </div>\r\n");
      out.write("                <li><a href=\"uacontrol?accion=cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("            \r\n");
      out.write("            ");

                Cliente c=(Cliente)request.getAttribute("dato");     
             
      out.write("  \r\n");
      out.write("            \r\n");
      out.write("            <main>\r\n");
      out.write("                <form class=\"formEditarCliente mt-5\" id=\"form\" action=\"svReserva\">\r\n");
      out.write("                    <h2 class=\"text-center mt-2\">Editar informacion</h2>\r\n");
      out.write("                    <input type=\"hidden\" name=\"opc\" value=\"4\">\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"idcliente\" class=\"form-label\">N° de documento :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"idcliente\" value=\"");
      out.print(c.getId_cliente());
      out.write("\" readonly>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-1\">\r\n");
      out.write("                        <label for=\"documento\" class=\"form-label\">Tipo de documento :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"documento\" value=\"");
      out.print(c.getTipoDoc());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"nombre\" class=\"form-label\">Nombres:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nombre\" value=\"");
      out.print(c.getNombre());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"apellido\" class=\"form-label\">Apellidos :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"apellido\" value=\"");
      out.print(c.getApellido());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"telefono\" class=\"form-label\">Telefono :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"telefono\" value=\"");
      out.print(c.getCelular());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"email\" class=\"form-label\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\"  name=\"email\" value=\"");
      out.print(c.getCorreo());
      out.write("\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 d-flex justify-content-evenly mt-3\">\r\n");
      out.write("                        <button type=\"submit\" id=\"\" class=\"btn btn-primary col-md-3\">Actualizar</button>\r\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary col-md-3\"><a class=\"text-white\" href=\"pagListaClientes.jsp\">Regresar</a></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </main>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

   }else{
    response.sendRedirect("login_admi.jsp");
} 

      out.write("    ");
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
