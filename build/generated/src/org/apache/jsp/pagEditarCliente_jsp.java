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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://cdn.jsdelivr.net/npm/toastify-js/src/toastify.min.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"infoUsuario\">\n");
      out.write("                <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\n");
      out.write("                <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\n");
      out.write("            </div>\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\n");
      out.write("                <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-solid fa-bed\"></i></span> Lista Habitaciones</a></li>\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Mantenimiento</a></li>\n");
      out.write("                <li><a href=\"uacontrol?accion=cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("            \n");
      out.write("            ");

                Cliente c=(Cliente)request.getAttribute("dato");     
             
      out.write("  \n");
      out.write("            \n");
      out.write("            <main>\n");
      out.write("                <form class=\"formEditarCliente mt-5\" id=\"form\" action=\"svReserva\">\n");
      out.write("                    <h2 class=\"text-center mt-2\">Editar informacion</h2>\n");
      out.write("                    <input type=\"hidden\" name=\"opc\" value=\"4\">\n");
      out.write("                    <div class=\"col-md-12 mt-1\">\n");
      out.write("                        <label for=\"documento\" class=\"form-label\">Tipo de documento :</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"documento\" value=\"");
      out.print(c.getTipoDoc());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\n");
      out.write("                        <label for=\"idcliente\" class=\"form-label\">N° de documento :</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"idcliente\" value=\"");
      out.print(c.getId_cliente());
      out.write("\" readonly>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\n");
      out.write("                        <label for=\"nombre\" class=\"form-label\">Nombres:</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"nombre\" value=\"");
      out.print(c.getNombre());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\n");
      out.write("                        <label for=\"apellido\" class=\"form-label\">Apellidos :</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\" name=\"apellido\" value=\"");
      out.print(c.getApellido());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\n");
      out.write("                        <label for=\"telefono\" class=\"form-label\">Telefono :</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control\"  name=\"telefono\" value=\"");
      out.print(c.getCelular());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\n");
      out.write("                        <label for=\"email\" class=\"form-label\">Email</label>\n");
      out.write("                        <input type=\"email\" class=\"form-control\"  name=\"email\" value=\"");
      out.print(c.getCorreo());
      out.write("\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col-md-12 d-flex justify-content-evenly mt-3\">\n");
      out.write("                        <button type=\"submit\" id=\"modificarboton\" class=\"btn btn-primary col-md-3\">Actualizar</button>\n");
      out.write("                        <button type=\"button\" class=\"btn btn-secondary col-md-3\"><a class=\"text-white\" href=\"pagListaClientes.jsp\">Regresar</a></button>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("                    <button type=\"submit\" id=\"modificarboton\" class=\"btn btn-primary col-md-3\" id=\"\">Actualizar</button>\n");
      out.write("            </main>\n");
      out.write("                    <script src=\"js/mensaje.js\"></script>\n");
      out.write("                    <script type=\"text/javascript\" src=\"https://cdn.jsdelivr.net/npm/toastify-js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
