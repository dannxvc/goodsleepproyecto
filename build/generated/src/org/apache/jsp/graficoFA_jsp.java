package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.graficoDAO;
import modelo.*;

public final class graficoFA_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("  <link\n");
      out.write("    rel=\n");
      out.write("\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css\"\n");
      out.write("    type=\"text/css\"\n");
      out.write("  />\n");
      out.write("  <script src=\n");
      out.write("\"https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.3/jquery.min.js\"></script>\n");
      out.write("  <script\n");
      out.write("    src=\n");
      out.write("\"https://cdnjs.cloudflare.com/ajax/libs/modernizr/2.8.3/modernizr.min.js\"\n");
      out.write("    type=\"text/javascript\"\n");
      out.write("  ></script>\n");
      out.write("  <script src=\n");
      out.write("\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js\"></script>\n");
      out.write("  \n");
      out.write("  <script src=\n");
      out.write("\"https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.2.2/Chart.min.js\"></script>\n");
      out.write("  <style>\n");
      out.write("    .container {\n");
      out.write("      width: 45%;\n");
      out.write("      margin: 15px auto;\n");
      out.write("    }\n");
      out.write("    body {\n");
      out.write("      text-align: center;\n");
      out.write("      color: green;\n");
      out.write("    }\n");
      out.write("    h2 {\n");
      out.write("      text-align: center;\n");
      out.write("      font-family: \"Verdana\", sans-serif;\n");
      out.write("      font-size: 30px;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("     \n");
      out.write("   \n");
      out.write("   ");
    
        String label="",dato="";
        graficoDAO obj = new graficoDAO();
        for (CantPorEstado x : obj.lisCantPorEstado()) {
            label+="'"+x.getEstado()+"',";
            dato += x.getCant()+",";
       }   
        
             
         
     label="["+label.substring(0,label.length()-1)+"]";
     dato="["+dato.substring(0,dato.length()-1)+"]";
   
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("          <h2>Esta</h2>\n");
      out.write("          <div>\n");
      out.write("              <canvas id=\"myChart\"></canvas>\n");
      out.write("          </div>\n");
      out.write("      </div>\n");
      out.write("  </body>\n");
      out.write("  <script>\n");
      out.write("    var ctx = document.getElementById(\"myChart\").getContext(\"2d\");\n");
      out.write("    var myChart = new Chart(ctx, {\n");
      out.write("      type: \"pie\",\n");
      out.write("      data: {\n");
      out.write("        labels: ");
      out.print(label);
      out.write(",\n");
      out.write("        datasets: [\n");
      out.write("          {\n");
      out.write("            label: \"work load\",\n");
      out.write("            data: ");
      out.print(dato);
      out.write(",\n");
      out.write("            backgroundColor: [\"rgba(153,205,1,0.6)\",\n");
      out.write("             'yellow',\n");
      out.write("             'orange',\n");
      out.write("             'red'\n");
      out.write("            ]\n");
      out.write("          },\n");
      out.write("          ],\n");
      out.write("      },\n");
      out.write("    });\n");
      out.write("  </script>\n");
      out.write("\n");
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
