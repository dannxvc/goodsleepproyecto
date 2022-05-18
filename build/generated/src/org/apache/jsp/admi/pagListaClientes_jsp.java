package org.apache.jsp.admi;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.Cliente;
import dao.listadoDAO;

public final class pagListaClientes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"..css/navAdmi.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"../css/clienteAdmi.css\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <header>\r\n");
      out.write("        <nav>\r\n");
      out.write("            <div class=\"infoUsuario\">\r\n");
      out.write("                <h2>Sistema</h2>\r\n");
      out.write("                <img src=\"img/user.png\" alt=\"\">\r\n");
      out.write("                <p class=\"mt-3\">USUARIO</p>\r\n");
      out.write("            </div>\r\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-regular fa-address-card\"></i></span> Registro</a></li>\r\n");
      out.write("                <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user\"></i></span> Clientes</a></li>\r\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-solid fa-bed\"></i></span> Lista Habitaciones</a></li>\r\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-regular fa-pen-to-square\"></i></span> Mantenimiento</a></li>\r\n");
      out.write("                <li><a href=\"\"><span><i class=\"fa-solid fa-right-from-bracket\"></i></span> Cerrar sesion</a></li>\r\n");
      out.write("        </nav>\r\n");
      out.write("    </header>\r\n");
      out.write("        <div class=\"modal-contenedor\">\r\n");
      out.write("            <div class=\"modal-formulario\">\r\n");
      out.write("                <button id=\"boton-cerrar\"><i class=\"fas fa-times-circle\"></i></button>\r\n");
      out.write("                <h3>Registrar Cliente :</h3>\r\n");
      out.write("                <form id=\"form\" action=\"svReserva\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"opc\" value=\"1\">\r\n");
      out.write("                    <div class=\"col-md-12 mt-1\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Tipo de documento :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"documento\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">N° de documento :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"idcliente\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Nombres:</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"nombre\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Apellidos :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"apellido\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"\" class=\"form-label\">Telefono :</label>\r\n");
      out.write("                        <input type=\"text\" class=\"form-control\" id=\"\" name=\"telefono\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 mt-3\">\r\n");
      out.write("                        <label for=\"inputEmail4\" class=\"form-label\">Email</label>\r\n");
      out.write("                        <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" name=\"email\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-md-12 d-flex justify-content-center mt-1\">\r\n");
      out.write("                        <button type=\"submit\" class=\"btn btn-primary col-md-4\">Registrar</button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    \r\n");
      out.write("    <main>\r\n");
      out.write("        <h2 class=\"text-center mt-5\">Lista de Clientes</h2>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"barraCliente mt-4\">\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-success \" id=\"boton-agregar\">Agregar +</button>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("        ");

          listadoDAO obj=new listadoDAO(); 
        
      out.write("\r\n");
      out.write("        \r\n");
      out.write("        <table class=\"table table-hover text-center mt-3\">\r\n");
      out.write("            <thead class=\"bg-dark text-white text-center\">\r\n");
      out.write("                <th>ID Cliente<th>Tipo de Documento<th>Nombres<th>Apellidos<th>Celular<th>Correo<th>Editar</th><th>Eliminar</th>\r\n");
      out.write("            </thead>     \r\n");
      out.write("            ");

                for(Cliente x:obj.lisCliente()){
                    out.print("<tr><td>"+x.getId_cliente()+"<td>"+x.getTipoDoc()+"<td>"+x.getNombre()+"<td>"+x.getApellido()+"<td>"+x.getCelular()+"<td>"+x.getCorreo());  
                }
            
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </table>\r\n");
      out.write("    </main>\r\n");
      out.write("    <script src=\"js/modal.js\"></script>\r\n");
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
