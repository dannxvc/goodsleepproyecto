package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.*;

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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    if(session.getAttribute("usuarioC")!=null){  

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("   <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"icon\" href=\"/img/logo.png\" type=\"image/png\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <title>Good Sleep | Perfil</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"yellow\">\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"uccontrol?accion=cerrar\" class=\"btn btn-login btn-logout\">\r\n");
      out.write("           <img class=\"login-icon\" src=\"img/profile.svg\" alt=\"log in\">\r\n");
      out.write("           LOG OUT\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1>hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" !!</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <a href=\"perfil.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon icon-active\"  src=\"img/yo.svg\" alt=\"my profile\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"clientecontrol?opc=3&cod=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/mis-reser.svg\" alt=\"my reservations\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"reservar.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/reservar.svg\" alt=\"book a room\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"index.html\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/home.svg\" alt=\"inicio\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"crear-cuenta\">\r\n");
      out.write("        <section class=\"section-form\">\r\n");
      out.write("           <form class=\"form form-crear-cuenta\" ><!--action=\"control\"-->\r\n");
      out.write("                <p>Mis datos</p>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"id_cliente\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"nombre\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>                \r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"apellido\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.apellido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" name=\"tipoDoc\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.tipoDoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"tel\" name=\"celular\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"email\" name=\"correo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.correo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <p>Usuario & Contraseña</p>\r\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"text\" name=\"usuario\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <input class=\"input input-pink-dark\" type=\"password\" name=\"password\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.password}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" readonly>\r\n");
      out.write("                <a href=\"javascript:editarPerfil('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.tipoDoc}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("                   '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.apellido}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("',\r\n");
      out.write("                    '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.celular}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("', '");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.correo}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("');\" class=\"btn btn-white\"> Editar Perfil</a>\r\n");
      out.write("            </form>\r\n");
      out.write("        </section>\r\n");
      out.write("        \r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write(" <script> \r\n");
      out.write("       function editarPerfil(codc,tipodoc,nom,ape,cel,correo){ \r\n");
      out.write("        //window.alert(prec); \r\n");
      out.write("      //  alert(prod); \r\n");
      out.write("       location=\"clientecontrol?opc=1&cod=\"+codc; \r\n");
      out.write("      //  window.parent.recibeSeleccion(codp,prod,prec);        \r\n");
      out.write("    } \r\n");
      out.write("    </script> \r\n");
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
