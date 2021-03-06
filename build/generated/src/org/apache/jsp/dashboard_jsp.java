package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.graficoDAO;
import dao.listadoDAO;
import modelo.*;
import java.util.List;
import modelo.Cliente;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\r\n");

    if(session.getAttribute("usuarioA")!=null){  

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"es\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"UTF-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.googleapis.com\">\r\n");
      out.write("        <link rel=\"icon\" href=\"img/logo_purple.png\" type=\"image/png\">\r\n");
      out.write("        <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\" crossorigin>\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,500;1,400&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css\" integrity=\"sha512-KfkfwYDsLkIlwQp6LFnl8zNdLGxu9YAA1QvwINks4PhcElQSvqcyVLLD9aMhXd13uQjoXtEKNosOWaZqXgel0g==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.2.0-beta1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-pprn3073KE6tl6bjs2QrFaJGz5/SUsLqktiwsUTF55Jfv3qYSDhgCecCxMW52nD2\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/navAdmi.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/clienteAdmi.css\">\r\n");
      out.write("         <script src=\"js/jquery-1.10.2.min.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <script defer src=\"js/sweetalert.js\" type=\"text/javascript\"></script>\r\n");
      out.write("        <link href=\"css/sweetalert.css\" rel=\"stylesheet\" type=\"text/css\"/>\r\n");
      out.write("        <script defer src=\"js/alerts.js\"></script>\r\n");
      out.write("        <script defer src=\"js/menu.js\"></script>\r\n");
      out.write("        <title>Dashboard</title>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <nav id=\"navbaradmi\" class=\"shadow mb-5 bg-dark\">\r\n");
      out.write("                <div class=\"infoUsuario\">\r\n");
      out.write("                    <img class=\"\" src=\"img/admi/");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(".svg\" alt=\"\">\r\n");
      out.write("                    <p> Hola, ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${usuarioA.id_admi.nombre}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("!</p>\r\n");
      out.write("                </div>\r\n");
      out.write("                <ul>\r\n");
      out.write("                    <li class=\"li-active\"><a href=\"#\"><span ><i class=\"fa fa-area-chart me-2\"></i></span> Dashboard</a></li>\r\n");
      out.write("                    <li><a href=\"pagReservaAdmi.jsp\"><span ><i class=\"fa-regular fa-address-card me-2\"></i></span> Registro</a></li>\r\n");
      out.write("                    <li><a href=\"pagListaClientes.jsp\"><span><i class=\"fa-solid fa-user me-2\"></i></span> Clientes</a></li>\r\n");
      out.write("                    <li ><a href=\"pagListaReservas.jsp\"><span><i class=\"fa-solid fa-bed me-2\"></i></span> Reservas</a></li>\r\n");
      out.write("                    <div id=\"mantenimiento\">\r\n");
      out.write("                        <li id=\"flecha_abajo\"><span><i class=\"fa-regular fa-pen-to-square me-2\"></i></span>Mantenimiento</li>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><a href=\"pagListaCategoria.jsp\"><span><i class=\"fa-regular fa-pen-to-square  me-2\"></i></span>Categorias</a></li>               \r\n");
      out.write("                            <li><a href=\"pagListaServicioAd.jsp\"><span><i class=\"fa-regular fa-pen-to-square  me-2\"></i></span>Servicios Adicionales</a></li>\r\n");
      out.write("                            <li><a href=\"pagHabitaciones.jsp\"><span><i class=\"fa-regular fa-pen-to-square  me-2\"></i></span>Habitaciones</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <li class=\"li-cerrar-sesion\"><a href=\"uacontrol?accion=cerrar\"  id=\"btn-cerrar\"><span><i class=\"fa-solid fa-right-from-bracket me-2\"></i></span> Cerrar sesion</a></li>\r\n");
      out.write("                </ul>\r\n");
      out.write("            </nav>\r\n");
      out.write("        </header>\r\n");
      out.write("        <main>\r\n");
      out.write("            ");

                listadoDAO obj = new listadoDAO();
            
      out.write("\r\n");
      out.write("            <h1 class=\"mt-5 text-black fs-1 \">Dashboard</h1>\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row gap-5 mb-5 mx-auto text-center \">\r\n");
      out.write("                        <div class=\"col card shadow p-3 bg-body rounded border-0 \" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-users fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                                \r\n");
      out.write("                              <h2 class=\"card-title fw-bold text-danger fs-1\">\r\n");
      out.write("                                ");
int cantC=0;
                                    
                                      for (Cliente x : obj.lisCliente()) {
                                         x.setCantClientes(cantC);
                                         cantC = x.getCantClientes();
                                         cantC++;
                                    }   
                                        out.print(cantC);
                                
      out.write("\r\n");
      out.write("                              </h2>\r\n");
      out.write("                              <p class=\"card-text text-black-50\">Clientes</p>\r\n");
      out.write("                              <a href=\"pagListaClientes.jsp\" class=\"btn btn btn-outline-info\">Ir a Clientes</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col card shadow p-3  bg-body rounded border-0\" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-address-book fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                              <h2 class=\"card-title fw-bold text-danger fs-1\">\r\n");
      out.write("                                ");

                                    int cantR=0;
                                    
                                      for (Reservar_Habitacion x : obj.lisReservas()) {
                                         x.setCantReservas(cantR);
                                         cantR = x.getCantReservas();
                                         cantR++;
                                    }   
                                        out.print(cantR);
                                
      out.write("\r\n");
      out.write("                              </h2>\r\n");
      out.write("                              <p class=\"card-text text-black-50\">Reservas</p>\r\n");
      out.write("                              <a href=\"pagListaReservas.jsp\" class=\"btn btn btn-outline-info\" >Ir a Reservas</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col card shadow p-3 bg-body rounded border-0 \" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-building fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                             <h2 class=\"card-title fw-bold text-danger fs-1\">\r\n");
      out.write("                                ");

                                    int cantH=0;
                                    
                                      for (Habitacion x : obj.lisHabitacion()) {
                                         x.setCantHabitaciones(cantH);
                                         cantH = x.getCantHabitaciones();
                                         cantH++;
                                    }   
                                        out.print(cantH);
                                
      out.write("\r\n");
      out.write("                              </h2>\r\n");
      out.write("                              <p class=\"card-text text-black-50\">Habitaciones</p>\r\n");
      out.write("                              <a href=\"pagHabitaciones.jsp\" class=\"btn btn btn-outline-info\">Ir a Habitaciones</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col card shadow p-3 bg-body rounded border-0\" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-car fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                              <h2 class=\"card-title fw-bold text-danger fs-1\">\r\n");
      out.write("                                ");

                                    int cantS=0;
                                    
                                      for (Servicio_Adicional x : obj.lisServicioAdicional()) {
                                         x.setCantServicios(cantS);
                                         cantS = x.getCantServicios();
                                         cantS++;
                                    }   
                                        out.print(cantS);
                                
      out.write("\r\n");
      out.write("                              </h2>\r\n");
      out.write("                              <p class=\"card-text text-black-50\">Servicios Adicionales</p>\r\n");
      out.write("                              <a href=\"pagListaServicioAd.jsp\" class=\"btn btn btn-outline-info\">Ir a Servicios</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                 </div>\r\n");
      out.write("<!--                <div class=\"row gap-5 mx-auto text-center \"> \r\n");
      out.write("                    \r\n");
      out.write("                        \r\n");
      out.write("                        <div class=\"col card shadow p-3 bg-body rounded border-0\" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-car fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                              <h2 class=\"card-title fw-bold text-black\">\r\n");
      out.write("                                  Estado de Habitaciones\r\n");
      out.write("                              </h2>\r\n");
      out.write("                              <p class=\"card-text text-danger\">Estado de Habitaciones</p>\r\n");
      out.write("                              <a href=\"pagListaServicioAd.jsp\" class=\"btn btn btn-outline-info\">Ir a Servicios</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div> \r\n");
      out.write("                        <div class=\"col card shadow p-3 rounded border-0 dash2\" style=\"width: 18rem;\">\r\n");
      out.write("                            <i class=\"fa fa-car fa-5x mx-auto p-5\"></i>\r\n");
      out.write("                            <div class=\"card-body\">\r\n");
      out.write("                              <h2 class=\"card-title fw-bold text-white\">\r\n");
      out.write("                                  Estado de Habitaciones\r\n");
      out.write("                              </h2>\r\n");
      out.write("                        \r\n");
      out.write("                              <p class=\"card-text text-black\">Estado de Habitaciones</p>\r\n");
      out.write("                              <a href=\"pagListaServicioAd.jsp\" class=\"btn btn btn-outline-info\">Ir a Servicios</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                </div>                -->\r\n");

             graficoDAO obj2=new graficoDAO();
        
      out.write("\r\n");
      out.write("        <h1 class=\"bg-primary text-center p-4 text-white\">Grafico por facturas mes</h1> \r\n");
      out.write("     \r\n");
      out.write("        \r\n");
      out.write("        <br>\r\n");
      out.write("        <br>\r\n");
      out.write("        <table class=\"table table-dark mx-auto\" style=\"width: 220px;\">\r\n");
      out.write("            <thead>\r\n");
      out.write("            <tr class=\"bg-light\">\r\n");
      out.write("                <th>\r\n");
      out.write("                    Mes\r\n");
      out.write("                </th>\r\n");
      out.write("                <th>\r\n");
      out.write("                    Cantidad\r\n");
      out.write("                </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("            </thead>\r\n");
      out.write("             ");

                for(FacturaPorMes x:obj2.lisFacPorMes()){
                    out.print("<tr><td>"+x.getMes()+"<td>"+x.getCantidad());
             }
      out.write("\r\n");
      out.write("        </table>\r\n");
      out.write("        <form action=\"graficoFA.jsp\" target=\"win\" class=\"form-control  mx-auto\"  style=\"width: 220px;\">\r\n");
      out.write("            <label for=\"torta\">\r\n");
      out.write("                <input id=\"torta\" type=\"radio\" value=\"1\" name=\"opc\" onclick=\"submit()\"/> Torta \r\n");
      out.write("            </label>\r\n");
      out.write("             <label for=\"barras\">\r\n");
      out.write("            <input id=\"barras\" type=\"radio\" value=\"2\" name=\"opc\" onclick=\"submit()\"/> Barras \r\n");
      out.write("            </label>\r\n");
      out.write("            <label for=\"lineal\">\r\n");
      out.write("            <input id=\"lineal\" type=\"radio\" value=\"3\" name=\"opc\" onclick=\"submit()\"/> Lineal          \r\n");
      out.write("            </label>\r\n");
      out.write("        </form>\r\n");
      out.write("        <iframe class=\"\" name=\"win\" height=\"500\" style=\"width: 100%;\">        \r\n");
      out.write("            \r\n");
      out.write("        </iframe>\r\n");
      out.write("            </div>\r\n");
      out.write("        </main>\r\n");
      out.write("          \r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");

   }else{
    response.sendRedirect("login_admi.jsp");
} 

      out.write("            ");
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
