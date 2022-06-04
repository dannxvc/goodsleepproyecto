package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import modelo.Reservar_Habitacion;
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
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write(" <link rel=\"stylesheet\" href=\"css/index.css\">\r\n");
      out.write("    <title>Good Sleep | Mis Reservaciones</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"yellow\">\r\n");
      out.write("    ");

            List<Reservar_Habitacion> lista=(ArrayList)request.getAttribute("dato");
        
      out.write("\r\n");
      out.write("    <header id=\"header\">\r\n");
      out.write("        <a href=\"uccontrol?accion=cerrar\" class=\"btn btn-login btn-logout\">\r\n");
      out.write("           <img class=\"login-icon\" src=\"img/profile.svg\" alt=\"log in\">\r\n");
      out.write("           LOG OUT\r\n");
      out.write("        </a>\r\n");
      out.write("        <h1>mis reservaciones</h1>\r\n");
      out.write("    </header>\r\n");
      out.write("   <nav id=\"navbar\">\r\n");
      out.write("        <a href=\"perfil.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon \"  src=\"img/yo.svg\" alt=\"my profile\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"clientecontrol?opc=3&cod=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioC.id_cliente.id_cliente}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("            <img class=\"icon nav-icon icon-active\" src=\"img/mis-reser.svg\" alt=\"my reservations\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"reservar.jsp\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/reservar.svg\" alt=\"book a room\">\r\n");
      out.write("        </a>\r\n");
      out.write("        <a href=\"index.html\">\r\n");
      out.write("            <img class=\"icon nav-icon\" src=\"img/home.svg\" alt=\"inicio\">\r\n");
      out.write("        </a>\r\n");
      out.write("    </nav>\r\n");
      out.write("    <main id=\"main-mis-reservas\">\r\n");
      out.write("        <section>\r\n");
      out.write("            <table class=\"table table-dark mx-auto\" style=\"width: 1200px;\">\r\n");
      out.write("        <thead>\r\n");
      out.write("            <th>ID Reserva</th>\r\n");
      out.write("            <th>Fecha Inicio</th>  \r\n");
      out.write("            <th>Fecha Final</th>            \r\n");
      out.write("            <th># dias</th>\r\n");
      out.write("            <th>ID Habitacion</th>\r\n");
      out.write("            <th>Subtotal</th>\r\n");
      out.write("            <th>ID Servicio</th>\r\n");
      out.write("            <th>N° Personas</th>\r\n");
      out.write("            <th>TOTAL</th>\r\n");
      out.write("            <th>Estado</th>\r\n");
      out.write("            </tr>\r\n");
      out.write("        </thead>\r\n");
      out.write("        ");

           
            for(Reservar_Habitacion x:lista){
                String fondo;
                String id=x.getId_reserva();
                Date fi=x.getFechaInicio() ;                
                Date ff=x.getFechaFinal() ;
                int dias= x.numeroDias();
                String codh=x.getCodHabita();
                Double sub=x.getSubtotal();                
                String serv=x.getCod_servA();
                int cant=x.getCant_personas();
                Double total=x.getPrecioTotal();
                String estado=x.getEstado();
                
                if(estado.equals("PAGADO")){
                    fondo="bg-success";
                }else{
                    fondo="bg-danger";
                }
                
      out.write(" <tr>\r\n");
      out.write("                    <td>");
      out.print(id);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(fi);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(ff);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(dias);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(codh);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(sub);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(serv);
      out.write("</td>\r\n");
      out.write("                    <td>");
      out.print(cant);
      out.write("</td>                    \r\n");
      out.write("                    <td>");
      out.print(total);
      out.write("</td>\r\n");
      out.write("\r\n");
      out.write("                    <td class=\"");
      out.print(fondo);
      out.write('"');
      out.write('>');
      out.print(estado);
      out.write("</td>\r\n");
      out.write("                </tr>");

     
            }
        
      out.write("\r\n");
      out.write("    </table>\r\n");
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
