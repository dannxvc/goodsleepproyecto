package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_005fadmi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"icon\" href=\"img/logo_purple.png\" type=\"image/png\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@600&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <title>Good Sleep | Log In Admi</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"purple\">\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"index.html\" class=\"btn btn-login btn-logout\">\r\n");
      out.write("            <img class=\"login-icon\"src=\"img/home.svg\" alt=\"log in\">\r\n");
      out.write("            INICIO\r\n");
      out.write("         </a>\r\n");
      out.write("        <h1>log in admi</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("    <nav id=\"navbar\">\r\n");
      out.write("        <div>\r\n");
      out.write("        <a href=\"login_cliente.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/profile.svg\" alt=\"go to login for admi\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <span class=\"tooltip\">log in cliente</span>\r\n");
      out.write("        </div>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"crear-cuenta\">\r\n");
      out.write("        <section class=\"section-form section-form-login\">\r\n");
      out.write("            <h2>Hola, admi!</h2>\r\n");
      out.write("            <form class=\"form form-login form-login-admi\"action=\"uacontrol?accion=verificar\"  method=\"post\">\r\n");
      out.write("                <input class=\"input input-gray\" type=\"text\" placeholder=\"Usuario\" name=\"usuario\" required>\r\n");
      out.write("                <input class=\"input input-gray\" type=\"password\" placeholder=\"Password\" name=\"password\" required>\r\n");
      out.write("                <p class=\"p-pink\"><img class=\"login-icon\" src=\"img/danger.svg\" alt=\"\"> Log In solo para administrador@s.  </p>\r\n");
      out.write("                <input type=\"submit\" name=\"verificar\" class=\"btn btn-pink\" value=\"INICIAR SESION\">\r\n");
      out.write("            </form>\r\n");
      out.write("            ");

                    if(request.getAttribute("msje")!=null){
                        String msg=request.getAttribute("msje").toString();
           
      out.write("\r\n");
      out.write("                 <div class=\"msg-error\" role=\"alert\">");
      out.print(msg);
      out.write("</div>\r\n");
      out.write("            ");

                }
             
      out.write("\r\n");
      out.write("        </section>\r\n");
      out.write("    </main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
