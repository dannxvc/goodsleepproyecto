package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;

public final class perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    if(session.getAttribute("usuarioC")!=null){  

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"icon\" href=\"/img/logo.png\" type=\"image/png\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\n");
      out.write("    <title>Good Sleep | Perfil</title>\n");
      out.write("</head>\n");
      out.write("<body id=\"yellow\">\n");
      out.write("    <header id=\"header\">\n");
      out.write("        <a href=\"uccontrol?accion=cerrar\" class=\"btn btn-login btn-logout\">\n");
      out.write("           <img class=\"login-icon\" src=\"img/profile.svg\" alt=\"log in\">\n");
      out.write("           LOG OUT\n");
      out.write("        </a>\n");
      out.write("        <h1>hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" !!</h1>\n");
      out.write("    </header>\n");
      out.write("    <nav id=\"navbar\">\n");
      out.write("        <a href=\"perfil.html\">\n");
      out.write("            <img class=\"icon nav-icon icon-active\"  src=\"img/yo.svg\" alt=\"my profile\">\n");
      out.write("        </a>\n");
      out.write("        <a href=\"misreservas.html\">\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/mis-reser.svg\" alt=\"my reservations\">\n");
      out.write("        </a>\n");
      out.write("        <a href=\"reservar.html\">\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/reservar.svg\" alt=\"book a room\">\n");
      out.write("        </a>\n");
      out.write("    </nav>\n");
      out.write("    <main id=\"crear-cuenta\">\n");
      out.write("        <section class=\"section-form\">\n");
      out.write("            <form class=\"form form-crear-cuenta\" action=\"control\">\n");
      out.write("                <p>Mis datos</p>\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"id_cliente\" value=\" ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"apellido\" value=\"");
//=p.getApellido()
      out.write("\" readonly>\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"tipoDoc\" value=\"");
//=p.getTipoDoc()
      out.write("\" readonly>\n");
      out.write("                <input class=\"input input-gray\" type=\"tel\" name=\"celular\" value=\"");
//=p.getCelular()
      out.write("\" readonly>\n");
      out.write("                <input class=\"input input-gray\" type=\"email\" name=\"correo\" value=\"");
//=p.getCorreo()
      out.write("\" readonly>\n");
      out.write("                <p>Usuario & Contraseña</p>\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"text\" name=\"usuario\" value=\"");
//=p.getUsuario()
      out.write("\" readonly>\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"password\" name=\"password\" value=\"");
//=p.getUsuario()
      out.write("\" readonly>\n");
      out.write("                <input type=\"hidden\" name=\"opc\" value=\"#\">\n");
      out.write("                <button type=\"submit\"  class=\"btn btn-white\" >Editar Perfil</button>\n");
      out.write("            </form>\n");
      out.write("        </section>\n");
      out.write("        \n");
      out.write("    </main>\n");
      out.write("</body>\n");
      out.write("</html>\n");

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
