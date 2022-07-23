package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.FacturaPorMes;
import modelo.Cliente;
import dao.graficoDAO;

public final class FacturaPorMes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Grafico | Facturas por año </title>\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

             graficoDAO obj=new graficoDAO();
        
      out.write("\n");
      out.write("        <h1 class=\"bg-primary text-center p-4 text-white\">Grafico por facturas año</h1> \n");
      out.write("       <div class=\" mx-auto\" style=\"width: 400px;\">\n");
      out.write("            <a href=\"FacPorMes.jsp\" class=\"btn btn-dark m-1 \"style=\"width: 100%;\"> grafico por mes\n");
      out.write("            </a>\n");
      out.write("             <a href=\"FacPorAnio.jsp\" class=\"btn btn-primary m-1\" style=\"width: 100%;\"> grafico por facturas año\n");
      out.write("            </a>\n");
      out.write("            <a href=\"ArtPorAnio.jsp\" class=\"btn btn-dark m-1\" style=\"width: 100%;\">grafico 10 articulos mas vendidos por año\n");
      out.write("            </a>\n");
      out.write("             <a href=\"VenPorAnio.jsp\" class=\"btn btn-dark m-1\" style=\"width: 100%;\"> grafico de ventas por empleado\n");
      out.write("            </a>\n");
      out.write("            <a href=\"pagCliente.jsp\" class=\"btn btn-danger m-1\" style=\"width: 100%;\"> volver\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <table class=\"table table-dark mx-auto\" style=\"width: 220px;\">\n");
      out.write("            <thead>\n");
      out.write("            <tr class=\"bg-light\">\n");
      out.write("                <th>\n");
      out.write("                    Mes\n");
      out.write("                </th>\n");
      out.write("                <th>\n");
      out.write("                    Cantidad\n");
      out.write("                </th>\n");
      out.write("            </tr>\n");
      out.write("            </thead>\n");
      out.write("             ");

                for(FacturaPorMes x:obj.lisFacPorMes()){
                    out.print("<tr><td>"+x.getMes()+"<td>"+x.getCantidad());
             }
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <form action=\"graficoFA.jsp\" target=\"win\" class=\"form-control  mx-auto\"  style=\"width: 220px;\">\n");
      out.write("            <label for=\"torta\">\n");
      out.write("                <input id=\"torta\" type=\"radio\" value=\"1\" name=\"opc\" onclick=\"submit()\"/> Torta \n");
      out.write("            </label>\n");
      out.write("             <label for=\"barras\">\n");
      out.write("            <input id=\"barras\" type=\"radio\" value=\"2\" name=\"opc\" onclick=\"submit()\"/> Barras \n");
      out.write("            </label>\n");
      out.write("            <label for=\"lineal\">\n");
      out.write("            <input id=\"lineal\" type=\"radio\" value=\"3\" name=\"opc\" onclick=\"submit()\"/> Lineal          \n");
      out.write("            </label>\n");
      out.write("        </form>\n");
      out.write("        <iframe class=\"\" name=\"win\" height=\"500\" style=\"width: 100%;\">        \n");
      out.write("            \n");
      out.write("        <iframe>\n");
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
