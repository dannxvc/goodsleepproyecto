package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Categoria;
import modelo.Servicio_Adicional;
import dao.listadoDAO;

public final class pagListaCategoria_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");

    if(session.getAttribute("usuarioA")!=null){  

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("   <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"icon\" href=\"img/logo_purple.png\" type=\"image/png\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script defer src=\"js/menu.js\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\n");
      out.write("    <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\n");
      out.write("    <script defer src=\"js/sweetalert.js\" type=\"text/javascript\"></script>\n");
      out.write("    <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    <script defer src=\"js/alerts.js\"></script>\n");
      out.write("    <title>Mantenimiento | Categorias</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("        <nav id=\"navbaradmi\">\n");
      out.write("            <div class=\"infoUsuario\">\n");
      out.write("                <img src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\n");
      out.write("                <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.id_admi.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\n");
      out.write("            </div>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"pagReservaAdmi.jsp\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\n");
      out.write("                <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\n");
      out.write("                <li><a href=\"pagListaReservas.jsp\"><span><i class=\"fa-solid fa-bed\"></i></span> Reservas</a></li>\n");
      out.write("                <div class=\"li-active\" id=\"mantenimiento\">\n");
      out.write("                    <li id=\"flecha_abajo\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span>Mantenimiento</li>\n");
      out.write("                    <ul>\n");
      out.write("                        <li class=\"li-active\"><a href=\"pagListaCategoria.jsp\">Categorias</a></li>               \n");
      out.write("                        <li><a href=\"pagListaServicioAd.jsp\">Servicios Adicionales</a></li>\n");
      out.write("                        <li><a href=\"pagHabitaciones.jsp\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Habitaciones</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("                <li  class=\"li-cerrar-sesion\"><a href=\"uacontrol?accion=cerrar\" id=\"btn-cerrar\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("          \n");
      out.write("            \n");
      out.write("          <main>\n");
      out.write("        <h2 class=\"text-center mt-5\">Lista de Categoria</h2>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        ");

          listadoDAO obj=new listadoDAO(); 
        
      out.write("  \n");
      out.write("          \n");
      out.write("         <table class=\"table table-hover text-center mt-3\">\n");
      out.write("            <thead class=\"bg-dark text-white text-center\">\n");
      out.write("                <th>Cod categoria<th>Nombre de categoria<th>Descripcion<th>Precio</th>\n");
      out.write("            </thead>     \n");
      out.write("            ");

                for(Categoria x:obj.lisCategoria()){
                    out.print("<tr><td>"+x.getCodCategoria()+"<td>"+x.getNombreCat()+"<td>"+x.getDescripcion()+"<td>"+x.getPrecio());  
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("       \n");
      out.write("\n");
      out.write("    </main>\n");
      out.write("                   \n");
      out.write("    </body>\n");
      out.write("</html>\n");

   }else{
    response.sendRedirect("login_admi.jsp");
} 

      out.write('\n');
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
