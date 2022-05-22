package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;

public final class misreservas_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <title>Good Sleep | Mis Reservaciones</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"yellow\">\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"uccontrol?accion=cerrar\" class=\"btn btn-login btn-logout\">\r\n");
      out.write("           <img class=\"login-icon\" src=\"img/profile.svg\" alt=\"log in\">\r\n");
      out.write("           LOG OUT\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1>mis reservaciones</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <a href=\"perfil.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\"  src=\"img/yo.svg\" alt=\"my rese  rvations\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"misreservas.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon icon-active\" src=\"img/mis-reser.svg\" alt=\"book a room\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"reservar.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/reservar.svg\" alt=\"book a room\">\r\n");
      out.write("        </a>  \r\n");
      out.write("        <a href=\"index.html\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/home.svg\" alt=\"inicio\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"main-mis-reservas\">\r\n");
      out.write("        <section>\r\n");
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
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
