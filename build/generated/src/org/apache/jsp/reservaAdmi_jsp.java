package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Servicio_Adicional;
import modelo.Categoria;
import dao.listadoDAO;

public final class reservaAdmi_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\n");
      out.write("    <title>Document</title>\n");
      out.write("</head>\n");
      out.write("    <body>\n");
      out.write("        <main>\n");
      out.write("        <h1 class=\"text-center mt-5\">REGISTRO CLIENTE</h1>\n");
      out.write("        <form class=\"mt-5\" id=\"form\" action=\"\"> \n");
      out.write("            <div class=\"row g-3 p-5\">\n");
      out.write("                <input type=\"hidden\" name=\"opc\" value=\"1\">\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Nombres:</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"nombre\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Apellidos :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"apellido\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Tipo de documento :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"documento\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">N° de documento :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"idcliente\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Telefono :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"telefono\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"inputEmail4\" class=\"form-label\">Email</label>\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" name=\"email\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Numero de personas :</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"\" name=\"npersonas\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Categoria :</label>\n");
      out.write("                    <select class=\"form-select\" name=\"tipohabitacion\">\n");
      out.write("                        <option>Elegir</option>\n");
      out.write("                            ");

                             listadoDAO catD=new listadoDAO();
                                                                    
                             for(Categoria x:catD.lisCategoria()){
                                    out.print("<option value="+x.getCodCategoria()+">"+x.getNombreCat());
                              }
                             
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\">\n");
      out.write("                    <label for=\"\" class=\"form-label\">Servicio adicional :</label>\n");
      out.write("                    <select class=\"form-select\" name=\"servicioad\">\n");
      out.write("                        <option>Elegir</option>\n");
      out.write("                        ");
                        
                             for(Servicio_Adicional x:catD.lisServicioAdicional()){
                                    out.print("<option value="+x.getCod_servA()+">"+x.getDescripcion());
                              }
                         
      out.write("\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Checkin</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"fcheckin\" name=\"fcheckin\">\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-md-4\">\n");
      out.write("                    <label class=\"form-label\">Checkout</label>\n");
      out.write("                    <input type=\"date\" class=\"form-control\" id=\"fcheckout\" name=\"fcheckout\">\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-12 d-flex justify-content-center\">\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-primary col-md-2\">Registrar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </form>               \n");
      out.write("    </main>\n");
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
